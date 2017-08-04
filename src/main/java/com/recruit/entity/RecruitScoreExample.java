package com.recruit.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecruitScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecruitScoreExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Long value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Long value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Long value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Long value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Long> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Long> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Long value1, Long value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNull() {
            addCriterion("task_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("task_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(String value) {
            addCriterion("task_type =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(String value) {
            addCriterion("task_type <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(String value) {
            addCriterion("task_type >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("task_type >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(String value) {
            addCriterion("task_type <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("task_type <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLike(String value) {
            addCriterion("task_type like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotLike(String value) {
            addCriterion("task_type not like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<String> values) {
            addCriterion("task_type in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<String> values) {
            addCriterion("task_type not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(String value1, String value2) {
            addCriterion("task_type between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(String value1, String value2) {
            addCriterion("task_type not between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andAttitudeScoreIsNull() {
            addCriterion("attitude_score is null");
            return (Criteria) this;
        }

        public Criteria andAttitudeScoreIsNotNull() {
            addCriterion("attitude_score is not null");
            return (Criteria) this;
        }

        public Criteria andAttitudeScoreEqualTo(Byte value) {
            addCriterion("attitude_score =", value, "attitudeScore");
            return (Criteria) this;
        }

        public Criteria andAttitudeScoreNotEqualTo(Byte value) {
            addCriterion("attitude_score <>", value, "attitudeScore");
            return (Criteria) this;
        }

        public Criteria andAttitudeScoreGreaterThan(Byte value) {
            addCriterion("attitude_score >", value, "attitudeScore");
            return (Criteria) this;
        }

        public Criteria andAttitudeScoreGreaterThanOrEqualTo(Byte value) {
            addCriterion("attitude_score >=", value, "attitudeScore");
            return (Criteria) this;
        }

        public Criteria andAttitudeScoreLessThan(Byte value) {
            addCriterion("attitude_score <", value, "attitudeScore");
            return (Criteria) this;
        }

        public Criteria andAttitudeScoreLessThanOrEqualTo(Byte value) {
            addCriterion("attitude_score <=", value, "attitudeScore");
            return (Criteria) this;
        }

        public Criteria andAttitudeScoreIn(List<Byte> values) {
            addCriterion("attitude_score in", values, "attitudeScore");
            return (Criteria) this;
        }

        public Criteria andAttitudeScoreNotIn(List<Byte> values) {
            addCriterion("attitude_score not in", values, "attitudeScore");
            return (Criteria) this;
        }

        public Criteria andAttitudeScoreBetween(Byte value1, Byte value2) {
            addCriterion("attitude_score between", value1, value2, "attitudeScore");
            return (Criteria) this;
        }

        public Criteria andAttitudeScoreNotBetween(Byte value1, Byte value2) {
            addCriterion("attitude_score not between", value1, value2, "attitudeScore");
            return (Criteria) this;
        }

        public Criteria andPayTimeScoreIsNull() {
            addCriterion("pay_time_score is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeScoreIsNotNull() {
            addCriterion("pay_time_score is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeScoreEqualTo(Byte value) {
            addCriterion("pay_time_score =", value, "payTimeScore");
            return (Criteria) this;
        }

        public Criteria andPayTimeScoreNotEqualTo(Byte value) {
            addCriterion("pay_time_score <>", value, "payTimeScore");
            return (Criteria) this;
        }

        public Criteria andPayTimeScoreGreaterThan(Byte value) {
            addCriterion("pay_time_score >", value, "payTimeScore");
            return (Criteria) this;
        }

        public Criteria andPayTimeScoreGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_time_score >=", value, "payTimeScore");
            return (Criteria) this;
        }

        public Criteria andPayTimeScoreLessThan(Byte value) {
            addCriterion("pay_time_score <", value, "payTimeScore");
            return (Criteria) this;
        }

        public Criteria andPayTimeScoreLessThanOrEqualTo(Byte value) {
            addCriterion("pay_time_score <=", value, "payTimeScore");
            return (Criteria) this;
        }

        public Criteria andPayTimeScoreIn(List<Byte> values) {
            addCriterion("pay_time_score in", values, "payTimeScore");
            return (Criteria) this;
        }

        public Criteria andPayTimeScoreNotIn(List<Byte> values) {
            addCriterion("pay_time_score not in", values, "payTimeScore");
            return (Criteria) this;
        }

        public Criteria andPayTimeScoreBetween(Byte value1, Byte value2) {
            addCriterion("pay_time_score between", value1, value2, "payTimeScore");
            return (Criteria) this;
        }

        public Criteria andPayTimeScoreNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_time_score not between", value1, value2, "payTimeScore");
            return (Criteria) this;
        }

        public Criteria andCoordinationScoreIsNull() {
            addCriterion("coordination_score is null");
            return (Criteria) this;
        }

        public Criteria andCoordinationScoreIsNotNull() {
            addCriterion("coordination_score is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinationScoreEqualTo(Byte value) {
            addCriterion("coordination_score =", value, "coordinationScore");
            return (Criteria) this;
        }

        public Criteria andCoordinationScoreNotEqualTo(Byte value) {
            addCriterion("coordination_score <>", value, "coordinationScore");
            return (Criteria) this;
        }

        public Criteria andCoordinationScoreGreaterThan(Byte value) {
            addCriterion("coordination_score >", value, "coordinationScore");
            return (Criteria) this;
        }

        public Criteria andCoordinationScoreGreaterThanOrEqualTo(Byte value) {
            addCriterion("coordination_score >=", value, "coordinationScore");
            return (Criteria) this;
        }

        public Criteria andCoordinationScoreLessThan(Byte value) {
            addCriterion("coordination_score <", value, "coordinationScore");
            return (Criteria) this;
        }

        public Criteria andCoordinationScoreLessThanOrEqualTo(Byte value) {
            addCriterion("coordination_score <=", value, "coordinationScore");
            return (Criteria) this;
        }

        public Criteria andCoordinationScoreIn(List<Byte> values) {
            addCriterion("coordination_score in", values, "coordinationScore");
            return (Criteria) this;
        }

        public Criteria andCoordinationScoreNotIn(List<Byte> values) {
            addCriterion("coordination_score not in", values, "coordinationScore");
            return (Criteria) this;
        }

        public Criteria andCoordinationScoreBetween(Byte value1, Byte value2) {
            addCriterion("coordination_score between", value1, value2, "coordinationScore");
            return (Criteria) this;
        }

        public Criteria andCoordinationScoreNotBetween(Byte value1, Byte value2) {
            addCriterion("coordination_score not between", value1, value2, "coordinationScore");
            return (Criteria) this;
        }

        public Criteria andQualityScoreIsNull() {
            addCriterion("quality_score is null");
            return (Criteria) this;
        }

        public Criteria andQualityScoreIsNotNull() {
            addCriterion("quality_score is not null");
            return (Criteria) this;
        }

        public Criteria andQualityScoreEqualTo(Byte value) {
            addCriterion("quality_score =", value, "qualityScore");
            return (Criteria) this;
        }

        public Criteria andQualityScoreNotEqualTo(Byte value) {
            addCriterion("quality_score <>", value, "qualityScore");
            return (Criteria) this;
        }

        public Criteria andQualityScoreGreaterThan(Byte value) {
            addCriterion("quality_score >", value, "qualityScore");
            return (Criteria) this;
        }

        public Criteria andQualityScoreGreaterThanOrEqualTo(Byte value) {
            addCriterion("quality_score >=", value, "qualityScore");
            return (Criteria) this;
        }

        public Criteria andQualityScoreLessThan(Byte value) {
            addCriterion("quality_score <", value, "qualityScore");
            return (Criteria) this;
        }

        public Criteria andQualityScoreLessThanOrEqualTo(Byte value) {
            addCriterion("quality_score <=", value, "qualityScore");
            return (Criteria) this;
        }

        public Criteria andQualityScoreIn(List<Byte> values) {
            addCriterion("quality_score in", values, "qualityScore");
            return (Criteria) this;
        }

        public Criteria andQualityScoreNotIn(List<Byte> values) {
            addCriterion("quality_score not in", values, "qualityScore");
            return (Criteria) this;
        }

        public Criteria andQualityScoreBetween(Byte value1, Byte value2) {
            addCriterion("quality_score between", value1, value2, "qualityScore");
            return (Criteria) this;
        }

        public Criteria andQualityScoreNotBetween(Byte value1, Byte value2) {
            addCriterion("quality_score not between", value1, value2, "qualityScore");
            return (Criteria) this;
        }

        public Criteria andEffectScoreIsNull() {
            addCriterion("effect_score is null");
            return (Criteria) this;
        }

        public Criteria andEffectScoreIsNotNull() {
            addCriterion("effect_score is not null");
            return (Criteria) this;
        }

        public Criteria andEffectScoreEqualTo(Byte value) {
            addCriterion("effect_score =", value, "effectScore");
            return (Criteria) this;
        }

        public Criteria andEffectScoreNotEqualTo(Byte value) {
            addCriterion("effect_score <>", value, "effectScore");
            return (Criteria) this;
        }

        public Criteria andEffectScoreGreaterThan(Byte value) {
            addCriterion("effect_score >", value, "effectScore");
            return (Criteria) this;
        }

        public Criteria andEffectScoreGreaterThanOrEqualTo(Byte value) {
            addCriterion("effect_score >=", value, "effectScore");
            return (Criteria) this;
        }

        public Criteria andEffectScoreLessThan(Byte value) {
            addCriterion("effect_score <", value, "effectScore");
            return (Criteria) this;
        }

        public Criteria andEffectScoreLessThanOrEqualTo(Byte value) {
            addCriterion("effect_score <=", value, "effectScore");
            return (Criteria) this;
        }

        public Criteria andEffectScoreIn(List<Byte> values) {
            addCriterion("effect_score in", values, "effectScore");
            return (Criteria) this;
        }

        public Criteria andEffectScoreNotIn(List<Byte> values) {
            addCriterion("effect_score not in", values, "effectScore");
            return (Criteria) this;
        }

        public Criteria andEffectScoreBetween(Byte value1, Byte value2) {
            addCriterion("effect_score between", value1, value2, "effectScore");
            return (Criteria) this;
        }

        public Criteria andEffectScoreNotBetween(Byte value1, Byte value2) {
            addCriterion("effect_score not between", value1, value2, "effectScore");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
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