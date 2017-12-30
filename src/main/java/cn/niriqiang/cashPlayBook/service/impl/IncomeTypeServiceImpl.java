package cn.niriqiang.cashPlayBook.service.impl;

import cn.niriqiang.cashPlayBook.core.AbstractService;
import cn.niriqiang.cashPlayBook.core.ServiceException;
import cn.niriqiang.cashPlayBook.dao.IncomeTypeMapper;
import cn.niriqiang.cashPlayBook.model.IncomeType;
import cn.niriqiang.cashPlayBook.service.IncomeTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by fengyuwusong on 2017/12/27.
 */
@Service
@Transactional
public class IncomeTypeServiceImpl extends AbstractService<IncomeType> implements IncomeTypeService {
    @Resource
    private IncomeTypeMapper incomeTypeMapper;

    @Override
    public List<IncomeType> findListByUid(int uid) {
        List<IncomeType> list=incomeTypeMapper.findListByUid(uid);
        if(list.size()==0){
            throw new ServiceException("查询结果为空！");
        }
        return list;
    }
}
