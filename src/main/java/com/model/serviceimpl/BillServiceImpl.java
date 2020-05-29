package com.model.serviceimpl;

import java.util.Date;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.model.entity.BillHead;
import com.model.entity.GoodInfo;
import com.model.entity.GoodInfoExample;
import com.model.mapper.BillHeadMapper;
import com.model.mapper.GoodInfoMapper;
import com.model.service.BillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceImpl implements BillService {
    Logger logger=LoggerFactory.getLogger(getClass());
    @Autowired
    BillHeadMapper billHeadMapper;
    @Autowired
    GoodInfoMapper goodInfoMapper;


    @Override
    public Page<BillHead> getByPage(BillHead billHead,int pageNum,int pageSize) {
        logger.info("getByPage billHead={},pageNum={},pageSize={}",billHead,pageNum,pageSize);
        if (pageNum==0){
            pageNum=1;
        }
        if (pageSize==0){
            pageSize=10;
        }
        Page<BillHead> billHeadPage = PageHelper.startPage(pageNum, pageSize).doSelectPage(new ISelect() {
            @Override
            public void doSelect() {
                billHeadMapper.selectByBillHead(billHead);
            }
        });
        billHeadPage.getResult().forEach(head -> {
            GoodInfoExample example = new GoodInfoExample();
            example.createCriteria().andHidEqualTo(head.getId());
            List<GoodInfo> goodInfos = goodInfoMapper.selectByExample(example);
            head.setGoodInfos(goodInfos);
        });
        logger.info("getByPage queryRes={}",billHeadPage);
        return billHeadPage;
    }

    @Override
    public int saveBill(BillHead billHead) {
        logger.info("saveBill billHead={}",billHead);

        initBillHead(billHead);

        int insert = billHeadMapper.insertSelective(billHead);
        if (billHead.getGoodInfos()!=null&& billHead.getGoodInfos().size()>0){
            billHead.getGoodInfos().forEach(goodInfo -> {
                goodInfo.setHid(billHead.getId());
                Snowflake snowflake = IdUtil.createSnowflake(1, 1);
                goodInfo.setId(snowflake.nextIdStr());
                saveGood(goodInfo);
            });
        }
        return insert;
    }

    private void initBillHead(BillHead billHead) {
        billHead.setId(String.valueOf(new Date().getTime()));
        billHead.setCreateDatetime(new Date());

    }

    @Override
    public int saveGood(GoodInfo goodInfo) {
        logger.info("saveGood goodInfo={}",goodInfo);
        return goodInfoMapper.insertSelective(goodInfo);
    }

    @Override
    public int updateBillHead(BillHead billHead) {
        logger.info("updateBillHead billHead={}",billHead);
        if (StringUtil.isEmpty(billHead.getId())){
            return 0;
        }
        return billHeadMapper.updateByPrimaryKeySelective(billHead);
    }

    @Override
    public int updateGoodInfo(GoodInfo goodInfo) {
        logger.info("updateGoodInfo goodInfo={}",goodInfo);
        if (StringUtil.isEmpty(goodInfo.getId())){
            return 0;
        }
        return goodInfoMapper.updateByPrimaryKeySelective(goodInfo);
    }
}
