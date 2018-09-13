package com.province.receive.service.impl;

import com.province.receive.controller.TestController;
import com.province.receive.dao.IQMCapMapper;
import com.province.receive.domain.IQMCap;
import com.province.receive.service.IIqmcapService;
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
@Service(value = "iqmcapService")
public class IqmcapServiceImpl implements IIqmcapService {
    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    @Resource
    private IQMCapMapper iqmCapDao;
    @Override
    public int insertIqmcap(IQMCap iqmcap) {
//        logger.warn(iqmcap.getDataxml());
        return iqmCapDao.insert(iqmcap);
    }
}
