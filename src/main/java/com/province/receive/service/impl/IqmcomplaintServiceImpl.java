package com.province.receive.service.impl;

import com.province.receive.dao.IQMComplaintMapper;
import com.province.receive.domain.IQMComplaint;
import com.province.receive.service.IIqmcomplaintService;
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
@Service(value = "iqmcomplaintService")
public class IqmcomplaintServiceImpl implements IIqmcomplaintService {
    private final Logger logger = LoggerFactory.getLogger(IqmcomplaintServiceImpl.class);

    @Resource
    private IQMComplaintMapper iqmComplaintDao;

    @Override
    public int insertIqmcomplaint(IQMComplaint iqmcomplaint) {
        return iqmComplaintDao.insert(iqmcomplaint);
    }
}
