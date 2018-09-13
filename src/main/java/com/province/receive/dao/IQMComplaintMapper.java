package com.province.receive.dao;

import com.province.receive.domain.IQMComplaint;

public interface IQMComplaintMapper {

    int insert(IQMComplaint record);

    int insertSelective(IQMComplaint record);


}