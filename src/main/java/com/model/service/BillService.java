package com.model.service;


import com.github.pagehelper.Page;
import com.model.entity.BillHead;
import com.model.entity.GoodInfo;

public interface BillService {
    Page<BillHead> getByPage(BillHead billHead,int pageNum,int pageSize);

    int saveBill(BillHead billHead);

    int saveGood(GoodInfo goodInfo);


    int updateBillHead(BillHead billHead);

    int updateGoodInfo(GoodInfo goodInfo);


}
