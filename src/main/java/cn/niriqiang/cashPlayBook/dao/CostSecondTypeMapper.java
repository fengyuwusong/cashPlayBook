package cn.niriqiang.cashPlayBook.dao;

import cn.niriqiang.cashPlayBook.core.Mapper;
import cn.niriqiang.cashPlayBook.model.CostSecondType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CostSecondTypeMapper extends Mapper<CostSecondType> {
    List<CostSecondType> findListByUid(@Param("uid") int uid);

}