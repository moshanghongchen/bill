//package com.bill.bill;
//
//import com.github.pagehelper.Page;
//import com.model.entity.BillHead;
//import com.model.entity.GoodInfo;
//import com.model.service.BillService;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.event.annotation.AfterTestMethod;
//import org.springframework.test.context.event.annotation.BeforeTestMethod;
//
//import java.util.List;
//
//@SpringBootTest
//class BillApplicationTests {
//    @Autowired
//    BillService billService;
//    private Long startTime=0L;
//
//    @Test
//    void contextLoads() {
//        BillHead billHead = new BillHead();
//        billHead.setCarNo("1");
//        billHead.setComName("西瓜");
//        billHead.setGoodsName("大西瓜");
//        GoodInfo goodInfo = new GoodInfo();
//        goodInfo.setGoodsCount("100");
//        goodInfo.setGoodsName("百度");
//
//        for (int i = 0; i <100 ; i++) {
//            String id="20200529_"+i;
//            billHead.setId(id);
//            goodInfo.setId(id);
//            goodInfo.setHid(id);
//            billService.saveBill(billHead);
//            billService.saveGood(goodInfo);
//
//        }
//
//    }
//
//
//    @Test
//    public void testSelect(){
//        BillHead billHead = new BillHead();
//        billHead.setId("9_0");
//
//        Page<BillHead> byPage = billService.getByPage(billHead,1,10);
////        System.out.println(byPage.getResult().size());
////        System.out.println(byPage.getTotal());
//        System.out.println(byPage);
//    }
//
//
//
//
//
//
//
//}
