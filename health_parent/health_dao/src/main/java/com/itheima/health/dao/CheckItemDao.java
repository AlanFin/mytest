package com.itheima.health.dao;

import com.itheima.health.pojo.CheckItem;

import java.util.List;

/*
 *@Data:2020/2/13
 *@Author:mr.wen
 *@Function:
 */
public interface CheckItemDao {

    List<CheckItem> findAll();
}
