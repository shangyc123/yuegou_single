package com.zr.yuegou_single.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductTypeExample() {
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

        public Criteria andProductTypeIdIsNull() {
            addCriterion("product_type_id is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNotNull() {
            addCriterion("product_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdEqualTo(Long value) {
            addCriterion("product_type_id =", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotEqualTo(Long value) {
            addCriterion("product_type_id <>", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThan(Long value) {
            addCriterion("product_type_id >", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_type_id >=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThan(Long value) {
            addCriterion("product_type_id <", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("product_type_id <=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIn(List<Long> values) {
            addCriterion("product_type_id in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotIn(List<Long> values) {
            addCriterion("product_type_id not in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdBetween(Long value1, Long value2) {
            addCriterion("product_type_id between", value1, value2, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("product_type_id not between", value1, value2, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameIsNull() {
            addCriterion("product_type_name is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameIsNotNull() {
            addCriterion("product_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameEqualTo(String value) {
            addCriterion("product_type_name =", value, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameNotEqualTo(String value) {
            addCriterion("product_type_name <>", value, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameGreaterThan(String value) {
            addCriterion("product_type_name >", value, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_type_name >=", value, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameLessThan(String value) {
            addCriterion("product_type_name <", value, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameLessThanOrEqualTo(String value) {
            addCriterion("product_type_name <=", value, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameLike(String value) {
            addCriterion("product_type_name like", value, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameNotLike(String value) {
            addCriterion("product_type_name not like", value, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameIn(List<String> values) {
            addCriterion("product_type_name in", values, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameNotIn(List<String> values) {
            addCriterion("product_type_name not in", values, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameBetween(String value1, String value2) {
            addCriterion("product_type_name between", value1, value2, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameNotBetween(String value1, String value2) {
            addCriterion("product_type_name not between", value1, value2, "productTypeName");
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

        public Criteria andProductTypeStatusIsNull() {
            addCriterion("product_type_status is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeStatusIsNotNull() {
            addCriterion("product_type_status is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeStatusEqualTo(Byte value) {
            addCriterion("product_type_status =", value, "productTypeStatus");
            return (Criteria) this;
        }

        public Criteria andProductTypeStatusNotEqualTo(Byte value) {
            addCriterion("product_type_status <>", value, "productTypeStatus");
            return (Criteria) this;
        }

        public Criteria andProductTypeStatusGreaterThan(Byte value) {
            addCriterion("product_type_status >", value, "productTypeStatus");
            return (Criteria) this;
        }

        public Criteria andProductTypeStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("product_type_status >=", value, "productTypeStatus");
            return (Criteria) this;
        }

        public Criteria andProductTypeStatusLessThan(Byte value) {
            addCriterion("product_type_status <", value, "productTypeStatus");
            return (Criteria) this;
        }

        public Criteria andProductTypeStatusLessThanOrEqualTo(Byte value) {
            addCriterion("product_type_status <=", value, "productTypeStatus");
            return (Criteria) this;
        }

        public Criteria andProductTypeStatusIn(List<Byte> values) {
            addCriterion("product_type_status in", values, "productTypeStatus");
            return (Criteria) this;
        }

        public Criteria andProductTypeStatusNotIn(List<Byte> values) {
            addCriterion("product_type_status not in", values, "productTypeStatus");
            return (Criteria) this;
        }

        public Criteria andProductTypeStatusBetween(Byte value1, Byte value2) {
            addCriterion("product_type_status between", value1, value2, "productTypeStatus");
            return (Criteria) this;
        }

        public Criteria andProductTypeStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("product_type_status not between", value1, value2, "productTypeStatus");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreatetimeIsNull() {
            addCriterion("product_type_createtime is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreatetimeIsNotNull() {
            addCriterion("product_type_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreatetimeEqualTo(Date value) {
            addCriterion("product_type_createtime =", value, "productTypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreatetimeNotEqualTo(Date value) {
            addCriterion("product_type_createtime <>", value, "productTypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreatetimeGreaterThan(Date value) {
            addCriterion("product_type_createtime >", value, "productTypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("product_type_createtime >=", value, "productTypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreatetimeLessThan(Date value) {
            addCriterion("product_type_createtime <", value, "productTypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("product_type_createtime <=", value, "productTypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreatetimeIn(List<Date> values) {
            addCriterion("product_type_createtime in", values, "productTypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreatetimeNotIn(List<Date> values) {
            addCriterion("product_type_createtime not in", values, "productTypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreatetimeBetween(Date value1, Date value2) {
            addCriterion("product_type_createtime between", value1, value2, "productTypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("product_type_createtime not between", value1, value2, "productTypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdatetimeIsNull() {
            addCriterion("product_type_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdatetimeIsNotNull() {
            addCriterion("product_type_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdatetimeEqualTo(Date value) {
            addCriterion("product_type_updatetime =", value, "productTypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdatetimeNotEqualTo(Date value) {
            addCriterion("product_type_updatetime <>", value, "productTypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdatetimeGreaterThan(Date value) {
            addCriterion("product_type_updatetime >", value, "productTypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("product_type_updatetime >=", value, "productTypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdatetimeLessThan(Date value) {
            addCriterion("product_type_updatetime <", value, "productTypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("product_type_updatetime <=", value, "productTypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdatetimeIn(List<Date> values) {
            addCriterion("product_type_updatetime in", values, "productTypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdatetimeNotIn(List<Date> values) {
            addCriterion("product_type_updatetime not in", values, "productTypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("product_type_updatetime between", value1, value2, "productTypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("product_type_updatetime not between", value1, value2, "productTypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreateuserIsNull() {
            addCriterion("product_type_createuser is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreateuserIsNotNull() {
            addCriterion("product_type_createuser is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreateuserEqualTo(String value) {
            addCriterion("product_type_createuser =", value, "productTypeCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreateuserNotEqualTo(String value) {
            addCriterion("product_type_createuser <>", value, "productTypeCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreateuserGreaterThan(String value) {
            addCriterion("product_type_createuser >", value, "productTypeCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("product_type_createuser >=", value, "productTypeCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreateuserLessThan(String value) {
            addCriterion("product_type_createuser <", value, "productTypeCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreateuserLessThanOrEqualTo(String value) {
            addCriterion("product_type_createuser <=", value, "productTypeCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreateuserLike(String value) {
            addCriterion("product_type_createuser like", value, "productTypeCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreateuserNotLike(String value) {
            addCriterion("product_type_createuser not like", value, "productTypeCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreateuserIn(List<String> values) {
            addCriterion("product_type_createuser in", values, "productTypeCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreateuserNotIn(List<String> values) {
            addCriterion("product_type_createuser not in", values, "productTypeCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreateuserBetween(String value1, String value2) {
            addCriterion("product_type_createuser between", value1, value2, "productTypeCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeCreateuserNotBetween(String value1, String value2) {
            addCriterion("product_type_createuser not between", value1, value2, "productTypeCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdateuserIsNull() {
            addCriterion("product_type_updateuser is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdateuserIsNotNull() {
            addCriterion("product_type_updateuser is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdateuserEqualTo(String value) {
            addCriterion("product_type_updateuser =", value, "productTypeUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdateuserNotEqualTo(String value) {
            addCriterion("product_type_updateuser <>", value, "productTypeUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdateuserGreaterThan(String value) {
            addCriterion("product_type_updateuser >", value, "productTypeUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdateuserGreaterThanOrEqualTo(String value) {
            addCriterion("product_type_updateuser >=", value, "productTypeUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdateuserLessThan(String value) {
            addCriterion("product_type_updateuser <", value, "productTypeUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdateuserLessThanOrEqualTo(String value) {
            addCriterion("product_type_updateuser <=", value, "productTypeUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdateuserLike(String value) {
            addCriterion("product_type_updateuser like", value, "productTypeUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdateuserNotLike(String value) {
            addCriterion("product_type_updateuser not like", value, "productTypeUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdateuserIn(List<String> values) {
            addCriterion("product_type_updateuser in", values, "productTypeUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdateuserNotIn(List<String> values) {
            addCriterion("product_type_updateuser not in", values, "productTypeUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdateuserBetween(String value1, String value2) {
            addCriterion("product_type_updateuser between", value1, value2, "productTypeUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductTypeUpdateuserNotBetween(String value1, String value2) {
            addCriterion("product_type_updateuser not between", value1, value2, "productTypeUpdateuser");
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