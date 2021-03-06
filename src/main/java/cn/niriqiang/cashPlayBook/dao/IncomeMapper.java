package cn.niriqiang.cashPlayBook.dao;

import cn.niriqiang.cashPlayBook.core.Mapper;
import cn.niriqiang.cashPlayBook.dto.ConditionDto;
import cn.niriqiang.cashPlayBook.model.Income;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IncomeMapper extends Mapper<Income> {
    //    按照条件查询所有收入
    public List<Income> findListByCondition(ConditionDto conditionDto);

    //    计算开始到结束的所有所有总和
    public Double getSumByStartAndEnd(@Param("start") long start, @Param("end") long end, @Param("uid") int uid);
}