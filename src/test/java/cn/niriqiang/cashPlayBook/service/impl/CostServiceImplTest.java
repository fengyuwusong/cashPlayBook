package cn.niriqiang.cashPlayBook.service.impl;

import cn.niriqiang.cashPlayBook.Tester;
import cn.niriqiang.cashPlayBook.core.ServiceException;
import cn.niriqiang.cashPlayBook.model.Cost;
import cn.niriqiang.cashPlayBook.service.CostService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by fengyuwusong on 2017/12/18 21:01.
 */
public class CostServiceImplTest extends Tester {
    @Autowired
    private CostService service;

    @Test
    public void findListByAll() {
        List<Cost> list = service.findListByCondition(null, null, null, null, null, null, 25);
        System.out.println(list.toString());

        long start = System.currentTimeMillis() / 1000;
        long end = System.currentTimeMillis() / 1000;
        try {
            List<Cost> list1 = service.findListByCondition(start, end, null, null, null, null, 1);
            System.out.println(list.toString());
        } catch (ServiceException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getSum() {
        String openid = "123";
        long start = 1;
        long end = System.currentTimeMillis();
        System.out.println(service.getSumByStartAndEnd(start, end, 25));
    }
}