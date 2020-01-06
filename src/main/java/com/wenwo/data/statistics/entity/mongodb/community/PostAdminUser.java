package com.wenwo.data.statistics.entity.mongodb.community;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * 
 * 项目名称：wenwo-cloud-postbar-service   
 *
 * 类描述：贴吧吧主实体表
 * 类名称：com.wenwo.cloud.postbar.entity.post.PostAdminUser     
 * 创建人： zhyl591 
 * 创建时间：2018年11月6日 下午2:03:30   
 * 修改人：
 * 修改时间：2018年11月6日 下午2:03:30   
 * 修改备注：   
 * @version 1.0
 */
@Data
@Document(collection = "com.wenwo.cloud.postbar.adminuser")
public class PostAdminUser implements Serializable {
	
	/**
	 * @Fields serialVersionUID : @TODO(用一句话描述这个变量表示什么)
	 */ 
	private static final long serialVersionUID = 2677152556999619322L;

	private String id;                // 主键ID
	private String userId;            // 吧主ID
	private String userName;          // 吧主姓名
	private String userPhoto;         // 吧主头像                 
	private String status;            // 状态【-1删除；0有效，默认；1：禁用；】
	
	private Date createTime;          // 创建时间
	private String createUserId;      // 创建人
	private Date updateTime;          // 修改时间
	private String updateUserId;      // 修改人
	
	private String postBarId;         // 所属贴吧ID	
	private String communityId;       // 所属社区ID
	private String orgId;             // 所属机构ID
	
	
}
