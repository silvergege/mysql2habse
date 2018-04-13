package com.example.mysql2hbase.po;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class VisPushMessageLog {
    private Long id;

    private String vehicleIdentifier;

    private Integer vehicleIdentifierType;

    private String messageVersion;

    private String ifFrom;

    private Date msgCreateTime;

    private Integer messageType;

    private String messageId;

    private Date eventCreationTime;

    private Integer uplinkCount;

    private Integer downlinkCount;
    
    private String body;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleIdentifier() {
        return vehicleIdentifier;
    }

    public void setVehicleIdentifier(String vehicleIdentifier) {
        this.vehicleIdentifier = vehicleIdentifier == null ? null : vehicleIdentifier.trim();
    }

    public Integer getVehicleIdentifierType() {
        return vehicleIdentifierType;
    }

    public void setVehicleIdentifierType(Integer vehicleIdentifierType) {
        this.vehicleIdentifierType = vehicleIdentifierType;
    }

    public String getMessageVersion() {
        return messageVersion;
    }

    public void setMessageVersion(String messageVersion) {
        this.messageVersion = messageVersion == null ? null : messageVersion.trim();
    }

    public String getIfFrom() {
        return ifFrom;
    }

    public void setIfFrom(String ifFrom) {
        this.ifFrom = ifFrom == null ? null : ifFrom.trim();
    }
    
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getMsgCreateTime() {
        return msgCreateTime;
    }

    public void setMsgCreateTime(Date msgCreateTime) {
        this.msgCreateTime = msgCreateTime;
    }

    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
    }

    public Date getEventCreationTime() {
        return eventCreationTime;
    }

    public void setEventCreationTime(Date eventCreationTime) {
        this.eventCreationTime = eventCreationTime;
    }

    public Integer getUplinkCount() {
        return uplinkCount;
    }

    public void setUplinkCount(Integer uplinkCount) {
        this.uplinkCount = uplinkCount;
    }

    public Integer getDownlinkCount() {
        return downlinkCount;
    }

    public void setDownlinkCount(Integer downlinkCount) {
        this.downlinkCount = downlinkCount;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }
}