package cn.niriqiang.cashPlayBook.service;

import cn.niriqiang.cashPlayBook.core.Service;
import cn.niriqiang.cashPlayBook.model.Type;

import java.util.List;


/**
 * Created by fengyuwusong on 2017/12/21.
 */
public interface TypeService extends Service<Type> {

    /**
     * 按照收入、消费进行查询 0->消费 1->收入
     * @param type
     * @param uid
     * @return
     */
    public List<Type> findListByType(int type,int uid);
}
