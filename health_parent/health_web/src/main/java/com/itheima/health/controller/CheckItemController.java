package com.itheima.health.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.health.constant.MessageConstant;
import com.itheima.health.entity.Result;
import com.itheima.health.pojo.CheckItem;
import com.itheima.health.service.CheckItemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 *@Data:2020/2/13
 *@Author:mr.wen
 *@Function:
 */
@RestController
@RequestMapping(value = "/checkitem")
public class CheckItemController {
    @Reference
    CheckItemService checkItemService;

    @RequestMapping(value = "/findAll")
    public Result findCheckItemList() {
        List<CheckItem> list = checkItemService.findAll();
        if (list != null && list.size() > 0) {
            return new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS, list);
        }else {
            return new Result(false,MessageConstant.QUERY_CHECKITEM_FAIL);
        }
    }
}
