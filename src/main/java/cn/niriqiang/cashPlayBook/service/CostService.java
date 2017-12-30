package cn.niriqiang.cashPlayBook.service;

import cn.niriqiang.cashPlayBook.core.Service;
import cn.niriqiang.cashPlayBook.model.Cost;

import java.util.List;


/**
 * Created by fengyuwusong on 2017/11/29.
 */
public interface CostService extends Service<Cost> {
    /**
     * 按照所有条件进行查询 参数为 -1则不进行查询
     *
     * @param start   开始时间
     * @param end     结束时间
     * @param type    类型id
     * @param necessary 是否必要
     * @param gtMoney 大于金额
     * @param ltMoney 小于金额
     * @param uid  微信用户id
     *
     * @return
     */
    List<Cost> findListByCondition(Long start, Long end, Integer type, Integer necessary, Integer gtMoney, Integer ltMoney, int uid);

    /**
     * 获取时间段内的总金额
     * @param satart
     * @param end
     * @param uid
     * @return
     */
    double getSumByStartAndEnd(long satart, long end, int uid);

}
