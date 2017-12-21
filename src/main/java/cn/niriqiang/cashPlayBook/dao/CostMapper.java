package cn.niriqiang.cashPlayBook.dao;

import cn.niriqiang.cashPlayBook.core.Mapper;
import cn.niriqiang.cashPlayBook.model.Cost;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CostMapper extends Mapper<Cost> {
    List<Cost> findListByDay(@Param("start") long start, @Param("end") long end, @Param("openid") String openid);

    List<Cost> findListByType(@Param("type") int type, @Param("openid") String openid);

    List<Cost> findListByCondition(@Param("start") Long start,@Param("end") Long end,@Param("type") Integer type,@Param("baoxiao") Integer baoxiao, @Param("gtMoney") Integer gtMoney,@Param("ltMoney") Integer ltMoney,@Param("openid") String openid);


    //    计算开始到结束的所有支出总和
    public double getSumByStartAndEnd(@Param("start") long start, @Param("end") long end, @Param("openid") String openid);
}