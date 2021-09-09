package com.zyl.pig.service.mvc.service.impl;

import com.zyl.pig.service.mvc.pojo.User;
import com.zyl.pig.service.mvc.mapper.UserMapper;
import com.zyl.pig.service.mvc.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 人 服务实现类
 *
 * @author 张代富
 * @since 2021-09-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
