package com.wenwo.data.statistics.entity.mongodb.doctor;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 描述: 电话咨询订单信息
 *
 * @版本: v4.5.3
 * @author: 朱智鹏
 * @创建日期: 2019年9月29日
 * @创建时间: 6:18:46
 */
@Data
@ApiModel
@Document(collection = "com.wenwo.cloud.doctor.telephone.consultation.order")
public class TelephoneConsultationOrder {

    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id", required = true)
    private String id;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", required = true)
    private  Date createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间", required = true)
    private   Date updateTime;

    /**
     * 医生 ID
     */
    @ApiModelProperty(value = "医生 ID", required = true)
    private  String doctorId;

    /**
     * 患端用户 ID
     */
    @ApiModelProperty(value = "患端用户 ID", required = true)
    private String patientId;

    /**
     * 预约咨询的患者 ID
     */
    @ApiModelProperty(value = "预约咨询的患者 ID", required = true)
    private String inquiryPatientId;

    /**
     * 预约咨询的患者号码
     */
    @ApiModelProperty(value = "预约咨询的患者号码", required = true)
    private String inquiryPatientPhone;

    /**
     * 意向通话开始时间
     */
    @ApiModelProperty(value = "意向通话开始时间", required = true)
    private Date callBeginTime;

    /**
     * 意向通话结束时间
     */
    @ApiModelProperty(value = "意向通话结束时间", required = true)
    private  Date callEndTime;

    /**
     * 服务价格。元
     */
    @ApiModelProperty(value = "服务价格。元", required = true)
    private BigDecimal servicePrice;

    /**
     * 服务时间。分钟
     */
    @ApiModelProperty(value = "服务时间。分钟", required = true)
    private  long serviceTime;

    /**
     * 订单状态(10001:待支付,20001:待确认,30001:未支付取消-（用户未支付就主动取消）,40001:支付取消(用户支付了,医生确认前取消),
     * 50001:支付超时取消,60001:医生取消（医生取消）,70001:待通话(医生已确认,订单无法取消)),80001:订单超时取消(超过24小时,订单未完成)
     * 80002:订单取消(24小时医生未确认),90001:待评价(可拨打),99999:订单关闭(用户评价完,订单关闭)
     */
    @ApiModelProperty(value = "订单状态(10001:待支付,20001:待确认,30001:未支付取消-（用户未支付就主动取消）,40001:支付取消(用户支付了,医生确认前取消),50001:支付超时取消,60001:医生取消（医生取消）,70001:待通话(医生已确认,订单无法取消),80001:订单超时取消(超过24小时,订单未成),80002:订单取消(24小时医生未确认),90001:待评价,99999:订单关闭(用户评价完,订单关闭)")
    private   String orderStatus;

    /**
     * 拨打次数
     */
    @ApiModelProperty(value = "拨打次数", required = true)
    private  int callNumber;

    /**
     * 抽成比例。百分比值
     */
    @ApiModelProperty(value = "抽成比例。百分比值", required = true)
    private Double ratio;

    /**
     * 支付订单 ID
     */
    @ApiModelProperty(value = "支付订单 ID", required = true)
    private String payOrderId;

    /**
     * 退款状态
     */
    @ApiModelProperty(value = "退款状态(退款成功:10001,退款中:20001,退款失败:30001)", required = true)
    private String refundStatus;

    /**
     * 取消来源 医生:doctor 患者:user
     */
    @ApiModelProperty(value = "取消来源 医生:doctor 患者:user", required = true)
    private  String cancelSource;

    /**
     * 取消订单原因
     */
    @ApiModelProperty(value = "取消订单原因", required = true)
    private  String cancelReason;

    /**
     * 患病时长
     */
    @ApiModelProperty(value = "患病时长", required = true)
    private  String sickTime;

    /**
     * 病情描述
     */
    @ApiModelProperty(value = "病情描述", required = true)
    private  String illnessDescription;

    /**
     * 病情图片id列表
     */
    @ApiModelProperty(value = "病情图片id列表", required = true)
    private  List<String> illnessImages;
    
    
    /**
     * 通话总时长
     */
    @ApiModelProperty(value = "通话总时长", required = true)
    private long durationSec;
}
