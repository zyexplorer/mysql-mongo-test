package com.wenwo.data.statistics.entity.mongodb.business;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Document(collection = "bc.server.center.newuser.info")
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	/********************************************** 注册信息 ***************************************************/
	private String id;                               // 本系统用户id
	/** WENWO_USER_PLATFORM 平台 */
	private String userType;                         // 数据类别 从那个部门读过来的数据,来源
	private String registerType;					 //邮箱注册:WENWO_USER_PLATFORM_MAIL,手机注册:WENWO_USER_PLATFORM_PHONE
	private String loginMail;						 //登陆邮箱
	private String loginPhone;					     //登陆手机号
	private String passWord;						 //密码
	private String loginUid;						 //登录微博的UID
	private String loginNickName;					 //登录微博的昵称
	private String loginWeiboHeadPhoto;				 //登录微博的头像
	/********************************************** 注册信息 ***************************************************/

	/********************************************** 原型上没有的 ***************************************************/
	//private String profession;             	//执业类型（ 1.执业医师 2.执业药师 3.执业护师 4.心理咨询师 5.公共营养师 6.健康管理师 7.医学检验技师 8.康复治疗技师 9.药剂师）
	private Date modInformationData;		//修改用户信息时间_后台修改
	private Integer modInformationId;		//修改用户信息人_后台修改
	//private String remark;                  //后台用户信息修改备注
	/********************************************** 原型上没有的 ***************************************************/

	/********************************************** 客户基本信息 ***************************************************/
	private String realName;                         //客户真实姓名
	private String mobile;                           //客户手机号码手机号码
	private String userMailBox;						 //客户邮箱
	private String workUnit;                         //工作单位
	private String gender;							 //性别       M("男"), F("女"),  DEFALT
	private String headPhoto;                        //头像
	private int fansCount;						 //粉丝数(暂时只同步套餐用户2019/06/03)
	/********************************************** 客户基本信息 ***************************************************/

	/********************************************** 运营人信息_客户创建 ***************************************************/
	private String operatorName;							//客户运营人姓名
	private String operatorPhone;							//客户运营人手机号
	private String operatorIdentityId;						//客户运营人身份证
	private String operatorMail;							//客户运营人邮箱
	/********************************************** 运营人信息_客户创建 ***************************************************/

	/********************************************** 运营信息_我们公司 ***************************************************/
	private String userLevel;								//客户等级;（1：vip1默认商业用户加粉）
	private String deptAttr; 								//部门归属		@author XMC		
	private Integer accountManagerId; 						//客户经理id  对应mysql t_ad_user id   @author XMC 已经做好了
	private String accountManagerName;
	private Integer serviceManageId;						//客服经理id  对应mysql t_ad_user id,
	private String serviceManageName;
	/********************************************** 运营信息_我们公司 ***************************************************/

	/********************************************** 认证资质 ***************************************************/
	//一级分类id
	private String firstId;
	//二级分类id
	private String secondId;
	/**
	 * iask 资质一级分类
	 */
	private String iaskFirstId;
	/**
	 * iask 资质二级分类
	 */
	private String iaskSecondId;
	//一级分类name
	private String iaskFirstName;
	//二级分类name
	private String iaskSecondName;
	private String recommendedDp;		 					//垂直推荐科室id
	private String recommendedDbName;						//垂直推荐科室名字
	private String enterpriseName;      					//企业名称
	private String identityId;								//身份证号
	private String licenseNumber;						    //营业执照注册号
	private String licenseName;								//营业执照名称
	private String opendUid;                         		//微博UID
	private String nickName;                         		//客户微博昵称
	/********************************************** 认证资质 ***************************************************/

	/********************************************** 资质审核start ***************************************************/
	private String auditStatus;
	private String auditor;
	private Date auditTime;
	/********************************************** 资质审核end ***************************************************/

	/* =======================================开户所需要的资料=================================== */
	/**
	 * 新增于超粉用户迁移的功能(开户需要)
	 * 2019年4月3日
	 * 账号类型（1.个人，2.企业） userInfoType 新增
	 * 客户微博账号登录名 weiboLoginName 新增
	 * 微博昵称 nickName
	 * 微博UID opendUid
	 * 联系人姓名 realName
	 * 手机号 mobile
	 * 所在地 province(省-新增) city(市)
	 * 渠道号 channel（新增）
	 * 开户状态 openAccountStatus
	 * 行业细分ID industryTypeId 新增(UserQuaDoc表主键id)
	 * 新增于2019年4月13日充值按钮开关字段
	 * payBtnType;支付按钮开关，默认关闭。
	 */
	private String province;
	private String provinceCode;
	private String userInfoType;
	private String weiboLoginName;
	private String channel;
	//支付按钮开关，默认关闭。
	private boolean payBtnType = false;

	/* =======================================开户所需要的资料============================= */

	/********************************************** 其他信息 ***************************************************/
	private String name;				    		//客户名称,客户代号
	private String status;							//用户状态 10:注册 20:认证 30:付费
	private String city;							//城市
	private String cityCode;							//城市
	private String industryCode;            		//行业代码
	private String industryName;            		//行业名称
	private String industryTypeId;
	private String autoExecuted;            		//0非自动执行 1自动执行 (是否使用WAX投放)
	private WaxAccountAduit waxAccountAduit;		// wax账号审核信息
	/********************************************** 其他信息 ***************************************************/

	private BigDecimal accountTotal;                        //账号总额
	private BigDecimal availableBalance;                    //可用余额
	private BigDecimal lockedFunds;                         //锁定资金
	private Date modStatusDate;								//修改状态时间
	private Integer modStatusId;							//修改状态人
	private Date lastNoLoginTime;                           //最后一次设置免登录时间
	private Date createTime = new Date();
	private Date updateTime;
	/** 强制用户修改密码标识为,0 用户必须修改好密码后才能正常操作,1用户密码不需要进行修改 */
	private String passwordLock;
	/** 是否已经发送短信通知客户运营人,1:发送成功，-1：发送失败 */
	private String sendNoticeMSGToOperatorResult;

	private String adsToken;						//超粉授权TOKEN
	private Date adsOauthTime;						//超粉更新授权状态时间
	private Date adsFirstOauthTime;					//超粉第一次授权

	/** 客户公司id bc_finance_company_basic*/
	/**
	 * 客户二级公司名称
	 */
	private String companyName;

	/**
	 * 财务公司ID(代理公司开户需要保存,与用户所属公司名称无关联)
	 */
	private Integer finaceCompanyId;
	/**
	 * iask中的 客户公司
	 */
	private Integer iaskFinaceCompanyId;

	/**
	 * 新增于超粉用户迁移的功能
	 * 2019年3月22日
	 */
	private String userCenterId;                            //基础组表用户的Id

	/**
	 * 5:开户成功 6:开户失败 （旧的）
	 * 新增于超粉迁移 4：审核中
	 */
	private String openAccountStatus;
	/**
	 * 开户失败理由
	 */
	private String openAccountReason;

	/**
	 * 行业
	 * @see com.wenwo.emarketing.platform.industry.IndustryEnum
	 */
	private String industry;

	/**
	 * 2019-8-1新增，adv登录修改，在此次需求上线之前的数据都为老数据，此字段标识为Y
	 *
	 */
	private String needUpdPhone;
	/** 商务通链接 */
	private String businessLinkUrl;
	/** 营业期限 */
	private  Date effectiveEndDate;
	/** 营业执照永久有效标记 Y永久 N非永久（此时必须传营业期限） */
	private String isForeverBusiness;
	/** 营业执照图片链接 */
	private String licenseImg;
	/** iask审核状态（冗余字段，仅供查询筛选）0待授权、3待审核、4拒绝、1审核通过、6质检拒绝 8停用 9注销*/
	private String iaskAuthStatus;
	/** iask审核提示 */
	private String iaskAuthMsg;
	/** iask广告主标记，表示是否为iAsk广告主 1是 其他否 */
	private Integer iaskUserMark;
	/** 保存资质时生成，用户点击链接时将token传入，确保用户是通过系统发出的短信进入(协议变更时请重新生成) */
	private String iaskToken;
	/** 用户是否授权（iAsk广告主） 1是 其他否 */
	private Integer iaskUserIsAuth;
	/** 广告主市以下更详细地址 */
	private String street;
	/** 开通产品类型 */
