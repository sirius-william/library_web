package com.sirius.dao;

import com.sirius.domain.UserInfo;

import java.util.ArrayList;

public interface UserInfoDao {
    /*查询*/
    // 根据id查询
    UserInfo selectUserInfoById(Integer id);
    // 根据用户名称查询
    ArrayList<UserInfo> selectUserInfoByName(String name);
    // 根据vip类型查询
    ArrayList<UserInfo> selectUserInfoByVIP(String vip);
    // 根据性别查询
    ArrayList<UserInfo> selectUserInfoBySex(String sex);
    // 根据对象查询
    UserInfo selectUserInfo(UserInfo userInfo);
    // 根据电话查询
    UserInfo selectUserInfoByTel(String tel);
    /*修改*/
    // 修改对象
    int updateUserInfo(UserInfo oldUserInfo, UserInfo newUserInfo);
    // 根据名字
    int updateUserInfoById(Integer id, UserInfo newUserInfo);
    /*删除*/
    // 根据id删除
    int deleteUserInfoById(Integer id);
    // 根据对象删除
    int deleteUserInfo(UserInfo userInfo);
    /*增加*/
    int insertUserInfo(UserInfo userInfo);
}
