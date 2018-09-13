package com.province.receive.dao;

import com.province.receive.domain.IQMStatisticalanalysis;

public interface IQMStatisticalanalysisMapper {
    int insert(IQMStatisticalanalysis record);

    int insertSelective(IQMStatisticalanalysis record);
}