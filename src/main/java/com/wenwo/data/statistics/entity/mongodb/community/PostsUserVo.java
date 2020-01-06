package com.wenwo.data.statistics.entity.mongodb.community;

import lombok.Data;

/**
 * @author lilimin
 */
@Data
public class PostsUserVo {
	/** 用户ID */
	private String userId;
	/** 帖子数 */
	private Integer postsCount;
}
