package com.zr.yuegou_single.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductCostpriceIsNull() {
            addCriterion("product_costprice is null");
            return (Criteria) this;
        }

        public Criteria andProductCostpriceIsNotNull() {
            addCriterion("product_costprice is not null");
            return (Criteria) this;
        }

        public Criteria andProductCostpriceEqualTo(BigDecimal value) {
            addCriterion("product_costprice =", value, "productCostprice");
            return (Criteria) this;
        }

        public Criteria andProductCostpriceNotEqualTo(BigDecimal value) {
            addCriterion("product_costprice <>", value, "productCostprice");
            return (Criteria) this;
        }

        public Criteria andProductCostpriceGreaterThan(BigDecimal value) {
            addCriterion("product_costprice >", value, "productCostprice");
            return (Criteria) this;
        }

        public Criteria andProductCostpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("product_costprice >=", value, "productCostprice");
            return (Criteria) this;
        }

        public Criteria andProductCostpriceLessThan(BigDecimal value) {
            addCriterion("product_costprice <", value, "productCostprice");
            return (Criteria) this;
        }

        public Criteria andProductCostpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("product_costprice <=", value, "productCostprice");
            return (Criteria) this;
        }

        public Criteria andProductCostpriceIn(List<BigDecimal> values) {
            addCriterion("product_costprice in", values, "productCostprice");
            return (Criteria) this;
        }

        public Criteria andProductCostpriceNotIn(List<BigDecimal> values) {
            addCriterion("product_costprice not in", values, "productCostprice");
            return (Criteria) this;
        }

        public Criteria andProductCostpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_costprice between", value1, value2, "productCostprice");
            return (Criteria) this;
        }

        public Criteria andProductCostpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_costprice not between", value1, value2, "productCostprice");
            return (Criteria) this;
        }

        public Criteria andProductImageIsNull() {
            addCriterion("product_image is null");
            return (Criteria) this;
        }

        public Criteria andProductImageIsNotNull() {
            addCriterion("product_image is not null");
            return (Criteria) this;
        }

        public Criteria andProductImageEqualTo(String value) {
            addCriterion("product_image =", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageNotEqualTo(String value) {
            addCriterion("product_image <>", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageGreaterThan(String value) {
            addCriterion("product_image >", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageGreaterThanOrEqualTo(String value) {
            addCriterion("product_image >=", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageLessThan(String value) {
            addCriterion("product_image <", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageLessThanOrEqualTo(String value) {
            addCriterion("product_image <=", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageLike(String value) {
            addCriterion("product_image like", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageNotLike(String value) {
            addCriterion("product_image not like", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageIn(List<String> values) {
            addCriterion("product_image in", values, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageNotIn(List<String> values) {
            addCriterion("product_image not in", values, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageBetween(String value1, String value2) {
            addCriterion("product_image between", value1, value2, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageNotBetween(String value1, String value2) {
            addCriterion("product_image not between", value1, value2, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductTypeidIsNull() {
            addCriterion("product_typeid is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeidIsNotNull() {
            addCriterion("product_typeid is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeidEqualTo(Long value) {
            addCriterion("product_typeid =", value, "productTypeid");
            return (Criteria) this;
        }

        public Criteria andProductTypeidNotEqualTo(Long value) {
            addCriterion("product_typeid <>", value, "productTypeid");
            return (Criteria) this;
        }

        public Criteria andProductTypeidGreaterThan(Long value) {
            addCriterion("product_typeid >", value, "productTypeid");
            return (Criteria) this;
        }

        public Criteria andProductTypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("product_typeid >=", value, "productTypeid");
            return (Criteria) this;
        }

        public Criteria andProductTypeidLessThan(Long value) {
            addCriterion("product_typeid <", value, "productTypeid");
            return (Criteria) this;
        }

        public Criteria andProductTypeidLessThanOrEqualTo(Long value) {
            addCriterion("product_typeid <=", value, "productTypeid");
            return (Criteria) this;
        }

        public Criteria andProductTypeidIn(List<Long> values) {
            addCriterion("product_typeid in", values, "productTypeid");
            return (Criteria) this;
        }

        public Criteria andProductTypeidNotIn(List<Long> values) {
            addCriterion("product_typeid not in", values, "productTypeid");
            return (Criteria) this;
        }

        public Criteria andProductTypeidBetween(Long value1, Long value2) {
            addCriterion("product_typeid between", value1, value2, "productTypeid");
            return (Criteria) this;
        }

        public Criteria andProductTypeidNotBetween(Long value1, Long value2) {
            addCriterion("product_typeid not between", value1, value2, "productTypeid");
            return (Criteria) this;
        }

        public Criteria andProductTypenameIsNull() {
            addCriterion("product_typename is null");
            return (Criteria) this;
        }

        public Criteria andProductTypenameIsNotNull() {
            addCriterion("product_typename is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypenameEqualTo(String value) {
            addCriterion("product_typename =", value, "productTypename");
            return (Criteria) this;
        }

        public Criteria andProductTypenameNotEqualTo(String value) {
            addCriterion("product_typename <>", value, "productTypename");
            return (Criteria) this;
        }

        public Criteria andProductTypenameGreaterThan(String value) {
            addCriterion("product_typename >", value, "productTypename");
            return (Criteria) this;
        }

        public Criteria andProductTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("product_typename >=", value, "productTypename");
            return (Criteria) this;
        }

        public Criteria andProductTypenameLessThan(String value) {
            addCriterion("product_typename <", value, "productTypename");
            return (Criteria) this;
        }

        public Criteria andProductTypenameLessThanOrEqualTo(String value) {
            addCriterion("product_typename <=", value, "productTypename");
            return (Criteria) this;
        }

        public Criteria andProductTypenameLike(String value) {
            addCriterion("product_typename like", value, "productTypename");
            return (Criteria) this;
        }

        public Criteria andProductTypenameNotLike(String value) {
            addCriterion("product_typename not like", value, "productTypename");
            return (Criteria) this;
        }

        public Criteria andProductTypenameIn(List<String> values) {
            addCriterion("product_typename in", values, "productTypename");
            return (Criteria) this;
        }

        public Criteria andProductTypenameNotIn(List<String> values) {
            addCriterion("product_typename not in", values, "productTypename");
            return (Criteria) this;
        }

        public Criteria andProductTypenameBetween(String value1, String value2) {
            addCriterion("product_typename between", value1, value2, "productTypename");
            return (Criteria) this;
        }

        public Criteria andProductTypenameNotBetween(String value1, String value2) {
            addCriterion("product_typename not between", value1, value2, "productTypename");
            return (Criteria) this;
        }

        public Criteria andProductSalepointIsNull() {
            addCriterion("product_salepoint is null");
            return (Criteria) this;
        }

        public Criteria andProductSalepointIsNotNull() {
            addCriterion("product_salepoint is not null");
            return (Criteria) this;
        }

        public Criteria andProductSalepointEqualTo(String value) {
            addCriterion("product_salepoint =", value, "productSalepoint");
            return (Criteria) this;
        }

        public Criteria andProductSalepointNotEqualTo(String value) {
            addCriterion("product_salepoint <>", value, "productSalepoint");
            return (Criteria) this;
        }

        public Criteria andProductSalepointGreaterThan(String value) {
            addCriterion("product_salepoint >", value, "productSalepoint");
            return (Criteria) this;
        }

        public Criteria andProductSalepointGreaterThanOrEqualTo(String value) {
            addCriterion("product_salepoint >=", value, "productSalepoint");
            return (Criteria) this;
        }

        public Criteria andProductSalepointLessThan(String value) {
            addCriterion("product_salepoint <", value, "productSalepoint");
            return (Criteria) this;
        }

        public Criteria andProductSalepointLessThanOrEqualTo(String value) {
            addCriterion("product_salepoint <=", value, "productSalepoint");
            return (Criteria) this;
        }

        public Criteria andProductSalepointLike(String value) {
            addCriterion("product_salepoint like", value, "productSalepoint");
            return (Criteria) this;
        }

        public Criteria andProductSalepointNotLike(String value) {
            addCriterion("product_salepoint not like", value, "productSalepoint");
            return (Criteria) this;
        }

        public Criteria andProductSalepointIn(List<String> values) {
            addCriterion("product_salepoint in", values, "productSalepoint");
            return (Criteria) this;
        }

        public Criteria andProductSalepointNotIn(List<String> values) {
            addCriterion("product_salepoint not in", values, "productSalepoint");
            return (Criteria) this;
        }

        public Criteria andProductSalepointBetween(String value1, String value2) {
            addCriterion("product_salepoint between", value1, value2, "productSalepoint");
            return (Criteria) this;
        }

        public Criteria andProductSalepointNotBetween(String value1, String value2) {
            addCriterion("product_salepoint not between", value1, value2, "productSalepoint");
            return (Criteria) this;
        }

        public Criteria andProductValueIsNull() {
            addCriterion("product_value is null");
            return (Criteria) this;
        }

        public Criteria andProductValueIsNotNull() {
            addCriterion("product_value is not null");
            return (Criteria) this;
        }

        public Criteria andProductValueEqualTo(BigDecimal value) {
            addCriterion("product_value =", value, "productValue");
            return (Criteria) this;
        }

        public Criteria andProductValueNotEqualTo(BigDecimal value) {
            addCriterion("product_value <>", value, "productValue");
            return (Criteria) this;
        }

        public Criteria andProductValueGreaterThan(BigDecimal value) {
            addCriterion("product_value >", value, "productValue");
            return (Criteria) this;
        }

        public Criteria andProductValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("product_value >=", value, "productValue");
            return (Criteria) this;
        }

        public Criteria andProductValueLessThan(BigDecimal value) {
            addCriterion("product_value <", value, "productValue");
            return (Criteria) this;
        }

        public Criteria andProductValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("product_value <=", value, "productValue");
            return (Criteria) this;
        }

        public Criteria andProductValueIn(List<BigDecimal> values) {
            addCriterion("product_value in", values, "productValue");
            return (Criteria) this;
        }

        public Criteria andProductValueNotIn(List<BigDecimal> values) {
            addCriterion("product_value not in", values, "productValue");
            return (Criteria) this;
        }

        public Criteria andProductValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_value between", value1, value2, "productValue");
            return (Criteria) this;
        }

        public Criteria andProductValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_value not between", value1, value2, "productValue");
            return (Criteria) this;
        }

        public Criteria andProductStatusIsNull() {
            addCriterion("product_status is null");
            return (Criteria) this;
        }

        public Criteria andProductStatusIsNotNull() {
            addCriterion("product_status is not null");
            return (Criteria) this;
        }

        public Criteria andProductStatusEqualTo(Byte value) {
            addCriterion("product_status =", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotEqualTo(Byte value) {
            addCriterion("product_status <>", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThan(Byte value) {
            addCriterion("product_status >", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("product_status >=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThan(Byte value) {
            addCriterion("product_status <", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThanOrEqualTo(Byte value) {
            addCriterion("product_status <=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusIn(List<Byte> values) {
            addCriterion("product_status in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotIn(List<Byte> values) {
            addCriterion("product_status not in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusBetween(Byte value1, Byte value2) {
            addCriterion("product_status between", value1, value2, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("product_status not between", value1, value2, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeIsNull() {
            addCriterion("product_createtime is null");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeIsNotNull() {
            addCriterion("product_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeEqualTo(Date value) {
            addCriterion("product_createtime =", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeNotEqualTo(Date value) {
            addCriterion("product_createtime <>", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeGreaterThan(Date value) {
            addCriterion("product_createtime >", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("product_createtime >=", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeLessThan(Date value) {
            addCriterion("product_createtime <", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("product_createtime <=", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeIn(List<Date> values) {
            addCriterion("product_createtime in", values, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeNotIn(List<Date> values) {
            addCriterion("product_createtime not in", values, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeBetween(Date value1, Date value2) {
            addCriterion("product_createtime between", value1, value2, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("product_createtime not between", value1, value2, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeIsNull() {
            addCriterion("product_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeIsNotNull() {
            addCriterion("product_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeEqualTo(Date value) {
            addCriterion("product_updatetime =", value, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeNotEqualTo(Date value) {
            addCriterion("product_updatetime <>", value, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeGreaterThan(Date value) {
            addCriterion("product_updatetime >", value, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("product_updatetime >=", value, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeLessThan(Date value) {
            addCriterion("product_updatetime <", value, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("product_updatetime <=", value, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeIn(List<Date> values) {
            addCriterion("product_updatetime in", values, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeNotIn(List<Date> values) {
            addCriterion("product_updatetime not in", values, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("product_updatetime between", value1, value2, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("product_updatetime not between", value1, value2, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreateuserIsNull() {
            addCriterion("product_createuser is null");
            return (Criteria) this;
        }

        public Criteria andProductCreateuserIsNotNull() {
            addCriterion("product_createuser is not null");
            return (Criteria) this;
        }

        public Criteria andProductCreateuserEqualTo(String value) {
            addCriterion("product_createuser =", value, "productCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductCreateuserNotEqualTo(String value) {
            addCriterion("product_createuser <>", value, "productCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductCreateuserGreaterThan(String value) {
            addCriterion("product_createuser >", value, "productCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("product_createuser >=", value, "productCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductCreateuserLessThan(String value) {
            addCriterion("product_createuser <", value, "productCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductCreateuserLessThanOrEqualTo(String value) {
            addCriterion("product_createuser <=", value, "productCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductCreateuserLike(String value) {
            addCriterion("product_createuser like", value, "productCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductCreateuserNotLike(String value) {
            addCriterion("product_createuser not like", value, "productCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductCreateuserIn(List<String> values) {
            addCriterion("product_createuser in", values, "productCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductCreateuserNotIn(List<String> values) {
            addCriterion("product_createuser not in", values, "productCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductCreateuserBetween(String value1, String value2) {
            addCriterion("product_createuser between", value1, value2, "productCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductCreateuserNotBetween(String value1, String value2) {
            addCriterion("product_createuser not between", value1, value2, "productCreateuser");
            return (Criteria) this;
        }

        public Criteria andProductUpdateuserIsNull() {
            addCriterion("product_updateuser is null");
            return (Criteria) this;
        }

        public Criteria andProductUpdateuserIsNotNull() {
            addCriterion("product_updateuser is not null");
            return (Criteria) this;
        }

        public Criteria andProductUpdateuserEqualTo(String value) {
            addCriterion("product_updateuser =", value, "productUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductUpdateuserNotEqualTo(String value) {
            addCriterion("product_updateuser <>", value, "productUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductUpdateuserGreaterThan(String value) {
            addCriterion("product_updateuser >", value, "productUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductUpdateuserGreaterThanOrEqualTo(String value) {
            addCriterion("product_updateuser >=", value, "productUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductUpdateuserLessThan(String value) {
            addCriterion("product_updateuser <", value, "productUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductUpdateuserLessThanOrEqualTo(String value) {
            addCriterion("product_updateuser <=", value, "productUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductUpdateuserLike(String value) {
            addCriterion("product_updateuser like", value, "productUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductUpdateuserNotLike(String value) {
            addCriterion("product_updateuser not like", value, "productUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductUpdateuserIn(List<String> values) {
            addCriterion("product_updateuser in", values, "productUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductUpdateuserNotIn(List<String> values) {
            addCriterion("product_updateuser not in", values, "productUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductUpdateuserBetween(String value1, String value2) {
            addCriterion("product_updateuser between", value1, value2, "productUpdateuser");
            return (Criteria) this;
        }

        public Criteria andProductUpdateuserNotBetween(String value1, String value2) {
            addCriterion("product_updateuser not between", value1, value2, "productUpdateuser");
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