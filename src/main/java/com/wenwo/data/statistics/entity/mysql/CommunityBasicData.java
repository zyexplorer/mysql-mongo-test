package com.wenwo.data.statistics.entity.mysql;

import io.swagger.annotations.ApiOperation;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CommunityBasicData implements Serializable {
    private Long id;

    private String communityId;

    private String communityName;

    private String department;

    private String label;

    private Integer delFlag;

    private Date createDate;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}