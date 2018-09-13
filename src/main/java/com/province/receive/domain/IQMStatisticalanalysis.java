package com.province.receive.domain;

import java.math.BigDecimal;
import java.util.Date;

public class IQMStatisticalanalysis {
    private String id;

    private String voiceNo;

    private String callPhone;

    private String appNo;

    private Date reqBeginDate;

    private Date connectTime;

    private String busiTypeCode;

    private BigDecimal interactiveNum;

    private BigDecimal effectiveTime;

    private BigDecimal invalidTime;

    private BigDecimal silencNum;

    private BigDecimal silenceTime;

    private BigDecimal overlapNum;

    private BigDecimal overlapTime;

    private String callReasonCode;

    private String mistakeLevel;

    private String isComplaint;

    private String isRepeat;

    private String orgNo;

    private String csrDept;

    private String center;

    private String recommendRank;

    private String proOrgNo;

    private String satisfaction;

    private String reqDirection;

    private String manualSatisfaction;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getVoiceNo() {
        return voiceNo;
    }

    public void setVoiceNo(String voiceNo) {
        this.voiceNo = voiceNo == null ? null : voiceNo.trim();
    }

    public String getCallPhone() {
        return callPhone;
    }

    public void setCallPhone(String callPhone) {
        this.callPhone = callPhone == null ? null : callPhone.trim();
    }

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo == null ? null : appNo.trim();
    }

    public Date getReqBeginDate() {
        return reqBeginDate;
    }

    public void setReqBeginDate(Date reqBeginDate) {
        this.reqBeginDate = reqBeginDate;
    }

    public Date getConnectTime() {
        return connectTime;
    }

    public void setConnectTime(Date connectTime) {
        this.connectTime = connectTime;
    }

    public String getBusiTypeCode() {
        return busiTypeCode;
    }

    public void setBusiTypeCode(String busiTypeCode) {
        this.busiTypeCode = busiTypeCode == null ? null : busiTypeCode.trim();
    }

    public BigDecimal getInteractiveNum() {
        return interactiveNum;
    }

    public void setInteractiveNum(BigDecimal interactiveNum) {
        this.interactiveNum = interactiveNum;
    }

    public BigDecimal getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(BigDecimal effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public BigDecimal getInvalidTime() {
        return invalidTime;
    }

    public void setInvalidTime(BigDecimal invalidTime) {
        this.invalidTime = invalidTime;
    }

    public BigDecimal getSilencNum() {
        return silencNum;
    }

    public void setSilencNum(BigDecimal silencNum) {
        this.silencNum = silencNum;
    }

    public BigDecimal getSilenceTime() {
        return silenceTime;
    }

    public void setSilenceTime(BigDecimal silenceTime) {
        this.silenceTime = silenceTime;
    }

    public BigDecimal getOverlapNum() {
        return overlapNum;
    }

    public void setOverlapNum(BigDecimal overlapNum) {
        this.overlapNum = overlapNum;
    }

    public BigDecimal getOverlapTime() {
        return overlapTime;
    }

    public void setOverlapTime(BigDecimal overlapTime) {
        this.overlapTime = overlapTime;
    }

    public String getCallReasonCode() {
        return callReasonCode;
    }

    public void setCallReasonCode(String callReasonCode) {
        this.callReasonCode = callReasonCode == null ? null : callReasonCode.trim();
    }

    public String getMistakeLevel() {
        return mistakeLevel;
    }

    public void setMistakeLevel(String mistakeLevel) {
        this.mistakeLevel = mistakeLevel == null ? null : mistakeLevel.trim();
    }

    public String getIsComplaint() {
        return isComplaint;
    }

    public void setIsComplaint(String isComplaint) {
        this.isComplaint = isComplaint == null ? null : isComplaint.trim();
    }

    public String getIsRepeat() {
        return isRepeat;
    }

    public void setIsRepeat(String isRepeat) {
        this.isRepeat = isRepeat == null ? null : isRepeat.trim();
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo == null ? null : orgNo.trim();
    }

    public String getCsrDept() {
        return csrDept;
    }

    public void setCsrDept(String csrDept) {
        this.csrDept = csrDept == null ? null : csrDept.trim();
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center == null ? null : center.trim();
    }

    public String getRecommendRank() {
        return recommendRank;
    }

    public void setRecommendRank(String recommendRank) {
        this.recommendRank = recommendRank == null ? null : recommendRank.trim();
    }

    public String getProOrgNo() {
        return proOrgNo;
    }

    public void setProOrgNo(String proOrgNo) {
        this.proOrgNo = proOrgNo == null ? null : proOrgNo.trim();
    }

    public String getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(String satisfaction) {
        this.satisfaction = satisfaction == null ? null : satisfaction.trim();
    }

    public String getReqDirection() {
        return reqDirection;
    }

    public void setReqDirection(String reqDirection) {
        this.reqDirection = reqDirection == null ? null : reqDirection.trim();
    }

    public String getManualSatisfaction() {
        return manualSatisfaction;
    }

    public void setManualSatisfaction(String manualSatisfaction) {
        this.manualSatisfaction = manualSatisfaction == null ? null : manualSatisfaction.trim();
    }
}