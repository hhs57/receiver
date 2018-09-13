package com.province.receive.domain;

/**
 * this is Description
 *
 * @author hongshuh
 * @date 2018/09/12
 */
public class BusiWordListBean {
    /**
     * beginDate : 9290
     * role : AGENT
     * endDate : 9480
     * keyWord : 电表
     */

    private int beginDate;
    private String role;
    private int endDate;
    private String keyWord;

    public int getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(int beginDate) {
        this.beginDate = beginDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
}
