package com.wenwo.data.statistics.entity.mongodb.community;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * ClassName:Community Date: 2018年10月27日 09:32:28
 * 社区
 * @author lidy
 * @version
 * @since JDK 1.8
 */
@Data
@Document(collection = "com.wenwo.cloud.biz.community")
@ApiModel(value = "社区实体")
public class Community implements Serializable {
    /**
     *序列号
     */
    private static final long serialVersionUID = -3952926030807388809L;
    /**
	 * 主键ID
	 */
	@ApiModelProperty("主键ID")
	private String id;
	/**
	 * 所属机构ID【B端客户主键ID】
	 */
	@ApiModelProperty("所属机构ID")
	@JsonProperty(value = "bId")
	private String bId;
	/**
	 * 社区名称
	 */
	@ApiModelProperty("社区名称")
	private String comtyName;
	/**
	 * 社区slogan
	 */
	@ApiModelProperty("社区slogan")
	private String introduction;
	/**
	 * 社区类型v1.5.6版本(1:医院 2:机构/集团 3:医生团体 4:项目型)
	 */
	@ApiModelProperty("社区类型")
	private String	type;
	/**
	 * 社区类型ID（一级）
	 *（v1.5.6 弃用）
	 */
	@ApiModelProperty("社区一级类型ID")
	private String comtyFatherId;
	/**
	 * 社区类型ID（二级）
	 * （v1.5.6 弃用）
	 */
	@ApiModelProperty("社区二级类型ID")
	private String comtySonId;
	/**
	 * 科室下疾病标签id(社区标签 v1.5.3更新)
	 */
	@ApiModelProperty("社区标签")
	private List<String> labelName;
	/**
	 * 二维码
	 */
	@ApiModelProperty("二维码")
	private String qrCode;
	/**
	 * 认证审核状态  [未认证:-1、不通过:0 、通过:1 、待审核:2]
	 */
	@ApiModelProperty("认证审核状态")
	private String auditStatus;
	/**
	 * v1.5.4 更新
	 * 社区上线状态（0：已下架、1：已上线、2：已注销、3：未上线、4：上线审核中、5：上线审核失败、6：违规下架）
	 */
	@ApiModelProperty("社区状态")
	private String status;
	/**
	 * 注销原因
	 */
	@ApiModelProperty("注销原因")
	private String reason;
	/**
	 * 创建时间
	 */
	@ApiModelProperty("创建时间")
	private Date createTime;
   
