package com.zr.yuegou_single.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductDescExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductDescExample() {
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

        public Criteria andProductDescIdIsNull() {
            addCriterion("product_desc_id is null");
            return (Criteria) this;
        }

        public Criteria andProductDescIdIsNotNull() {
            addCriterion("product_desc_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescIdEqualTo(Long value) {
            addCriterion("product_desc_id =", value, "productDescId");
            return (Criteria) this;
        }

        public Criteria andProductDescIdNotEqualTo(Long value) {
            addCriterion("product_desc_id <>", value, "productDescId");
            return (Criteria) this;
        }

        public Criteria andProductDescIdGreaterThan(Long value) {
            addCriterion("product_desc_id >", value, "productDescId");
            return (Criteria) this;
        }

        public Criteria andProductDescIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_desc_id >=", value, "productDescId");
            return (Criteria) this;
        }

        public Criteria andProductDescIdLessThan(Long value) {
            addCriterion("product_desc_id <", value, "productDescId");
            return (Criteria) this;
        }

        public Criteria andProductDescIdLessThanOrEqualTo(Long value) {
            addCriterion("product_desc_id <=", value, "productDescId");
            return (Criteria) this;
        }

        public Criteria andProductDescIdIn(List<Long> values) {
            addCriterion("product_desc_id in", values, "productDescId");
            return (Criteria) this;
        }

        public Criteria andProductDescIdNotIn(List<Long> values) {
            addCriterion("product_desc_id not in", values, "productDescId");
            return (Criteria) this;
        }

        public Criteria andProductDescIdBetween(Long value1, Long value2) {
            addCriterion("product_desc_id between", value1, value2, "productDescId");
            return (Criteria) this;
        }

        public Criteria andProductDescIdNotBetween(Long value1, Long value2) {
            addCriterion("product_desc_id not between", value1, value2, "productDescId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductDescStatusIsNull() {
            addCriterion("product_desc_status is null");
            return (Criteria) this;
        }

        public Criteria andProductDescStatusIsNotNull() {
            addCriterion("product_desc_status is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescStatusEqualTo(Byte value) {
            addCriterion("product_desc_status =", value, "productDescStatus");
            return (Criteria) this;
        }

        public Criteria andProductDescStatusNotEqualTo(Byte value) {
            addCriterion("product_desc_status <>", value, "productDescStatus");
            return (Criteria) this;
        }

        public Criteria andProductDescStatusGreaterThan(Byte value) {
            addCriterion("product_desc_status >", value, "productDescStatus");
            return (Criteria) this;
        }

        public Criteria andProductDescStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("product_desc_status >=", value, "productDescStatus");
            return (Criteria) this;
        }

        public Criteria andProductDescStatusLessThan(Byte value) {
            addCriterion("product_desc_status <", value, "productDescStatus");
            return (Criteria) this;
        }

        public Criteria andProductDescStatusLessThanOrEqualTo(Byte value) {
            addCriterion("product_desc_status <=", value, "productDescStatus");
            return (Criteria) this;
        }

        public Criteria andProductDescStatusIn(List<Byte> values) {
            addCriterion("product_desc_status in", values, "productDescStatus");
            return (Criteria) this;
        }

        public Criteria andProductDescStatusNotIn(List<Byte> values) {
            addCriterion("product_desc_status not in", values, "productDescStatus");
            return (Criteria) this;
        }

        public Criteria andProductDescStatusBetween(Byte value1, Byte value2) {
            addCriterion("product_desc_status between", value1, value2, "productDescStatus");
            return (Criteria) this;
        }

        public Criteria andProductDescStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("product_desc_status not between", value1, value2, "productDescStatus");
            return (Criteria) this;
        }

        public Criteria andProductDescCreatetimeIsNull() {
            addCriterion("product_desc_createtime is null");
            return (Criteria) this;
        }

        public Criteria andProductDescCreatetimeIsNotNull() {
            addCriterion("product_desc_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescCreatetimeEqualTo(Date value) {
            addCriterion("product_desc_createtime =", value, "productDescCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductDescCreatetimeNotEqualTo(Date value) {
            addCriterion("product_desc_createtime <>", value, "productDescCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductDescCreatetimeGreaterThan(Date value) {
            addCriterion("product_desc_createtime >", value, "productDescCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductDescCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("product_desc_createtime >=", value, "productDescCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductDescCreatetimeLessThan(Date value) {
            addCriterion("product_desc_createtime <", value, "productDescCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductDescCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("product_desc_createtime <=", value, "productDescCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductDescCreatetimeIn(List<Date> values) {
            addCriterion("product_desc_createtime in", values, "productDescCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductDescCreatetimeNotIn(List<Date> values) {
            addCriterion("product_desc_createtime not in", values, "productDescCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductDescCreatetimeBetween(Date value1, Date value2) {
            addCriterion("product_desc_createtime between", value1, value2, "productDescCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductDescCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("product_desc_createtime not between", value1, value2, "productDescCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdatetimeIsNull() {
            addCriterion("product_desc_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdatetimeIsNotNull() {
            addCriterion("product_desc_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdatetimeEqualTo(Date value) {
            addCriterion("product_desc_updatetime =", value, "productDescUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdatetimeNotEqualTo(Date value) {
            addCriterion("product_desc_updatetime <>", value, "productDescUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdatetimeGreaterThan(Date value) {
            addCriterion("product_desc_updatetime >", value, "productDescUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("product_desc_updatetime >=", value, "productDescUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdatetimeLessThan(Date value) {
            addCriterion("product_desc_updatetime <", value, "productDescUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("product_desc_updatetime <=", value, "productDescUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdatetimeIn(List<Date> values) {
            addCriterion("product_desc_updatetime in", values, "productDescUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdatetimeNotIn(List<Date> values) {
            addCriterion("product_desc_updatetime not in", values, "productDescUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("product_desc_updatetime between", value1, value2, "productDescUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("product_desc_updatetime not between", value1, value2, "productDescUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductDescCreateuserIsNull() {
            addCriterion("product_desc_createuser is null");
            return (Criteria) this;
        }

        public Criteria andProductDescCreateuserIsNotNull() {
            addCriterion("product_desc_createuser is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescCreateuserEqualTo(String value) {
            addCriterion("product_desc_createuser =", value, "productDescCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescCreateuserNotEqualTo(String value) {
            addCriterion("product_desc_createuser <>", value, "productDescCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescCreateuserGreaterThan(String value) {
            addCriterion("product_desc_createuser >", value, "productDescCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("product_desc_createuser >=", value, "productDescCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescCreateuserLessThan(String value) {
            addCriterion("product_desc_createuser <", value, "productDescCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescCreateuserLessThanOrEqualTo(String value) {
            addCriterion("product_desc_createuser <=", value, "productDescCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescCreateuserLike(String value) {
            addCriterion("product_desc_createuser like", value, "productDescCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescCreateuserNotLike(String value) {
            addCriterion("product_desc_createuser not like", value, "productDescCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescCreateuserIn(List<String> values) {
            addCriterion("product_desc_createuser in", values, "productDescCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescCreateuserNotIn(List<String> values) {
            addCriterion("product_desc_createuser not in", values, "productDescCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescCreateuserBetween(String value1, String value2) {
            addCriterion("product_desc_createuser between", value1, value2, "productDescCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescCreateuserNotBetween(String value1, String value2) {
            addCriterion("product_desc_createuser not between", value1, value2, "productDescCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdateuserIsNull() {
            addCriterion("product_desc_updateuser is null");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdateuserIsNotNull() {
            addCriterion("product_desc_updateuser is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdateuserEqualTo(String value) {
            addCriterion("product_desc_updateuser =", value, "productDescUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdateuserNotEqualTo(String value) {
            addCriterion("product_desc_updateuser <>", value, "productDescUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdateuserGreaterThan(String value) {
            addCriterion("product_desc_updateuser >", value, "productDescUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdateuserGreaterThanOrEqualTo(String value) {
            addCriterion("product_desc_updateuser >=", value, "productDescUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdateuserLessThan(String value) {
            addCriterion("product_desc_updateuser <", value, "productDescUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdateuserLessThanOrEqualTo(String value) {
            addCriterion("product_desc_updateuser <=", value, "productDescUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdateuserLike(String value) {
            addCriterion("product_desc_updateuser like", value, "productDescUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdateuserNotLike(String value) {
            addCriterion("product_desc_updateuser not like", value, "productDescUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdateuserIn(List<String> values) {
            addCriterion("product_desc_updateuser in", values, "productDescUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdateuserNotIn(List<String> values) {
            addCriterion("product_desc_updateuser not in", values, "productDescUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdateuserBetween(String value1, String value2) {
            addCriterion("product_desc_updateuser between", value1, value2, "productDescUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescUpdateuserNotBetween(String value1, String value2) {
            addCriterion("product_desc_updateuser not between", value1, value2, "productDescUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductDescProductdescIsNull() {
            addCriterion("product_desc_productdesc is null");
            return (Criteria) this;
        }

        public Criteria andProductDescProductdescIsNotNull() {
            addCriterion("product_desc_productdesc is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescProductdescEqualTo(String value) {
            addCriterion("product_desc_productdesc =", value, "productDescProductdesc");
            return (Criteria) this;
        }

        public Criteria andProductDescProductdescNotEqualTo(String value) {
            addCriterion("product_desc_productdesc <>", value, "productDescProductdesc");
            return (Criteria) this;
        }

        public Criteria andProductDescProductdescGreaterThan(String value) {
            addCriterion("product_desc_productdesc >", value, "productDescProductdesc");
            return (Criteria) this;
        }

        public Criteria andProductDescProductdescGreaterThanOrEqualTo(String value) {
            addCriterion("product_desc_productdesc >=", value, "productDescProductdesc");
            return (Criteria) this;
        }

        public Criteria andProductDescProductdescLessThan(String value) {
            addCriterion("product_desc_productdesc <", value, "productDescProductdesc");
            return (Criteria) this;
        }

        public Criteria andProductDescProductdescLessThanOrEqualTo(String value) {
            addCriterion("product_desc_productdesc <=", value, "productDescProductdesc");
            return (Criteria) this;
        }

        public Criteria andProductDescProductdescLike(String value) {
            addCriterion("product_desc_productdesc like", value, "productDescProductdesc");
            return (Criteria) this;
        }

        public Criteria andProductDescProductdescNotLike(String value) {
            addCriterion("product_desc_productdesc not like", value, "productDescProductdesc");
            return (Criteria) this;
        }

        public Criteria andProductDescProductdescIn(List<String> values) {
            addCriterion("product_desc_productdesc in", values, "productDescProductdesc");
            return (Criteria) this;
        }

        public Criteria andProductDescProductdescNotIn(List<String> values) {
            addCriterion("product_desc_productdesc not in", values, "productDescProductdesc");
            return (Criteria) this;
        }

        public Criteria andProductDescProductdescBetween(String value1, String value2) {
            addCriterion("product_desc_productdesc between", value1, value2, "productDescProductdesc");
            return (Criteria) this;
        }

        public Criteria andProductDescProductdescNotBetween(String value1, String value2) {
            addCriterion("product_desc_productdesc not between", value1, value2, "productDescProductdesc");
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