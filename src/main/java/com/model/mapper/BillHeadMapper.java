package com.model.mapper;

import com.model.entity.BillHead;
import com.model.entity.BillHeadExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BillHeadMapper {
    long countByExample(BillHeadExample example);

    int deleteByExample(BillHeadExample example);

    int deleteByPrimaryKey(String id);

    int insert(BillHead record);

    int insertSelective(BillHead record);

    List<BillHead> selectByExample(BillHeadExample example);

    BillHead selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BillHead record, @Param("example") BillHeadExample example);

    int updateByExample(@Param("record") BillHead record, @Param("example") BillHeadExample example);

    int updateByPrimaryKeySelective(BillHead record);

    int updateByPrimaryKey(BillHead record);

    List<BillHead> selectByBillHead(BillHead billHead);
}