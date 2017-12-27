package cn.niriqiang.cashPlayBook.service.impl;

import cn.niriqiang.cashPlayBook.Tester;
import cn.niriqiang.cashPlayBook.core.ServiceException;
import cn.niriqiang.cashPlayBook.model.Cost;
import cn.niriqiang.cashPlayBook.service.CostService;
import org.junit.Assert;
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
    public void findListByDay() throws Exception {
        try {
            List<Cost> list = service.findListByDay(System.currentTimeMillis() / 1000, (int) System.currentTimeMillis() / 1000, "123");
            System.out.println(list);
        } catch (ServiceException e) {
            Assert.assertEquals(e.getMessage(), "查询数据为空！");
        }
        List<Cost> list = service.findListByDay(1510934400, (1510934400 + 24 * 60 * 60), "123");
        System.out.println(list.toString());
    }

    @Test
    public void findListByType() throws Exception {
        List<Cost> list = service.findListByType(1, "123");
        for (Cost c : list) {
            System.out.println(c);
        }

        try {
            List<Cost> list1 = service.findListByType(2, "123");
            for (Cost c : list) {
                System.out.println(c);
            }
        } catch (ServiceException e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void findListByAll() {
        String openid="123";
        List<Cost> list=service.findListByCondition(null,null,null,null,null,null,openid);
        System.out.println(list.toString());

        long start=System.currentTimeMillis()/1000;
        long end=System.currentTimeMillis()/1000;
        try {
            List<Cost> list1=service.findListByCondition(start,end,null,null,null,null,openid);
            System.out.println(list.toString());
        }catch (ServiceException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getSum(){
        String openid="123";
        long start=1;
        long end=System.currentTimeMillis();
        System.out.println(service.getSumByStartAndEnd(start, end, openid));
    }
}