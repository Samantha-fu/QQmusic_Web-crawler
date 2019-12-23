package com.zks.dao;

import com.zks.model.BeanSong;

public interface BeanSongMapper {
    int deleteByPrimaryKey(String songId);

    int insert(BeanSong record);

    int insertSelective(BeanSong record);

    BeanSong selectByPrimaryKey(String songId);

    int updateByPrimaryKeySelective(BeanSong record);

    int updateByPrimaryKeyWithBLOBs(BeanSong record);

    int updateByPrimaryKey(BeanSong record);
}