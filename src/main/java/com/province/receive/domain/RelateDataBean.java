package com.province.receive.domain;

/**
 * this is Description
 *
 * @author hongshuh
 * @date 2018/09/12
 */
public class RelateDataBean {
    /**
     * path : /0/output/2018081311/SB,00A502C0DBEA9C3B,841832,2018-08-13.pcm
     * startTime : 2018-08-13 10:08:54
     * timeSection : 10
     * endTime : 2018-08-13 10:09:42
     * ani : 18782089355
     */

    private String path;
    private String startTime;
    private String timeSection;
    private String endTime;
    private String ani;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getTimeSection() {
        return timeSection;
    }

    public void setTimeSection(String timeSection) {
        this.timeSection = timeSection;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getAni() {
        return ani;
    }

    public void setAni(String ani) {
        this.ani = ani;
    }
}
