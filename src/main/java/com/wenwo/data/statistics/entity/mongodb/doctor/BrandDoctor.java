package com.wenwo.data.statistics.entity.mongodb.doctor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @描述: 推广活动医生实体
 * @版权: Copyright (c) 2017
 * @作者: zhilong.liu
 * @创建日期: 2017年7月25日
 * @创建时间: 下午7:21:58
 */
@Document(collection = "dr.brand.doctor")
public class BrandDoctor implements Serializable {

	private static final long serialVersionUID = 7499222931103298279L;
	private String id; // id
	private String taskId; // 任务ID
	private String drUserId; // 医生ID
	private String drRealName; // 医生姓名
	private String weiboNickName; // 微博昵称
	private String weiboId; // 微博ID
	private Integer taskStatus; // 任务状态(1、待完成；2、名额已抢完；3、待审核；4、已过期；5、未完成；6、奖励待反馈（投放审核）；7、未获得奖励；8、奖励已下发；9、审核通过（未投放）；10、已关闭)
	private String taskLinks; // 任务外链
	private String arctleLinks; // 文章链接
	private String arctleTitle; // 文章标题
	private String taskResourceId; // 奖励id
	private String taskReward; // 任务奖励
	private Date postTime; // 任务提交时间
	private Date auditDate; // 任务审核时间
	private Date sendTime; // 奖励下发时间
	private Message messages; // 消息文案
	private String assistantId; // 助理ID
	private String assistantName; // 助理姓名
	private Date createTime; // 创建时间
	private String createUserId; // 创建人
	private Date updateTime; // 更新时间
	private String updateUserId; // 更新人
	private int redPoint = 0; // 红点提示APP专用 0未查看 1已查看
	private String weiboURL; // 发送微博成功后返回的url地址
	private String weiboMid; // 微博类MID
	private List<String> imgs; // 医生自己上传的图片
	private Date feedBackTime; // 反馈时间
	private String feedBackContent; // 反馈内容 (如果是文章类是任务文章ID)
	private String incompleteReason; // 未完成原因
	private Integer sortIndex = 1; // 排序：1未参加 2已报满 3待审核 4 奖励待反馈 5审核通过 6奖励已下发 7未获得奖励 8 未完成 9已关闭
	private String videoLinks; // 视频连接
	private String isOutPatient; // 是否为文章类型门诊预约:1是 0不是
	private String resourcePackageName; // 资源包名称
	private List<Map<String, Object>> resourceList; // 资源包项 (Map<String,
													// Object>的key为resourceId、resourceNum、resourceEntity；resourceId对应的值为资源id，
													// resourceNum对应的值为资源数量，resourceEntity对应的值为资源实体)
	private Date popSciencePostDate; // 文章发布时间(针对定时发布的文章)
	private String pushOriginal; // 来源：1 新发布 2 历史内容（文章/视频） dingshubin 20180615
	private String contentTaskType; // （1.微博类任务 2.文章类任务 3.其他类任务 4.视频类任务）针对多任务类型任务，确定多任务类型发布的是哪一类任务
	// 展示，不保存
	private String pageVideoId; // 文章或视频id
	private String temporaryTaskDoctorStatus; // 任务状态，用于导出数据，显示任务状态

	public String getContentTaskType() {
		return contentTaskType;
	}

	public void setContentTaskType(String contentTaskType) {
		this.contentTaskType = contentTaskType;
	}

	public Date getPopSciencePostDate() {
		return popSciencePostDate;
	}

	public void setPopSciencePostDate(Date popSciencePostDate) {
		this.popSciencePostDate = popSciencePostDate;
	}

	public String getResourcePackageName() {
		return resourcePackageName;
	}

	public void setResourcePackageName(String resourcePackageName) {
		this.resourcePackageName = resourcePackageName;
	}

	public List<Map<String, Object>> getResourceList() {
		return resourceList;
	}

	public void setResourceList(List<Map<String, Object>> resourceList) {
		this.resourceList = resourceList;
	}

	public String getIsOutPatient() {
		return isOutPatient;
	}

	public void setIsOutPatient(String isOutPatient) {
		this.isOutPatient = isOutPatient;
	}

	public String getVideoLinks() {
		return videoLinks;
	}

	public void setVideoLinks(String videoLinks) {
		this.videoLinks = videoLinks;
	}

	public String getArctleTitle() {
		return arctleTitle;
	}

	public void setArctleTitle(String arctleTitle) {
		this.arctleTitle = arctleTitle;
	}

	public Integer getSortIndex() {
		return sortIndex;
	}

	public void setSortIndex(Integer sortIndex) {
		this.sortIndex = sortIndex;
	}

	public String getWeiboMid() {
		return weiboMid;
	}

	public void setWeiboMid(String weiboMid) {
		this.weiboMid = weiboMid;
	}

	public String getIncompleteReason() {
		return incompleteReason;
	}

	public void setIncompleteReason(String incompleteReason) {
		this.incompleteReason = incompleteReason;
	}

