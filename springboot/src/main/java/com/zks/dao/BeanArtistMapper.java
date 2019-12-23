package com.zks.dao;

import com.zks.model.BeanArtist;

public interface BeanArtistMapper {
    int deleteByPrimaryKey(String artistId);

    int insert(BeanArtist record);

    int insertSelective(BeanArtist record);

    BeanArtist selectByPrimaryKey(String artistId);

    int updateByPrimaryKeySelective(BeanArtist record);

    int updateByPrimaryKey(BeanArtist record);
}