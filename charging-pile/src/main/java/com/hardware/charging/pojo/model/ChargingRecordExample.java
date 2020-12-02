package com.hardware.charging.pojo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChargingRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChargingRecordExample() {
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

        public Criteria andChargingGunIdIsNull() {
            addCriterion("charging_gun_id is null");
            return (Criteria) this;
        }

        public Criteria andChargingGunIdIsNotNull() {
            addCriterion("charging_gun_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargingGunIdEqualTo(Integer value) {
            addCriterion("charging_gun_id =", value, "chargingGunId");
            return (Criteria) this;
        }

        public Criteria andChargingGunIdNotEqualTo(Integer value) {
            addCriterion("charging_gun_id <>", value, "chargingGunId");
            return (Criteria) this;
        }

        public Criteria andChargingGunIdGreaterThan(Integer value) {
            addCriterion("charging_gun_id >", value, "chargingGunId");
            return (Criteria) this;
        }

        public Criteria andChargingGunIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("charging_gun_id >=", value, "chargingGunId");
            return (Criteria) this;
        }

        public Criteria andChargingGunIdLessThan(Integer value) {
            addCriterion("charging_gun_id <", value, "chargingGunId");
            return (Criteria) this;
        }

        public Criteria andChargingGunIdLessThanOrEqualTo(Integer value) {
            addCriterion("charging_gun_id <=", value, "chargingGunId");
            return (Criteria) this;
        }

        public Criteria andChargingGunIdIn(List<Integer> values) {
            addCriterion("charging_gun_id in", values, "chargingGunId");
            return (Criteria) this;
        }

        public Criteria andChargingGunIdNotIn(List<Integer> values) {
            addCriterion("charging_gun_id not in", values, "chargingGunId");
            return (Criteria) this;
        }

        public Criteria andChargingGunIdBetween(Integer value1, Integer value2) {
            addCriterion("charging_gun_id between", value1, value2, "chargingGunId");
            return (Criteria) this;
        }

        public Criteria andChargingGunIdNotBetween(Integer value1, Integer value2) {
            addCriterion("charging_gun_id not between", value1, value2, "chargingGunId");
            return (Criteria) this;
        }

        public Criteria andChargingStartTimeIsNull() {
            addCriterion("charging_start_time is null");
            return (Criteria) this;
        }

        public Criteria andChargingStartTimeIsNotNull() {
            addCriterion("charging_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andChargingStartTimeEqualTo(Date value) {
            addCriterion("charging_start_time =", value, "chargingStartTime");
            return (Criteria) this;
        }

        public Criteria andChargingStartTimeNotEqualTo(Date value) {
            addCriterion("charging_start_time <>", value, "chargingStartTime");
            return (Criteria) this;
        }

        public Criteria andChargingStartTimeGreaterThan(Date value) {
            addCriterion("charging_start_time >", value, "chargingStartTime");
            return (Criteria) this;
        }

        public Criteria andChargingStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("charging_start_time >=", value, "chargingStartTime");
            return (Criteria) this;
        }

        public Criteria andChargingStartTimeLessThan(Date value) {
            addCriterion("charging_start_time <", value, "chargingStartTime");
            return (Criteria) this;
        }

        public Criteria andChargingStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("charging_start_time <=", value, "chargingStartTime");
            return (Criteria) this;
        }

        public Criteria andChargingStartTimeIn(List<Date> values) {
            addCriterion("charging_start_time in", values, "chargingStartTime");
            return (Criteria) this;
        }

        public Criteria andChargingStartTimeNotIn(List<Date> values) {
            addCriterion("charging_start_time not in", values, "chargingStartTime");
            return (Criteria) this;
        }

        public Criteria andChargingStartTimeBetween(Date value1, Date value2) {
            addCriterion("charging_start_time between", value1, value2, "chargingStartTime");
            return (Criteria) this;
        }

        public Criteria andChargingStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("charging_start_time not between", value1, value2, "chargingStartTime");
            return (Criteria) this;
        }

        public Criteria andChargingEndTimeIsNull() {
            addCriterion("charging_end_time is null");
            return (Criteria) this;
        }

        public Criteria andChargingEndTimeIsNotNull() {
            addCriterion("charging_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andChargingEndTimeEqualTo(Date value) {
            addCriterion("charging_end_time =", value, "chargingEndTime");
            return (Criteria) this;
        }

        public Criteria andChargingEndTimeNotEqualTo(Date value) {
            addCriterion("charging_end_time <>", value, "chargingEndTime");
            return (Criteria) this;
        }

        public Criteria andChargingEndTimeGreaterThan(Date value) {
            addCriterion("charging_end_time >", value, "chargingEndTime");
            return (Criteria) this;
        }

        public Criteria andChargingEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("charging_end_time >=", value, "chargingEndTime");
            return (Criteria) this;
        }

        public Criteria andChargingEndTimeLessThan(Date value) {
            addCriterion("charging_end_time <", value, "chargingEndTime");
            return (Criteria) this;
        }

        public Criteria andChargingEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("charging_end_time <=", value, "chargingEndTime");
            return (Criteria) this;
        }

        public Criteria andChargingEndTimeIn(List<Date> values) {
            addCriterion("charging_end_time in", values, "chargingEndTime");
            return (Criteria) this;
        }

        public Criteria andChargingEndTimeNotIn(List<Date> values) {
            addCriterion("charging_end_time not in", values, "chargingEndTime");
            return (Criteria) this;
        }

        public Criteria andChargingEndTimeBetween(Date value1, Date value2) {
            addCriterion("charging_end_time between", value1, value2, "chargingEndTime");
            return (Criteria) this;
        }

        public Criteria andChargingEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("charging_end_time not between", value1, value2, "chargingEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(String value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(String value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(String value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(String value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLike(String value) {
            addCriterion("order_number like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotLike(String value) {
            addCriterion("order_number not like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<String> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<String> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(String value1, String value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(String value1, String value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andChargingTypeIsNull() {
            addCriterion("charging_type is null");
            return (Criteria) this;
        }

        public Criteria andChargingTypeIsNotNull() {
            addCriterion("charging_type is not null");
            return (Criteria) this;
        }

        public Criteria andChargingTypeEqualTo(Byte value) {
            addCriterion("charging_type =", value, "chargingType");
            return (Criteria) this;
        }

        public Criteria andChargingTypeNotEqualTo(Byte value) {
            addCriterion("charging_type <>", value, "chargingType");
            return (Criteria) this;
        }

        public Criteria andChargingTypeGreaterThan(Byte value) {
            addCriterion("charging_type >", value, "chargingType");
            return (Criteria) this;
        }

        public Criteria andChargingTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("charging_type >=", value, "chargingType");
            return (Criteria) this;
        }

        public Criteria andChargingTypeLessThan(Byte value) {
            addCriterion("charging_type <", value, "chargingType");
            return (Criteria) this;
        }

        public Criteria andChargingTypeLessThanOrEqualTo(Byte value) {
            addCriterion("charging_type <=", value, "chargingType");
            return (Criteria) this;
        }

        public Criteria andChargingTypeIn(List<Byte> values) {
            addCriterion("charging_type in", values, "chargingType");
            return (Criteria) this;
        }

        public Criteria andChargingTypeNotIn(List<Byte> values) {
            addCriterion("charging_type not in", values, "chargingType");
            return (Criteria) this;
        }

        public Criteria andChargingTypeBetween(Byte value1, Byte value2) {
            addCriterion("charging_type between", value1, value2, "chargingType");
            return (Criteria) this;
        }

        public Criteria andChargingTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("charging_type not between", value1, value2, "chargingType");
            return (Criteria) this;
        }

        public Criteria andChargeRuleIdIsNull() {
            addCriterion("charge_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andChargeRuleIdIsNotNull() {
            addCriterion("charge_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargeRuleIdEqualTo(Integer value) {
            addCriterion("charge_rule_id =", value, "chargeRuleId");
            return (Criteria) this;
        }

        public Criteria andChargeRuleIdNotEqualTo(Integer value) {
            addCriterion("charge_rule_id <>", value, "chargeRuleId");
            return (Criteria) this;
        }

        public Criteria andChargeRuleIdGreaterThan(Integer value) {
            addCriterion("charge_rule_id >", value, "chargeRuleId");
            return (Criteria) this;
        }

        public Criteria andChargeRuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_rule_id >=", value, "chargeRuleId");
            return (Criteria) this;
        }

        public Criteria andChargeRuleIdLessThan(Integer value) {
            addCriterion("charge_rule_id <", value, "chargeRuleId");
            return (Criteria) this;
        }

        public Criteria andChargeRuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("charge_rule_id <=", value, "chargeRuleId");
            return (Criteria) this;
        }

        public Criteria andChargeRuleIdIn(List<Integer> values) {
            addCriterion("charge_rule_id in", values, "chargeRuleId");
            return (Criteria) this;
        }

        public Criteria andChargeRuleIdNotIn(List<Integer> values) {
            addCriterion("charge_rule_id not in", values, "chargeRuleId");
            return (Criteria) this;
        }

        public Criteria andChargeRuleIdBetween(Integer value1, Integer value2) {
            addCriterion("charge_rule_id between", value1, value2, "chargeRuleId");
            return (Criteria) this;
        }

        public Criteria andChargeRuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_rule_id not between", value1, value2, "chargeRuleId");
            return (Criteria) this;
        }

        public Criteria andChargingAppointmentTimeIsNull() {
            addCriterion("charging_appointment_time is null");
            return (Criteria) this;
        }

        public Criteria andChargingAppointmentTimeIsNotNull() {
            addCriterion("charging_appointment_time is not null");
            return (Criteria) this;
        }

        public Criteria andChargingAppointmentTimeEqualTo(Date value) {
            addCriterion("charging_appointment_time =", value, "chargingAppointmentTime");
            return (Criteria) this;
        }

        public Criteria andChargingAppointmentTimeNotEqualTo(Date value) {
            addCriterion("charging_appointment_time <>", value, "chargingAppointmentTime");
            return (Criteria) this;
        }

        public Criteria andChargingAppointmentTimeGreaterThan(Date value) {
            addCriterion("charging_appointment_time >", value, "chargingAppointmentTime");
            return (Criteria) this;
        }

        public Criteria andChargingAppointmentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("charging_appointment_time >=", value, "chargingAppointmentTime");
            return (Criteria) this;
        }

        public Criteria andChargingAppointmentTimeLessThan(Date value) {
            addCriterion("charging_appointment_time <", value, "chargingAppointmentTime");
            return (Criteria) this;
        }

        public Criteria andChargingAppointmentTimeLessThanOrEqualTo(Date value) {
            addCriterion("charging_appointment_time <=", value, "chargingAppointmentTime");
            return (Criteria) this;
        }

        public Criteria andChargingAppointmentTimeIn(List<Date> values) {
            addCriterion("charging_appointment_time in", values, "chargingAppointmentTime");
            return (Criteria) this;
        }

        public Criteria andChargingAppointmentTimeNotIn(List<Date> values) {
            addCriterion("charging_appointment_time not in", values, "chargingAppointmentTime");
            return (Criteria) this;
        }

        public Criteria andChargingAppointmentTimeBetween(Date value1, Date value2) {
            addCriterion("charging_appointment_time between", value1, value2, "chargingAppointmentTime");
            return (Criteria) this;
        }

        public Criteria andChargingAppointmentTimeNotBetween(Date value1, Date value2) {
            addCriterion("charging_appointment_time not between", value1, value2, "chargingAppointmentTime");
            return (Criteria) this;
        }

        public Criteria andChargingStartModeIsNull() {
            addCriterion("charging_start_mode is null");
            return (Criteria) this;
        }

        public Criteria andChargingStartModeIsNotNull() {
            addCriterion("charging_start_mode is not null");
            return (Criteria) this;
        }

        public Criteria andChargingStartModeEqualTo(Byte value) {
            addCriterion("charging_start_mode =", value, "chargingStartMode");
            return (Criteria) this;
        }

        public Criteria andChargingStartModeNotEqualTo(Byte value) {
            addCriterion("charging_start_mode <>", value, "chargingStartMode");
            return (Criteria) this;
        }

        public Criteria andChargingStartModeGreaterThan(Byte value) {
            addCriterion("charging_start_mode >", value, "chargingStartMode");
            return (Criteria) this;
        }

        public Criteria andChargingStartModeGreaterThanOrEqualTo(Byte value) {
            addCriterion("charging_start_mode >=", value, "chargingStartMode");
            return (Criteria) this;
        }

        public Criteria andChargingStartModeLessThan(Byte value) {
            addCriterion("charging_start_mode <", value, "chargingStartMode");
            return (Criteria) this;
        }

        public Criteria andChargingStartModeLessThanOrEqualTo(Byte value) {
            addCriterion("charging_start_mode <=", value, "chargingStartMode");
            return (Criteria) this;
        }

        public Criteria andChargingStartModeIn(List<Byte> values) {
            addCriterion("charging_start_mode in", values, "chargingStartMode");
            return (Criteria) this;
        }

        public Criteria andChargingStartModeNotIn(List<Byte> values) {
            addCriterion("charging_start_mode not in", values, "chargingStartMode");
            return (Criteria) this;
        }

        public Criteria andChargingStartModeBetween(Byte value1, Byte value2) {
            addCriterion("charging_start_mode between", value1, value2, "chargingStartMode");
            return (Criteria) this;
        }

        public Criteria andChargingStartModeNotBetween(Byte value1, Byte value2) {
            addCriterion("charging_start_mode not between", value1, value2, "chargingStartMode");
            return (Criteria) this;
        }

        public Criteria andChargingStrategyIsNull() {
            addCriterion("charging_strategy is null");
            return (Criteria) this;
        }

        public Criteria andChargingStrategyIsNotNull() {
            addCriterion("charging_strategy is not null");
            return (Criteria) this;
        }

        public Criteria andChargingStrategyEqualTo(Byte value) {
            addCriterion("charging_strategy =", value, "chargingStrategy");
            return (Criteria) this;
        }

        public Criteria andChargingStrategyNotEqualTo(Byte value) {
            addCriterion("charging_strategy <>", value, "chargingStrategy");
            return (Criteria) this;
        }

        public Criteria andChargingStrategyGreaterThan(Byte value) {
            addCriterion("charging_strategy >", value, "chargingStrategy");
            return (Criteria) this;
        }

        public Criteria andChargingStrategyGreaterThanOrEqualTo(Byte value) {
            addCriterion("charging_strategy >=", value, "chargingStrategy");
            return (Criteria) this;
        }

        public Criteria andChargingStrategyLessThan(Byte value) {
            addCriterion("charging_strategy <", value, "chargingStrategy");
            return (Criteria) this;
        }

        public Criteria andChargingStrategyLessThanOrEqualTo(Byte value) {
            addCriterion("charging_strategy <=", value, "chargingStrategy");
            return (Criteria) this;
        }

        public Criteria andChargingStrategyIn(List<Byte> values) {
            addCriterion("charging_strategy in", values, "chargingStrategy");
            return (Criteria) this;
        }

        public Criteria andChargingStrategyNotIn(List<Byte> values) {
            addCriterion("charging_strategy not in", values, "chargingStrategy");
            return (Criteria) this;
        }

        public Criteria andChargingStrategyBetween(Byte value1, Byte value2) {
            addCriterion("charging_strategy between", value1, value2, "chargingStrategy");
            return (Criteria) this;
        }

        public Criteria andChargingStrategyNotBetween(Byte value1, Byte value2) {
            addCriterion("charging_strategy not between", value1, value2, "chargingStrategy");
            return (Criteria) this;
        }

        public Criteria andDegreeBeforeChargingIsNull() {
            addCriterion("degree_before_charging is null");
            return (Criteria) this;
        }

        public Criteria andDegreeBeforeChargingIsNotNull() {
            addCriterion("degree_before_charging is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeBeforeChargingEqualTo(BigDecimal value) {
            addCriterion("degree_before_charging =", value, "degreeBeforeCharging");
            return (Criteria) this;
        }

        public Criteria andDegreeBeforeChargingNotEqualTo(BigDecimal value) {
            addCriterion("degree_before_charging <>", value, "degreeBeforeCharging");
            return (Criteria) this;
        }

        public Criteria andDegreeBeforeChargingGreaterThan(BigDecimal value) {
            addCriterion("degree_before_charging >", value, "degreeBeforeCharging");
            return (Criteria) this;
        }

        public Criteria andDegreeBeforeChargingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("degree_before_charging >=", value, "degreeBeforeCharging");
            return (Criteria) this;
        }

        public Criteria andDegreeBeforeChargingLessThan(BigDecimal value) {
            addCriterion("degree_before_charging <", value, "degreeBeforeCharging");
            return (Criteria) this;
        }

        public Criteria andDegreeBeforeChargingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("degree_before_charging <=", value, "degreeBeforeCharging");
            return (Criteria) this;
        }

        public Criteria andDegreeBeforeChargingIn(List<BigDecimal> values) {
            addCriterion("degree_before_charging in", values, "degreeBeforeCharging");
            return (Criteria) this;
        }

        public Criteria andDegreeBeforeChargingNotIn(List<BigDecimal> values) {
            addCriterion("degree_before_charging not in", values, "degreeBeforeCharging");
            return (Criteria) this;
        }

        public Criteria andDegreeBeforeChargingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("degree_before_charging between", value1, value2, "degreeBeforeCharging");
            return (Criteria) this;
        }

        public Criteria andDegreeBeforeChargingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("degree_before_charging not between", value1, value2, "degreeBeforeCharging");
            return (Criteria) this;
        }

        public Criteria andCurrentDegreeIsNull() {
            addCriterion("current_degree is null");
            return (Criteria) this;
        }

        public Criteria andCurrentDegreeIsNotNull() {
            addCriterion("current_degree is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentDegreeEqualTo(BigDecimal value) {
            addCriterion("current_degree =", value, "currentDegree");
            return (Criteria) this;
        }

        public Criteria andCurrentDegreeNotEqualTo(BigDecimal value) {
            addCriterion("current_degree <>", value, "currentDegree");
            return (Criteria) this;
        }

        public Criteria andCurrentDegreeGreaterThan(BigDecimal value) {
            addCriterion("current_degree >", value, "currentDegree");
            return (Criteria) this;
        }

        public Criteria andCurrentDegreeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_degree >=", value, "currentDegree");
            return (Criteria) this;
        }

        public Criteria andCurrentDegreeLessThan(BigDecimal value) {
            addCriterion("current_degree <", value, "currentDegree");
            return (Criteria) this;
        }

        public Criteria andCurrentDegreeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_degree <=", value, "currentDegree");
            return (Criteria) this;
        }

        public Criteria andCurrentDegreeIn(List<BigDecimal> values) {
            addCriterion("current_degree in", values, "currentDegree");
            return (Criteria) this;
        }

        public Criteria andCurrentDegreeNotIn(List<BigDecimal> values) {
            addCriterion("current_degree not in", values, "currentDegree");
            return (Criteria) this;
        }

        public Criteria andCurrentDegreeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_degree between", value1, value2, "currentDegree");
            return (Criteria) this;
        }

        public Criteria andCurrentDegreeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_degree not between", value1, value2, "currentDegree");
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