package cn.niriqiang.cashPlayBook.service;

import cn.niriqiang.cashPlayBook.core.Service;
import cn.niriqiang.cashPlayBook.model.Cost;

import java.util.List;


/**
 * Created by fengyuwusong on 2017/11/29.
 */
public interface CostService extends Service<Cost> {
    /**
     * 查询该天支出类型占比
     *
     * @param start  日期
     * @param openid 微信用户openid
     *
     * @return List<Cost> 用户消费集合
     */
    List<Cost> findListByDay(long start, long end, String openid);

    /**
     * 按照分类查询
     *
     * @param type   分类id
     * @param openid 微信用户openid
     *
     * @return List<Cost> 用户消费集合
     */
    List<Cost> findListByType(int type, String openid);

    /**
     * 按照所有条件进行查询 参数为 -1则不进行查询
     *
     * @param start   开始时间
     * @param end     结束时间
     * @param type    类型id
     * @param baoxiao 是否报销
     * @param gtMoney 大于金额
     * @param ltMoney 小于金额
     * @param openid  微信用户openid
     *
     * @return
     */
    List<Cost> findListByCondition(Long start, Long end, Integer type, Integer baoxiao, Integer gtMoney, Integer ltMoney, String openid);

    /**
     * 获取时间段内的总金额
     * @param satart
     * @param end
     * @param openid
     * @return
     */
    double getSumByStartAndEnd(long satart, long end, String openid);

}
