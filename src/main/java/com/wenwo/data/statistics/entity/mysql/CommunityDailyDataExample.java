package com.wenwo.data.statistics.entity.mysql;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommunityDailyDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommunityDailyDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCommunityIdIsNull() {
            addCriterion("community_id is null");
            return (Criteria) this;
        }

        public Criteria andCommunityIdIsNotNull() {
            addCriterion("community_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityIdEqualTo(String value) {
            addCriterion("community_id =", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotEqualTo(String value) {
            addCriterion("community_id <>", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdGreaterThan(String value) {
            addCriterion("community_id >", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdGreaterThanOrEqualTo(String value) {
            addCriterion("community_id >=", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdLessThan(String value) {
            addCriterion("community_id <", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdLessThanOrEqualTo(String value) {
            addCriterion("community_id <=", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdLike(String value) {
            addCriterion("community_id like", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotLike(String value) {
            addCriterion("community_id not like", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdIn(List<String> values) {
            addCriterion("community_id in", values, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotIn(List<String> values) {
            addCriterion("community_id not in", values, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdBetween(String value1, String value2) {
            addCriterion("community_id between", value1, value2, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotBetween(String value1, String value2) {
            addCriterion("community_id not between", value1, value2, "communityId");
            return (Criteria) this;
        }

        public Criteria andDoctorNumIsNull() {
            addCriterion("doctor_num is null");
            return (Criteria) this;
        }

        public Criteria andDoctorNumIsNotNull() {
            addCriterion("doctor_num is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorNumEqualTo(Integer value) {
            addCriterion("doctor_num =", value, "doctorNum");
            return (Criteria) this;
        }

        public Criteria andDoctorNumNotEqualTo(Integer value) {
            addCriterion("doctor_num <>", value, "doctorNum");
            return (Criteria) this;
        }

        public Criteria andDoctorNumGreaterThan(Integer value) {
            addCriterion("doctor_num >", value, "doctorNum");
            return (Criteria) this;
        }

        public Criteria andDoctorNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_num >=", value, "doctorNum");
            return (Criteria) this;
        }

        public Criteria andDoctorNumLessThan(Integer value) {
            addCriterion("doctor_num <", value, "doctorNum");
            return (Criteria) this;
        }

        public Criteria andDoctorNumLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_num <=", value, "doctorNum");
            return (Criteria) this;
        }

        public Criteria andDoctorNumIn(List<Integer> values) {
            addCriterion("doctor_num in", values, "doctorNum");
            return (Criteria) this;
        }

        public Criteria andDoctorNumNotIn(List<Integer> values) {
            addCriterion("doctor_num not in", values, "doctorNum");
            return (Criteria) this;
        }

        public Criteria andDoctorNumBetween(Integer value1, Integer value2) {
            addCriterion("doctor_num between", value1, value2, "doctorNum");
            return (Criteria) this;
        }

        public Criteria andDoctorNumNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_num not between", value1, value2, "doctorNum");
            return (Criteria) this;
        }

        public Criteria andUserNumIsNull() {
            addCriterion("user_num is null");
            return (Criteria) this;
        }

        public Criteria andUserNumIsNotNull() {
            addCriterion("user_num is not null");
            return (Criteria) this;
        }

        public Criteria andUserNumEqualTo(Integer value) {
            addCriterion("user_num =", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumNotEqualTo(Integer value) {
            addCriterion("user_num <>", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumGreaterThan(Integer value) {
            addCriterion("user_num >", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_num >=", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumLessThan(Integer value) {
            addCriterion("user_num <", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumLessThanOrEqualTo(Integer value) {
            addCriterion("user_num <=", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumIn(List<Integer> values) {
            addCriterion("user_num in", values, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumNotIn(List<Integer> values) {
            addCriterion("user_num not in", values, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumBetween(Integer value1, Integer value2) {
            addCriterion("user_num between", value1, value2, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumNotBetween(Integer value1, Integer value2) {
            addCriterion("user_num not between", value1, value2, "userNum");
            return (Criteria) this;
        }

        public Criteria andInvitationProduceContentNumIsNull() {
            addCriterion("invitation_produce_content_num is null");
            return (Criteria) this;
        }

        public Criteria andInvitationProduceContentNumIsNotNull() {
            addCriterion("invitation_produce_content_num is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationProduceContentNumEqualTo(Integer value) {
            addCriterion("invitation_produce_content_num =", value, "invitationProduceContentNum");
            return (Criteria) this;
        }

        public Criteria andInvitationProduceContentNumNotEqualTo(Integer value) {
            addCriterion("invitation_produce_content_num <>", value, "invitationProduceContentNum");
            return (Criteria) this;
        }

        public Criteria andInvitationProduceContentNumGreaterThan(Integer value) {
            addCriterion("invitation_produce_content_num >", value, "invitationProduceContentNum");
            return (Criteria) this;
        }

        public Criteria andInvitationProduceContentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("invitation_produce_content_num >=", value, "invitationProduceContentNum");
            return (Criteria) this;
        }

        public Criteria andInvitationProduceContentNumLessThan(Integer value) {
            addCriterion("invitation_produce_content_num <", value, "invitationProduceContentNum");
            return (Criteria) this;
        }

        public Criteria andInvitationProduceContentNumLessThanOrEqualTo(Integer value) {
            addCriterion("invitation_produce_content_num <=", value, "invitationProduceContentNum");
            return (Criteria) this;
        }

        public Criteria andInvitationProduceContentNumIn(List<Integer> values) {
            addCriterion("invitation_produce_content_num in", values, "invitationProduceContentNum");
            return (Criteria) this;
        }

        public Criteria andInvitationProduceContentNumNotIn(List<Integer> values) {
            addCriterion("invitation_produce_content_num not in", values, "invitationProduceContentNum");
            return (Criteria) this;
        }

        public Criteria andInvitationProduceContentNumBetween(Integer value1, Integer value2) {
            addCriterion("invitation_produce_content_num between", value1, value2, "invitationProduceContentNum");
            return (Criteria) this;
        }

        public Criteria andInvitationProduceContentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("invitation_produce_content_num not between", value1, value2, "invitationProduceContentNum");
            return (Criteria) this;
        }

        public Criteria andPostContentNumIsNull() {
            addCriterion("post_content_num is null");
            return (Criteria) this;
        }

        public Criteria andPostContentNumIsNotNull() {
            addCriterion("post_content_num is not null");
            return (Criteria) this;
        }

        public Criteria andPostContentNumEqualTo(Integer value) {
            addCriterion("post_content_num =", value, "postContentNum");
            return (Criteria) this;
        }

        public Criteria andPostContentNumNotEqualTo(Integer value) {
            addCriterion("post_content_num <>", value, "postContentNum");
            return (Criteria) this;
        }

        public Criteria andPostContentNumGreaterThan(Integer value) {
            addCriterion("post_content_num >", value, "postContentNum");
            return (Criteria) this;
        }

        public Criteria andPostContentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_content_num >=", value, "postContentNum");
            return (Criteria) this;
        }

        public Criteria andPostContentNumLessThan(Integer value) {
            addCriterion("post_content_num <", value, "postContentNum");
            return (Criteria) this;
        }

        public Criteria andPostContentNumLessThanOrEqualTo(Integer value) {
            addCriterion("post_content_num <=", value, "postContentNum");
            return (Criteria) this;
        }

        public Criteria andPostContentNumIn(List<Integer> values) {
            addCriterion("post_content_num in", values, "postContentNum");
            return (Criteria) this;
        }

        public Criteria andPostContentNumNotIn(List<Integer> values) {
            addCriterion("post_content_num not in", values, "postContentNum");
            return (Criteria) this;
        }

        public Criteria andPostContentNumBetween(Integer value1, Integer value2) {
            addCriterion("post_content_num between", value1, value2, "postContentNum");
            return (Criteria) this;
        }

        public Criteria andPostContentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("post_content_num not between", value1, value2, "postContentNum");
            return (Criteria) this;
        }

        public Criteria andHealthNumIsNull() {
            addCriterion("health_num is null");
            return (Criteria) this;
        }

        public Criteria andHealthNumIsNotNull() {
            addCriterion("health_num is not null");
            return (Criteria) this;
        }

        public Criteria andHealthNumEqualTo(Integer value) {
            addCriterion("health_num =", value, "healthNum");
            return (Criteria) this;
        }

        public Criteria andHealthNumNotEqualTo(Integer value) {
            addCriterion("health_num <>", value, "healthNum");
            return (Criteria) this;
        }

        public Criteria andHealthNumGreaterThan(Integer value) {
            addCriterion("health_num >", value, "healthNum");
            return (Criteria) this;
        }

        public Criteria andHealthNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("health_num >=", value, "healthNum");
            return (Criteria) this;
        }

        public Criteria andHealthNumLessThan(Integer value) {
            addCriterion("health_num <", value, "healthNum");
            return (Criteria) this;
        }

        public Criteria andHealthNumLessThanOrEqualTo(Integer value) {
            addCriterion("health_num <=", value, "healthNum");
            return (Criteria) this;
        }

        public Criteria andHealthNumIn(List<Integer> values) {
            addCriterion("health_num in", values, "healthNum");
            return (Criteria) this;
        }

        public Criteria andHealthNumNotIn(List<Integer> values) {
            addCriterion("health_num not in", values, "healthNum");
            return (Criteria) this;
        }

        public Criteria andHealthNumBetween(Integer value1, Integer value2) {
            addCriterion("health_num between", value1, value2, "healthNum");
            return (Criteria) this;
        }

        public Criteria andHealthNumNotBetween(Integer value1, Integer value2) {
            addCriterion("health_num not between", value1, value2, "healthNum");
            return (Criteria) this;
        }

        public Criteria andCounselNumIsNull() {
            addCriterion("counsel_num is null");
            return (Criteria) this;
        }

        public Criteria andCounselNumIsNotNull() {
            addCriterion("counsel_num is not null");
            return (Criteria) this;
        }

        public Criteria andCounselNumEqualTo(Integer value) {
            addCriterion("counsel_num =", value, "counselNum");
            return (Criteria) this;
        }

        public Criteria andCounselNumNotEqualTo(Integer value) {
            addCriterion("counsel_num <>", value, "counselNum");
            return (Criteria) this;
        }

        public Criteria andCounselNumGreaterThan(Integer value) {
            addCriterion("counsel_num >", value, "counselNum");
            return (Criteria) this;
        }

        public Criteria andCounselNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("counsel_num >=", value, "counselNum");
            return (Criteria) this;
        }

        public Criteria andCounselNumLessThan(Integer value) {
            addCriterion("counsel_num <", value, "counselNum");
            return (Criteria) this;
        }

        public Criteria andCounselNumLessThanOrEqualTo(Integer value) {
            addCriterion("counsel_num <=", value, "counselNum");
            return (Criteria) this;
        }

        public Criteria andCounselNumIn(List<Integer> values) {
            addCriterion("counsel_num in", values, "counselNum");
            return (Criteria) this;
        }

        public Criteria andCounselNumNotIn(List<Integer> values) {
            addCriterion("counsel_num not in", values, "counselNum");
            return (Criteria) this;
        }

        public Criteria andCounselNumBetween(Integer value1, Integer value2) {
            addCriterion("counsel_num between", value1, value2, "counselNum");
            return (Criteria) this;
        }

        public Criteria andCounselNumNotBetween(Integer value1, Integer value2) {
            addCriterion("counsel_num not between", value1, value2, "counselNum");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumIsNull() {
            addCriterion("appointment_num is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumIsNotNull() {
            addCriterion("appointment_num is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumEqualTo(Integer value) {
            addCriterion("appointment_num =", value, "appointmentNum");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumNotEqualTo(Integer value) {
            addCriterion("appointment_num <>", value, "appointmentNum");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumGreaterThan(Integer value) {
            addCriterion("appointment_num >", value, "appointmentNum");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("appointment_num >=", value, "appointmentNum");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumLessThan(Integer value) {
            addCriterion("appointment_num <", value, "appointmentNum");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumLessThanOrEqualTo(Integer value) {
            addCriterion("appointment_num <=", value, "appointmentNum");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumIn(List<Integer> values) {
            addCriterion("appointment_num in", values, "appointmentNum");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumNotIn(List<Integer> values) {
            addCriterion("appointment_num not in", values, "appointmentNum");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumBetween(Integer value1, Integer value2) {
            addCriterion("appointment_num between", value1, value2, "appointmentNum");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("appointment_num not between", value1, value2, "appointmentNum");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Integer value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Integer value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Integer value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Integer value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Integer value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Integer> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Integer> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Integer value1, Integer value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}