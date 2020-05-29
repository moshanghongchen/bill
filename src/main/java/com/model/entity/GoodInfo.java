package com.model.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class GoodInfo implements Serializable {
    private String id;

    private String goodsName;

    private String norms;

    private String normsUnit;

    private String goodsCount;

    private String goodsCountDx;

    private String remark;

    private String hid;

    private static final long serialVersionUID = 1L;

}