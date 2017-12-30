package cn.niriqiang.cashPlayBook.service.impl;

import cn.niriqiang.cashPlayBook.core.ServiceException;
import cn.niriqiang.cashPlayBook.dao.CostMapper;
import cn.niriqiang.cashPlayBook.model.Cost;
import cn.niriqiang.cashPlayBook.service.CostService;
import cn.niriqiang.cashPlayBook.core.AbstractService;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;


/**
 * Created by fengyuwusong on 2017/11/29.
 */
@Service
@Transactional
public class CostServiceImpl extends AbstractService<Cost> implements CostService {
    @Autowired
    private CostMapper costMapper;

    @Override
    public List<Cost> findListByCondition(Long start, Long end, Integer type, Integer necessary, Integer gt, Integer lt, int uid) {
        List<Cost> list=costMapper.findListByCondition(start, end, type, necessary, gt, lt, uid);
        if(list.size()==0){
            throw new ServiceException("查询数据为空！");
        }
        return list;
    }

    @Override
    public double getSumByStartAndEnd(long satart, long end, int uid) {
        Double sum=costMapper.getSumByStartAndEnd(satart, end, uid);
        return sum==null?0:sum;
    }


}
