package com.zks.dao;

import com.zks.model.BeanLyric;

public interface BeanLyricMapper {
    int deleteByPrimaryKey(Integer lyricId);

    int insert(BeanLyric record);

    int insertSelective(BeanLyric record);

    BeanLyric selectByPrimaryKey(Integer lyricId);

    int updateByPrimaryKeySelective(BeanLyric record);

    int updateByPrimaryKeyWithBLOBs(BeanLyric record);

    int updateByPrimaryKey(BeanLyric record);
}