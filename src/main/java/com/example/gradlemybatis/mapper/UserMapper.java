package com.example.gradlemybatis.mapper;

import com.example.gradlemybatis.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 查看所有的用户信息
     * @return
     */
    public List<User> selectList();
}
