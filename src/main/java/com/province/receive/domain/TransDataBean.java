package com.province.receive.domain;

import java.util.List;

/**
 * this is Description
 *
 * @author hongshuh
 * @date 2018/09/12
 */
public class TransDataBean {
    /**
     * sentenceList : [{"role":"USER","startTime":"30","endTime":"270","content":"对","speed":"4.16667"},{"role":"AGENT","startTime":"500","endTime":"6490","content":"您好我是国家电网的工号为三八元好的客服人员请问一下您您是您女士对吧","speed":"5.50918"},{"role":"USER","startTime":"6920","endTime":"7170","content":"嗯","speed":"4"},{"role":"AGENT","startTime":"7120","endTime":"11050","content":"啊打扰您了前面您跟我反映关于电表的脱落问题做个回访","speed":"6.36132"},{"role":"USER","startTime":"7320","endTime":"7750","content":"嗯","speed":"2.32558"},{"role":"USER","startTime":"10740","endTime":"13610","content":"他们处理他们他们俩七七四就处理了","speed":"5.57491"},{"role":"AGENT","startTime":"11480","endTime":"15870","content":"嗯那您对供电公司元春的情况您感到非常满意满意办法不满意呢","speed":"6.37813"},{"role":"USER","startTime":"16620","endTime":"18790","content":"非常满意嗯啊也过了","speed":"4.14747"},{"role":"AGENT","startTime":"17080","endTime":"20710","content":"嗯好谢谢您的评价欢迎再次致电九五九八再见","speed":"5.50964"},{"role":"USER","startTime":"18940","endTime":"19270","content":"嗯","speed":"3.0303"},{"role":"USER","startTime":"19480","endTime":"19830","content":"嗯","speed":"2.85714"}]
     * emotionList : []
     * overLapDuration : 0
     * overlapNum : 0
     * silencePercent : 0.00
     * maxSilenceDuration : 0
     * speed : 5.94
     * duration : 21320
     * userContent : 对。嗯。嗯。他们处理他们他们俩七七四就处理了。非常满意嗯啊也过了。嗯。嗯。
     * allContent : 对。您好我是国家电网的工号为三八元好的客服人员请问一下您您是您女士对吧。嗯。啊打扰您了前面您跟我反映关于电表的脱落问题做个回访。嗯。他们处理他们他们俩七七四就处理了。嗯那您对供电公司元春的情况您感到非常满意满意办法不满意呢。非常满意嗯啊也过了。嗯好谢谢您的评价欢迎再次致电九五九八再见。嗯。嗯。
     * agentContent : 您好我是国家电网的工号为三八元好的客服人员请问一下您您是您女士对吧。啊打扰您了前面您跟我反映关于电表的脱落问题做个回访。嗯那您对供电公司元春的情况您感到非常满意满意办法不满意呢。嗯好谢谢您的评价欢迎再次致电九五九八再见。
     * silenceDuration : 0
     * effectiveDuration : 21320
     * silenceList : [{"startTime":"0","endTime":"30"},{"startTime":"270","endTime":"500"},{"startTime":"6490","endTime":"6920"},{"startTime":"15870","endTime":"16620"},{"startTime":"20710","endTime":"21320"}]
     * invalidDuration : 0
     * silenceNum : 0
     */

    private int overLapDuration;
    private int overlapNum;
    private String silencePercent;
    private int maxSilenceDuration;
    private String speed;
    private int duration;
    private String userContent;
    private String allContent;
    private String agentContent;
    private int silenceDuration;
    private int effectiveDuration;
    private int invalidDuration;
    private int silenceNum;
    private List<SentenceListBean> sentenceList;
    private List<?> emotionList;
    private List<SilenceListBean> silenceList;

    public int getOverLapDuration() {
        return overLapDuration;
    }

    public void setOverLapDuration(int overLapDuration) {
        this.overLapDuration = overLapDuration;
    }

    public int getOverlapNum() {
        return overlapNum;
    }

    public void setOverlapNum(int overlapNum) {
        this.overlapNum = overlapNum;
    }

    public String getSilencePercent() {
        return silencePercent;
    }

    public void setSilencePercent(String silencePercent) {
        this.silencePercent = silencePercent;
    }

    public int getMaxSilenceDuration() {
        return maxSilenceDuration;
    }

    public void setMaxSilenceDuration(int maxSilenceDuration) {
        this.maxSilenceDuration = maxSilenceDuration;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getUserContent() {
        return userContent;
    }

    public void setUserContent(String userContent) {
        this.userContent = userContent;
    }

    public String getAllContent() {
        return allContent;
    }

    public void setAllContent(String allContent) {
        this.allContent = allContent;
    }

    public String getAgentContent() {
        return agentContent;
    }

    public void setAgentContent(String agentContent) {
        this.agentContent = agentContent;
    }

    public int getSilenceDuration() {
        return silenceDuration;
    }

    public void setSilenceDuration(int silenceDuration) {
        this.silenceDuration = silenceDuration;
    }

    public int getEffectiveDuration() {
        return effectiveDuration;
    }

    public void setEffectiveDuration(int effectiveDuration) {
        this.effectiveDuration = effectiveDuration;
    }

    public int getInvalidDuration() {
        return invalidDuration;
    }

    public void setInvalidDuration(int invalidDuration) {
        this.invalidDuration = invalidDuration;
    }

    public int getSilenceNum() {
        return silenceNum;
    }

    public void setSilenceNum(int silenceNum) {
        this.silenceNum = silenceNum;
    }

    public List<SentenceListBean> getSentenceList() {
        return sentenceList;
    }

    public void setSentenceList(List<SentenceListBean> sentenceList) {
        this.sentenceList = sentenceList;
    }

    public List<?> getEmotionList() {
        return emotionList;
    }

    public void setEmotionList(List<?> emotionList) {
        this.emotionList = emotionList;
    }

    public List<SilenceListBean> getSilenceList() {
        return silenceList;
    }

    public void setSilenceList(List<SilenceListBean> silenceList) {
        this.silenceList = silenceList;
    }
}
