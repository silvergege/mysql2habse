package com.example.mysql2hbase.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VisPushMessageLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisPushMessageLogExample() {
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

        public Criteria andVehicleIdentifierIsNull() {
            addCriterion("vehicle_identifier is null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierIsNotNull() {
            addCriterion("vehicle_identifier is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierEqualTo(String value) {
            addCriterion("vehicle_identifier =", value, "vehicleIdentifier");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierNotEqualTo(String value) {
            addCriterion("vehicle_identifier <>", value, "vehicleIdentifier");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierGreaterThan(String value) {
            addCriterion("vehicle_identifier >", value, "vehicleIdentifier");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_identifier >=", value, "vehicleIdentifier");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierLessThan(String value) {
            addCriterion("vehicle_identifier <", value, "vehicleIdentifier");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierLessThanOrEqualTo(String value) {
            addCriterion("vehicle_identifier <=", value, "vehicleIdentifier");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierLike(String value) {
            addCriterion("vehicle_identifier like", value, "vehicleIdentifier");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierNotLike(String value) {
            addCriterion("vehicle_identifier not like", value, "vehicleIdentifier");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierIn(List<String> values) {
            addCriterion("vehicle_identifier in", values, "vehicleIdentifier");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierNotIn(List<String> values) {
            addCriterion("vehicle_identifier not in", values, "vehicleIdentifier");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierBetween(String value1, String value2) {
            addCriterion("vehicle_identifier between", value1, value2, "vehicleIdentifier");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierNotBetween(String value1, String value2) {
            addCriterion("vehicle_identifier not between", value1, value2, "vehicleIdentifier");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierTypeIsNull() {
            addCriterion("vehicle_identifier_type is null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierTypeIsNotNull() {
            addCriterion("vehicle_identifier_type is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierTypeEqualTo(Integer value) {
            addCriterion("vehicle_identifier_type =", value, "vehicleIdentifierType");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierTypeNotEqualTo(Integer value) {
            addCriterion("vehicle_identifier_type <>", value, "vehicleIdentifierType");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierTypeGreaterThan(Integer value) {
            addCriterion("vehicle_identifier_type >", value, "vehicleIdentifierType");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("vehicle_identifier_type >=", value, "vehicleIdentifierType");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierTypeLessThan(Integer value) {
            addCriterion("vehicle_identifier_type <", value, "vehicleIdentifierType");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierTypeLessThanOrEqualTo(Integer value) {
            addCriterion("vehicle_identifier_type <=", value, "vehicleIdentifierType");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierTypeIn(List<Integer> values) {
            addCriterion("vehicle_identifier_type in", values, "vehicleIdentifierType");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierTypeNotIn(List<Integer> values) {
            addCriterion("vehicle_identifier_type not in", values, "vehicleIdentifierType");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierTypeBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_identifier_type between", value1, value2, "vehicleIdentifierType");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentifierTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_identifier_type not between", value1, value2, "vehicleIdentifierType");
            return (Criteria) this;
        }

        public Criteria andMessageVersionIsNull() {
            addCriterion("message_version is null");
            return (Criteria) this;
        }

        public Criteria andMessageVersionIsNotNull() {
            addCriterion("message_version is not null");
            return (Criteria) this;
        }

        public Criteria andMessageVersionEqualTo(String value) {
            addCriterion("message_version =", value, "messageVersion");
            return (Criteria) this;
        }

        public Criteria andMessageVersionNotEqualTo(String value) {
            addCriterion("message_version <>", value, "messageVersion");
            return (Criteria) this;
        }

        public Criteria andMessageVersionGreaterThan(String value) {
            addCriterion("message_version >", value, "messageVersion");
            return (Criteria) this;
        }

        public Criteria andMessageVersionGreaterThanOrEqualTo(String value) {
            addCriterion("message_version >=", value, "messageVersion");
            return (Criteria) this;
        }

        public Criteria andMessageVersionLessThan(String value) {
            addCriterion("message_version <", value, "messageVersion");
            return (Criteria) this;
        }

        public Criteria andMessageVersionLessThanOrEqualTo(String value) {
            addCriterion("message_version <=", value, "messageVersion");
            return (Criteria) this;
        }

        public Criteria andMessageVersionLike(String value) {
            addCriterion("message_version like", value, "messageVersion");
            return (Criteria) this;
        }

        public Criteria andMessageVersionNotLike(String value) {
            addCriterion("message_version not like", value, "messageVersion");
            return (Criteria) this;
        }

        public Criteria andMessageVersionIn(List<String> values) {
            addCriterion("message_version in", values, "messageVersion");
            return (Criteria) this;
        }

        public Criteria andMessageVersionNotIn(List<String> values) {
            addCriterion("message_version not in", values, "messageVersion");
            return (Criteria) this;
        }

        public Criteria andMessageVersionBetween(String value1, String value2) {
            addCriterion("message_version between", value1, value2, "messageVersion");
            return (Criteria) this;
        }

        public Criteria andMessageVersionNotBetween(String value1, String value2) {
            addCriterion("message_version not between", value1, value2, "messageVersion");
            return (Criteria) this;
        }

        public Criteria andIfFromIsNull() {
            addCriterion("if_from is null");
            return (Criteria) this;
        }

        public Criteria andIfFromIsNotNull() {
            addCriterion("if_from is not null");
            return (Criteria) this;
        }

        public Criteria andIfFromEqualTo(String value) {
            addCriterion("if_from =", value, "ifFrom");
            return (Criteria) this;
        }

        public Criteria andIfFromNotEqualTo(String value) {
            addCriterion("if_from <>", value, "ifFrom");
            return (Criteria) this;
        }

        public Criteria andIfFromGreaterThan(String value) {
            addCriterion("if_from >", value, "ifFrom");
            return (Criteria) this;
        }

        public Criteria andIfFromGreaterThanOrEqualTo(String value) {
            addCriterion("if_from >=", value, "ifFrom");
            return (Criteria) this;
        }

        public Criteria andIfFromLessThan(String value) {
            addCriterion("if_from <", value, "ifFrom");
            return (Criteria) this;
        }

        public Criteria andIfFromLessThanOrEqualTo(String value) {
            addCriterion("if_from <=", value, "ifFrom");
            return (Criteria) this;
        }

        public Criteria andIfFromLike(String value) {
            addCriterion("if_from like", value, "ifFrom");
            return (Criteria) this;
        }

        public Criteria andIfFromNotLike(String value) {
            addCriterion("if_from not like", value, "ifFrom");
            return (Criteria) this;
        }

        public Criteria andIfFromIn(List<String> values) {
            addCriterion("if_from in", values, "ifFrom");
            return (Criteria) this;
        }

        public Criteria andIfFromNotIn(List<String> values) {
            addCriterion("if_from not in", values, "ifFrom");
            return (Criteria) this;
        }

        public Criteria andIfFromBetween(String value1, String value2) {
            addCriterion("if_from between", value1, value2, "ifFrom");
            return (Criteria) this;
        }

        public Criteria andIfFromNotBetween(String value1, String value2) {
            addCriterion("if_from not between", value1, value2, "ifFrom");
            return (Criteria) this;
        }

        public Criteria andMsgCreateTimeIsNull() {
            addCriterion("msg_create_time is null");
            return (Criteria) this;
        }

        public Criteria andMsgCreateTimeIsNotNull() {
            addCriterion("msg_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andMsgCreateTimeEqualTo(Date value) {
            addCriterion("msg_create_time =", value, "msgCreateTime");
            return (Criteria) this;
        }

        public Criteria andMsgCreateTimeNotEqualTo(Date value) {
            addCriterion("msg_create_time <>", value, "msgCreateTime");
            return (Criteria) this;
        }

        public Criteria andMsgCreateTimeGreaterThan(Date value) {
            addCriterion("msg_create_time >", value, "msgCreateTime");
            return (Criteria) this;
        }

        public Criteria andMsgCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("msg_create_time >=", value, "msgCreateTime");
            return (Criteria) this;
        }

        public Criteria andMsgCreateTimeLessThan(Date value) {
            addCriterion("msg_create_time <", value, "msgCreateTime");
            return (Criteria) this;
        }

        public Criteria andMsgCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("msg_create_time <=", value, "msgCreateTime");
            return (Criteria) this;
        }

        public Criteria andMsgCreateTimeIn(List<Date> values) {
            addCriterion("msg_create_time in", values, "msgCreateTime");
            return (Criteria) this;
        }

        public Criteria andMsgCreateTimeNotIn(List<Date> values) {
            addCriterion("msg_create_time not in", values, "msgCreateTime");
            return (Criteria) this;
        }

        public Criteria andMsgCreateTimeBetween(Date value1, Date value2) {
            addCriterion("msg_create_time between", value1, value2, "msgCreateTime");
            return (Criteria) this;
        }

        public Criteria andMsgCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("msg_create_time not between", value1, value2, "msgCreateTime");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIsNull() {
            addCriterion("message_type is null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIsNotNull() {
            addCriterion("message_type is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeEqualTo(Integer value) {
            addCriterion("message_type =", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotEqualTo(Integer value) {
            addCriterion("message_type <>", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThan(Integer value) {
            addCriterion("message_type >", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_type >=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThan(Integer value) {
            addCriterion("message_type <", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThanOrEqualTo(Integer value) {
            addCriterion("message_type <=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIn(List<Integer> values) {
            addCriterion("message_type in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotIn(List<Integer> values) {
            addCriterion("message_type not in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeBetween(Integer value1, Integer value2) {
            addCriterion("message_type between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("message_type not between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(String value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(String value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(String value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(String value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(String value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(String value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLike(String value) {
            addCriterion("message_id like", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotLike(String value) {
            addCriterion("message_id not like", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<String> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<String> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(String value1, String value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(String value1, String value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andEventCreationTimeIsNull() {
            addCriterion("event_creation_time is null");
            return (Criteria) this;
        }

        public Criteria andEventCreationTimeIsNotNull() {
            addCriterion("event_creation_time is not null");
            return (Criteria) this;
        }

        public Criteria andEventCreationTimeEqualTo(Date value) {
            addCriterion("event_creation_time =", value, "eventCreationTime");
            return (Criteria) this;
        }

        public Criteria andEventCreationTimeNotEqualTo(Date value) {
            addCriterion("event_creation_time <>", value, "eventCreationTime");
            return (Criteria) this;
        }

        public Criteria andEventCreationTimeGreaterThan(Date value) {
            addCriterion("event_creation_time >", value, "eventCreationTime");
            return (Criteria) this;
        }

        public Criteria andEventCreationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("event_creation_time >=", value, "eventCreationTime");
            return (Criteria) this;
        }

        public Criteria andEventCreationTimeLessThan(Date value) {
            addCriterion("event_creation_time <", value, "eventCreationTime");
            return (Criteria) this;
        }

        public Criteria andEventCreationTimeLessThanOrEqualTo(Date value) {
            addCriterion("event_creation_time <=", value, "eventCreationTime");
            return (Criteria) this;
        }

        public Criteria andEventCreationTimeIn(List<Date> values) {
            addCriterion("event_creation_time in", values, "eventCreationTime");
            return (Criteria) this;
        }

        public Criteria andEventCreationTimeNotIn(List<Date> values) {
            addCriterion("event_creation_time not in", values, "eventCreationTime");
            return (Criteria) this;
        }

        public Criteria andEventCreationTimeBetween(Date value1, Date value2) {
            addCriterion("event_creation_time between", value1, value2, "eventCreationTime");
            return (Criteria) this;
        }

        public Criteria andEventCreationTimeNotBetween(Date value1, Date value2) {
            addCriterion("event_creation_time not between", value1, value2, "eventCreationTime");
            return (Criteria) this;
        }

        public Criteria andUplinkCountIsNull() {
            addCriterion("uplink_count is null");
            return (Criteria) this;
        }

        public Criteria andUplinkCountIsNotNull() {
            addCriterion("uplink_count is not null");
            return (Criteria) this;
        }

        public Criteria andUplinkCountEqualTo(Integer value) {
            addCriterion("uplink_count =", value, "uplinkCount");
            return (Criteria) this;
        }

        public Criteria andUplinkCountNotEqualTo(Integer value) {
            addCriterion("uplink_count <>", value, "uplinkCount");
            return (Criteria) this;
        }

        public Criteria andUplinkCountGreaterThan(Integer value) {
            addCriterion("uplink_count >", value, "uplinkCount");
            return (Criteria) this;
        }

        public Criteria andUplinkCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("uplink_count >=", value, "uplinkCount");
            return (Criteria) this;
        }

        public Criteria andUplinkCountLessThan(Integer value) {
            addCriterion("uplink_count <", value, "uplinkCount");
            return (Criteria) this;
        }

        public Criteria andUplinkCountLessThanOrEqualTo(Integer value) {
            addCriterion("uplink_count <=", value, "uplinkCount");
            return (Criteria) this;
        }

        public Criteria andUplinkCountIn(List<Integer> values) {
            addCriterion("uplink_count in", values, "uplinkCount");
            return (Criteria) this;
        }

        public Criteria andUplinkCountNotIn(List<Integer> values) {
            addCriterion("uplink_count not in", values, "uplinkCount");
            return (Criteria) this;
        }

        public Criteria andUplinkCountBetween(Integer value1, Integer value2) {
            addCriterion("uplink_count between", value1, value2, "uplinkCount");
            return (Criteria) this;
        }

        public Criteria andUplinkCountNotBetween(Integer value1, Integer value2) {
            addCriterion("uplink_count not between", value1, value2, "uplinkCount");
            return (Criteria) this;
        }

        public Criteria andDownlinkCountIsNull() {
            addCriterion("downlink_count is null");
            return (Criteria) this;
        }

        public Criteria andDownlinkCountIsNotNull() {
            addCriterion("downlink_count is not null");
            return (Criteria) this;
        }

        public Criteria andDownlinkCountEqualTo(Integer value) {
            addCriterion("downlink_count =", value, "downlinkCount");
            return (Criteria) this;
        }

        public Criteria andDownlinkCountNotEqualTo(Integer value) {
            addCriterion("downlink_count <>", value, "downlinkCount");
            return (Criteria) this;
        }

        public Criteria andDownlinkCountGreaterThan(Integer value) {
            addCriterion("downlink_count >", value, "downlinkCount");
            return (Criteria) this;
        }

        public Criteria andDownlinkCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("downlink_count >=", value, "downlinkCount");
            return (Criteria) this;
        }

        public Criteria andDownlinkCountLessThan(Integer value) {
            addCriterion("downlink_count <", value, "downlinkCount");
            return (Criteria) this;
        }

        public Criteria andDownlinkCountLessThanOrEqualTo(Integer value) {
            addCriterion("downlink_count <=", value, "downlinkCount");
            return (Criteria) this;
        }

        public Criteria andDownlinkCountIn(List<Integer> values) {
            addCriterion("downlink_count in", values, "downlinkCount");
            return (Criteria) this;
        }

        public Criteria andDownlinkCountNotIn(List<Integer> values) {
            addCriterion("downlink_count not in", values, "downlinkCount");
            return (Criteria) this;
        }

        public Criteria andDownlinkCountBetween(Integer value1, Integer value2) {
            addCriterion("downlink_count between", value1, value2, "downlinkCount");
            return (Criteria) this;
        }

        public Criteria andDownlinkCountNotBetween(Integer value1, Integer value2) {
            addCriterion("downlink_count not between", value1, value2, "downlinkCount");
            return (Criteria) this;
        }

        public Criteria andBodyIsNull() {
            addCriterion("body is null");
            return (Criteria) this;
        }

        public Criteria andBodyIsNotNull() {
            addCriterion("body is not null");
            return (Criteria) this;
        }

        public Criteria andBodyEqualTo(String value) {
            addCriterion("body =", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotEqualTo(String value) {
            addCriterion("body <>", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyGreaterThan(String value) {
            addCriterion("body >", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyGreaterThanOrEqualTo(String value) {
            addCriterion("body >=", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLessThan(String value) {
            addCriterion("body <", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLessThanOrEqualTo(String value) {
            addCriterion("body <=", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLike(String value) {
            addCriterion("body like", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotLike(String value) {
            addCriterion("body not like", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyIn(List<String> values) {
            addCriterion("body in", values, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotIn(List<String> values) {
            addCriterion("body not in", values, "body");
            return (Criteria) this;
        }

        public Criteria andBodyBetween(String value1, String value2) {
            addCriterion("body between", value1, value2, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotBetween(String value1, String value2) {
            addCriterion("body not between", value1, value2, "body");
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