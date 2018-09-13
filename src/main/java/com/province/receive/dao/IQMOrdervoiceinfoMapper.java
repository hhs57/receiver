package com.province.receive.dao;

import com.province.receive.domain.IQMOrdervoiceinfo;

public interface IQMOrdervoiceinfoMapper {
    int insert(IQMOrdervoiceinfo record);

    int insertSelective(IQMOrdervoiceinfo record);
}