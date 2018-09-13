package com.province.receive.domain;

import java.util.Date;

public class IQMCap {
    private String id;

    private Date startTime;

    private Date endTime;

    private String dataxml;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getDataxml() {
        return dataxml;
    }

    public void setDataxml(String dataxml) {
        this.dataxml = dataxml;
    }
}