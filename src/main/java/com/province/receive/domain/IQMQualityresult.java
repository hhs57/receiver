package com.province.receive.domain;

import java.math.BigDecimal;

public class IQMQualityresult {
    private String voiceId;

    private BigDecimal callTime;

    private BigDecimal effectTime;

    private BigDecimal slenceTime;

    private BigDecimal slenceNum;

    private BigDecimal overlapTime;

    private BigDecimal overlapNum;

    private String standardList;

    private String ruleLisr;

    private String mistakeLevel;

    private String isComplaint;

    private String isRepeatCall;

    private String satisfaction;

    private BigDecimal senseNum;

    private BigDecimal banNum;

    private String recommendId;

    private String recommendRank;

    private BigDecimal longSlenceTime;

    private String accuracyEvaluation;

    private String busiProficiency;

    private String appContentAccruacy;

    private String customerEmotion;

    private String agentEmotion;

    private BigDecimal agentMinSpeed;

    private BigDecimal agentMaxSpeed;

    private String iscomplaintByperson;

    private String isrepeatcallByperson;

    public String getVoiceId() {
        return voiceId;
    }

    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId == null ? null : voiceId.trim();
    }

    public BigDecimal getCallTime() {
        return callTime;
    }

    public void setCallTime(BigDecimal callTime) {
        this.callTime = callTime;
    }

    public BigDecimal getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(BigDecimal effectTime) {
        this.effectTime = effectTime;
    }

    public BigDecimal getSlenceTime() {
        return slenceTime;
    }

    public void setSlenceTime(BigDecimal slenceTime) {
        this.slenceTime = slenceTime;
    }

    public BigDecimal getSlenceNum() {
        return slenceNum;
    }

    public void setSlenceNum(BigDecimal slenceNum) {
        this.slenceNum = slenceNum;
    }

    public BigDecimal getOverlapTime() {
        return overlapTime;
    }

    public void setOverlapTime(BigDecimal overlapTime) {
        this.overlapTime = overlapTime;
    }

    public BigDecimal getOverlapNum() {
        return overlapNum;
    }

    public void setOverlapNum(BigDecimal overlapNum) {
        this.overlapNum = overlapNum;
    }

    public String getStandardList() {
        return standardList;
    }

    public void setStandardList(String standardList) {
        this.standardList = standardList == null ? null : standardList.trim();
    }

    public String getRuleLisr() {
        return ruleLisr;
    }

    public void setRuleLisr(String ruleLisr) {
        this.ruleLisr = ruleLisr == null ? null : ruleLisr.trim();
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

    public String getIsRepeatCall() {
        return isRepeatCall;
    }

    public void setIsRepeatCall(String isRepeatCall) {
        this.isRepeatCall = isRepeatCall == null ? null : isRepeatCall.trim();
    }

    public String getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(String satisfaction) {
        this.satisfaction = satisfaction == null ? null : satisfaction.trim();
    }

    public BigDecimal getSenseNum() {
        return senseNum;
    }

    public void setSenseNum(BigDecimal senseNum) {
        this.senseNum = senseNum;
    }

    public BigDecimal getBanNum() {
        return banNum;
    }

    public void setBanNum(BigDecimal banNum) {
        this.banNum = banNum;
    }

    public String getRecommendId() {
        return recommendId;
    }

    public void setRecommendId(String recommendId) {
        this.recommendId = recommendId == null ? null : recommendId.trim();
    }

    public String getRecommendRank() {
        return recommendRank;
    }

    public void setRecommendRank(String recommendRank) {
        this.recommendRank = recommendRank == null ? null : recommendRank.trim();
    }

    public BigDecimal getLongSlenceTime() {
        return longSlenceTime;
    }

    public void setLongSlenceTime(BigDecimal longSlenceTime) {
        this.longSlenceTime = longSlenceTime;
    }

    public String getAccuracyEvaluation() {
        return accuracyEvaluation;
    }

    public void setAccuracyEvaluation(String accuracyEvaluation) {
        this.accuracyEvaluation = accuracyEvaluation == null ? null : accuracyEvaluation.trim();
    }

    public String getBusiProficiency() {
        return busiProficiency;
    }

    public void setBusiProficiency(String busiProficiency) {
        this.busiProficiency = busiProficiency == null ? null : busiProficiency.trim();
    }

    public String getAppContentAccruacy() {
        return appContentAccruacy;
    }

    public void setAppContentAccruacy(String appContentAccruacy) {
        this.appContentAccruacy = appContentAccruacy == null ? null : appContentAccruacy.trim();
    }

    public String getCustomerEmotion() {
        return customerEmotion;
    }

    public void setCustomerEmotion(String customerEmotion) {
        this.customerEmotion = customerEmotion == null ? null : customerEmotion.trim();
    }

    public String getAgentEmotion() {
        return agentEmotion;
    }

    public void setAgentEmotion(String agentEmotion) {
        this.agentEmotion = agentEmotion == null ? null : agentEmotion.trim();
    }

    public BigDecimal getAgentMinSpeed() {
        return agentMinSpeed;
    }

    public void setAgentMinSpeed(BigDecimal agentMinSpeed) {
        this.agentMinSpeed = agentMinSpeed;
    }

    public BigDecimal getAgentMaxSpeed() {
        return agentMaxSpeed;
    }

    public void setAgentMaxSpeed(BigDecimal agentMaxSpeed) {
        this.agentMaxSpeed = agentMaxSpeed;
    }

    public String getIscomplaintByperson() {
        return iscomplaintByperson;
    }

    public void setIscomplaintByperson(String iscomplaintByperson) {
        this.iscomplaintByperson = iscomplaintByperson == null ? null : iscomplaintByperson.trim();
    }

    public String getIsrepeatcallByperson() {
        return isrepeatcallByperson;
    }

    public void setIsrepeatcallByperson(String isrepeatcallByperson) {
        this.isrepeatcallByperson = isrepeatcallByperson == null ? null : isrepeatcallByperson.trim();
    }
}