package com.wenwo.data.statistics.entity.mongodb.community;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * ClassName:BCustomer Date: 2018年10月27日 09:32:28
 * B端客户
 * @author lidy
 * @version
 * @since JDK 1.8
 */

@Data
@ApiModel(value = "B端客户实体")
@Document(collection = "com.wenwo.cloud.biz.customer")
public class BCustomer implements Serializable {
	private static final long serialVersionUID = -111180047843163945L;
	/**
	 * 主键ID
	 */
	@ApiModelProperty("主键ID")
	private String	id;
	/**
	 * 登录的手机号
	 */
	@ApiModelProperty("登录的手机号")
	private String	phone;
	/**
	 * 姓名（默认为注册的手机号码）
	 */
	@ApiModelProperty("姓名")
	private String	name;
	/**
	 * 账号类型（0:普通账号、1:机构创始人账号）
	 */
	@ApiModelProperty("账号类型")
	private String	bType;
	/**
	 * 所属账号ID[实际是机构id]
	 */
	@ApiModelProperty("所属账号ID")
	private String orgId;
	/**
	 * 账号所属角色
	 */
	@ApiModelProperty("账号所属角色")
	private String	roleId;
	/**
	 * 账号所属角色名称
	 */
	@ApiModelProperty("账号所属角色名称")
	private String	roleName;
	/**
	 * 账号状态（0:已停用、1:使用中、2:注销）
	 */
	@ApiModelProperty("账号状态")
	private String	status;
	/**
	 * 创建时间
	 */
	@ApiModelProperty("创建时间")
	private Date createTime;
	/**
	 * 创建者Id
	 */
	@ApiModelProperty("创建者Id")
	private String createId;
	/**
	 * 创建者名称
	 */
	@ApiModelProperty("创建者名称")
	private String createName;
	/**
	 * 头像
	 */
	@ApiModelProperty("头像")
	private String faceimage;
	/**
	 * 我（机构）的社区数
	 */
	@ApiModelProperty("我的社区数")
	private Integer communityCount;
    /**
     * 注销/停用原因
     */
	@ApiModelProperty("注销/停用原因")
	private String reason;
	/**
	 * 加入机构的时间
	 * v1.5.8.3 新增
	 */
	@ApiModelProperty("加入机构的时间")
	private Date joinOrgTime;
	
}