	public Date getFeedBackTime() {
		return feedBackTime;
	}

	public void setFeedBackTime(Date feedBackTime) {
		this.feedBackTime = feedBackTime;
	}

	public String getFeedBackContent() {
		return feedBackContent;
	}

	public void setFeedBackContent(String feedBackContent) {
		this.feedBackContent = feedBackContent;
	}

	public String getTaskResourceId() {
		return taskResourceId;
	}

	public void setTaskResourceId(String taskResourceId) {
		this.taskResourceId = taskResourceId;
	}

	public String getWeiboURL() {
		return weiboURL;
	}

	public void setWeiboURL(String weiboURL) {
		this.weiboURL = weiboURL;
	}

	public int getRedPoint() {
		return redPoint;
	}

	public void setRedPoint(int redPoint) {
		this.redPoint = redPoint;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getDrUserId() {
		return drUserId;
	}

	public void setDrUserId(String drUserId) {
		this.drUserId = drUserId;
	}

	public String getDrRealName() {
		return drRealName;
	}

	public void setDrRealName(String drRealName) {
		this.drRealName = drRealName;
	}

	public String getWeiboNickName() {
		return weiboNickName;
	}

	public void setWeiboNickName(String weiboNickName) {
		this.weiboNickName = weiboNickName;
	}

	public String getWeiboId() {
		return weiboId;
	}

	public void setWeiboId(String weiboId) {
		this.weiboId = weiboId;
	}

	public Integer getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(Integer taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTaskLinks() {
		return taskLinks;
	}

	public void setTaskLinks(String taskLinks) {
		this.taskLinks = taskLinks;
	}

	public String getArctleLinks() {
		return arctleLinks;
	}

	public void setArctleLinks(String arctleLinks) {
		this.arctleLinks = arctleLinks;
	}

	public String getTaskReward() {
		return taskReward;
	}

	public void setTaskReward(String taskReward) {
		this.taskReward = taskReward;
	}

	public Date getPostTime() {
		return postTime;
	}

	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	public Date getAuditDate() {
		return auditDate;
	}

	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public Message getMessages() {
		return messages;
	}

	public void setMessages(Message messages) {
		this.messages = messages;
	}

	public String getAssistantId() {
		return assistantId;
	}

	public void setAssistantId(String assistantId) {
		this.assistantId = assistantId;
	}

	public String getAssistantName() {
		return assistantName;
	}

	public void setAssistantName(String assistantName) {
		this.assistantName = assistantName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}

	public String getPushOriginal() {
		return pushOriginal;
	}

	public void setPushOriginal(String pushOriginal) {
		this.pushOriginal = pushOriginal;
	}

	public List<String> getImgs() {
		return imgs;
	}

	public void setImgs(List<String> imgs) {
		this.imgs = imgs;
	}

	public Message getMessgeInstance() {
		return new Message();
	}

	public class Message implements Serializable {

		private static final long serialVersionUID = -4564220864113908051L;
		private String isSmsMessage; // 是否发送短信通知(1：发送)
		private String isUpdateSmsMessage; // 短信内容是否被修改(1: 修改，如果短信内容被修改发送方式修改为玄武发送)
		private String smsMessage; // 短信消息通知内容
		private String privateMessage; // 私信消息通知内容
		private String instationMessage; // 站内消息通知内容
		private String pushMessage; // push消息通知内容

		public String getIsSmsMessage() {
			return isSmsMessage;
		}

		public void setIsSmsMessage(String isSmsMessage) {
			this.isSmsMessage = isSmsMessage;
		}

		public String getIsUpdateSmsMessage() {
			return isUpdateSmsMessage;
		}

		public void setIsUpdateSmsMessage(String isUpdateSmsMessage) {
			this.isUpdateSmsMessage = isUpdateSmsMessage;
		}

		public String getSmsMessage() {
			return smsMessage;
		}

		public void setSmsMessage(String smsMessage) {
			this.smsMessage = smsMessage;
		}

		public String getPrivateMessage() {
			return privateMessage;
		}

		public void setPrivateMessage(String privateMessage) {
			this.privateMessage = privateMessage;
		}

		public String getInstationMessage() {
			return instationMessage;
		}

		public void setInstationMessage(String instationMessage) {
			this.instationMessage = instationMessage;
		}

		public String getPushMessage() {
			return pushMessage;
		}

		public void setPushMessage(String pushMessage) {
			this.pushMessage = pushMessage;
		}
	}

	public String getPageVideoId() {
		return pageVideoId;
	}

	public void setPageVideoId(String pageVideoId) {
		this.pageVideoId = pageVideoId;
	}

	public String getTemporaryTaskDoctorStatus() {
		return temporaryTaskDoctorStatus;
	}

	public void setTemporaryTaskDoctorStatus(String temporaryTaskDoctorStatus) {
		this.temporaryTaskDoctorStatus = temporaryTaskDoctorStatus;
	}

}
