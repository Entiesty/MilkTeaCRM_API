package com.example.milkteacrm_api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.milkteacrm_api.mapper.UserMapper;
import com.example.milkteacrm_api.pojo.UserPo;
import com.example.milkteacrm_api.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserPo> implements UserService {
}
