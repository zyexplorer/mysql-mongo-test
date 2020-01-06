package com.wenwo.data.statistics.entity.mongodb.community;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * ClassName:ActivityInvitations Date: 2018年10月27日 09:32:28 活动邀约产出内容
 * 
 * @author lidy
 * @version
 * @since JDK 1.8
 */
@Data
@ApiModel(value = "活动邀约产出内容")
@Document(collection = "com.wenwo.cloud.biz.invitationsproducecontent")
public class InvitationsProduCecontent implements Serializable {
	private static final long serialVersionUID = 4995276792757579324L;
	
    @ApiModelProperty("主键ID")
	private String id;
    @ApiModelProperty("邀约ID")
	private String actId;
    @ApiModelProperty("邀约名称")
	private String actName;
    @ApiModelProperty("标题")
	private String title;
    @ApiModelProperty("内容ID（文章ID/视频ID）")
	private String contentId;
    @ApiModelProperty("内容分类ID")
	private String classId;
    @ApiModelProperty("分类名称")
	private String className;
    @ApiModelProperty("专题ID")
	private String subjectId;
    @ApiModelProperty("专题名称")
	private String subjectName;
    @ApiModelProperty("内容类型（文章:0,视频:1)")
	private String contentType;
    @ApiModelProperty("作者")
	private String authorName;
    @ApiModelProperty("作者ID")
	private String authorId;
    @ApiModelProperty("作者类型（医生：0")
	private String authorType;
    @ApiModelProperty("科室Id")
	private String depId;
    @ApiModelProperty("科室名称")
	private String depName;	
    @ApiModelProperty("来源（0：专题邀约，1：文章邀约，2：诊室投稿，3：其它）")
	private String sourceType;
    @ApiModelProperty("提交日期")
	private Date createTime;
    @ApiModelProperty("文章标签ID")
	private List<String> lables;
    @ApiModelProperty("采纳状态（-1:删除、0:待采纳、1:采纳、2:丢弃）")
	private String status;
    @ApiModelProperty("是否置顶（0:不顶置 1:顶置 ")
	private int isStick;
    @ApiModelProperty("所属机构ID")
	private String bId;
    @ApiModelProperty("所属社区ID")
	private String comtyId;
    @ApiModelProperty("内容链接")
	private String url;	
    @ApiModelProperty("点赞数（视频文章专属）")
    private Long likeCount;
    /**
     * 同医端文章分类（1 健康科普;2 诊间日记;3 患者自述;4 热点追踪;5 病例分析;6 医院资讯;7 集团资讯;8 媒体文章;9 医药文章;10 视频文章）
     * （频道需求添加）
     */
    @ApiModelProperty("同医端文章分类(目前同步的:1 健康科普;2 诊间日记; 5 病例分析;)")
    private String articleType;
    /**
     * 文章唯一Id,对应医生端数据,用于去重
     * （频道需求添加）
     */
    @ApiModelProperty("文章唯一Id,对应医生端数据,用于去重")
    private String articleId;
    /**
     * 疾病标签名称集合(同步医端的)
     * （频道需求添加）
     */
    @ApiModelProperty("疾病标签名称集合(同步医端的)")
    private List<String> diseaseTagName;
    /**
     * 医端推送文章时间 (频道)  与医端文章真实发布时间有一点差异
     */
    @ApiModelProperty("医端推送文章时间")
    private Date initPublishTime;
	
	// 辅助字段---------
    @ApiModelProperty("阅读数")
	private String readCount_uv;	//阅读数
    @ApiModelProperty("阅读人数")
	private String readCount_pv;	//阅读人数
    @ApiModelProperty("有帮助数")
	private String supportCount;	//有帮助
    @ApiModelProperty("无帮助数")
	private String unhelpfulCount;	//无帮助
    /**
     * 点赞数
     */
    @ApiModelProperty("点赞数")
    private long praisePoints = 0;
    /**
     * 评论数
     */
    @ApiModelProperty("评论数")
    private long comments = 0;
    /**
     * pv
     */
    @ApiModelProperty("浏览数")
    private long pv = 0;
    /**
     * uv
     */
    @ApiModelProperty("访问用户数")
    private long uv = 0;
    /**
     * wbPv
     */
    @ApiModelProperty("微博用户浏览数")
    private long wbPv = 0;
    /**
     * wbUv
     */
    @ApiModelProperty("微博访问用户数")
    private long wbUv = 0;
    /**
     * wxPv
     */
    @ApiModelProperty("微信用户浏览数")
    private long wxPv = 0;
    /**
     * wxUv
     */
    @ApiModelProperty("微信访问用户数")
    private long wxUv = 0;
    /**
     * 虚拟阅读数
     */
    @ApiModelProperty("虚拟阅读数")
    private long virtualPv = 0;
}
