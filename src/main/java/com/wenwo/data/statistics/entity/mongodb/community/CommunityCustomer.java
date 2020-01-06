package com.wenwo.data.statistics.entity.mongodb.community;

import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * ClassName:CommunityCustomer Date: 2018年10月27日 09:32:28
 * 社区客户管理
 * @author lidy
 * @version
 * @since JDK 1.8
 */
@Data
@Document(collection = "com.wenwo.cloud.biz.communitycustomer")
public class CommunityCustomer {

	/**
	 * 主键id
	 */
	@ApiModelProperty("主键id")
	private String	id;
	/**
	 * 客户名称
	 */
	@ApiModelProperty("客户名称")
	private String	customerName;
	/**
	 * 客户ID
	 */
	@ApiModelProperty("客户ID")
	private String	customerId;
	/**
	 * 客户手机号码
	 */
	@ApiModelProperty("客户手机号码")
	private String phone;
	/**
	 * 客户类型(医生:0 ...)
	 */
	@ApiModelProperty("客户类型")
	private String	customerType;
	/**
	 * 客户属性
	 */
	@ApiModelProperty("客户属性")
	private String	customerAttribute;
	/**
	 * 所属科室
	 */
	@ApiModelProperty("所属科室")
	private String	depId;
	/**
	 * 科室名称
	 */
	@ApiModelProperty("科室名称")
	private String depName;
	/**
	 * 来源（二维码邀请:qrcode、手机号邀请:phone、名医在线推送:famousDoctorOnline、h5注册:h5register、其它:other、系统默认加入: system）
	 */
	@ApiModelProperty("来源")
	private String	customerSource;
	/**
	 * 邀请者Id
	 */
	@ApiModelProperty("邀请者Id")
	private String	inviterId;
	/**
	 * 邀请者type（0：社区用户账号、1：机构账号、2：医生团队）
	 */
	@ApiModelProperty("邀请者type")
	private String	inviterType;
	/**
	 * 文章贡献数
	 */
	@ApiModelProperty("文章贡献数")
	private String	articlesNumber;
	/**
	 * 发帖数
	 */
	@ApiModelProperty("发帖数")
	private String	postNumber;
	/**
	 * 回帖数
	 */
	@ApiModelProperty("回帖数")
	private String	repliesNumber;
	/**
	 * 所属机构ID
	 */
	@ApiModelProperty("所属机构ID")
	private String	bId;
	/**
	 * 所属社区ID
	 */
	@ApiModelProperty("所属社区ID")
	private String	comtyId;
	/**
	 * 创建时间
	 */
	@ApiModelProperty("创建时间")
	private Date createTime = new Date();
	/**
	 * 加入社区时间
	 */
	@ApiModelProperty("加入社区时间")
	private Date joinTime;
	/**
	 * 客户状态 0:待确认 1:已加入
	 */
	@ApiModelProperty("客户状态")
	private String status;
	/**
	 * 省份id
	 */
	@ApiModelProperty("省份id")
	private String provinceId;
	/**
	 * 城市id
	 */
	@ApiModelProperty("城市id")
	private String cityId;
    /**
     * 是否为预约医生（预约业务新增）
     */
    @ApiModelProperty("是否为预约医生 0:不是 1:是")
    private String isAppointment;
	
	/**
	 * 以下为辅助字段
	 */
	/**
	 * 任职医院
	 */
	@ApiModelProperty("任职医院")
	private String hospital;
	/**
	 * 职称
	 */
	@ApiModelProperty("职称")
	private String title;
	/**
	 * 擅长领域
	 */
	@ApiModelProperty("擅长领域")
	private String expertiseArea;
	/**
	 * 所属城市
	 */
	@ApiModelProperty("所属城市")
	private String address;
	/**
	 * 标签
	 */
	@ApiModelProperty("标签")
	private List<CommunityLabel> labels;
	/**
	 * 客户注册时间
	 */
	@ApiModelProperty("客户注册时间")
	private Date registerTime;
	
}
