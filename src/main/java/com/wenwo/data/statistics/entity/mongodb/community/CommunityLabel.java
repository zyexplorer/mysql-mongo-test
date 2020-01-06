package com.wenwo.data.statistics.entity.mongodb.community;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description 用户/医生 标签
 * @author pin.zhao
 * @date 2018年12月27日 下午4:54:25
 */
@Document(collection = "com.wenwo.cloud.biz.communitylabel")
@Data
@ApiModel
public class CommunityLabel implements Serializable{

	private static final long serialVersionUID = 6859990841285370884L;
	
	@ApiModelProperty("主键id")
	private String id;
	@ApiModelProperty("标签名称")
	private String labelName;
	@ApiModelProperty("标签类型[0:手动标签 1:福利社任务专题标签]")
	private String labelType;
	@ApiModelProperty("社区id")
	private String comtyId;
	@ApiModelProperty("标签所属用户类型  doctor:医生， user:用户,  aiwen:爱问后台")
	private String userType;
	@ApiModelProperty("创建时间")
	private Date createTime;
	@ApiModelProperty("用户数[辅助字段]")
	private Integer useCount;
	
	

}
