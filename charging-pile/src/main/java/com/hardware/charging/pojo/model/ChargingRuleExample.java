package com.hardware.charging.pojo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ChargingRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChargingRuleExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andParkingIdIsNull() {
            addCriterion("parking_id is null");
            return (Criteria) this;
        }

        public Criteria andParkingIdIsNotNull() {
            addCriterion("parking_id is not null");
            return (Criteria) this;
        }

        public Criteria andParkingIdEqualTo(Integer value) {
            addCriterion("parking_id =", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdNotEqualTo(Integer value) {
            addCriterion("parking_id <>", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdGreaterThan(Integer value) {
            addCriterion("parking_id >", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parking_id >=", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdLessThan(Integer value) {
            addCriterion("parking_id <", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdLessThanOrEqualTo(Integer value) {
            addCriterion("parking_id <=", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdIn(List<Integer> values) {
            addCriterion("parking_id in", values, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdNotIn(List<Integer> values) {
            addCriterion("parking_id not in", values, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdBetween(Integer value1, Integer value2) {
            addCriterion("parking_id between", value1, value2, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parking_id not between", value1, value2, "parkingId");
            return (Criteria) this;
        }

        public Criteria andSectionStartIsNull() {
            addCriterion("section_start is null");
            return (Criteria) this;
        }

        public Criteria andSectionStartIsNotNull() {
            addCriterion("section_start is not null");
            return (Criteria) this;
        }

        public Criteria andSectionStartEqualTo(Date value) {
            addCriterionForJDBCTime("section_start =", value, "sectionStart");
            return (Criteria) this;
        }

        public Criteria andSectionStartNotEqualTo(Date value) {
            addCriterionForJDBCTime("section_start <>", value, "sectionStart");
            return (Criteria) this;
        }

        public Criteria andSectionStartGreaterThan(Date value) {
            addCriterionForJDBCTime("section_start >", value, "sectionStart");
            return (Criteria) this;
        }

        public Criteria andSectionStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("section_start >=", value, "sectionStart");
            return (Criteria) this;
        }

        public Criteria andSectionStartLessThan(Date value) {
            addCriterionForJDBCTime("section_start <", value, "sectionStart");
            return (Criteria) this;
        }

        public Criteria andSectionStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("section_start <=", value, "sectionStart");
            return (Criteria) this;
        }

        public Criteria andSectionStartIn(List<Date> values) {
            addCriterionForJDBCTime("section_start in", values, "sectionStart");
            return (Criteria) this;
        }

        public Criteria andSectionStartNotIn(List<Date> values) {
            addCriterionForJDBCTime("section_start not in", values, "sectionStart");
            return (Criteria) this;
        }

        public Criteria andSectionStartBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("section_start between", value1, value2, "sectionStart");
            return (Criteria) this;
        }

        public Criteria andSectionStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("section_start not between", value1, value2, "sectionStart");
            return (Criteria) this;
        }

        public Criteria andSectionEndIsNull() {
            addCriterion("section_end is null");
            return (Criteria) this;
        }

        public Criteria andSectionEndIsNotNull() {
            addCriterion("section_end is not null");
            return (Criteria) this;
        }

        public Criteria andSectionEndEqualTo(Date value) {
            addCriterionForJDBCTime("section_end =", value, "sectionEnd");
            return (Criteria) this;
        }

        public Criteria andSectionEndNotEqualTo(Date value) {
            addCriterionForJDBCTime("section_end <>", value, "sectionEnd");
            return (Criteria) this;
        }

        public Criteria andSectionEndGreaterThan(Date value) {
            addCriterionForJDBCTime("section_end >", value, "sectionEnd");
            return (Criteria) this;
        }

        public Criteria andSectionEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("section_end >=", value, "sectionEnd");
            return (Criteria) this;
        }

        public Criteria andSectionEndLessThan(Date value) {
            addCriterionForJDBCTime("section_end <", value, "sectionEnd");
            return (Criteria) this;
        }

        public Criteria andSectionEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("section_end <=", value, "sectionEnd");
            return (Criteria) this;
        }

        public Criteria andSectionEndIn(List<Date> values) {
            addCriterionForJDBCTime("section_end in", values, "sectionEnd");
            return (Criteria) this;
        }

        public Criteria andSectionEndNotIn(List<Date> values) {
            addCriterionForJDBCTime("section_end not in", values, "sectionEnd");
            return (Criteria) this;
        }

        public Criteria andSectionEndBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("section_end between", value1, value2, "sectionEnd");
            return (Criteria) this;
        }

        public Criteria andSectionEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("section_end not between", value1, value2, "sectionEnd");
            return (Criteria) this;
        }

        public Criteria andSubSerialNumberIsNull() {
            addCriterion("sub_serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSubSerialNumberIsNotNull() {
            addCriterion("sub_serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andSubSerialNumberEqualTo(String value) {
            addCriterion("sub_serial_number =", value, "subSerialNumber");
            return (Criteria) this;
        }

        public Criteria andSubSerialNumberNotEqualTo(String value) {
            addCriterion("sub_serial_number <>", value, "subSerialNumber");
            return (Criteria) this;
        }

        public Criteria andSubSerialNumberGreaterThan(String value) {
            addCriterion("sub_serial_number >", value, "subSerialNumber");
            return (Criteria) this;
        }

        public Criteria andSubSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sub_serial_number >=", value, "subSerialNumber");
            return (Criteria) this;
        }

        public Criteria andSubSerialNumberLessThan(String value) {
            addCriterion("sub_serial_number <", value, "subSerialNumber");
            return (Criteria) this;
        }

        public Criteria andSubSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("sub_serial_number <=", value, "subSerialNumber");
            return (Criteria) this;
        }

        public Criteria andSubSerialNumberLike(String value) {
            addCriterion("sub_serial_number like", value, "subSerialNumber");
            return (Criteria) this;
        }

        public Criteria andSubSerialNumberNotLike(String value) {
            addCriterion("sub_serial_number not like", value, "subSerialNumber");
            return (Criteria) this;
        }

        public Criteria andSubSerialNumberIn(List<String> values) {
            addCriterion("sub_serial_number in", values, "subSerialNumber");
            return (Criteria) this;
        }

        public Criteria andSubSerialNumberNotIn(List<String> values) {
            addCriterion("sub_serial_number not in", values, "subSerialNumber");
            return (Criteria) this;
        }

        public Criteria andSubSerialNumberBetween(String value1, String value2) {
            addCriterion("sub_serial_number between", value1, value2, "subSerialNumber");
            return (Criteria) this;
        }

        public Criteria andSubSerialNumberNotBetween(String value1, String value2) {
            addCriterion("sub_serial_number not between", value1, value2, "subSerialNumber");
            return (Criteria) this;
        }

        public Criteria andChargeUnitIsNull() {
            addCriterion("charge_unit is null");
            return (Criteria) this;
        }

        public Criteria andChargeUnitIsNotNull() {
            addCriterion("charge_unit is not null");
            return (Criteria) this;
        }

        public Criteria andChargeUnitEqualTo(Byte value) {
            addCriterion("charge_unit =", value, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeUnitNotEqualTo(Byte value) {
            addCriterion("charge_unit <>", value, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeUnitGreaterThan(Byte value) {
            addCriterion("charge_unit >", value, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeUnitGreaterThanOrEqualTo(Byte value) {
            addCriterion("charge_unit >=", value, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeUnitLessThan(Byte value) {
            addCriterion("charge_unit <", value, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeUnitLessThanOrEqualTo(Byte value) {
            addCriterion("charge_unit <=", value, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeUnitIn(List<Byte> values) {
            addCriterion("charge_unit in", values, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeUnitNotIn(List<Byte> values) {
            addCriterion("charge_unit not in", values, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeUnitBetween(Byte value1, Byte value2) {
            addCriterion("charge_unit between", value1, value2, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeUnitNotBetween(Byte value1, Byte value2) {
            addCriterion("charge_unit not between", value1, value2, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andUnitCostIsNull() {
            addCriterion("unit_cost is null");
            return (Criteria) this;
        }

        public Criteria andUnitCostIsNotNull() {
            addCriterion("unit_cost is not null");
            return (Criteria) this;
        }

        public Criteria andUnitCostEqualTo(BigDecimal value) {
            addCriterion("unit_cost =", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotEqualTo(BigDecimal value) {
            addCriterion("unit_cost <>", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostGreaterThan(BigDecimal value) {
            addCriterion("unit_cost >", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_cost >=", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostLessThan(BigDecimal value) {
            addCriterion("unit_cost <", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_cost <=", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostIn(List<BigDecimal> values) {
            addCriterion("unit_cost in", values, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotIn(List<BigDecimal> values) {
            addCriterion("unit_cost not in", values, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_cost between", value1, value2, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_cost not between", value1, value2, "unitCost");
            return (Criteria) this;
        }

        public Criteria andCeilingCostIsNull() {
            addCriterion("ceiling_cost is null");
            return (Criteria) this;
        }

        public Criteria andCeilingCostIsNotNull() {
            addCriterion("ceiling_cost is not null");
            return (Criteria) this;
        }

        public Criteria andCeilingCostEqualTo(BigDecimal value) {
            addCriterion("ceiling_cost =", value, "ceilingCost");
            return (Criteria) this;
        }

        public Criteria andCeilingCostNotEqualTo(BigDecimal value) {
            addCriterion("ceiling_cost <>", value, "ceilingCost");
            return (Criteria) this;
        }

        public Criteria andCeilingCostGreaterThan(BigDecimal value) {
            addCriterion("ceiling_cost >", value, "ceilingCost");
            return (Criteria) this;
        }

        public Criteria andCeilingCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ceiling_cost >=", value, "ceilingCost");
            return (Criteria) this;
        }

        public Criteria andCeilingCostLessThan(BigDecimal value) {
            addCriterion("ceiling_cost <", value, "ceilingCost");
            return (Criteria) this;
        }

        public Criteria andCeilingCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ceiling_cost <=", value, "ceilingCost");
            return (Criteria) this;
        }

        public Criteria andCeilingCostIn(List<BigDecimal> values) {
            addCriterion("ceiling_cost in", values, "ceilingCost");
            return (Criteria) this;
        }

        public Criteria andCeilingCostNotIn(List<BigDecimal> values) {
            addCriterion("ceiling_cost not in", values, "ceilingCost");
            return (Criteria) this;
        }

        public Criteria andCeilingCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ceiling_cost between", value1, value2, "ceilingCost");
            return (Criteria) this;
        }

        public Criteria andCeilingCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ceiling_cost not between", value1, value2, "ceilingCost");
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
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Integer value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Integer value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Integer value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Integer value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Integer> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Integer> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("update_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("update_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(Integer value) {
            addCriterion("update_user_id =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(Integer value) {
            addCriterion("update_user_id <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(Integer value) {
            addCriterion("update_user_id >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_user_id >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(Integer value) {
            addCriterion("update_user_id <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("update_user_id <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<Integer> values) {
            addCriterion("update_user_id in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<Integer> values) {
            addCriterion("update_user_id not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("update_user_id between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("update_user_id not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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