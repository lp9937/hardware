package com.hardware.charging.pojo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChargingGunExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChargingGunExample() {
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

        public Criteria andChargingPileIdIsNull() {
            addCriterion("charging_pile_id is null");
            return (Criteria) this;
        }

        public Criteria andChargingPileIdIsNotNull() {
            addCriterion("charging_pile_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargingPileIdEqualTo(Integer value) {
            addCriterion("charging_pile_id =", value, "chargingPileId");
            return (Criteria) this;
        }

        public Criteria andChargingPileIdNotEqualTo(Integer value) {
            addCriterion("charging_pile_id <>", value, "chargingPileId");
            return (Criteria) this;
        }

        public Criteria andChargingPileIdGreaterThan(Integer value) {
            addCriterion("charging_pile_id >", value, "chargingPileId");
            return (Criteria) this;
        }

        public Criteria andChargingPileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("charging_pile_id >=", value, "chargingPileId");
            return (Criteria) this;
        }

        public Criteria andChargingPileIdLessThan(Integer value) {
            addCriterion("charging_pile_id <", value, "chargingPileId");
            return (Criteria) this;
        }

        public Criteria andChargingPileIdLessThanOrEqualTo(Integer value) {
            addCriterion("charging_pile_id <=", value, "chargingPileId");
            return (Criteria) this;
        }

        public Criteria andChargingPileIdIn(List<Integer> values) {
            addCriterion("charging_pile_id in", values, "chargingPileId");
            return (Criteria) this;
        }

        public Criteria andChargingPileIdNotIn(List<Integer> values) {
            addCriterion("charging_pile_id not in", values, "chargingPileId");
            return (Criteria) this;
        }

        public Criteria andChargingPileIdBetween(Integer value1, Integer value2) {
            addCriterion("charging_pile_id between", value1, value2, "chargingPileId");
            return (Criteria) this;
        }

        public Criteria andChargingPileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("charging_pile_id not between", value1, value2, "chargingPileId");
            return (Criteria) this;
        }

        public Criteria andChargingGunTypeIsNull() {
            addCriterion("charging_gun_type is null");
            return (Criteria) this;
        }

        public Criteria andChargingGunTypeIsNotNull() {
            addCriterion("charging_gun_type is not null");
            return (Criteria) this;
        }

        public Criteria andChargingGunTypeEqualTo(Byte value) {
            addCriterion("charging_gun_type =", value, "chargingGunType");
            return (Criteria) this;
        }

        public Criteria andChargingGunTypeNotEqualTo(Byte value) {
            addCriterion("charging_gun_type <>", value, "chargingGunType");
            return (Criteria) this;
        }

        public Criteria andChargingGunTypeGreaterThan(Byte value) {
            addCriterion("charging_gun_type >", value, "chargingGunType");
            return (Criteria) this;
        }

        public Criteria andChargingGunTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("charging_gun_type >=", value, "chargingGunType");
            return (Criteria) this;
        }

        public Criteria andChargingGunTypeLessThan(Byte value) {
            addCriterion("charging_gun_type <", value, "chargingGunType");
            return (Criteria) this;
        }

        public Criteria andChargingGunTypeLessThanOrEqualTo(Byte value) {
            addCriterion("charging_gun_type <=", value, "chargingGunType");
            return (Criteria) this;
        }

        public Criteria andChargingGunTypeIn(List<Byte> values) {
            addCriterion("charging_gun_type in", values, "chargingGunType");
            return (Criteria) this;
        }

        public Criteria andChargingGunTypeNotIn(List<Byte> values) {
            addCriterion("charging_gun_type not in", values, "chargingGunType");
            return (Criteria) this;
        }

        public Criteria andChargingGunTypeBetween(Byte value1, Byte value2) {
            addCriterion("charging_gun_type between", value1, value2, "chargingGunType");
            return (Criteria) this;
        }

        public Criteria andChargingGunTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("charging_gun_type not between", value1, value2, "chargingGunType");
            return (Criteria) this;
        }

        public Criteria andChargingGunStatusIsNull() {
            addCriterion("charging_gun_status is null");
            return (Criteria) this;
        }

        public Criteria andChargingGunStatusIsNotNull() {
            addCriterion("charging_gun_status is not null");
            return (Criteria) this;
        }

        public Criteria andChargingGunStatusEqualTo(Byte value) {
            addCriterion("charging_gun_status =", value, "chargingGunStatus");
            return (Criteria) this;
        }

        public Criteria andChargingGunStatusNotEqualTo(Byte value) {
            addCriterion("charging_gun_status <>", value, "chargingGunStatus");
            return (Criteria) this;
        }

        public Criteria andChargingGunStatusGreaterThan(Byte value) {
            addCriterion("charging_gun_status >", value, "chargingGunStatus");
            return (Criteria) this;
        }

        public Criteria andChargingGunStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("charging_gun_status >=", value, "chargingGunStatus");
            return (Criteria) this;
        }

        public Criteria andChargingGunStatusLessThan(Byte value) {
            addCriterion("charging_gun_status <", value, "chargingGunStatus");
            return (Criteria) this;
        }

        public Criteria andChargingGunStatusLessThanOrEqualTo(Byte value) {
            addCriterion("charging_gun_status <=", value, "chargingGunStatus");
            return (Criteria) this;
        }

        public Criteria andChargingGunStatusIn(List<Byte> values) {
            addCriterion("charging_gun_status in", values, "chargingGunStatus");
            return (Criteria) this;
        }

        public Criteria andChargingGunStatusNotIn(List<Byte> values) {
            addCriterion("charging_gun_status not in", values, "chargingGunStatus");
            return (Criteria) this;
        }

        public Criteria andChargingGunStatusBetween(Byte value1, Byte value2) {
            addCriterion("charging_gun_status between", value1, value2, "chargingGunStatus");
            return (Criteria) this;
        }

        public Criteria andChargingGunStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("charging_gun_status not between", value1, value2, "chargingGunStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusIsNull() {
            addCriterion("connection_status is null");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusIsNotNull() {
            addCriterion("connection_status is not null");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusEqualTo(Byte value) {
            addCriterion("connection_status =", value, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusNotEqualTo(Byte value) {
            addCriterion("connection_status <>", value, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusGreaterThan(Byte value) {
            addCriterion("connection_status >", value, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("connection_status >=", value, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusLessThan(Byte value) {
            addCriterion("connection_status <", value, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusLessThanOrEqualTo(Byte value) {
            addCriterion("connection_status <=", value, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusIn(List<Byte> values) {
            addCriterion("connection_status in", values, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusNotIn(List<Byte> values) {
            addCriterion("connection_status not in", values, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusBetween(Byte value1, Byte value2) {
            addCriterion("connection_status between", value1, value2, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("connection_status not between", value1, value2, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andChargingVoltageIsNull() {
            addCriterion("charging_voltage is null");
            return (Criteria) this;
        }

        public Criteria andChargingVoltageIsNotNull() {
            addCriterion("charging_voltage is not null");
            return (Criteria) this;
        }

        public Criteria andChargingVoltageEqualTo(Integer value) {
            addCriterion("charging_voltage =", value, "chargingVoltage");
            return (Criteria) this;
        }

        public Criteria andChargingVoltageNotEqualTo(Integer value) {
            addCriterion("charging_voltage <>", value, "chargingVoltage");
            return (Criteria) this;
        }

        public Criteria andChargingVoltageGreaterThan(Integer value) {
            addCriterion("charging_voltage >", value, "chargingVoltage");
            return (Criteria) this;
        }

        public Criteria andChargingVoltageGreaterThanOrEqualTo(Integer value) {
            addCriterion("charging_voltage >=", value, "chargingVoltage");
            return (Criteria) this;
        }

        public Criteria andChargingVoltageLessThan(Integer value) {
            addCriterion("charging_voltage <", value, "chargingVoltage");
            return (Criteria) this;
        }

        public Criteria andChargingVoltageLessThanOrEqualTo(Integer value) {
            addCriterion("charging_voltage <=", value, "chargingVoltage");
            return (Criteria) this;
        }

        public Criteria andChargingVoltageIn(List<Integer> values) {
            addCriterion("charging_voltage in", values, "chargingVoltage");
            return (Criteria) this;
        }

        public Criteria andChargingVoltageNotIn(List<Integer> values) {
            addCriterion("charging_voltage not in", values, "chargingVoltage");
            return (Criteria) this;
        }

        public Criteria andChargingVoltageBetween(Integer value1, Integer value2) {
            addCriterion("charging_voltage between", value1, value2, "chargingVoltage");
            return (Criteria) this;
        }

        public Criteria andChargingVoltageNotBetween(Integer value1, Integer value2) {
            addCriterion("charging_voltage not between", value1, value2, "chargingVoltage");
            return (Criteria) this;
        }

        public Criteria andChargingCurrentIsNull() {
            addCriterion("charging_current is null");
            return (Criteria) this;
        }

        public Criteria andChargingCurrentIsNotNull() {
            addCriterion("charging_current is not null");
            return (Criteria) this;
        }

        public Criteria andChargingCurrentEqualTo(Integer value) {
            addCriterion("charging_current =", value, "chargingCurrent");
            return (Criteria) this;
        }

        public Criteria andChargingCurrentNotEqualTo(Integer value) {
            addCriterion("charging_current <>", value, "chargingCurrent");
            return (Criteria) this;
        }

        public Criteria andChargingCurrentGreaterThan(Integer value) {
            addCriterion("charging_current >", value, "chargingCurrent");
            return (Criteria) this;
        }

        public Criteria andChargingCurrentGreaterThanOrEqualTo(Integer value) {
            addCriterion("charging_current >=", value, "chargingCurrent");
            return (Criteria) this;
        }

        public Criteria andChargingCurrentLessThan(Integer value) {
            addCriterion("charging_current <", value, "chargingCurrent");
            return (Criteria) this;
        }

        public Criteria andChargingCurrentLessThanOrEqualTo(Integer value) {
            addCriterion("charging_current <=", value, "chargingCurrent");
            return (Criteria) this;
        }

        public Criteria andChargingCurrentIn(List<Integer> values) {
            addCriterion("charging_current in", values, "chargingCurrent");
            return (Criteria) this;
        }

        public Criteria andChargingCurrentNotIn(List<Integer> values) {
            addCriterion("charging_current not in", values, "chargingCurrent");
            return (Criteria) this;
        }

        public Criteria andChargingCurrentBetween(Integer value1, Integer value2) {
            addCriterion("charging_current between", value1, value2, "chargingCurrent");
            return (Criteria) this;
        }

        public Criteria andChargingCurrentNotBetween(Integer value1, Integer value2) {
            addCriterion("charging_current not between", value1, value2, "chargingCurrent");
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