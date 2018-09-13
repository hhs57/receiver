package com.province.receive.service;

import com.province.receive.common.ResultModel;

import java.util.List;

public interface IProvinceService {

    ResultModel receiveData(List<String> dataList);
}
