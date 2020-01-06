package com.wenwo.data.statistics.entity.mongodb.community;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 描述:社区视频
 * @版本: v1.4.1
 * @作者: lidy
 * @时间: 2019年4月2日 下午2:08:08
 */
@Data
@ApiModel(value = "社区视频")
@Document(collection = "com.wenwo.cloud.biz.communityvideo")
public class CommunityVideo {

    /**
     * 主键视频内容ID
     */
    @ApiModelProperty("主键ID")
    private String id;
    /**
     * 视频标题
     */
    @ApiModelProperty("视频标题")
    private String title;
    /**
     * 视频描述
     */
    @ApiModelProperty("视频描述")
    private String description;
    /**
     * 视频url
     */
    @ApiModelProperty("视频url")
    private String url;
    /**
     * 视频封面Url
     */
    @ApiModelProperty("视频封面Url")
    private String videoCover;
    /**
     * 上传文件ID
     */
    @ApiModelProperty("上传文件ID")
    private String fileId;
    /**
     * 视频发布者名称
     */
    @ApiModelProperty("视频发布者名称")
    private String publisher;
    /**
     * 视频发布者头像
     */
    @ApiModelProperty("视频发布者头像")
    private String publishCover;
    /**
     * 视频所属社区
     */
    @ApiModelProperty("视频所属社区")
    private String comtyId;
    /**
     * v1.5.6新增
     * 社区标识（prd:正式,test:测试）
     */
    @ApiModelProperty("社区标识（prd:正式,test:测试）")
    private String comtyOpenStatus;
    /**
     * 视频状态（0:已删除 1:使用中 2:无效视频）
     */
    @ApiModelProperty("视频状态（0:已删除 1:使用中  2:无效视频）")
    private String status;
    /**
     * 是否是置顶视频（0:非置顶 1:置顶）
     */
    @ApiModelProperty("视频置顶状态")
    private String isTop;
    /**
     * 是否是热门视频（0:非热门 1:热门）
     */
    @ApiModelProperty("是否是热门视频（0:非热门 1:热门）")
    private String isHot;
    /**
     * 是否已上线（0:已下线 1:已上线 2:未上线（待发布）3:上传中
     */
    @ApiModelProperty("是否已上线（0:已下线 1:已上线 2:未上线（待发布）3:上传中）")
    private String isPublish;
    /**
     * 是否为推荐视频（0:非推荐 1:推荐）
     */
    @ApiModelProperty("是否为推荐视频（0:非推荐 1:推荐）")
    private String isRecommend;
    /**
     * 视频自定义标签
     */
    @ApiModelProperty("视频自定义标签")
    private List<String> lables;
    /**
     * 发布时间
     */
    @ApiModelProperty("发布时间")
    private Date createTime;
    /**
     * 视频修改时间
     */
    @ApiModelProperty("视频修改时间")
    private Date updateTime;
    /**
     * 视频时长
     */
    @ApiModelProperty("视频时长")
    private String videoTime;
    
    /**
     * 文件名称
     */
    @ApiModelProperty("文件名称")
    private String fileName;
    
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
    @ApiModelProperty("pv")
    private long pv = 0;
    /**
     * uv
     */
    @ApiModelProperty("uv")
    private long uv = 0;
    /**
     * wbPv
     */
    @ApiModelProperty("wbPv")
    private long wbPv = 0;
    /**
     * wbUv
     */
    @ApiModelProperty("wbUv")
    private long wbUv = 0;
    /**
     * wxPv
     */
    @ApiModelProperty("wxPv")
    private long wxPv = 0;
    /**
     * wxUv
     */
    @ApiModelProperty("wxUv")
    private long wxUv = 0;
    
    /**
     * 课程介绍
     */
    @ApiModelProperty("课程介绍")
    private String intro;
    /**
     * 课程大纲
     */
    @ApiModelProperty("课程大纲")
    private String outline;
    /**
     * 医生头衔
     */
    @ApiModelProperty("医生头衔")
    private String doctorTitle;
    /**
     * 问卷链接
     */
    @ApiModelProperty("问卷链接")
    private String questionnaireUrl;
    /**
     * 分享数
     */
    @ApiModelProperty("分享数")
    private long shareNum;
    /**
     * 排序值
     */
    @ApiModelProperty("排序值")
    private int sort;
    /**
     * 虚拟阅读数
     */
    @ApiModelProperty("虚拟阅读数")
    private long virtualPv = 0;
    

}
