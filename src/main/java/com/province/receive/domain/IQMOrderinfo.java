package com.province.receive.domain;

import java.math.BigDecimal;
import java.util.Date;

public class IQMOrderinfo {
    private String appNo;

    private String userPhone;

    private BigDecimal callTime;

    private Date handleTime;

    private Date connectTime;

    private String busiTypeCode;

    private String retvisitFlag;

    private Date handleFinishTime;

    private String handleResult;

    private String importantCustLevel;

    private String csrNumber;

    private String csrGroup;

    private String csrDept;

    private String orgNo;

    private String cityCode;

    private String countyCode;

    private String urbanRuralFlag;

    private String centerCode;

    private String qualityLevel;

    private String proOrgNo;

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo == null ? null : appNo.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public BigDecimal getCallTime() {
        return callTime;
    }

    public void setCallTime(BigDecimal callTime) {
        this.callTime = callTime;
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
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

    public String getRetvisitFlag() {
        return retvisitFlag;
    }

    public void setRetvisitFlag(String retvisitFlag) {
        this.retvisitFlag = retvisitFlag == null ? null : retvisitFlag.trim();
    }

    public Date getHandleFinishTime() {
        return handleFinishTime;
    }

    public void setHandleFinishTime(Date handleFinishTime) {
        this.handleFinishTime = handleFinishTime;
    }

    public String getHandleResult() {
        return handleResult;
    }

    public void setHandleResult(String handleResult) {
        this.handleResult = handleResult == null ? null : handleResult.trim();
    }

    public String getImportantCustLevel() {
        return importantCustLevel;
    }

    public void setImportantCustLevel(String importantCustLevel) {
        this.importantCustLevel = importantCustLevel == null ? null : importantCustLevel.trim();
    }

    public String getCsrNumber() {
        return csrNumber;
    }

    public void setCsrNumber(String csrNumber) {
        this.csrNumber = csrNumber == null ? null : csrNumber.trim();
    }

    public String getCsrGroup() {
        return csrGroup;
    }

    public void setCsrGroup(String csrGroup) {
        this.csrGroup = csrGroup == null ? null : csrGroup.trim();
    }

    public String getCsrDept() {
        return csrDept;
    }

    public void setCsrDept(String csrDept) {
        this.csrDept = csrDept == null ? null : csrDept.trim();
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo == null ? null : orgNo.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode == null ? null : countyCode.trim();
    }

    public String getUrbanRuralFlag() {
        return urbanRuralFlag;
    }

    public void setUrbanRuralFlag(String urbanRuralFlag) {
        this.urbanRuralFlag = urbanRuralFlag == null ? null : urbanRuralFlag.trim();
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode == null ? null : centerCode.trim();
    }

    public String getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(String qualityLevel) {
        this.qualityLevel = qualityLevel == null ? null : qualityLevel.trim();
    }

    public String getProOrgNo() {
        return proOrgNo;
    }

    public void setProOrgNo(String proOrgNo) {
        this.proOrgNo = proOrgNo == null ? null : proOrgNo.trim();
    }
}