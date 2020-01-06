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
 * 类描述：贴吧分类实体表
 * 类名称：com.wenwo.cloud.postbar.entity.post.PostBarCategory     
 * 创建人： zhyl591 
 * 创建时间：2018年11月6日 下午4:15:25   
 * 修改人： zhyl591 
 * 修改时间：2018年11月6日 下午4:15:25   
 * 修改备注：   
 * @version 1.0
 */
@Document(collection = "com.wenwo.cloud.postbar.category")
@Data
public class PostBarCategory implements Serializable {

	/**
	 * @Fields serialVersionUID : @TODO(用一句话描述这个变量表示什么)
	 */ 
	private static final long serialVersionUID = -2380289142832757534L;
	
	private String id;                                 // 主键id
	private String name;                               // 分类名称 
	private String parentId;                           // 分类上级ID
	private String departId;                           // 科室ID
	private String departName;                         // 科室名称
	private Integer orderNum = 0;                      // 排序（默认：0）
	private String status;                             // 状态【-1删除；0有效，默认；1：禁用；】
	private Date createTime;                           // 创建时间
	private String createUserId;                       // 创建人
	private Date updateTime;                           // 修改时间
	private String updateUserId;                       // 修改人
	
	private String communityId;                        // 社区ID
	private String orgId;                              // 机构ID
}
