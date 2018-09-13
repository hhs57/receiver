package com.province.receive.controller;

import com.province.receive.common.ResultModel;
import com.province.receive.service.IProvinceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/province")
public class ProvinceController {

    @Resource
    private IProvinceService provinceService;

    @PostMapping(value = "/receiveData")
    @ResponseBody
    public ResultModel receiveData(@RequestBody List<String> dataList) {
        return this.provinceService.receiveData(dataList);
    }

    @GetMapping(value = "/getData")
    public String getResult(){
        return "200ok";
    }
}
