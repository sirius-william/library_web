/**
 * Demo class
 *
 * @author Sirius
 * @date 2020-07-14 19:17
 */
package com.sirius.service;

import com.sirius.domain.UserInfo;
import com.sirius.domain.UserLogin;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public interface UserService {
    // 登录接口
    Boolean login(String username, String password);
    Boolean login(Integer id, String password);
    Date showLastLoginTime(Integer id);
    Date showLastLoginTime(String username);
    // 显示日期区间登录的用户
    ArrayList<UserLogin> showUserBetweenDate(Date left, Date right);
    // 修改密码
    Boolean changePassword(String username, String password, String salt);
    Boolean changePassword(Integer id, String password, String salt);
    Boolean changePassword(String username, HashMap<String, String> passwordList);
    Boolean changePassword(Integer id, HashMap<String, String> passwordList);
    // 用户注册，返回注册id，即借阅证号码
    Integer resister(UserInfo userInfo, String password);
    // 显示用户信息
    UserInfo showUserInfo(String username);
    // 查询用户
    UserInfo showUser(String username);
    UserInfo showUser(Integer id);
    UserInfo showUser(UserInfo userInfo);
    ArrayList<UserInfo> showAllUser();
    // 修改用户信息
    Boolean changeUserInfo(UserInfo oldUserInfo, UserInfo newUserInfo);
    Boolean changeUserInfo(Integer id, UserInfo userInfo);
    // 删除用户
    Boolean deleteUser(UserInfo userInfo);
    Boolean deleteUserByCondition(UserInfo userInfo);
    Boolean deleteUser(Integer id);

}

