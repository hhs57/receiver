package com.province.receive.service.impl;

import com.province.receive.dao.IQMOrdervoicerealMapper;
import com.province.receive.domain.IQMOrdervoicereal;
import com.province.receive.service.IIqmordervoicerealService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * this is Description
 *
 * @author hongshuh
 * @date 2018/09/11
 */
@Service(value = "iiqmordervoicerealService")
public class IqmordervoicerealServiceImpl implements IIqmordervoicerealService {
    private final Logger logger = LoggerFactory.getLogger(IqmordervoicerealServiceImpl.class);

    @Resource
    private IQMOrdervoicerealMapper iqmordervoicerealDao;


    @Override
    public int insertIqmordervoicereal(IQMOrdervoicereal iqmordervoicereal) {
        return iqmordervoicerealDao.insert(iqmordervoicereal);
    }
}
