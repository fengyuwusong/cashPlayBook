package cn.niriqiang.cashPlayBook.dao;

import cn.niriqiang.cashPlayBook.core.Mapper;
import cn.niriqiang.cashPlayBook.model.Type;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TypeMapper extends Mapper<Type> {
    public List<Type> findListByType(@Param("type") int type,@Param("uid") int uid);
}