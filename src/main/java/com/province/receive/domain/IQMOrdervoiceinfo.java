package com.province.receive.domain;

import java.util.Date;

public class IQMOrdervoiceinfo {
    private String id;

    private String voicePhone;

    private Date startTime;

    private Date endTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getVoicePhone() {
        return voicePhone;
    }

    public void setVoicePhone(String voicePhone) {
        this.voicePhone = voicePhone == null ? null : voicePhone.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}