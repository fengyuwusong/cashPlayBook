package cn.niriqiang.cashPlayBook.service;

import cn.niriqiang.cashPlayBook.core.Service;
import cn.niriqiang.cashPlayBook.model.IncomeType;

import java.util.List;


/**
 * Created by fengyuwusong on 2017/12/27.
 */
public interface IncomeTypeService extends Service<IncomeType> {
    /**
     * 通过uid查找
     * @param uid 用户id
     * @return
     */
    public List<IncomeType> findListByUid(int uid);
}
