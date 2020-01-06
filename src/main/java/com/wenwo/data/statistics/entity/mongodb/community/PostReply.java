/**  
* @Title: PostReply.java
* @Package com.wenwo.cloud.postbar.entity.post
* @Description: @TODO(用一句话描述该文件做什么)
* @author zhyl591  
* @date 2018年11月6日 下午3:27:27
* @version V1.0  
*/ 
package com.wenwo.data.statistics.entity.mongodb.community;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**   
 * 
 * 项目名称：wenwo-cloud-postbar-service   
 *
 * 类描述：回帖实体表
 * 类名称：com.wenwo.cloud.postbar.entity.post.PostReply     
 * 创建人： zhyl591 
 * 创建时间：2018年11月6日 下午3:27:27   
 * 修改人： zhyl591 
 * 修改时间：2018年11月6日 下午3:27:27   
 * 修改备注：   
 * @version 1.0  
 */
@Data
@Document(collection = "com.wenwo.cloud.posts.reply")
public class PostReply implements Serializable {
	
	/**
	 * @Fields serialVersionUID : @TODO(用一句话描述这个变量表示什么)
	 */ 
	private static final long serialVersionUID = 7598936610068552594L;
	
	private String id; 			      // 回复ID
	private String postsId;           // 帖子ID
	private String userId;            // 回复人ID
	private String userName;          // 回复人昵称
	private String userPhoto;         // 回复人头像
	private String userType;          // 回复人类型【0普通用户；1医生；2吧主；3专家委员；】
	private String content;           // 回复内容
	private String status;            // 回复状态【0待审核；1审核通过、已发布；2审核不通过；3已删除；】
	private Date createTime;          // 回复时间（创建时间、发布时间）
	private Date updateTime;          // 修改时间
	private String updateUserId;      // 修改人
	private String replyParentId;     // 回复目标ID
	private Integer floor;            // 当前回复的楼层
	private String ip;                // IP
	
	private String postBarId;         // 帖子所属贴吧ID	
	private String communityId;       // 社区ID
	private String orgId;             // 机构ID
	
	private String postTitle;         // 帖子标题，显示用
	
}
