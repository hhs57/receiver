package com.province.receive.domain;

import java.math.BigDecimal;
import java.util.Date;

public class IQMComplaint {
    private String id;

    private String voiceNo;

    private String appNo;

    private String callPhone;

    private BigDecimal interactiveNum;

    private BigDecimal callTime;

    private String busiTypeCode;

    private BigDecimal callReasonCode;

    private String orgNo;

    private String csrDept;

    private Date reqBeginDate;

    private String complaintClassifyCode;

    private String proOrgNo;

    private String iscomplaintByperson;

    private Date handleTime;

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

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo == null ? null : appNo.trim();
    }

    public String getCallPhone() {
        return callPhone;
    }

    public void setCallPhone(String callPhone) {
        this.callPhone = callPhone == null ? null : callPhone.trim();
    }

    public BigDecimal getInteractiveNum() {
        return interactiveNum;
    }

    public void setInteractiveNum(BigDecimal interactiveNum) {
        this.interactiveNum = interactiveNum;
    }

    public BigDecimal getCallTime() {
        return callTime;
    }

    public void setCallTime(BigDecimal callTime) {
        this.callTime = callTime;
    }

    public String getBusiTypeCode() {
        return busiTypeCode;
    }

    public void setBusiTypeCode(String busiTypeCode) {
        this.busiTypeCode = busiTypeCode == null ? null : busiTypeCode.trim();
    }

    public BigDecimal getCallReasonCode() {
        return callReasonCode;
    }

    public void setCallReasonCode(BigDecimal callReasonCode) {
        this.callReasonCode = callReasonCode;
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

    public Date getReqBeginDate() {
        return reqBeginDate;
    }

    public void setReqBeginDate(Date reqBeginDate) {
        this.reqBeginDate = reqBeginDate;
    }

    public String getComplaintClassifyCode() {
        return complaintClassifyCode;
    }

    public void setComplaintClassifyCode(String complaintClassifyCode) {
        this.complaintClassifyCode = complaintClassifyCode == null ? null : complaintClassifyCode.trim();
    }

    public String getProOrgNo() {
        return proOrgNo;
    }

    public void setProOrgNo(String proOrgNo) {
        this.proOrgNo = proOrgNo == null ? null : proOrgNo.trim();
    }

    public String getIscomplaintByperson() {
        return iscomplaintByperson;
    }

    public void setIscomplaintByperson(String iscomplaintByperson) {
        this.iscomplaintByperson = iscomplaintByperson == null ? null : iscomplaintByperson.trim();
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }
}