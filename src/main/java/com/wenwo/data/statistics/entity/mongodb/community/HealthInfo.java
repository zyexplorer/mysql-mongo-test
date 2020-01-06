package com.wenwo.data.statistics.entity.mongodb.community;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author bin.yin
 * @version v1.3.0
 * @date 2019/3/19 19:23
 * @description 健康知识
 */
@Data
@ApiModel
@Document(collection = "com.wenwo.cloud.biz.healthinfo")
public class HealthInfo implements Serializable {

    private static final long serialVersionUID = 8222918010241503125L;

    /**
     * 主键id
     */
    @ApiModelProperty("主键id")
    private String id;

    /**
     * 标题
     */
    @ApiModelProperty("标题")
    private String title;

    /**
     * 封面图
     */
    @ApiModelProperty("封面图")
    private Cover cover;

    /**
     * 发布者
     */
    @ApiModelProperty("发布者")
    private String publisher;

    /**
     * 发布者头像
     */
    @ApiModelProperty("发布者头像")
    private Cover pic;
    /**
     * @author bin.yin
     * @version v1.3.0
     * @date 2019/3/19 19:23
     * @description 图片内部类
     */
    @Data
    static class Cover{

        /**
         * 图片id
         */
        @ApiModelProperty("图片id")
        private String id;

        /**
         * 图片url
         */
        @ApiModelProperty("图片url")
        private String url;
    }



    /**
     * 内容
     */
    @ApiModelProperty("内容")
    private String content;

    /**
     * 社区id
     */
    @ApiModelProperty("社区id")
    private String comtyId;

    /**
     * 状态（1：已删除 0：使用中）
     */
    @ApiModelProperty("状态")
    private String status = "0";

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime = new Date();


    /**
     * 排序值
     */
    @ApiModelProperty("排序值")
    private long sortNum = new Date().getTime();

    /**
     * 类型（1：健康知识 2：资讯公告）
     */
    @ApiModelProperty("类型")
    private String  type;

    /**
     * [冗余字段] 发布起始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("[冗余字段] 发布起始时间")
    private Date  startTime;

    /**
     * [冗余字段] 发布结束时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("[冗余字段] 发布结束时间")
    private Date  endTime;

    /**
     * [冗余字段] 浏览量
     */
    @ApiModelProperty("[冗余字段] 浏览量")
    private Long pv;
    /**
     * [冗余字段] 浏览用户数
     */
    @ApiModelProperty("[冗余字段] 浏览用户数")
    private Long uv;

    /**
     * [冗余字段] 微博浏览量
     */
    @ApiModelProperty("[冗余字段] 微博浏览量")
    private Long wpv;
    /**
     * [冗余字段] 微博浏览用户数
     */
    @ApiModelProperty("[冗余字段] 微博浏览用户数")
    private Long wuv;

}
