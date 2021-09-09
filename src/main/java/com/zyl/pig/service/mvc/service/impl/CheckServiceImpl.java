package com.zyl.pig.service.mvc.service.impl;

import com.zyl.pig.service.mvc.pojo.Check;
import com.zyl.pig.service.mvc.mapper.CheckMapper;
import com.zyl.pig.service.mvc.service.ICheckService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 账单 服务实现类
 *
 * @author 张代富
 * @since 2021-09-09
 */
@Service
public class CheckServiceImpl extends ServiceImpl<CheckMapper, Check> implements ICheckService {

}
