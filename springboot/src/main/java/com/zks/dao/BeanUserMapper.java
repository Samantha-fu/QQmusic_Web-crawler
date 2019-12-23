package com.zks.dao;

import com.zks.model.BeanUser;

public interface BeanUserMapper {
    int deleteByPrimaryKey(String userid);

    int insert(BeanUser record);

    int insertSelective(BeanUser record);

    BeanUser selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(BeanUser record);

    int updateByPrimaryKey(BeanUser record);
}