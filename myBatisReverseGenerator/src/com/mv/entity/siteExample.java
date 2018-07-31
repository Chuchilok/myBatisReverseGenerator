package com.mv.entity;

import com.neusoft.util.PaginationUtil;
import java.util.ArrayList;
import java.util.List;

public class siteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected PaginationUtil pagination;

    public siteExample() {
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

    public void setPagination(PaginationUtil pagination) {
        this.pagination=pagination;
    }

    public PaginationUtil getPagination() {
        return pagination;
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

        public Criteria andSiteIdIsNull() {
            addCriterion("site_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(Integer value) {
            addCriterion("site_id =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(Integer value) {
            addCriterion("site_id <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(Integer value) {
            addCriterion("site_id >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("site_id >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(Integer value) {
            addCriterion("site_id <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("site_id <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<Integer> values) {
            addCriterion("site_id in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<Integer> values) {
            addCriterion("site_id not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(Integer value1, Integer value2) {
            addCriterion("site_id between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("site_id not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andScrIdIsNull() {
            addCriterion("scr_id is null");
            return (Criteria) this;
        }

        public Criteria andScrIdIsNotNull() {
            addCriterion("scr_id is not null");
            return (Criteria) this;
        }

        public Criteria andScrIdEqualTo(Integer value) {
            addCriterion("scr_id =", value, "scrId");
            return (Criteria) this;
        }

        public Criteria andScrIdNotEqualTo(Integer value) {
            addCriterion("scr_id <>", value, "scrId");
            return (Criteria) this;
        }

        public Criteria andScrIdGreaterThan(Integer value) {
            addCriterion("scr_id >", value, "scrId");
            return (Criteria) this;
        }

        public Criteria andScrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scr_id >=", value, "scrId");
            return (Criteria) this;
        }

        public Criteria andScrIdLessThan(Integer value) {
            addCriterion("scr_id <", value, "scrId");
            return (Criteria) this;
        }

        public Criteria andScrIdLessThanOrEqualTo(Integer value) {
            addCriterion("scr_id <=", value, "scrId");
            return (Criteria) this;
        }

        public Criteria andScrIdIn(List<Integer> values) {
            addCriterion("scr_id in", values, "scrId");
            return (Criteria) this;
        }

        public Criteria andScrIdNotIn(List<Integer> values) {
            addCriterion("scr_id not in", values, "scrId");
            return (Criteria) this;
        }

        public Criteria andScrIdBetween(Integer value1, Integer value2) {
            addCriterion("scr_id between", value1, value2, "scrId");
            return (Criteria) this;
        }

        public Criteria andScrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scr_id not between", value1, value2, "scrId");
            return (Criteria) this;
        }

        public Criteria andSesIdIsNull() {
            addCriterion("ses_id is null");
            return (Criteria) this;
        }

        public Criteria andSesIdIsNotNull() {
            addCriterion("ses_id is not null");
            return (Criteria) this;
        }

        public Criteria andSesIdEqualTo(Integer value) {
            addCriterion("ses_id =", value, "sesId");
            return (Criteria) this;
        }

        public Criteria andSesIdNotEqualTo(Integer value) {
            addCriterion("ses_id <>", value, "sesId");
            return (Criteria) this;
        }

        public Criteria andSesIdGreaterThan(Integer value) {
            addCriterion("ses_id >", value, "sesId");
            return (Criteria) this;
        }

        public Criteria andSesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ses_id >=", value, "sesId");
            return (Criteria) this;
        }

        public Criteria andSesIdLessThan(Integer value) {
            addCriterion("ses_id <", value, "sesId");
            return (Criteria) this;
        }

        public Criteria andSesIdLessThanOrEqualTo(Integer value) {
            addCriterion("ses_id <=", value, "sesId");
            return (Criteria) this;
        }

        public Criteria andSesIdIn(List<Integer> values) {
            addCriterion("ses_id in", values, "sesId");
            return (Criteria) this;
        }

        public Criteria andSesIdNotIn(List<Integer> values) {
            addCriterion("ses_id not in", values, "sesId");
            return (Criteria) this;
        }

        public Criteria andSesIdBetween(Integer value1, Integer value2) {
            addCriterion("ses_id between", value1, value2, "sesId");
            return (Criteria) this;
        }

        public Criteria andSesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ses_id not between", value1, value2, "sesId");
            return (Criteria) this;
        }

        public Criteria andEmptyIsNull() {
            addCriterion("empty is null");
            return (Criteria) this;
        }

        public Criteria andEmptyIsNotNull() {
            addCriterion("empty is not null");
            return (Criteria) this;
        }

        public Criteria andEmptyEqualTo(Integer value) {
            addCriterion("empty =", value, "empty");
            return (Criteria) this;
        }

        public Criteria andEmptyNotEqualTo(Integer value) {
            addCriterion("empty <>", value, "empty");
            return (Criteria) this;
        }

        public Criteria andEmptyGreaterThan(Integer value) {
            addCriterion("empty >", value, "empty");
            return (Criteria) this;
        }

        public Criteria andEmptyGreaterThanOrEqualTo(Integer value) {
            addCriterion("empty >=", value, "empty");
            return (Criteria) this;
        }

        public Criteria andEmptyLessThan(Integer value) {
            addCriterion("empty <", value, "empty");
            return (Criteria) this;
        }

        public Criteria andEmptyLessThanOrEqualTo(Integer value) {
            addCriterion("empty <=", value, "empty");
            return (Criteria) this;
        }

        public Criteria andEmptyIn(List<Integer> values) {
            addCriterion("empty in", values, "empty");
            return (Criteria) this;
        }

        public Criteria andEmptyNotIn(List<Integer> values) {
            addCriterion("empty not in", values, "empty");
            return (Criteria) this;
        }

        public Criteria andEmptyBetween(Integer value1, Integer value2) {
            addCriterion("empty between", value1, value2, "empty");
            return (Criteria) this;
        }

        public Criteria andEmptyNotBetween(Integer value1, Integer value2) {
            addCriterion("empty not between", value1, value2, "empty");
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