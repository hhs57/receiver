package com.province.receive.dao;

import com.province.receive.domain.IQMQualityresult;

public interface IQMQualityresultMapper {
    int insert(IQMQualityresult record);

    int insertSelective(IQMQualityresult record);
}