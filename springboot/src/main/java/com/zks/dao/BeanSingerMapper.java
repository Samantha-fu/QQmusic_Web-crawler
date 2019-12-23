package com.zks.dao;

import com.zks.model.BeanSinger;

public interface BeanSingerMapper {
    int deleteByPrimaryKey(String singerId);

    int insert(BeanSinger record);

    int insertSelective(BeanSinger record);

    BeanSinger selectByPrimaryKey(String singerId);

    int updateByPrimaryKeySelective(BeanSinger record);

    int updateByPrimaryKey(BeanSinger record);
}