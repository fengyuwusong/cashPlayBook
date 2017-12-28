package cn.niriqiang.cashPlayBook.dao;

import cn.niriqiang.cashPlayBook.core.Mapper;
import cn.niriqiang.cashPlayBook.model.CostFirstType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CostFirstTypeMapper extends Mapper<CostFirstType> {
    List<CostFirstType> findListByUid(@Param("uid") int uid);
}