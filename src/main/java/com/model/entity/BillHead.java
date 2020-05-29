package com.model.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Data
public class BillHead implements Serializable {
    private String id;

    private String contractNum;

    private String comName;

    private String proNum;

    private String proName;

    private String carNo;

    private String cargoWeight;

    private String weightUnit;

    private String freightUnit;

    private String freightPrice;

    private String goodsName;

    private String norms;

    private String normsUnit;

    private String goodsCount;

    private String goodsCountDx;

    private String remark;

    private Date createDatetime;

    private Date modifyDatetime;

    private String createUserid;

    private String modifyUserid;


    private List<GoodInfo> goodInfos;

    private static final long serialVersionUID = 1L;


}