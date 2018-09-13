package com.province.receive.domain;

import java.util.List;

/**
 * this is Description
 *
 * @author hongshuh
 * @date 2018/09/12
 */
public class QualityDataBean {
    private List<?> keyInfoWordList;
    private List<?> voiceOverlapList;
    private List<?> banWordList;
    private List<?> senseWordList;
    private List<?> silenceList;
    private List<BusiWordListBean> busiWordList;

    public List<?> getKeyInfoWordList() {
        return keyInfoWordList;
    }

    public void setKeyInfoWordList(List<?> keyInfoWordList) {
        this.keyInfoWordList = keyInfoWordList;
    }

    public List<?> getVoiceOverlapList() {
        return voiceOverlapList;
    }

    public void setVoiceOverlapList(List<?> voiceOverlapList) {
        this.voiceOverlapList = voiceOverlapList;
    }

    public List<?> getBanWordList() {
        return banWordList;
    }

    public void setBanWordList(List<?> banWordList) {
        this.banWordList = banWordList;
    }

    public List<?> getSenseWordList() {
        return senseWordList;
    }

    public void setSenseWordList(List<?> senseWordList) {
        this.senseWordList = senseWordList;
    }

    public List<?> getSilenceList() {
        return silenceList;
    }

    public void setSilenceList(List<?> silenceList) {
        this.silenceList = silenceList;
    }

    public List<BusiWordListBean> getBusiWordList() {
        return busiWordList;
    }

    public void setBusiWordList(List<BusiWordListBean> busiWordList) {
        this.busiWordList = busiWordList;
    }
}
