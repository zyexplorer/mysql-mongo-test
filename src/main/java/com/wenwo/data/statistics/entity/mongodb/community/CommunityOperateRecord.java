package com.wenwo.data.statistics.entity.mongodb.community;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.util.Date;

/**
 * 描述: 社区操作（认证/上线）记录实体
 * @author: jim.han
 * @Date: 2019/8/28
 * @version: 1.5.3
 */
@Data
@Document(collection = "com.wenwo.cloud.biz.communityoperaterecord")
@ApiModel(value = "社区操作（认证/上线 审核、申请认证/上线）记录实体")
public class CommunityOperateRecord implements Serializable {
    /**
     *序列号
     */
    private static final long serialVersionUID = 4299291627504191610L;
    /**
	 * 主键ID
	 */
	@ApiModelProperty("主键ID")
	private String id;
    /**
     * 社区id
     */
	@ApiModelProperty("社区id")
	private String comtyId;
	/**
	 * 记录类型 0：社区认证 1：上线审核
	 */
	@ApiModelProperty("记录类型 0：社区认证 、1：上线审核、2：申请上线")
	private String type;
    /**
	 * 操作状态 0：不通过 1：通过
	 */
	@ApiModelProperty("操作状态 0：不通过 1：通过")
	private String operateStatus;
    /**
	 * 操作/申请理由
	 */
	@ApiModelProperty("操作/申请理由")
	private String operateReason;
    /**
     * 操作类型 admin：爱问后台操作
     */
    @ApiModelProperty("操作类型 admin：爱问后台操作；saas B端后台")
    private String operateType;
    /**
	 * 操作/申请时间
	 */
	@ApiModelProperty("操作/申请时间")
	private Date operateTime;
    /**
     * 操作/申请人
     */
    @ApiModelProperty("操作/申请人")
    private String operator;
    /**
     * 操作/申请人id
     */
    @ApiModelProperty("操作/申请人id")
    private String operatorId;
    /**
     * 申请上线记录id
     */
    @ApiModelProperty("对应的申请上线记录id")
    private String applyId;
    
    /**
	  * 申请记录信息[辅助信息]
	  */
	@ApiModelProperty("申请记录信息[辅助信息]")
	private ApplyMap applyMap;
	
	@Data
	public static class ApplyMap {
		/**
		 * 申请时间
		 */
		@ApiModelProperty("申请时间")
		private Date operateTime;
		 /**
	     * 申请人
	     */
	    @ApiModelProperty("申请人")
	    private String operator;
	    /**
	     * 用户类型  admin：爱问后台；saas B端
	     */
	    @ApiModelProperty("操作类型 admin：爱问后台；saas B端")
	    private String operateType;
	    /**
		 * 申请理由
		 */
		@ApiModelProperty("申请理由")
		private String operateReason;
	}

}
