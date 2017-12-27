package cn.niriqiang.cashPlayBook.service.impl;

import cn.niriqiang.cashPlayBook.Tester;
import cn.niriqiang.cashPlayBook.service.CostSecondTypeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by fengyuwusong on 2017/12/27 14:08.
 */
public class CostSecondTypeServiceImplTest extends Tester{
    @Autowired
    CostSecondTypeService service;

    @Test
    public void findListByUid() throws Exception {
        System.out.println(service.findListByUid(1));
    }

    @Test
    public void findAll() throws Exception {
        System.out.println(service.findAllByUid(1));
    }

}