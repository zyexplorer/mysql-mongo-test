package com.wenwo.data.statistics.entity.mysql;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CommunityDailyData implements Serializable {
    private Long id;

    private String communityId;

    private Integer doctorNum;

    private Integer userNum;

    private Integer invitationProduceContentNum;

    private Integer postContentNum;

    private Integer healthNum;

    private Integer counselNum;

    private Integer appointmentNum;

    private Integer delFlag;

    private Date createDate;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

}