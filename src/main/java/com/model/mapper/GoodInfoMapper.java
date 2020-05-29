package com.model.mapper;

import com.model.entity.GoodInfo;
import com.model.entity.GoodInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodInfoMapper {
    long countByExample(GoodInfoExample example);

    int deleteByExample(GoodInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodInfo record);

    int insertSelective(GoodInfo record);

    List<GoodInfo> selectByExample(GoodInfoExample example);

    GoodInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodInfo record, @Param("example") GoodInfoExample example);

    int updateByExample(@Param("record") GoodInfo record, @Param("example") GoodInfoExample example);

    int updateByPrimaryKeySelective(GoodInfo record);

    int updateByPrimaryKey(GoodInfo record);
}