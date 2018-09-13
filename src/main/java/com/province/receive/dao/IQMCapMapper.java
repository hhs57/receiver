package com.province.receive.dao;

import com.province.receive.domain.IQMCap;

public interface IQMCapMapper {
    int insert(IQMCap record);

    int insertSelective(IQMCap record);
}