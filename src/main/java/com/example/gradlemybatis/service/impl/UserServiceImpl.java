package com.example.gradlemybatis.service.impl;

import com.example.gradlemybatis.bean.User;
import com.example.gradlemybatis.mapper.UserMapper;
import com.example.gradlemybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<User> showUserList() {
        System.out.println("aaaa");
        List<User> list = userMapper.selectList();
        System.out.println("bbb");
        return list;
    }
}
