package cn.niriqiang.cashPlayBook.service;

import cn.niriqiang.cashPlayBook.dto.ConditionDto;
import cn.niriqiang.cashPlayBook.core.Service;
import cn.niriqiang.cashPlayBook.model.Income;

import java.util.List;


/**
 * Created by fengyuwusong on 2017/11/29.
 */
public interface IncomeService extends Service<Income> {
    public List<Income> findListByCondition(ConditionDto dto);
    public double getSumByStartAndEnd(long start,long end,String openid);
}
