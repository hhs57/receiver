package com.province.receive.service.impl;

import com.province.receive.dao.IQMStatisticalanalysisMapper;
import com.province.receive.domain.IQMStatisticalanalysis;
import com.province.receive.service.IIqmstatisticalanalysisService;
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
@Service(value = "iiqmstatisticalanalysisService")
public class IqmstatisticalanalysisServiceImpl implements IIqmstatisticalanalysisService {
    private final Logger logger = LoggerFactory.getLogger(IqmstatisticalanalysisServiceImpl.class);

    @Resource
    private IQMStatisticalanalysisMapper iqmstatisticalanalysisDao;


    @Override
    public int insertIqmstatisticalanalysis(IQMStatisticalanalysis iqmstatisticalanalysis) {
        return iqmstatisticalanalysisDao.insert(iqmstatisticalanalysis);
    }
}
