package com.wenwo.data.statistics.entity.mysql;

import java.util.Date;

public class DataPoint {

	private Integer id;

	private String userId;// 用户ID

	private Integer equipmentType;// 设备类型(0:手机,1:PC)

	private String imei;// 设备标识

	private String operateSystem;// 设备操作系统

	private String equipmentFirm;// 设备品牌

	private String ip;// ip

	private String referrer;// 页面引用源

	private String url;// 页面URL

	private Integer productId;// 产品ID

	private Integer functionId;// 功能ID

	private Integer pageId;// 页面ID

	private Integer elementId;// 元素id

	private Integer eventType;// 事件类型（0：曝光事件，1：点击事件，2：停留事件）

	private String ext;// 扩展属性

	private Integer actionTime;// 页面响应时间

	private Long stayTime;// 停留时间

	private String channelId;// 渠道id

	private String belongBusiness;// 所属业务

	private Date eventTime;// 事件发生时间

	private String ua;// 手机标识ua

	private Date createTime;// 记录创建时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(Integer equipmentType) {
		this.equipmentType = equipmentType;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getOperateSystem() {
		return operateSystem;
	}

	public void setOperateSystem(String operateSystem) {
		this.operateSystem = operateSystem;
	}

	public String getEquipmentFirm() {
		return equipmentFirm;
	}

	public void setEquipmentFirm(String equipmentFirm) {
		this.equipmentFirm = equipmentFirm;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getReferrer() {
		return referrer;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getFunctionId() {
		return functionId;
	}

	public void setFunctionId(Integer functionId) {
		this.functionId = functionId;
	}

	public Integer getPageId() {
		return pageId;
	}

	public void setPageId(Integer pageId) {
		this.pageId = pageId;
	}

	public Integer getElementId() {
		return elementId;
	}

	public void setElementId(Integer elementId) {
		this.elementId = elementId;
	}

	public Integer getEventType() {
		return eventType;
	}

	public void setEventType(Integer eventType) {
		this.eventType = eventType;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public Integer getActionTime() {
		return actionTime;
	}

	public void setActionTime(Integer actionTime) {
		this.actionTime = actionTime;
	}

	public Long getStayTime() {
		return stayTime;
	}

	public void setStayTime(Long stayTime) {
		this.stayTime = stayTime;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getBelongBusiness() {
		return belongBusiness;
	}

	public void setBelongBusiness(String belongBusiness) {
		this.belongBusiness = belongBusiness;
	}

	public Date getEventTime() {
		return eventTime;
	}

	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}

	public String getUa() {
		return ua;
	}

	public void setUa(String ua) {
		this.ua = ua;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
