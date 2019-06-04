package com.isfong.sharding.jdbc.demo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.isfong.sharding.jdbc.demo.mapper.UserMapper;
import com.isfong.sharding.jdbc.demo.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends ServiceImpl< UserMapper, User > implements UserService {
}
