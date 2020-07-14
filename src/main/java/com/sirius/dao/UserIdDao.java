package com.sirius.dao;

import com.sirius.domain.UserId;

import java.util.ArrayList;

public interface UserIdDao {
    /*查询*/
    // 获取一个空闲的id
    UserId selectOne();
    // 获取所有指定状态的id
    ArrayList<UserId> selectAllByStatus(Character flag);
    // 获取id状态
    Character selectStatusById(Integer id);
    // 查询最大的id值
    Integer selectMaxId();
    // 获取指定状态id的最大值
    Integer selectMaxIdByStatus(Character flag);
    /*增加*/
    // 增加对象
    int insertOne(UserId newUserId);
    // 增加指定状态的id
    int insertById(Integer id, Character flag);
    /*修改*/
    // 修改id状态
    int updateStatus(Integer id, char status);
}
