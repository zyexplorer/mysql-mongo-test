package com.wenwo.data.statistics.entity.mongodb.community;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * 
 * 项目名称：wenwo-cloud-postbar-service   
 *
 * 类描述：贴吧实体（相当于喻言社区中的圈子）
 * 类名称：com.wenwo.cloud.postbar.entity.post.Postbar     
 * 创建人： zhyl591 
 * 创建时间：2018年11月6日 上午10:26:09   
 * 修改人：
 * 修改时间：2018年11月6日 上午10:26:09   
 * 修改备注：   
 * @version 1.0
 */
@Data
@Document(collection = "com.wenwo.cloud.postbar")
public class PostBar implements Serializable {
	
	/**
	 * @Fields serialVersionUID : @TODO()
	 */ 
	private static final long serialVersionUID = 4872945759164959074L;

 	private String id;                // 贴吧ID，主键ID
	private String name;	          // 贴吧名称
	private String status;            // 贴吧状态：【-1：待发布；0 ：已发布（默认）；1：禁用、下架；2：删除；】
	
	private String categoryId;        // 贴吧分类ID
	private List<String> postTags;    // 标签集合
	private Date publishTime;         // 发布时间
	
	private Date createTime;          // 创建时间
	private String createUserId;      // 创建人
	private Date updateTime;          // 修改时间
	private String updateUserId;      // 修改人
	
	private String communityId;       // 所属社区ID
	private String orgId;             // 所属机构ID

}
