package cn.niriqiang.cashPlayBook.service.impl;

import cn.niriqiang.cashPlayBook.core.ServiceException;
import cn.niriqiang.cashPlayBook.dao.CostFirstTypeMapper;
import cn.niriqiang.cashPlayBook.model.CostFirstType;
import cn.niriqiang.cashPlayBook.service.CostFirstTypeService;
import cn.niriqiang.cashPlayBook.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by fengyuwusong on 2017/12/27.
 */
@Service
@Transactional
public class CostFirstTypeServiceImpl extends AbstractService<CostFirstType> implements CostFirstTypeService {
    @Resource
    private CostFirstTypeMapper costFirstTypeMapper;

    @Override
    public List<CostFirstType> findListByUid(int uid) {
        List<CostFirstType> list=costFirstTypeMapper.findListByUid(uid);
        if(list.size()==0){
            throw new ServiceException("查询结果为空！");
        }
        return list;
    }
}
