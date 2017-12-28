package cn.niriqiang.cashPlayBook.dao;

import cn.niriqiang.cashPlayBook.core.Mapper;
import cn.niriqiang.cashPlayBook.model.IncomeType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IncomeTypeMapper extends Mapper<IncomeType> {
    List<IncomeType> findListByUid(@Param("uid") int uid);
}