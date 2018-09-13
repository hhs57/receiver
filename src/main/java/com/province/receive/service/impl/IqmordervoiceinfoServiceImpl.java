package com.province.receive.service.impl;

import com.province.receive.dao.IQMOrdervoiceinfoMapper;
import com.province.receive.domain.IQMOrdervoiceinfo;
import com.province.receive.service.IIqmordervoiceinfoService;
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
@Service(value = "iiqmordervoiceinfoService")
public class IqmordervoiceinfoServiceImpl implements IIqmordervoiceinfoService {
    private final Logger logger = LoggerFactory.getLogger(IqmordervoiceinfoServiceImpl.class);

    @Resource
    private IQMOrdervoiceinfoMapper iqmordervoiceinfoDao;


    @Override
    public int insertIqmordervoiceinfo(IQMOrdervoiceinfo iqmordervoiceinfo) {
        return iqmordervoiceinfoDao.insert(iqmordervoiceinfo);
    }
}
