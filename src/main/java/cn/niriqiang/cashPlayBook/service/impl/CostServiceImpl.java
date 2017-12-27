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
    public List<Cost> findListByDay(long start, long end, String openid) {
        List<Cost> list = costMapper.findListByDay(start, end, openid);
        if (list.size() == 0) {
            throw new ServiceException("查询数据为空！");
        }
        return list;
    }

    @Override
    public List<Cost> findListByType(int type, String openid) {
        List<Cost> list = costMapper.findListByType(type, openid);
        if (list.size() == 0) {
            throw new ServiceException("查询数据为空！");
        }
        return list;
    }

    @Override
    public List<Cost> findListByCondition(Long start, Long end, Integer type, Integer necessary, Integer gt, Integer lt, String openid) {
        List<Cost> list=costMapper.findListByCondition(start, end, type, necessary, gt, lt, openid);
        if(list.size()==0){
            throw new ServiceException("查询数据为空！");
        }
        return list;
    }

    @Override
    public double getSumByStartAndEnd(long satart, long end, String openid) {
        return costMapper.getSumByStartAndEnd(satart, end, openid);
    }


}
