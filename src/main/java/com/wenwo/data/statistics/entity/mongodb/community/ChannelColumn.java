package com.wenwo.data.statistics.entity.mongodb.community;

import java.io.Serializable;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 
 * @description 频道专栏实体类
 * @author hongchao.wu
 * @date 2019年9月30日
 *
 */
@Data
@Document(collection = "com.wenwo.cloud.patient.channelColumn")
public class ChannelColumn implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@Id
	@Field("id")
	private String id;

	/**
	 * 频道id
	 */
	private String channelId;

	/**
	 * 关联社区id
	 */
	private String communityId;

	/**
	 * 专栏名称
	 */
	private String columnName;

	/**
	 * 专栏logo
	 */
	private String columnLogo;

	/**
	 * 专栏状态（0-待发布；1-上线申请中；2-已上线；3-已下线）
	 */
	private Integer columnStatus;

	/**
	 * 背书团队
	 */
	private String endorsementTeam;

	/**
	 * 背书团队外链
	 */
	private String endorsementTeamLink;


	/**
	 * 上线时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date publishTime;

	/**
	 * 创建时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 更新时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

}
