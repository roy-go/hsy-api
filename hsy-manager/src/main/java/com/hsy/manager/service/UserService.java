package com.hsy.manager.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hsy.manager.entity.User;
import com.hsy.manager.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: gk
 * @Date: Created in 2021/2/5 9:54
 */
@Service
public class UserService {

    @Autowired(required = false)
    UserMapper userMapper;

    public int storeUser(User user) {
        return userMapper.insert(user);
    }

    public Integer findCountByUsername(String username) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.eq("username", username);
        return userMapper.selectCount(queryWrapper);
    }

    public User findUserByUsername(String username) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        return userMapper.selectOne(queryWrapper);
    }
}
