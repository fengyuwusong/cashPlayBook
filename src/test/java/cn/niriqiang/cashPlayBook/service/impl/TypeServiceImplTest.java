package cn.niriqiang.cashPlayBook.service.impl;

import cn.niriqiang.cashPlayBook.Tester;
import cn.niriqiang.cashPlayBook.core.ServiceException;
import cn.niriqiang.cashPlayBook.service.TypeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by fengyuwusong on 2017/12/21 20:52.
 */
public class TypeServiceImplTest extends Tester{
    @Autowired
    TypeService service;
    @Test
    public void findListByType() throws Exception {
        try {
            System.out.println(service.findListByType(0, 1));
            System.out.println(service.findListByType(0, 2));
        }catch (ServiceException e){
            System.out.println(e.getMessage());
        }
    }

}