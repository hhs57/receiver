package com.province.receive.service.impl;

import com.province.receive.dao.IQMOrderinfoMapper;
import com.province.receive.domain.IQMOrderinfo;
import com.province.receive.service.IIqmorderinfoService;
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
@Service(value = "iqmorderinfoService")
public class IqmorderinfoServiceImpl implements IIqmorderinfoService {
    private final Logger logger = LoggerFactory.getLogger(IqmorderinfoServiceImpl.class);

    @Resource
    private IQMOrderinfoMapper iqmorderinfoDao;


    @Override
    public int insertIqmorderinfo(IQMOrderinfo iqmorderinfo) {
        return iqmorderinfoDao.insert(iqmorderinfo);
    }
}
