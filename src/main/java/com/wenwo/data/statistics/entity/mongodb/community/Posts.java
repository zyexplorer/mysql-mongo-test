package com.wenwo.data.statistics.entity.mongodb.community;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * 
 * 
 * 项目名称：wenwo-cloud-postbar-service   
 *
 * 类描述：帖子实体表
 * 类名称：com.wenwo.cloud.postbar.entity.post.Posts     
 * 创建人： zhyl591 
 * 创建时间：2018年11月6日 下午2:40:32   
 * 修改人： zhyl591 
 * 修改时间：2018年11月6日 下午2:40:32   
 * 修改备注：   
 * @version 1.0
 */
@Data
@Document(collection = "com.wenwo.cloud.posts")
public class Posts implements Serializable {

	/**
	 * @Fields serialVersionUID : @TODO(用一句话描述这个变量表示什么)
	 */ 
	private static final long serialVersionUID = 737746398032822523L;
	
	private String id;                                           // 主键id，帖子ID
	private String title;                                        // 帖子标题
	private String content;                                      // 帖子内容
	private List<String> imgIds = new ArrayList<>();      		 // 帖子图片（集合）
	private List<String> postTags = new ArrayList<>();  	     // 帖子标签列表（集合）

	private String userId;                                       // 帖子作者ID
	private String userName;                                     // 帖子作者昵称
	private String userPhoto;                                    // 帖子作者头像
	private String userType;                                     // 帖子作者类型【0:普通用户；1:医生；2:吧主；3专家委员】
	
	private String status;                                       // 帖子状态【0待审核；1审核通过、已发布；2审核不通过；3已删除；】

	private Date createTime;                                     // 帖子创建时间、发布时间
	
	private Date updateTime;                                     // 帖子修改时间
	private String updateUserId;                                 // 帖子修改时间
	private Date lastOperationTime;                     		 // 帖子最近操作时间（包括：新建、修改、评论）

	/*@Deprecated // 置顶、精华、推荐 允许同时存在，该字段作废
	private String postType;                                     // 帖子类型【0普通贴；1精华帖；2推荐贴；】*/	
	
	private int isEssence;                                       // 是否精华: 0、否 1、是
	private Date essenceTime;                                     // 帖子设置精华时间
	private int isTop;                                           // 是否置顶: 0、否 1、是
	private int isRecommend;                                     // 是否推荐: 0、否 1、是
     
	private String ip;                                           // IP
	        
	private String postBarId;                                    // 帖子所属贴吧ID	
	private String communityId;                                  // 社区ID
	private String orgId;                                        // 机构ID
    /**
     * 评论数
     */
    private long comments;
    /**
     * 帖子详情地址
     */
    private String address;
}
