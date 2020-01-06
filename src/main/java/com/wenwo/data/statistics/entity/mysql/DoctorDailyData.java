package com.wenwo.data.statistics.entity.mysql;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class DoctorDailyData implements Serializable {
    private Long id;

    private String doctorId;

    private Integer weiboFansNum;

    private Integer adviceTotal;

    private Integer appointmentNum;

    private Integer articleNum;

    private Integer delFlag;

    private Date createDate;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

}