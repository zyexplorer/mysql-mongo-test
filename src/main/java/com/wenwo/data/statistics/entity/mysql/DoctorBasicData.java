package com.wenwo.data.statistics.entity.mysql;

import java.io.Serializable;
import java.util.Date;

public class DoctorBasicData implements Serializable {
    private Long id;

    private String doctorId;

    private String realName;

    private String weiboId;

    private String weiboNickname;

    private String titles;

    private String city;

    private String hospital;

    private String hospitalLevel;

    private String department;

    private String onlineLevel;

    private String community;

    private String isBusiness;

    private Integer delFlag;

    private Date createDate;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

}