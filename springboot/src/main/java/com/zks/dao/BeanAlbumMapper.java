package com.zks.dao;

import com.zks.model.BeanAlbum;

public interface BeanAlbumMapper {
    int deleteByPrimaryKey(String albumId);

    int insert(BeanAlbum record);

    int insertSelective(BeanAlbum record);

    BeanAlbum selectByPrimaryKey(String albumId);

    int updateByPrimaryKeySelective(BeanAlbum record);

    int updateByPrimaryKeyWithBLOBs(BeanAlbum record);

    int updateByPrimaryKey(BeanAlbum record);
}