package cn.niriqiang.cashPlayBook.service;

import cn.niriqiang.cashPlayBook.core.Service;
import cn.niriqiang.cashPlayBook.model.CostFirstType;

import java.util.List;


/**
 * Created by fengyuwusong on 2017/12/27.
 */
public interface CostFirstTypeService extends Service<CostFirstType> {
    List<CostFirstType> findListByUid(int uid);
}
