package cn.niriqiang.cashPlayBook.service.impl;

import cn.niriqiang.cashPlayBook.core.ServiceException;
import cn.niriqiang.cashPlayBook.dao.TypeMapper;
import cn.niriqiang.cashPlayBook.model.Type;
import cn.niriqiang.cashPlayBook.service.TypeService;
import cn.niriqiang.cashPlayBook.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by fengyuwusong on 2017/12/21.
 */
@Service
@Transactional
public class TypeServiceImpl extends AbstractService<Type> implements TypeService {
    @Resource
    private TypeMapper typeMapper;

    @Override
    public List<Type> findListByType(int type,int uid) {
        List<Type> list=typeMapper.findListByType(type,uid);
        if(list.size()==0){
            throw new ServiceException("查询结果为空!");
        }
        return list;
    }

}
