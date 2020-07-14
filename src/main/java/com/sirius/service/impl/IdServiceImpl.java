/**
 * Demo class
 *
 * @author Sirius
 * @date 2020-07-14 19:59
 */
package com.sirius.service.impl;

import com.sirius.dao.UserIdDao;
import com.sirius.domain.UserId;
import com.sirius.service.IdService;

import java.util.ArrayList;

public class IdServiceImpl implements IdService {
    private UserIdDao userIdDao;

    @Override
    public Integer addId() {
        // 获取数据库内id的最大值
        Integer maxId = userIdDao.selectMaxId();
        if(maxId == null){
            maxId = 1000000;
        }
        // 生成id
        Integer newId = maxId + 1;
        // 创建id对象
        UserId newUserId = new UserId(newId, 0);
        int add = userIdDao.insertOne(newUserId);   // 添加id对象
        if (add == 1) {
            return newId;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<Integer> addIds(Integer nums) {
        if (nums < 1) {
            return null;
        }
        ArrayList<Integer> ids = new ArrayList<>();
        int newId = userIdDao.selectMaxId();
        while (ids.size() < nums) {
            newId = newId + 1;
            int add = userIdDao.insertOne(new UserId(newId, 0));
            if (add == 1) {
                ids.add(newId);
            }
        }
        return ids;
    }

    @Override
    public Boolean changeStatus(Integer id, Integer status) {
        int success = userIdDao.updateStatus(id, status);
        return success == 1;
    }

    public void setUserIdDao(UserIdDao userIdDao) {
        this.userIdDao = userIdDao;
    }
}
