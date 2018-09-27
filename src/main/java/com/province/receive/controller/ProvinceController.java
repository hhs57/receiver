package com.province.receive.controller;

import com.province.receive.common.ResultModel;
import com.province.receive.config.EncryptConfig;
import com.province.receive.config.EsConfig;
import com.province.receive.service.IProvinceService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/province",produces="application/json;charset=utf-8")

public class ProvinceController {

    @Resource
    private IProvinceService provinceService;

    @Resource
    private EsConfig esConfig;

    @Resource
    private EncryptConfig encryptConfig;


    @PostMapping(value = "/receiveData")
    @ResponseBody
    public ResultModel receiveData(@RequestBody List<String> dataList) {
        return this.provinceService.receiveData(dataList);
    }

    @GetMapping(value = "/getData")
    public String getResult(){
        return esConfig.getHost()+esConfig.getPort()+encryptConfig.getKeyword();
    }
}
