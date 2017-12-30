package cn.niriqiang.cashPlayBook.service.impl;

import cn.niriqiang.cashPlayBook.core.AbstractService;
import cn.niriqiang.cashPlayBook.dao.UserMapper;
import cn.niriqiang.cashPlayBook.model.User;
import cn.niriqiang.cashPlayBook.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by fengyuwusong on 2017/11/29.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
