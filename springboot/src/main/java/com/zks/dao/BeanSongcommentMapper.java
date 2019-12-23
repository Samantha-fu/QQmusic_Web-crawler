package com.zks.dao;

import com.zks.model.BeanSongcomment;

public interface BeanSongcommentMapper {
    int deleteByPrimaryKey(String songCommentId);

    int insert(BeanSongcomment record);

    int insertSelective(BeanSongcomment record);

    BeanSongcomment selectByPrimaryKey(String songCommentId);

    int updateByPrimaryKeySelective(BeanSongcomment record);

    int updateByPrimaryKeyWithBLOBs(BeanSongcomment record);

    int updateByPrimaryKey(BeanSongcomment record);
}