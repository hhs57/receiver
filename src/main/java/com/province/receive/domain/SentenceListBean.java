package com.province.receive.domain;

/**
 * this is Description
 *
 * @author hongshuh
 * @date 2018/09/12
 */
public class SentenceListBean {
    /**
     * role : USER
     * startTime : 30
     * endTime : 270
     * content : 对
     * speed : 4.16667
     */

    private String role;
    private String startTime;
    private String endTime;
    private String content;
    private Double speed;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    //    public String getSpeed() {
//        return speed;
//    }
//
//    public void setSpeed(String speed) {
//        this.speed = speed;
//    }
}
