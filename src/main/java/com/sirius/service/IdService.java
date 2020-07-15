package com.sirius.service;

import java.util.ArrayList;

public interface IdService {
    // 添加id
    Integer addId();
    // 添加指定状态的id
    Integer addId(Integer status);
    // 批量添加id
    ArrayList<Integer> addIds(Integer nums);   // 指定个数
    // 批量增加指定状态的id
    ArrayList<Integer> addIds(Integer nums, Integer flag);
    // 改变id状态
    Boolean changeStatus(Integer id, Integer status);
    // 查看id状态
    Integer showStatus(Integer id);
    // 获取指定状态id最大值
    Integer showMaxIdByStatus(Integer status);
    // 查看指定状态的所有id
    ArrayList<Integer> showAllIdsByStatus(Integer status);
    // 获取一个空闲id
    Integer getOneFreeId();

}
