package com.province.receive.service.impl;

import com.province.receive.dao.IQMQualityresultMapper;
import com.province.receive.domain.IQMQualityresult;
import com.province.receive.service.IIqmqualityresultService;
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
@Service(value = "iiqmqualityresultService")
public class IqmqualityresultServiceImpl implements IIqmqualityresultService {
    private final Logger logger = LoggerFactory.getLogger(IqmqualityresultServiceImpl.class);

    @Resource
    private IQMQualityresultMapper iqmqualityresultDao;


    @Override
    public int insertIqmqualityresult(IQMQualityresult iqmqualityresult) {
        return iqmqualityresultDao.insert(iqmqualityresult);
    }
}
