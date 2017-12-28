package cn.niriqiang.cashPlayBook.service;

import cn.niriqiang.cashPlayBook.core.Service;
import cn.niriqiang.cashPlayBook.dto.CostTypeDto;
import cn.niriqiang.cashPlayBook.model.CostSecondType;

import java.util.List;


/**
 * Created by fengyuwusong on 2017/12/27.
 */
public interface CostSecondTypeService extends Service<CostSecondType> {
    List<CostSecondType> findListByUid(int uid);

    /**
     * 查询出所有消费类型并转化成CostTypeDto
     * @param uid 用户id
     * @return
     */
    List<CostTypeDto> findAllByUid(int uid);
}
