package com.wenwo.data.statistics.entity.mongodb.community;

import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
 * @描述: 社区数据记录表
 * @版本: v1.0.0
 * @版权: Copyright (c) 2019 
 * @作者: zhilong.liu
 * @创建日期: 2019年3月27日 
 * @创建时间: 上午10:15:50
 */
@ApiModel(value = "CommunityDataRecord", description = "社区数据记录表")
@Document(collection = "com.wenwo.cloud.community.data.record")
@Data
public class CommunityDataRecord {
	
	/** 主键id */
	@ApiModelProperty(value = "主键id")
	private String id;
	
	/** 内容id */
	@ApiModelProperty(value = "内容id")
	private String contentId;
	
	/** 用户id */
	@ApiModelProperty(value = "用户id")
	private String userId;

    /** 作者id authorId */
    @ApiModelProperty(value = "作者id")
    private String authorId;

	/** 第三方用户id */
	@ApiModelProperty(value = "第三方用户id")
	private String thirdUserId;
	
	/** 性别（2：女；1：男） */
	@ApiModelProperty(value = "性别")
	private String sex;
	
	/**
	 * 内容类型（0：视频；1：社区、2：健康科普 、3：专题、4：帖子、5:咨询室 、6:调查问卷、
	 * 7:社区介绍 、8:按钮广告 、9:广告栏、10:健康知识、 11:健康公告 、12:医院推荐、13:预约推广）
	 */  
	@ApiModelProperty(value = "内容类型")
	private String contentType;
	
	/** 地域 */
	@ApiModelProperty(value = "地域")
	private String region;
	
	/** 标签 */
	@ApiModelProperty(value = "标签")
	private String label;
	
	/** 
	 * 操作类型（0：浏览；1：评论；2：点赞；3:分享；4：提交；5：提交成功；6：数据渲染完；7：加载时长；8：访问时长；9：B端登录；10：访问社区） 
	 * 4、5、6 、7、8目前只对预约推广临时使用 update 2019.9.23 pin.zhao
	 */
	@ApiModelProperty(value = "操作类型")
	private String operationType;
	
	/** 来源（0：pc；1：h5；2：小程序；3：微博 ；4：微信 ；5：爱问医生APP） */
	@ApiModelProperty(value = "来源")
	private String source;
	
	/** 渠道 */
	@ApiModelProperty(value = "渠道")
	private String channel;
	
	/** 设备类型 */
	@ApiModelProperty(value = "设备类型")
	private String equipmentType;
	
	/** 设备号 */
	@ApiModelProperty(value = "设备号")
	private String equipmentNumber;
	
	/** ip地址 */
	@ApiModelProperty(value = "ip地址")
	private String ip;
	
	/** 社区id */
	@ApiModelProperty(value = "社区id")
	private String comtyId;
	
	/** 创建时间 */
	@ApiModelProperty(value = "创建时间")
	@DateTimeFormat(pattern = "YYYY-MM-dd HH:mm:ss")
	private Date createTime;

    /** 日期，精确到天 */
    @ApiModelProperty(value = "日期，精确到天")
    private String  day;
    
    /**
     * 时长，精确到毫秒
     * add 2019.9.23
     */
    @ApiModelProperty(value = "时长，精确到毫秒")
    private String duration;

}
