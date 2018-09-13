package com.province.receive.dao;

import com.province.receive.domain.IQMOrderinfo;

public interface IQMOrderinfoMapper {
    int insert(IQMOrderinfo record);

    int insertSelective(IQMOrderinfo record);
}