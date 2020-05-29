package com.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillHeadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillHeadExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContractNumIsNull() {
            addCriterion("contract_num is null");
            return (Criteria) this;
        }

        public Criteria andContractNumIsNotNull() {
            addCriterion("contract_num is not null");
            return (Criteria) this;
        }

        public Criteria andContractNumEqualTo(String value) {
            addCriterion("contract_num =", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumNotEqualTo(String value) {
            addCriterion("contract_num <>", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumGreaterThan(String value) {
            addCriterion("contract_num >", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumGreaterThanOrEqualTo(String value) {
            addCriterion("contract_num >=", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumLessThan(String value) {
            addCriterion("contract_num <", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumLessThanOrEqualTo(String value) {
            addCriterion("contract_num <=", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumLike(String value) {
            addCriterion("contract_num like", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumNotLike(String value) {
            addCriterion("contract_num not like", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumIn(List<String> values) {
            addCriterion("contract_num in", values, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumNotIn(List<String> values) {
            addCriterion("contract_num not in", values, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumBetween(String value1, String value2) {
            addCriterion("contract_num between", value1, value2, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumNotBetween(String value1, String value2) {
            addCriterion("contract_num not between", value1, value2, "contractNum");
            return (Criteria) this;
        }

        public Criteria andComNameIsNull() {
            addCriterion("com_name is null");
            return (Criteria) this;
        }

        public Criteria andComNameIsNotNull() {
            addCriterion("com_name is not null");
            return (Criteria) this;
        }

        public Criteria andComNameEqualTo(String value) {
            addCriterion("com_name =", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotEqualTo(String value) {
            addCriterion("com_name <>", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameGreaterThan(String value) {
            addCriterion("com_name >", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameGreaterThanOrEqualTo(String value) {
            addCriterion("com_name >=", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameLessThan(String value) {
            addCriterion("com_name <", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameLessThanOrEqualTo(String value) {
            addCriterion("com_name <=", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameLike(String value) {
            addCriterion("com_name like", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotLike(String value) {
            addCriterion("com_name not like", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameIn(List<String> values) {
            addCriterion("com_name in", values, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotIn(List<String> values) {
            addCriterion("com_name not in", values, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameBetween(String value1, String value2) {
            addCriterion("com_name between", value1, value2, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotBetween(String value1, String value2) {
            addCriterion("com_name not between", value1, value2, "comName");
            return (Criteria) this;
        }

        public Criteria andProNumIsNull() {
            addCriterion("pro_num is null");
            return (Criteria) this;
        }

        public Criteria andProNumIsNotNull() {
            addCriterion("pro_num is not null");
            return (Criteria) this;
        }

        public Criteria andProNumEqualTo(String value) {
            addCriterion("pro_num =", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumNotEqualTo(String value) {
            addCriterion("pro_num <>", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumGreaterThan(String value) {
            addCriterion("pro_num >", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumGreaterThanOrEqualTo(String value) {
            addCriterion("pro_num >=", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumLessThan(String value) {
            addCriterion("pro_num <", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumLessThanOrEqualTo(String value) {
            addCriterion("pro_num <=", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumLike(String value) {
            addCriterion("pro_num like", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumNotLike(String value) {
            addCriterion("pro_num not like", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumIn(List<String> values) {
            addCriterion("pro_num in", values, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumNotIn(List<String> values) {
            addCriterion("pro_num not in", values, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumBetween(String value1, String value2) {
            addCriterion("pro_num between", value1, value2, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumNotBetween(String value1, String value2) {
            addCriterion("pro_num not between", value1, value2, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNameIsNull() {
            addCriterion("pro_name is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("pro_name is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("pro_name =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("pro_name <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("pro_name >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_name >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("pro_name <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("pro_name <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("pro_name like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("pro_name not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("pro_name in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("pro_name not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("pro_name between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("pro_name not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andCarNoIsNull() {
            addCriterion("car_no is null");
            return (Criteria) this;
        }

        public Criteria andCarNoIsNotNull() {
            addCriterion("car_no is not null");
            return (Criteria) this;
        }

        public Criteria andCarNoEqualTo(String value) {
            addCriterion("car_no =", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotEqualTo(String value) {
            addCriterion("car_no <>", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoGreaterThan(String value) {
            addCriterion("car_no >", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoGreaterThanOrEqualTo(String value) {
            addCriterion("car_no >=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLessThan(String value) {
            addCriterion("car_no <", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLessThanOrEqualTo(String value) {
            addCriterion("car_no <=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLike(String value) {
            addCriterion("car_no like", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotLike(String value) {
            addCriterion("car_no not like", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoIn(List<String> values) {
            addCriterion("car_no in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotIn(List<String> values) {
            addCriterion("car_no not in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoBetween(String value1, String value2) {
            addCriterion("car_no between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotBetween(String value1, String value2) {
            addCriterion("car_no not between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andCargoWeightIsNull() {
            addCriterion("cargo_weight is null");
            return (Criteria) this;
        }

        public Criteria andCargoWeightIsNotNull() {
            addCriterion("cargo_weight is not null");
            return (Criteria) this;
        }

        public Criteria andCargoWeightEqualTo(String value) {
            addCriterion("cargo_weight =", value, "cargoWeight");
            return (Criteria) this;
        }

        public Criteria andCargoWeightNotEqualTo(String value) {
            addCriterion("cargo_weight <>", value, "cargoWeight");
            return (Criteria) this;
        }

        public Criteria andCargoWeightGreaterThan(String value) {
            addCriterion("cargo_weight >", value, "cargoWeight");
            return (Criteria) this;
        }

        public Criteria andCargoWeightGreaterThanOrEqualTo(String value) {
            addCriterion("cargo_weight >=", value, "cargoWeight");
            return (Criteria) this;
        }

        public Criteria andCargoWeightLessThan(String value) {
            addCriterion("cargo_weight <", value, "cargoWeight");
            return (Criteria) this;
        }

        public Criteria andCargoWeightLessThanOrEqualTo(String value) {
            addCriterion("cargo_weight <=", value, "cargoWeight");
            return (Criteria) this;
        }

        public Criteria andCargoWeightLike(String value) {
            addCriterion("cargo_weight like", value, "cargoWeight");
            return (Criteria) this;
        }

        public Criteria andCargoWeightNotLike(String value) {
            addCriterion("cargo_weight not like", value, "cargoWeight");
            return (Criteria) this;
        }

        public Criteria andCargoWeightIn(List<String> values) {
            addCriterion("cargo_weight in", values, "cargoWeight");
            return (Criteria) this;
        }

        public Criteria andCargoWeightNotIn(List<String> values) {
            addCriterion("cargo_weight not in", values, "cargoWeight");
            return (Criteria) this;
        }

        public Criteria andCargoWeightBetween(String value1, String value2) {
            addCriterion("cargo_weight between", value1, value2, "cargoWeight");
            return (Criteria) this;
        }

        public Criteria andCargoWeightNotBetween(String value1, String value2) {
            addCriterion("cargo_weight not between", value1, value2, "cargoWeight");
            return (Criteria) this;
        }

        public Criteria andWeightUnitIsNull() {
            addCriterion("weight_unit is null");
            return (Criteria) this;
        }

        public Criteria andWeightUnitIsNotNull() {
            addCriterion("weight_unit is not null");
            return (Criteria) this;
        }

        public Criteria andWeightUnitEqualTo(String value) {
            addCriterion("weight_unit =", value, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNotEqualTo(String value) {
            addCriterion("weight_unit <>", value, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitGreaterThan(String value) {
            addCriterion("weight_unit >", value, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitGreaterThanOrEqualTo(String value) {
            addCriterion("weight_unit >=", value, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitLessThan(String value) {
            addCriterion("weight_unit <", value, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitLessThanOrEqualTo(String value) {
            addCriterion("weight_unit <=", value, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitLike(String value) {
            addCriterion("weight_unit like", value, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNotLike(String value) {
            addCriterion("weight_unit not like", value, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitIn(List<String> values) {
            addCriterion("weight_unit in", values, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNotIn(List<String> values) {
            addCriterion("weight_unit not in", values, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitBetween(String value1, String value2) {
            addCriterion("weight_unit between", value1, value2, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNotBetween(String value1, String value2) {
            addCriterion("weight_unit not between", value1, value2, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andFreightUnitIsNull() {
            addCriterion("freight_unit is null");
            return (Criteria) this;
        }

        public Criteria andFreightUnitIsNotNull() {
            addCriterion("freight_unit is not null");
            return (Criteria) this;
        }

        public Criteria andFreightUnitEqualTo(String value) {
            addCriterion("freight_unit =", value, "freightUnit");
            return (Criteria) this;
        }

        public Criteria andFreightUnitNotEqualTo(String value) {
            addCriterion("freight_unit <>", value, "freightUnit");
            return (Criteria) this;
        }

        public Criteria andFreightUnitGreaterThan(String value) {
            addCriterion("freight_unit >", value, "freightUnit");
            return (Criteria) this;
        }

        public Criteria andFreightUnitGreaterThanOrEqualTo(String value) {
            addCriterion("freight_unit >=", value, "freightUnit");
            return (Criteria) this;
        }

        public Criteria andFreightUnitLessThan(String value) {
            addCriterion("freight_unit <", value, "freightUnit");
            return (Criteria) this;
        }

        public Criteria andFreightUnitLessThanOrEqualTo(String value) {
            addCriterion("freight_unit <=", value, "freightUnit");
            return (Criteria) this;
        }

        public Criteria andFreightUnitLike(String value) {
            addCriterion("freight_unit like", value, "freightUnit");
            return (Criteria) this;
        }

        public Criteria andFreightUnitNotLike(String value) {
            addCriterion("freight_unit not like", value, "freightUnit");
            return (Criteria) this;
        }

        public Criteria andFreightUnitIn(List<String> values) {
            addCriterion("freight_unit in", values, "freightUnit");
            return (Criteria) this;
        }

        public Criteria andFreightUnitNotIn(List<String> values) {
            addCriterion("freight_unit not in", values, "freightUnit");
            return (Criteria) this;
        }

        public Criteria andFreightUnitBetween(String value1, String value2) {
            addCriterion("freight_unit between", value1, value2, "freightUnit");
            return (Criteria) this;
        }

        public Criteria andFreightUnitNotBetween(String value1, String value2) {
            addCriterion("freight_unit not between", value1, value2, "freightUnit");
            return (Criteria) this;
        }

        public Criteria andFreightPriceIsNull() {
            addCriterion("freight_price is null");
            return (Criteria) this;
        }

        public Criteria andFreightPriceIsNotNull() {
            addCriterion("freight_price is not null");
            return (Criteria) this;
        }

        public Criteria andFreightPriceEqualTo(String value) {
            addCriterion("freight_price =", value, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceNotEqualTo(String value) {
            addCriterion("freight_price <>", value, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceGreaterThan(String value) {
            addCriterion("freight_price >", value, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceGreaterThanOrEqualTo(String value) {
            addCriterion("freight_price >=", value, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceLessThan(String value) {
            addCriterion("freight_price <", value, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceLessThanOrEqualTo(String value) {
            addCriterion("freight_price <=", value, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceLike(String value) {
            addCriterion("freight_price like", value, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceNotLike(String value) {
            addCriterion("freight_price not like", value, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceIn(List<String> values) {
            addCriterion("freight_price in", values, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceNotIn(List<String> values) {
            addCriterion("freight_price not in", values, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceBetween(String value1, String value2) {
            addCriterion("freight_price between", value1, value2, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceNotBetween(String value1, String value2) {
            addCriterion("freight_price not between", value1, value2, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andNormsIsNull() {
            addCriterion("norms is null");
            return (Criteria) this;
        }

        public Criteria andNormsIsNotNull() {
            addCriterion("norms is not null");
            return (Criteria) this;
        }

        public Criteria andNormsEqualTo(String value) {
            addCriterion("norms =", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsNotEqualTo(String value) {
            addCriterion("norms <>", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsGreaterThan(String value) {
            addCriterion("norms >", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsGreaterThanOrEqualTo(String value) {
            addCriterion("norms >=", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsLessThan(String value) {
            addCriterion("norms <", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsLessThanOrEqualTo(String value) {
            addCriterion("norms <=", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsLike(String value) {
            addCriterion("norms like", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsNotLike(String value) {
            addCriterion("norms not like", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsIn(List<String> values) {
            addCriterion("norms in", values, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsNotIn(List<String> values) {
            addCriterion("norms not in", values, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsBetween(String value1, String value2) {
            addCriterion("norms between", value1, value2, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsNotBetween(String value1, String value2) {
            addCriterion("norms not between", value1, value2, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsUnitIsNull() {
            addCriterion("norms_unit is null");
            return (Criteria) this;
        }

        public Criteria andNormsUnitIsNotNull() {
            addCriterion("norms_unit is not null");
            return (Criteria) this;
        }

        public Criteria andNormsUnitEqualTo(String value) {
            addCriterion("norms_unit =", value, "normsUnit");
            return (Criteria) this;
        }

        public Criteria andNormsUnitNotEqualTo(String value) {
            addCriterion("norms_unit <>", value, "normsUnit");
            return (Criteria) this;
        }

        public Criteria andNormsUnitGreaterThan(String value) {
            addCriterion("norms_unit >", value, "normsUnit");
            return (Criteria) this;
        }

        public Criteria andNormsUnitGreaterThanOrEqualTo(String value) {
            addCriterion("norms_unit >=", value, "normsUnit");
            return (Criteria) this;
        }

        public Criteria andNormsUnitLessThan(String value) {
            addCriterion("norms_unit <", value, "normsUnit");
            return (Criteria) this;
        }

        public Criteria andNormsUnitLessThanOrEqualTo(String value) {
            addCriterion("norms_unit <=", value, "normsUnit");
            return (Criteria) this;
        }

        public Criteria andNormsUnitLike(String value) {
            addCriterion("norms_unit like", value, "normsUnit");
            return (Criteria) this;
        }

        public Criteria andNormsUnitNotLike(String value) {
            addCriterion("norms_unit not like", value, "normsUnit");
            return (Criteria) this;
        }

        public Criteria andNormsUnitIn(List<String> values) {
            addCriterion("norms_unit in", values, "normsUnit");
            return (Criteria) this;
        }

        public Criteria andNormsUnitNotIn(List<String> values) {
            addCriterion("norms_unit not in", values, "normsUnit");
            return (Criteria) this;
        }

        public Criteria andNormsUnitBetween(String value1, String value2) {
            addCriterion("norms_unit between", value1, value2, "normsUnit");
            return (Criteria) this;
        }

        public Criteria andNormsUnitNotBetween(String value1, String value2) {
            addCriterion("norms_unit not between", value1, value2, "normsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIsNull() {
            addCriterion("goods_count is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIsNotNull() {
            addCriterion("goods_count is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountEqualTo(String value) {
            addCriterion("goods_count =", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotEqualTo(String value) {
            addCriterion("goods_count <>", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountGreaterThan(String value) {
            addCriterion("goods_count >", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountGreaterThanOrEqualTo(String value) {
            addCriterion("goods_count >=", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountLessThan(String value) {
            addCriterion("goods_count <", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountLessThanOrEqualTo(String value) {
            addCriterion("goods_count <=", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountLike(String value) {
            addCriterion("goods_count like", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotLike(String value) {
            addCriterion("goods_count not like", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIn(List<String> values) {
            addCriterion("goods_count in", values, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotIn(List<String> values) {
            addCriterion("goods_count not in", values, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountBetween(String value1, String value2) {
            addCriterion("goods_count between", value1, value2, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotBetween(String value1, String value2) {
            addCriterion("goods_count not between", value1, value2, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountDxIsNull() {
            addCriterion("goods_count_dx is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountDxIsNotNull() {
            addCriterion("goods_count_dx is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountDxEqualTo(String value) {
            addCriterion("goods_count_dx =", value, "goodsCountDx");
            return (Criteria) this;
        }

        public Criteria andGoodsCountDxNotEqualTo(String value) {
            addCriterion("goods_count_dx <>", value, "goodsCountDx");
            return (Criteria) this;
        }

        public Criteria andGoodsCountDxGreaterThan(String value) {
            addCriterion("goods_count_dx >", value, "goodsCountDx");
            return (Criteria) this;
        }

        public Criteria andGoodsCountDxGreaterThanOrEqualTo(String value) {
            addCriterion("goods_count_dx >=", value, "goodsCountDx");
            return (Criteria) this;
        }

        public Criteria andGoodsCountDxLessThan(String value) {
            addCriterion("goods_count_dx <", value, "goodsCountDx");
            return (Criteria) this;
        }

        public Criteria andGoodsCountDxLessThanOrEqualTo(String value) {
            addCriterion("goods_count_dx <=", value, "goodsCountDx");
            return (Criteria) this;
        }

        public Criteria andGoodsCountDxLike(String value) {
            addCriterion("goods_count_dx like", value, "goodsCountDx");
            return (Criteria) this;
        }

        public Criteria andGoodsCountDxNotLike(String value) {
            addCriterion("goods_count_dx not like", value, "goodsCountDx");
            return (Criteria) this;
        }

        public Criteria andGoodsCountDxIn(List<String> values) {
            addCriterion("goods_count_dx in", values, "goodsCountDx");
            return (Criteria) this;
        }

        public Criteria andGoodsCountDxNotIn(List<String> values) {
            addCriterion("goods_count_dx not in", values, "goodsCountDx");
            return (Criteria) this;
        }

        public Criteria andGoodsCountDxBetween(String value1, String value2) {
            addCriterion("goods_count_dx between", value1, value2, "goodsCountDx");
            return (Criteria) this;
        }

        public Criteria andGoodsCountDxNotBetween(String value1, String value2) {
            addCriterion("goods_count_dx not between", value1, value2, "goodsCountDx");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNull() {
            addCriterion("create_datetime is null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNotNull() {
            addCriterion("create_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeEqualTo(Date value) {
            addCriterion("create_datetime =", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotEqualTo(Date value) {
            addCriterion("create_datetime <>", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThan(Date value) {
            addCriterion("create_datetime >", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_datetime >=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThan(Date value) {
            addCriterion("create_datetime <", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("create_datetime <=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIn(List<Date> values) {
            addCriterion("create_datetime in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotIn(List<Date> values) {
            addCriterion("create_datetime not in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeBetween(Date value1, Date value2) {
            addCriterion("create_datetime between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("create_datetime not between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeIsNull() {
            addCriterion("modify_datetime is null");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeIsNotNull() {
            addCriterion("modify_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeEqualTo(Date value) {
            addCriterion("modify_datetime =", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeNotEqualTo(Date value) {
            addCriterion("modify_datetime <>", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeGreaterThan(Date value) {
            addCriterion("modify_datetime >", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_datetime >=", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeLessThan(Date value) {
            addCriterion("modify_datetime <", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_datetime <=", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeIn(List<Date> values) {
            addCriterion("modify_datetime in", values, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeNotIn(List<Date> values) {
            addCriterion("modify_datetime not in", values, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeBetween(Date value1, Date value2) {
            addCriterion("modify_datetime between", value1, value2, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_datetime not between", value1, value2, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIsNull() {
            addCriterion("create_userid is null");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIsNotNull() {
            addCriterion("create_userid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUseridEqualTo(String value) {
            addCriterion("create_userid =", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotEqualTo(String value) {
            addCriterion("create_userid <>", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridGreaterThan(String value) {
            addCriterion("create_userid >", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridGreaterThanOrEqualTo(String value) {
            addCriterion("create_userid >=", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLessThan(String value) {
            addCriterion("create_userid <", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLessThanOrEqualTo(String value) {
            addCriterion("create_userid <=", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLike(String value) {
            addCriterion("create_userid like", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotLike(String value) {
            addCriterion("create_userid not like", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIn(List<String> values) {
            addCriterion("create_userid in", values, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotIn(List<String> values) {
            addCriterion("create_userid not in", values, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridBetween(String value1, String value2) {
            addCriterion("create_userid between", value1, value2, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotBetween(String value1, String value2) {
            addCriterion("create_userid not between", value1, value2, "createUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridIsNull() {
            addCriterion("modify_userid is null");
            return (Criteria) this;
        }

        public Criteria andModifyUseridIsNotNull() {
            addCriterion("modify_userid is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUseridEqualTo(String value) {
            addCriterion("modify_userid =", value, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridNotEqualTo(String value) {
            addCriterion("modify_userid <>", value, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridGreaterThan(String value) {
            addCriterion("modify_userid >", value, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridGreaterThanOrEqualTo(String value) {
            addCriterion("modify_userid >=", value, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridLessThan(String value) {
            addCriterion("modify_userid <", value, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridLessThanOrEqualTo(String value) {
            addCriterion("modify_userid <=", value, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridLike(String value) {
            addCriterion("modify_userid like", value, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridNotLike(String value) {
            addCriterion("modify_userid not like", value, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridIn(List<String> values) {
            addCriterion("modify_userid in", values, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridNotIn(List<String> values) {
            addCriterion("modify_userid not in", values, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridBetween(String value1, String value2) {
            addCriterion("modify_userid between", value1, value2, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridNotBetween(String value1, String value2) {
            addCriterion("modify_userid not between", value1, value2, "modifyUserid");
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