package com.wenwo.data.statistics.entity.mongodb.community;


import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * 
 * 
 * 项目名称：wenwo-cloud-postbar-service   
 *
 * 类描述：帖子标签实体
 * 类名称：com.wenwo.cloud.postbar.entity.post.PostTags     
 * 创建人： zhyl591 
 * 创建时间：2018年11月6日 下午4:17:08   
 * 修改人： zhyl591 
 * 修改时间：2018年11月6日 下午4:17:08   
 * 修改备注：   
 * @version 1.0
 */
@Data
@Document(collection = "com.wenwo.cloud.postbar.posttags")
public class PostTags implements Serializable {
	
	private static final long serialVersionUID = -516989759079068039L;
	
	private String id;               // 标签ID
	private String name;             // 标签名称
	private String status;           // 状态【-1删除；0有效，默认；1：禁用；】
	
	private Date createTime;         // 创建时间
	private String createUserId;     // 创建人
	private Date updateTime;         // 修改时间
	private String updateUserId;     // 修改人
	
	private String postBarId;        // 所属贴吧ID
	private String communityId;      // 社区ID
	private String orgId;            // 机构ID
	
}
