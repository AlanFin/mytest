package com.itheima.health.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.health.dao.CheckItemDao;
import com.itheima.health.pojo.CheckItem;
import com.itheima.health.service.CheckItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
 *@Data:2020/2/13
 *@Author:mr.wen
 *@Function:
 */
@Service
@Transactional
public class CheckItemServiceImpl implements CheckItemService {
    @Autowired
    CheckItemDao checkItemDao;

    @Override
    public List<CheckItem> findAll() {

        return checkItemDao.findAll();
    }
}
