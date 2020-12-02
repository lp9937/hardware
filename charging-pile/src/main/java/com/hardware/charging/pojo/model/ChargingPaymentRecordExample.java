package com.hardware.charging.pojo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChargingPaymentRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChargingPaymentRecordExample() {
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

        public Criteria andChargingRecordIdIsNull() {
            addCriterion("charging_record_id is null");
            return (Criteria) this;
        }

        public Criteria andChargingRecordIdIsNotNull() {
            addCriterion("charging_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargingRecordIdEqualTo(Integer value) {
            addCriterion("charging_record_id =", value, "chargingRecordId");
            return (Criteria) this;
        }

        public Criteria andChargingRecordIdNotEqualTo(Integer value) {
            addCriterion("charging_record_id <>", value, "chargingRecordId");
            return (Criteria) this;
        }

        public Criteria andChargingRecordIdGreaterThan(Integer value) {
            addCriterion("charging_record_id >", value, "chargingRecordId");
            return (Criteria) this;
        }

        public Criteria andChargingRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("charging_record_id >=", value, "chargingRecordId");
            return (Criteria) this;
        }

        public Criteria andChargingRecordIdLessThan(Integer value) {
            addCriterion("charging_record_id <", value, "chargingRecordId");
            return (Criteria) this;
        }

        public Criteria andChargingRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("charging_record_id <=", value, "chargingRecordId");
            return (Criteria) this;
        }

        public Criteria andChargingRecordIdIn(List<Integer> values) {
            addCriterion("charging_record_id in", values, "chargingRecordId");
            return (Criteria) this;
        }

        public Criteria andChargingRecordIdNotIn(List<Integer> values) {
            addCriterion("charging_record_id not in", values, "chargingRecordId");
            return (Criteria) this;
        }

        public Criteria andChargingRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("charging_record_id between", value1, value2, "chargingRecordId");
            return (Criteria) this;
        }

        public Criteria andChargingRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("charging_record_id not between", value1, value2, "chargingRecordId");
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

        public Criteria andPaymentChannelIsNull() {
            addCriterion("payment_channel is null");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelIsNotNull() {
            addCriterion("payment_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelEqualTo(Byte value) {
            addCriterion("payment_channel =", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotEqualTo(Byte value) {
            addCriterion("payment_channel <>", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelGreaterThan(Byte value) {
            addCriterion("payment_channel >", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelGreaterThanOrEqualTo(Byte value) {
            addCriterion("payment_channel >=", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelLessThan(Byte value) {
            addCriterion("payment_channel <", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelLessThanOrEqualTo(Byte value) {
            addCriterion("payment_channel <=", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelIn(List<Byte> values) {
            addCriterion("payment_channel in", values, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotIn(List<Byte> values) {
            addCriterion("payment_channel not in", values, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelBetween(Byte value1, Byte value2) {
            addCriterion("payment_channel between", value1, value2, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotBetween(Byte value1, Byte value2) {
            addCriterion("payment_channel not between", value1, value2, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNull() {
            addCriterion("payment_method is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNotNull() {
            addCriterion("payment_method is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodEqualTo(Byte value) {
            addCriterion("payment_method =", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotEqualTo(Byte value) {
            addCriterion("payment_method <>", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThan(Byte value) {
            addCriterion("payment_method >", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThanOrEqualTo(Byte value) {
            addCriterion("payment_method >=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThan(Byte value) {
            addCriterion("payment_method <", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThanOrEqualTo(Byte value) {
            addCriterion("payment_method <=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIn(List<Byte> values) {
            addCriterion("payment_method in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotIn(List<Byte> values) {
            addCriterion("payment_method not in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodBetween(Byte value1, Byte value2) {
            addCriterion("payment_method between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotBetween(Byte value1, Byte value2) {
            addCriterion("payment_method not between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andShouldAmountIsNull() {
            addCriterion("should_amount is null");
            return (Criteria) this;
        }

        public Criteria andShouldAmountIsNotNull() {
            addCriterion("should_amount is not null");
            return (Criteria) this;
        }

        public Criteria andShouldAmountEqualTo(BigDecimal value) {
            addCriterion("should_amount =", value, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountNotEqualTo(BigDecimal value) {
            addCriterion("should_amount <>", value, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountGreaterThan(BigDecimal value) {
            addCriterion("should_amount >", value, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("should_amount >=", value, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountLessThan(BigDecimal value) {
            addCriterion("should_amount <", value, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("should_amount <=", value, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountIn(List<BigDecimal> values) {
            addCriterion("should_amount in", values, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountNotIn(List<BigDecimal> values) {
            addCriterion("should_amount not in", values, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("should_amount between", value1, value2, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("should_amount not between", value1, value2, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountIsNull() {
            addCriterion("actual_amount is null");
            return (Criteria) this;
        }

        public Criteria andActualAmountIsNotNull() {
            addCriterion("actual_amount is not null");
            return (Criteria) this;
        }

        public Criteria andActualAmountEqualTo(BigDecimal value) {
            addCriterion("actual_amount =", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountNotEqualTo(BigDecimal value) {
            addCriterion("actual_amount <>", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountGreaterThan(BigDecimal value) {
            addCriterion("actual_amount >", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_amount >=", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountLessThan(BigDecimal value) {
            addCriterion("actual_amount <", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_amount <=", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountIn(List<BigDecimal> values) {
            addCriterion("actual_amount in", values, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountNotIn(List<BigDecimal> values) {
            addCriterion("actual_amount not in", values, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_amount between", value1, value2, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_amount not between", value1, value2, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNull() {
            addCriterion("discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("discount_amount =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("discount_amount <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("discount_amount >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(BigDecimal value) {
            addCriterion("discount_amount <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("discount_amount in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("discount_amount not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount not between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andIsReductionIsNull() {
            addCriterion("is_reduction is null");
            return (Criteria) this;
        }

        public Criteria andIsReductionIsNotNull() {
            addCriterion("is_reduction is not null");
            return (Criteria) this;
        }

        public Criteria andIsReductionEqualTo(Boolean value) {
            addCriterion("is_reduction =", value, "isReduction");
            return (Criteria) this;
        }

        public Criteria andIsReductionNotEqualTo(Boolean value) {
            addCriterion("is_reduction <>", value, "isReduction");
            return (Criteria) this;
        }

        public Criteria andIsReductionGreaterThan(Boolean value) {
            addCriterion("is_reduction >", value, "isReduction");
            return (Criteria) this;
        }

        public Criteria andIsReductionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_reduction >=", value, "isReduction");
            return (Criteria) this;
        }

        public Criteria andIsReductionLessThan(Boolean value) {
            addCriterion("is_reduction <", value, "isReduction");
            return (Criteria) this;
        }

        public Criteria andIsReductionLessThanOrEqualTo(Boolean value) {
            addCriterion("is_reduction <=", value, "isReduction");
            return (Criteria) this;
        }

        public Criteria andIsReductionIn(List<Boolean> values) {
            addCriterion("is_reduction in", values, "isReduction");
            return (Criteria) this;
        }

        public Criteria andIsReductionNotIn(List<Boolean> values) {
            addCriterion("is_reduction not in", values, "isReduction");
            return (Criteria) this;
        }

        public Criteria andIsReductionBetween(Boolean value1, Boolean value2) {
            addCriterion("is_reduction between", value1, value2, "isReduction");
            return (Criteria) this;
        }

        public Criteria andIsReductionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_reduction not between", value1, value2, "isReduction");
            return (Criteria) this;
        }

        public Criteria andReductionRuleIdIsNull() {
            addCriterion("reduction_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andReductionRuleIdIsNotNull() {
            addCriterion("reduction_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andReductionRuleIdEqualTo(Integer value) {
            addCriterion("reduction_rule_id =", value, "reductionRuleId");
            return (Criteria) this;
        }

        public Criteria andReductionRuleIdNotEqualTo(Integer value) {
            addCriterion("reduction_rule_id <>", value, "reductionRuleId");
            return (Criteria) this;
        }

        public Criteria andReductionRuleIdGreaterThan(Integer value) {
            addCriterion("reduction_rule_id >", value, "reductionRuleId");
            return (Criteria) this;
        }

        public Criteria andReductionRuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reduction_rule_id >=", value, "reductionRuleId");
            return (Criteria) this;
        }

        public Criteria andReductionRuleIdLessThan(Integer value) {
            addCriterion("reduction_rule_id <", value, "reductionRuleId");
            return (Criteria) this;
        }

        public Criteria andReductionRuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("reduction_rule_id <=", value, "reductionRuleId");
            return (Criteria) this;
        }

        public Criteria andReductionRuleIdIn(List<Integer> values) {
            addCriterion("reduction_rule_id in", values, "reductionRuleId");
            return (Criteria) this;
        }

        public Criteria andReductionRuleIdNotIn(List<Integer> values) {
            addCriterion("reduction_rule_id not in", values, "reductionRuleId");
            return (Criteria) this;
        }

        public Criteria andReductionRuleIdBetween(Integer value1, Integer value2) {
            addCriterion("reduction_rule_id between", value1, value2, "reductionRuleId");
            return (Criteria) this;
        }

        public Criteria andReductionRuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reduction_rule_id not between", value1, value2, "reductionRuleId");
            return (Criteria) this;
        }

        public Criteria andIsRefundIsNull() {
            addCriterion("is_refund is null");
            return (Criteria) this;
        }

        public Criteria andIsRefundIsNotNull() {
            addCriterion("is_refund is not null");
            return (Criteria) this;
        }

        public Criteria andIsRefundEqualTo(Boolean value) {
            addCriterion("is_refund =", value, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundNotEqualTo(Boolean value) {
            addCriterion("is_refund <>", value, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundGreaterThan(Boolean value) {
            addCriterion("is_refund >", value, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_refund >=", value, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundLessThan(Boolean value) {
            addCriterion("is_refund <", value, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundLessThanOrEqualTo(Boolean value) {
            addCriterion("is_refund <=", value, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundIn(List<Boolean> values) {
            addCriterion("is_refund in", values, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundNotIn(List<Boolean> values) {
            addCriterion("is_refund not in", values, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundBetween(Boolean value1, Boolean value2) {
            addCriterion("is_refund between", value1, value2, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_refund not between", value1, value2, "isRefund");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNull() {
            addCriterion("refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(BigDecimal value) {
            addCriterion("refund_amount =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(BigDecimal value) {
            addCriterion("refund_amount <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(BigDecimal value) {
            addCriterion("refund_amount >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_amount >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(BigDecimal value) {
            addCriterion("refund_amount <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_amount <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<BigDecimal> values) {
            addCriterion("refund_amount in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<BigDecimal> values) {
            addCriterion("refund_amount not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_amount between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_amount not between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(String value) {
            addCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(String value) {
            addCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(String value) {
            addCriterion("serial_number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(String value) {
            addCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLike(String value) {
            addCriterion("serial_number like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotLike(String value) {
            addCriterion("serial_number not like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<String> values) {
            addCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<String> values) {
            addCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(String value1, String value2) {
            addCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(String value1, String value2) {
            addCriterion("serial_number not between", value1, value2, "serialNumber");
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