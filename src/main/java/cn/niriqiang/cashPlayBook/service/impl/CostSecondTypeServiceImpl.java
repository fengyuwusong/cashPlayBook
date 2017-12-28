package cn.niriqiang.cashPlayBook.service.impl;

import cn.niriqiang.cashPlayBook.core.AbstractService;
import cn.niriqiang.cashPlayBook.core.ServiceException;
import cn.niriqiang.cashPlayBook.dao.CostFirstTypeMapper;
import cn.niriqiang.cashPlayBook.dao.CostSecondTypeMapper;
import cn.niriqiang.cashPlayBook.dto.CostTypeDto;
import cn.niriqiang.cashPlayBook.model.CostFirstType;
import cn.niriqiang.cashPlayBook.model.CostSecondType;
import cn.niriqiang.cashPlayBook.service.CostFirstTypeService;
import cn.niriqiang.cashPlayBook.service.CostSecondTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by fengyuwusong on 2017/12/27.
 */
@Service
@Transactional
public class CostSecondTypeServiceImpl extends AbstractService<CostSecondType> implements CostSecondTypeService {
    @Resource
    private CostSecondTypeMapper costSecondTypeMapper;
    @Autowired
    private CostFirstTypeService costFirstTypeService;

    @Override
    public List<CostSecondType> findListByUid(int uid) {
        List<CostSecondType> list = costSecondTypeMapper.findListByUid(uid);
        if (list.size() == 0) {
            throw new ServiceException("查询结果为空！");
        }
        return list;
    }

    @Override
    public List<CostTypeDto> findAllByUid(int uid) {
        List<CostFirstType> firstTypes = costFirstTypeService.findListByUid(uid);
        List<CostSecondType> secondTypes = this.findListByUid(uid);
        List<CostTypeDto> dtos = new ArrayList<>();
        for (CostFirstType firstType : firstTypes) {
            CostTypeDto dto = new CostTypeDto();
            dto.setFirstTypeId(firstType.getId());
            dto.setFirstTypeName(firstType.getName());
            //生成二级类型
            List<CostSecondType> dtoSecTypes=new ArrayList<>();
            for (CostSecondType secondType : secondTypes) {
                if (secondType.getFid()==dto.getFirstTypeId()){
                    dtoSecTypes.add(secondType);
                }
            }
            dto.setList(dtoSecTypes);
            dtos.add(dto);
        }
        return dtos;
    }
}
