package com.wenwo.data.statistics.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Web日志切面类
 */
@Slf4j
@Aspect
@Component
public class WebLogAspect {
	
	/**
	 * 定义一个切入点
	 * execution 排除登录方法
	 */
	@Pointcut("execution(public * com.wenwo.data.statistics.controller..*(..))")
	public void webLog(){}

	@Around("webLog()")
	public Object writeLog(ProceedingJoinPoint joinPoint) throws Throwable {
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		if (attributes == null) {
			log.warn("ServletRequestAttributes is null");
			Object object = joinPoint.proceed();
			return object;
		}
		HttpServletRequest request = attributes.getRequest();
		String URL = request.getRequestURL().toString();
		String HTTP_METHORD = request.getMethod();
		String ARGS = Arrays.toString(joinPoint.getArgs());

		long startTime = System.currentTimeMillis();
		Object object = joinPoint.proceed();
		long endTime = System.currentTimeMillis();

		log.info(">>>cost:{}(ms)  method：{}  url：{}  args：{} ", endTime - startTime, HTTP_METHORD, URL, ARGS);
		return object;
	}
	
	
	

}
