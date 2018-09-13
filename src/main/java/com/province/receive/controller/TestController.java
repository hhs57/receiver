package com.province.receive.controller;

import com.province.receive.domain.IQMOrdervoiceinfo;
import com.province.receive.service.IIqmorderinfoService;
import com.province.receive.service.IIqmordervoiceinfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * this is Description
 *
 * @author hongshuh
 * @date 2018/09/10
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {


    private final Logger logger = LoggerFactory.getLogger(TestController.class);

    @InitBinder
    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @Resource
    private IIqmordervoiceinfoService iiqmordervoiceinfoservice;

    @ResponseBody
    @PostMapping("/add")
    public int addIqmCompaint(IQMOrdervoiceinfo iqmordervoiceinfo){

        return iiqmordervoiceinfoservice.insertIqmordervoiceinfo(iqmordervoiceinfo);
    }
}
