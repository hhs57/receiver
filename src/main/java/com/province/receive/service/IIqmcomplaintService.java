package com.province.receive.service;

import com.province.receive.domain.IQMComplaint;

public interface IIqmcomplaintService {

    /**
     * 详细描述方法的功能与意图
     * @author hongshuh
     * @date 2018/9/11 11:32
     * @param iqmcomplaint 为实体
     * @return 返回1为成功0为失败
     */
    int insertIqmcomplaint(IQMComplaint iqmcomplaint);
}
