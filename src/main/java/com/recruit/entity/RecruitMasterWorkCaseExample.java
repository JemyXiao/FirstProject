package com.recruit.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecruitMasterWorkCaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecruitMasterWorkCaseExample() {
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

        public Criteria andWorkNameIsNull() {
            addCriterion("work_name is null");
            return (Criteria) this;
        }

        public Criteria andWorkNameIsNotNull() {
            addCriterion("work_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorkNameEqualTo(String value) {
            addCriterion("work_name =", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotEqualTo(String value) {
            addCriterion("work_name <>", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameGreaterThan(String value) {
            addCriterion("work_name >", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameGreaterThanOrEqualTo(String value) {
            addCriterion("work_name >=", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLessThan(String value) {
            addCriterion("work_name <", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLessThanOrEqualTo(String value) {
            addCriterion("work_name <=", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLike(String value) {
            addCriterion("work_name like", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotLike(String value) {
            addCriterion("work_name not like", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameIn(List<String> values) {
            addCriterion("work_name in", values, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotIn(List<String> values) {
            addCriterion("work_name not in", values, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameBetween(String value1, String value2) {
            addCriterion("work_name between", value1, value2, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotBetween(String value1, String value2) {
            addCriterion("work_name not between", value1, value2, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkResponsibilityIsNull() {
            addCriterion("work_responsibility is null");
            return (Criteria) this;
        }

        public Criteria andWorkResponsibilityIsNotNull() {
            addCriterion("work_responsibility is not null");
            return (Criteria) this;
        }

        public Criteria andWorkResponsibilityEqualTo(String value) {
            addCriterion("work_responsibility =", value, "workResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkResponsibilityNotEqualTo(String value) {
            addCriterion("work_responsibility <>", value, "workResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkResponsibilityGreaterThan(String value) {
            addCriterion("work_responsibility >", value, "workResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkResponsibilityGreaterThanOrEqualTo(String value) {
            addCriterion("work_responsibility >=", value, "workResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkResponsibilityLessThan(String value) {
            addCriterion("work_responsibility <", value, "workResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkResponsibilityLessThanOrEqualTo(String value) {
            addCriterion("work_responsibility <=", value, "workResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkResponsibilityLike(String value) {
            addCriterion("work_responsibility like", value, "workResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkResponsibilityNotLike(String value) {
            addCriterion("work_responsibility not like", value, "workResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkResponsibilityIn(List<String> values) {
            addCriterion("work_responsibility in", values, "workResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkResponsibilityNotIn(List<String> values) {
            addCriterion("work_responsibility not in", values, "workResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkResponsibilityBetween(String value1, String value2) {
            addCriterion("work_responsibility between", value1, value2, "workResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkResponsibilityNotBetween(String value1, String value2) {
            addCriterion("work_responsibility not between", value1, value2, "workResponsibility");
            return (Criteria) this;
        }

        public Criteria andIndustryidIsNull() {
            addCriterion("industryId is null");
            return (Criteria) this;
        }

        public Criteria andIndustryidIsNotNull() {
            addCriterion("industryId is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryidEqualTo(Long value) {
            addCriterion("industryId =", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidNotEqualTo(Long value) {
            addCriterion("industryId <>", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidGreaterThan(Long value) {
            addCriterion("industryId >", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidGreaterThanOrEqualTo(Long value) {
            addCriterion("industryId >=", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidLessThan(Long value) {
            addCriterion("industryId <", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidLessThanOrEqualTo(Long value) {
            addCriterion("industryId <=", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidIn(List<Long> values) {
            addCriterion("industryId in", values, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidNotIn(List<Long> values) {
            addCriterion("industryId not in", values, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidBetween(Long value1, Long value2) {
            addCriterion("industryId between", value1, value2, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidNotBetween(Long value1, Long value2) {
            addCriterion("industryId not between", value1, value2, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustrynameIsNull() {
            addCriterion("industryName is null");
            return (Criteria) this;
        }

        public Criteria andIndustrynameIsNotNull() {
            addCriterion("industryName is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrynameEqualTo(String value) {
            addCriterion("industryName =", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameNotEqualTo(String value) {
            addCriterion("industryName <>", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameGreaterThan(String value) {
            addCriterion("industryName >", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameGreaterThanOrEqualTo(String value) {
            addCriterion("industryName >=", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameLessThan(String value) {
            addCriterion("industryName <", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameLessThanOrEqualTo(String value) {
            addCriterion("industryName <=", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameLike(String value) {
            addCriterion("industryName like", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameNotLike(String value) {
            addCriterion("industryName not like", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameIn(List<String> values) {
            addCriterion("industryName in", values, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameNotIn(List<String> values) {
            addCriterion("industryName not in", values, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameBetween(String value1, String value2) {
            addCriterion("industryName between", value1, value2, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameNotBetween(String value1, String value2) {
            addCriterion("industryName not between", value1, value2, "industryname");
            return (Criteria) this;
        }

        public Criteria andWorkslinkIsNull() {
            addCriterion("worksLink is null");
            return (Criteria) this;
        }

        public Criteria andWorkslinkIsNotNull() {
            addCriterion("worksLink is not null");
            return (Criteria) this;
        }

        public Criteria andWorkslinkEqualTo(String value) {
            addCriterion("worksLink =", value, "workslink");
            return (Criteria) this;
        }

        public Criteria andWorkslinkNotEqualTo(String value) {
            addCriterion("worksLink <>", value, "workslink");
            return (Criteria) this;
        }

        public Criteria andWorkslinkGreaterThan(String value) {
            addCriterion("worksLink >", value, "workslink");
            return (Criteria) this;
        }

        public Criteria andWorkslinkGreaterThanOrEqualTo(String value) {
            addCriterion("worksLink >=", value, "workslink");
            return (Criteria) this;
        }

        public Criteria andWorkslinkLessThan(String value) {
            addCriterion("worksLink <", value, "workslink");
            return (Criteria) this;
        }

        public Criteria andWorkslinkLessThanOrEqualTo(String value) {
            addCriterion("worksLink <=", value, "workslink");
            return (Criteria) this;
        }

        public Criteria andWorkslinkLike(String value) {
            addCriterion("worksLink like", value, "workslink");
            return (Criteria) this;
        }

        public Criteria andWorkslinkNotLike(String value) {
            addCriterion("worksLink not like", value, "workslink");
            return (Criteria) this;
        }

        public Criteria andWorkslinkIn(List<String> values) {
            addCriterion("worksLink in", values, "workslink");
            return (Criteria) this;
        }

        public Criteria andWorkslinkNotIn(List<String> values) {
            addCriterion("worksLink not in", values, "workslink");
            return (Criteria) this;
        }

        public Criteria andWorkslinkBetween(String value1, String value2) {
            addCriterion("worksLink between", value1, value2, "workslink");
            return (Criteria) this;
        }

        public Criteria andWorkslinkNotBetween(String value1, String value2) {
            addCriterion("worksLink not between", value1, value2, "workslink");
            return (Criteria) this;
        }

        public Criteria andWorksdescIsNull() {
            addCriterion("worksDesc is null");
            return (Criteria) this;
        }

        public Criteria andWorksdescIsNotNull() {
            addCriterion("worksDesc is not null");
            return (Criteria) this;
        }

        public Criteria andWorksdescEqualTo(String value) {
            addCriterion("worksDesc =", value, "worksdesc");
            return (Criteria) this;
        }

        public Criteria andWorksdescNotEqualTo(String value) {
            addCriterion("worksDesc <>", value, "worksdesc");
            return (Criteria) this;
        }

        public Criteria andWorksdescGreaterThan(String value) {
            addCriterion("worksDesc >", value, "worksdesc");
            return (Criteria) this;
        }

        public Criteria andWorksdescGreaterThanOrEqualTo(String value) {
            addCriterion("worksDesc >=", value, "worksdesc");
            return (Criteria) this;
        }

        public Criteria andWorksdescLessThan(String value) {
            addCriterion("worksDesc <", value, "worksdesc");
            return (Criteria) this;
        }

        public Criteria andWorksdescLessThanOrEqualTo(String value) {
            addCriterion("worksDesc <=", value, "worksdesc");
            return (Criteria) this;
        }

        public Criteria andWorksdescLike(String value) {
            addCriterion("worksDesc like", value, "worksdesc");
            return (Criteria) this;
        }

        public Criteria andWorksdescNotLike(String value) {
            addCriterion("worksDesc not like", value, "worksdesc");
            return (Criteria) this;
        }

        public Criteria andWorksdescIn(List<String> values) {
            addCriterion("worksDesc in", values, "worksdesc");
            return (Criteria) this;
        }

        public Criteria andWorksdescNotIn(List<String> values) {
            addCriterion("worksDesc not in", values, "worksdesc");
            return (Criteria) this;
        }

        public Criteria andWorksdescBetween(String value1, String value2) {
            addCriterion("worksDesc between", value1, value2, "worksdesc");
            return (Criteria) this;
        }

        public Criteria andWorksdescNotBetween(String value1, String value2) {
            addCriterion("worksDesc not between", value1, value2, "worksdesc");
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