//	private String accountTypeDictVal;
	/** 爱问科技保存的广告主uid */
	private Integer iaskUid;
	/** iask投放计划数量 */
	private Integer iaskPutPlanCount;
	/**
	 * 用户授权时间
	 */
	private Date iaskAuthTime;

	/** iask联系人姓名 */
	private String iaskLinkMan;

	/** iask广告主（联系人）手机号 */
	private String iaskPhoneNumber;

	public String getIaskFirstId() {
		return iaskFirstId;
	}

	public void setIaskFirstId(String iaskFirstId) {
		this.iaskFirstId = iaskFirstId;
	}

	public String getIaskSecondId() {
		return iaskSecondId;
	}

	public void setIaskSecondId(String iaskSecondId) {
		this.iaskSecondId = iaskSecondId;
	}

	public String getIaskLinkMan() {
		return iaskLinkMan;
	}

	public void setIaskLinkMan(String iaskLinkMan) {
		this.iaskLinkMan = iaskLinkMan;
	}

	public String getIaskPhoneNumber() {
		return iaskPhoneNumber;
	}

	public void setIaskPhoneNumber(String iaskPhoneNumber) {
		this.iaskPhoneNumber = iaskPhoneNumber;
	}

	public Date getIaskAuthTime() {
		return iaskAuthTime;
	}

	public void setIaskAuthTime(Date iaskAuthTime) {
		this.iaskAuthTime = iaskAuthTime;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getIaskFirstName() {
		return iaskFirstName;
	}

	public void setIaskFirstName(String iaskFirstName) {
		this.iaskFirstName = iaskFirstName;
	}

	public String getIaskSecondName() {
		return iaskSecondName;
	}

	public void setIaskSecondName(String iaskSecondName) {
		this.iaskSecondName = iaskSecondName;
	}

	public Integer getIaskPutPlanCount() {
		return iaskPutPlanCount;
	}

	public void setIaskPutPlanCount(Integer iaskPutPlanCount) {
		this.iaskPutPlanCount = iaskPutPlanCount;
	}

	public String getIaskAuthMsg() {
		return iaskAuthMsg;
	}

	public void setIaskAuthMsg(String iaskAuthMsg) {
		this.iaskAuthMsg = iaskAuthMsg;
	}

	public Integer getIaskUid() {
		return iaskUid;
	}

	public void setIaskUid(Integer iaskUid) {
		this.iaskUid = iaskUid;
	}

/*	public String getAccountTypeDictVal() {
		return accountTypeDictVal;
	}

	public void setAccountTypeDictVal(String accountTypeDictVal) {
		this.accountTypeDictVal = accountTypeDictVal;
	}*/

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getIsForeverBusiness() {
		return isForeverBusiness;
	}

	public void setIsForeverBusiness(String isForeverBusiness) {
		this.isForeverBusiness = isForeverBusiness;
	}

	public Integer getIaskUserMark() {
		return iaskUserMark;
	}

	public String getIaskAuthStatus() {
		return iaskAuthStatus;
	}

	public void setIaskAuthStatus(String iaskAuthStatus) {
		this.iaskAuthStatus = iaskAuthStatus;
	}

	public void setIaskUserMark(Integer iaskUserMark) {
		this.iaskUserMark = iaskUserMark;
	}

	public String getIaskToken() {
		return iaskToken;
	}

	public void setIaskToken(String iaskToken) {
		this.iaskToken = iaskToken;
	}

	public Integer getIaskUserIsAuth() {
		return iaskUserIsAuth;
	}

	public void setIaskUserIsAuth(Integer iaskUserIsAuth) {
		this.iaskUserIsAuth = iaskUserIsAuth;
	}

	public String getBusinessLinkUrl() {
		return businessLinkUrl;
	}

	public void setBusinessLinkUrl(String businessLinkUrl) {
		this.businessLinkUrl = businessLinkUrl;
	}

	public Date getEffectiveEndDate() {
		return effectiveEndDate;
	}

	public void setEffectiveEndDate(Date effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}

	public String getLicenseImg() {
		return licenseImg;
	}

	public void setLicenseImg(String licenseImg) {
		this.licenseImg = licenseImg;
	}

	public String getNeedUpdPhone() {
		return needUpdPhone;
	}

	public void setNeedUpdPhone(String needUpdPhone) {
		this.needUpdPhone = needUpdPhone;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public static class WaxAccountAduit implements Serializable {
		private static final long serialVersionUID = -4985779529306250093L;
		private Date applyDate;       //申请日期
		private String status;        //审核中1        审核通过2         审核不通过3
		private Date auditDate;       //审核日期
		private String auditDscri;    //审核结果 成功 or 失败原因

		private Date uidBindDate;     //uid绑定申请日期
		private Date uidUnBindDate;   //解绑申请日期
		private String uidBindStatus; //申请已提交 1 绑定审核通过2 审核不通过3 已申请解除4 解除成功5 解除失败6

		public Date getApplyDate() {
			return applyDate;
		}

		public void setApplyDate(Date applyDate) {
			this.applyDate = applyDate;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Date getAuditDate() {
			return auditDate;
		}

		public void setAuditDate(Date auditDate) {
			this.auditDate = auditDate;
		}

		public String getAuditDscri() {
			return auditDscri;
		}

		public void setAuditDscri(String auditDscri) {
			this.auditDscri = auditDscri;
		}

		public Date getUidBindDate() {
			return uidBindDate;
		}

		public void setUidBindDate(Date uidBindDate) {
			this.uidBindDate = uidBindDate;
		}

		public Date getUidUnBindDate() {
			return uidUnBindDate;
		}

		public void setUidUnBindDate(Date uidUnBindDate) {
			this.uidUnBindDate = uidUnBindDate;
		}

		public String getUidBindStatus() {
			return uidBindStatus;
		}

		public void setUidBindStatus(String uidBindStatus) {
			this.uidBindStatus = uidBindStatus;
		}

		@Override
		public String toString() {
			return "WaxAccountAduit [applyDate=" + applyDate + ", status=" + status + ", auditDate=" + auditDate
					+ ", auditDscri=" + auditDscri + ", uidBindDate=" + uidBindDate + ", uidUnBindDate=" + uidUnBindDate
					+ ", uidBindStatus=" + uidBindStatus + "]";
		}

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getRegisterType() {
		return registerType;
	}

	public void setRegisterType(String registerType) {
		this.registerType = registerType;
	}

	public String getLoginMail() {
		return loginMail;
	}

	public void setLoginMail(String loginMail) {
		this.loginMail = loginMail;
	}

	public String getLoginPhone() {
		return loginPhone;
	}

	public void setLoginPhone(String loginPhone) {
		this.loginPhone = loginPhone;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Date getModInformationData() {
		return modInformationData;
	}

	public void setModInformationData(Date modInformationData) {
		this.modInformationData = modInformationData;
	}

	public Integer getModInformationId() {
		return modInformationId;
	}

	public void setModInformationId(Integer modInformationId) {
		this.modInformationId = modInformationId;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserMailBox() {
		return userMailBox;
	}

	public void setUserMailBox(String userMailBox) {
		this.userMailBox = userMailBox;
	}

	public String getWorkUnit() {
		return workUnit;
	}

	public void setWorkUnit(String workUnit) {
		this.workUnit = workUnit;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHeadPhoto() {
		return headPhoto;
	}

	public void setHeadPhoto(String headPhoto) {
		this.headPhoto = headPhoto;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getOperatorPhone() {
		return operatorPhone;
	}

	public void setOperatorPhone(String operatorPhone) {
		this.operatorPhone = operatorPhone;
	}

	public String getOperatorIdentityId() {
		return operatorIdentityId;
	}

	public void setOperatorIdentityId(String operatorIdentityId) {
		this.operatorIdentityId = operatorIdentityId;
	}

	public String getOperatorMail() {
		return operatorMail;
	}

	public void setOperatorMail(String operatorMail) {
		this.operatorMail = operatorMail;
	}

	public String getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}

	public String getDeptAttr() {
		return deptAttr;
	}

	public void setDeptAttr(String deptAttr) {
		this.deptAttr = deptAttr;
	}

	public Integer getAccountManagerId() {
		return accountManagerId;
	}

	public void setAccountManagerId(Integer accountManagerId) {
		this.accountManagerId = accountManagerId;
	}

	public String getAccountManagerName() {
		return accountManagerName;
	}

	public void setAccountManagerName(String accountManagerName) {
		this.accountManagerName = accountManagerName;
	}

	public Integer getServiceManageId() {
		return serviceManageId;
	}

	public void setServiceManageId(Integer serviceManageId) {
		this.serviceManageId = serviceManageId;
	}

	public String getServiceManageName() {
		return serviceManageName;
	}

	public void setServiceManageName(String serviceManageName) {
		this.serviceManageName = serviceManageName;
	}

	public String getFirstId() {
		return firstId;
	}

	public void setFirstId(String firstId) {
		this.firstId = firstId;
	}

	public String getSecondId() {
		return secondId;
	}

	public void setSecondId(String secondId) {
		this.secondId = secondId;
	}

	public String getRecommendedDp() {
		return recommendedDp;
	}

	public void setRecommendedDp(String recommendedDp) {
		this.recommendedDp = recommendedDp;
	}

	public String getRecommendedDbName() {
		return recommendedDbName;
	}

	public void setRecommendedDbName(String recommendedDbName) {
		this.recommendedDbName = recommendedDbName;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getIdentityId() {
		return identityId;
	}

	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getLicenseName() {
		return licenseName;
	}

	public void setLicenseName(String licenseName) {
		this.licenseName = licenseName;
	}

	public String getOpendUid() {
		return opendUid;
	}

	public void setOpendUid(String opendUid) {
		this.opendUid = opendUid;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getIndustryCode() {
		return industryCode;
	}

	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

	public String getIndustryName() {
		return industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	public String getAutoExecuted() {
		return autoExecuted;
	}

	public void setAutoExecuted(String autoExecuted) {
		this.autoExecuted = autoExecuted;
	}

	public WaxAccountAduit getWaxAccountAduit() {
		return waxAccountAduit;
	}

	public void setWaxAccountAduit(WaxAccountAduit waxAccountAduit) {
		this.waxAccountAduit = waxAccountAduit;
	}

	public BigDecimal getAccountTotal() {
		return accountTotal;
	}

	public void setAccountTotal(BigDecimal accountTotal) {
		this.accountTotal = accountTotal;
	}

	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
	}

	public BigDecimal getLockedFunds() {
		return lockedFunds;
	}

	public void setLockedFunds(BigDecimal lockedFunds) {
		this.lockedFunds = lockedFunds;
	}

	public Date getModStatusDate() {
		return modStatusDate;
	}

	public void setModStatusDate(Date modStatusDate) {
		this.modStatusDate = modStatusDate;
	}

	public Integer getModStatusId() {
		return modStatusId;
	}

	public void setModStatusId(Integer modStatusId) {
		this.modStatusId = modStatusId;
	}

	public Date getLastNoLoginTime() {
		return lastNoLoginTime;
	}

	public void setLastNoLoginTime(Date lastNoLoginTime) {
		this.lastNoLoginTime = lastNoLoginTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getPasswordLock() {
		return passwordLock;
	}

	public void setPasswordLock(String passwordLock) {
		this.passwordLock = passwordLock;
	}

	public String getSendNoticeMSGToOperatorResult() {
		return sendNoticeMSGToOperatorResult;
	}

	public void setSendNoticeMSGToOperatorResult(String sendNoticeMSGToOperatorResult) {
		this.sendNoticeMSGToOperatorResult = sendNoticeMSGToOperatorResult;
	}

	public String getAdsToken() {
		return adsToken;
	}

	public void setAdsToken(String adsToken) {
		this.adsToken = adsToken;
	}

	public Date getAdsOauthTime() {
		return adsOauthTime;
	}

	public void setAdsOauthTime(Date adsOauthTime) {
		this.adsOauthTime = adsOauthTime;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getOpenAccountStatus() {
		return openAccountStatus;
	}

	public void setOpenAccountStatus(String openAccountStatus) {
		this.openAccountStatus = openAccountStatus;
	}

	public String getOpenAccountReason() {
		return openAccountReason;
	}

	public void setOpenAccountReason(String openAccountReason) {
		this.openAccountReason = openAccountReason;
	}

	public Date getAdsFirstOauthTime() {
		return adsFirstOauthTime;
	}

	public void setAdsFirstOauthTime(Date adsFirstOauthTime) {
		this.adsFirstOauthTime = adsFirstOauthTime;
	}

	public String getLoginUid() {
		return loginUid;
	}

	public void setLoginUid(String loginUid) {
		this.loginUid = loginUid;
	}

	public String getLoginNickName() {
		return loginNickName;
	}

	public void setLoginNickName(String loginNickName) {
		this.loginNickName = loginNickName;
	}

	public String getUserCenterId() {
		return userCenterId;
	}

	public void setUserCenterId(String userCenterId) {
		this.userCenterId = userCenterId;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getUserInfoType() {
		return userInfoType;
	}

	public void setUserInfoType(String userInfoType) {
		this.userInfoType = userInfoType;
	}

	public String getWeiboLoginName() {
		return weiboLoginName;
	}

	public void setWeiboLoginName(String weiboLoginName) {
		this.weiboLoginName = weiboLoginName;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getIndustryTypeId() {
		return industryTypeId;
	}

	public void setIndustryTypeId(String industryTypeId) {
		this.industryTypeId = industryTypeId;
	}

	public boolean isPayBtnType() {
		return payBtnType;
	}

	public void setPayBtnType(boolean payBtnType) {
		this.payBtnType = payBtnType;
	}

	public String getLoginWeiboHeadPhoto() {
		return loginWeiboHeadPhoto;
	}

	public void setLoginWeiboHeadPhoto(String loginWeiboHeadPhoto) {
		this.loginWeiboHeadPhoto = loginWeiboHeadPhoto;
	}

	public Integer getFinaceCompanyId() {
		return finaceCompanyId;
	}

	public void setFinaceCompanyId(Integer finaceCompanyId) {
		this.finaceCompanyId = finaceCompanyId;
	}

	public int getFansCount() {
		return fansCount;
	}

	public void setFansCount(int fansCount) {
		this.fansCount = fansCount;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getAuditor() {
		return auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}

	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public Integer getIaskFinaceCompanyId() {
		return iaskFinaceCompanyId;
	}

	public void setIaskFinaceCompanyId(Integer iaskFinaceCompanyId) {
		this.iaskFinaceCompanyId = iaskFinaceCompanyId;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", userType=" + userType + ", registerType=" + registerType + ", loginMail="
				+ loginMail + ", loginPhone=" + loginPhone + ", passWord=" + passWord + ", loginUid=" + loginUid
				+ ", loginNickName=" + loginNickName + ", loginWeiboHeadPhoto=" + loginWeiboHeadPhoto
				+ ", modInformationData=" + modInformationData + ", modInformationId=" + modInformationId
				+ ", realName=" + realName + ", mobile=" + mobile + ", userMailBox=" + userMailBox + ", workUnit="
				+ workUnit + ", gender=" + gender + ", headPhoto=" + headPhoto + ", operatorName=" + operatorName
				+ ", operatorPhone=" + operatorPhone + ", operatorIdentityId=" + operatorIdentityId + ", operatorMail="
				+ operatorMail + ", userLevel=" + userLevel + ", deptAttr=" + deptAttr + ", accountManagerId="
				+ accountManagerId + ", accountManagerName=" + accountManagerName + ", serviceManageId="
				+ serviceManageId + ", serviceManageName=" + serviceManageName + ", firstId=" + firstId + ", secondId="
				+ secondId + ", recommendedDp=" + recommendedDp + ", recommendedDbName=" + recommendedDbName
				+ ", enterpriseName=" + enterpriseName + ", identityId=" + identityId + ", licenseNumber="
				+ licenseNumber + ", licenseName=" + licenseName + ", opendUid=" + opendUid + ", nickName=" + nickName
				+ ", auditStatus=" + auditStatus + ", auditor=" + auditor + ", auditTime=" + auditTime + ", province="
				+ province + ", userInfoType=" + userInfoType + ", weiboLoginName=" + weiboLoginName + ", channel="
				+ channel + ", payBtnType=" + payBtnType + ", name=" + name + ", status=" + status + ", city=" + city
				+ ", industryCode=" + industryCode + ", industryName=" + industryName + ", industryTypeId="
				+ industryTypeId + ", autoExecuted=" + autoExecuted + ", waxAccountAduit=" + waxAccountAduit
				+ ", accountTotal=" + accountTotal + ", availableBalance=" + availableBalance + ", lockedFunds="
				+ lockedFunds + ", modStatusDate=" + modStatusDate + ", modStatusId=" + modStatusId
				+ ", lastNoLoginTime=" + lastNoLoginTime + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", passwordLock=" + passwordLock + ", sendNoticeMSGToOperatorResult=" + sendNoticeMSGToOperatorResult
				+ ", adsToken=" + adsToken + ", adsOauthTime=" + adsOauthTime + ", adsFirstOauthTime="
				+ adsFirstOauthTime + ", companyName=" + companyName + ", finaceCompanyId=" + finaceCompanyId
				+ ", userCenterId=" + userCenterId + ", openAccountStatus=" + openAccountStatus + ", openAccountReason="
				+ openAccountReason + ", industry=" + industry + "]";
	}

}