    /**
     * 地址(v1.5.3 新增)
	 * v1.5.6 （对应不同类型社区的 相关地址，比如医院类型社区为医院地址，机构/集团类型社区为机构/集团地址...）
     */
	@ApiModelProperty("地址")
	private String address;
	/**
     * 省份id(v1.5.3 新增)
     */
    @ApiModelProperty("省份id")
    private String provinceId;
    /**
     * 城市id(v1.5.3 新增)
     */
    @ApiModelProperty("城市id")
    private String cityId;
    /**
     * 行政区id(v1.5.3 新增)
     */
    @ApiModelProperty("行政区id")
    private String districtId;
	/**
	 * 企业名称
	 * v1.5.6 （对应不同类型社区的 相关名称，比如医院类型社区为医院名称，机构/集团类型社区为机构/集团名称...）
	 */
	@ApiModelProperty("企业名称")
	private String corporateName;
	/**
	 * 机构代码(H5注册无，pc为非必填)
	 */
	@ApiModelProperty("机构代码")
	private String companyCode;
	/**
	 * 客服URL
	 */
	@ApiModelProperty("客服URL")
	private String serviceUrl;
	/**
	 * 公众号业务ID
	 */
	@ApiModelProperty(" 公众号业务ID")
	private String wxBusinessId;
    /**
     * h5社区介绍图片展示
     */
	@ApiModelProperty("h5社区介绍图片展示")
	private List<Image> introductImages;
    /**
	 * 授权方appid
	 */
	@ApiModelProperty("wxAuthorizerAppId")
	private String wxAuthorizerAppId;
	/**
	 * 社区简称
	 */
	@ApiModelProperty("社区简称")
	private String abbreviation;
    /**
     * 社区简介
     */
	@ApiModelProperty("社区简介")
    private String introduce;
	/**
	 * 社区logo
	 */
	@ApiModelProperty("社区logo")
	private Image logo;
	/**
	 * 医院名称(v1.5.3 新增)
	 */
	@ApiModelProperty("医院名称")
	private String hospitalName;
	/**
	 * 医院科室(v1.5.3 新增)
	 */
	@ApiModelProperty("医院科室")
	private List<String> departmentIds;
	/**
	 * 联系人(v1.5.3 新增)
	 */
	@ApiModelProperty("联系人")
	private String linkman;
	/**
	 * 联系方式(v1.5.3 新增)
	 */
	@ApiModelProperty("联系方式")
	private String phone;
	/**
	 * (v1.5.3 新增)
	 */
	@ApiModelProperty("审核不通原因(v1.5.3 新增)")
	private String auditReason;
	/**
	 * (v1.5.4 新增)[待审核:-1、不通过:0 、通过:1 ]
	 */
	@ApiModelProperty("上线审核状态(v1.5.4 新增)[待审核:-1、不通过:0 、通过:1 ]")
	private String onlineStatus;
	/**
	 * (v1.5.4 新增)
	 */
	@ApiModelProperty("上线审核不通原因(v1.5.4 新增)")
	private String onlineReason;
	/**
	 * (v1.5.4 新增)
	 */
	@ApiModelProperty("下架再次申请上线原因(v1.5.4 新增)")
	private String applyOnlineReason;
    /**
     * (v1.5.4 新增)
     */
    @ApiModelProperty("申请上线时间")
    private Date applyOnlineTime;
    /**
     * (v1.5.5 新增)
     */
    @ApiModelProperty("申请上线记录id")
    private String applyOnlineId;
    /**
     * (v1.5.5 新增)
     */
    @ApiModelProperty("申请资质审核时间")
    private Date applyAuditTime;
	/**
	 * (v1.5.6 新增)
	 */
	@ApiModelProperty("医院库医院主键id（与医院库做关联，非医院类型社区无此字段）")
	private String hospitalId;
	/**
	 * 经营性质(v1.5.6 新增) 
	 *（非医院类型社区无此字段）
	 */
	@ApiModelProperty("经营性质 [0：私立、1：公立 ]")
	private String property;
	/**
	 * 医院类型(v1.5.6 新增)
	 *（非医院类型社区无此字段）
	 */
	@ApiModelProperty("医院类型[0：诊所、1：卫生所、2：社区卫生服务中心、3：医院]")
	private String hospitalType;
	/**
	 * (v1.5.6 新增)
	 */
	@ApiModelProperty("项目介绍（非项目类型社区无此字段）")
	private String programIntro;
	/**
	 * (v1.5.6 新增)
	 */
	@ApiModelProperty("社区标识（prd:正式,test:测试）")
	private String openStatus;

	/**
	 * @Description 图片内部类
	 * @author pin.zhao
	 * @date 2019年7月22日 上午10:25:18
	 * @version v1.5.2
	 */
	@Data
	public static class Image {    	

		@ApiModelProperty("图片id")
    	private String id = "";
    	
    	@ApiModelProperty("图片链接")
    	private String url = "";
    }
	
	/**
     * 社区医生数量【冗余设计不保存数据】
     */
    @ApiModelProperty("社区医生数量【冗余设计不保存数据】")
	private Integer doctorCount;
	
	/**
	 * 社区类型名称（一级）【冗余设计不保存数据】
	 */
    @ApiModelProperty("社区类型名称（一级）【冗余设计不保存数据】")
	private String comtyFatherName;
	/**
	 * 社区类型名称（二级）【冗余设计不保存数据】
	 */
    @ApiModelProperty("社区类型名称（二级）【冗余设计不保存数据】")
	private String comtySonName;
	/**
	 * 所属机构名称【冗余设计不保存数据】
	 */
    @ApiModelProperty("所属机构名称【冗余设计不保存数据】")
	private String bName;
	/**
	 * 开通的应用【冗余设计不保存数据】
	 */
    @ApiModelProperty("开通的应用【冗余设计不保存数据】")
	private String apps;
	/**
	 * 机构电话【冗余设计不保存数据】v1.5.7 jim.han
	 */
	@ApiModelProperty("机构电话【冗余设计不保存数据】")
	private String bPhone;
	/**
	 * channel值【冗余设计不保存数据】v1.5.7 jim.han
	 */
	@ApiModelProperty("channel值【冗余设计不保存数据】")
	private String channel;

	/**
	 * 社区来源，【PC：PC注册   H5: H5注册   DH：牙医管家注册	其他来源注册待定】
	 * @author ShuangLong.Wang
	 * 2019年11月29日11:23:06
	 */
	@ApiModelProperty("社区来源，【PC：PC注册   H5: H5注册   DH：牙医管家注册】")
	private String sourceType;
}
