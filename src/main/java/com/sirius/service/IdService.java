package com.sirius.service;

import java.util.ArrayList;

public interface IdService {
    // 添加id
    Integer addId();
    // 批量添加id
    ArrayList<Integer> addIds(Integer nums);   // 指定个数
    // 改变id状态
    Boolean changeStatus(Integer id, Integer status);
}
