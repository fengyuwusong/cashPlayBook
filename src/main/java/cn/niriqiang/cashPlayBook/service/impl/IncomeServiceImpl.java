package cn.niriqiang.cashPlayBook.service.impl;

import cn.niriqiang.cashPlayBook.dto.ConditionDto;
import cn.niriqiang.cashPlayBook.core.ServiceException;
import cn.niriqiang.cashPlayBook.dao.IncomeMapper;
import cn.niriqiang.cashPlayBook.model.Income;
import cn.niriqiang.cashPlayBook.service.IncomeService;
import cn.niriqiang.cashPlayBook.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by fengyuwusong on 2017/11/29.
 */
@Service
@Transactional
public class IncomeServiceImpl extends AbstractService<Income> implements IncomeService {
    @Resource
    private IncomeMapper incomeMapper;

    @Override
    public List<Income> findListByCondition(ConditionDto dto) {
        List<Income> list=incomeMapper.findListByCondition(dto);
        if(list.size()==0){
            throw new ServiceException("查询结果为空!");
        }
        return list;
    }

    @Override
    public double getSumByStartAndEnd(long start, long end, String openid) {
        return incomeMapper.getSumByStartAndEnd(start, end, openid);
    }


}
