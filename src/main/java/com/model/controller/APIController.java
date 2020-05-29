package com.model.controller;

import com.github.pagehelper.Page;
import com.model.entity.BillHead;
import com.model.entity.GoodInfo;
import com.model.service.BillService;
import com.util.ResponseMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api")
public class APIController {
    @Autowired
    BillService service;

    @RequestMapping("get")
    public Page<BillHead> get(BillHead billHead, int pageNo, int pageSize){
        return service.getByPage(billHead,pageNo,pageSize);
    }

    @RequestMapping("save")
    public int save(BillHead billHead){
        return service.saveBill(billHead);
    }

    @RequestMapping("update/bill")
    public int updateBill(BillHead billHead){
        return service.updateBillHead(billHead);
    }

    @RequestMapping("update/good")
    public int updateGood(GoodInfo goodInfo){
        return service.updateGoodInfo(goodInfo);
    }

}
