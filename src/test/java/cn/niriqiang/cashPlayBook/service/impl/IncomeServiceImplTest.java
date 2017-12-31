package cn.niriqiang.cashPlayBook.service.impl;

import cn.niriqiang.cashPlayBook.Tester;
import cn.niriqiang.cashPlayBook.core.ServiceException;
import cn.niriqiang.cashPlayBook.dto.ConditionDto;
import cn.niriqiang.cashPlayBook.model.Income;
import cn.niriqiang.cashPlayBook.service.IncomeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by fengyuwusong on 2017/12/21 20:00.
 */
public class IncomeServiceImplTest extends Tester{
    @Autowired
    private IncomeService service;
    @Test
    public void findListByCondition() throws Exception {
        Income income=new Income();
        income.setCreateTime(System.currentTimeMillis()/1000);
        income.setMoney(12D);
        income.setUid(25);
        income.setType(10);
        service.save(income);
        ConditionDto dto=new ConditionDto();
        dto.setUid(4);
        List<Income> list=service.findListByCondition(dto);
        System.out.println(list);

        try {
            dto.setGtMoney(100);
            list=service.findListByCondition(dto);
            System.out.println(list);
        }catch (ServiceException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getSum(){
        long start=1;
        long end=System.currentTimeMillis()/1000;
        int uid=4;
        System.out.println(service.getSumByStartAndEnd(start, end, uid));
    }

}