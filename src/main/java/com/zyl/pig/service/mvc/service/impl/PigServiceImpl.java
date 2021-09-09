package com.zyl.pig.service.mvc.service.impl;

import com.zyl.pig.service.mvc.pojo.Pig;
import com.zyl.pig.service.mvc.mapper.PigMapper;
import com.zyl.pig.service.mvc.service.IPigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 猪 服务实现类
 *
 * @author 张代富
 * @since 2021-09-09
 */
@Service
public class PigServiceImpl extends ServiceImpl<PigMapper, Pig> implements IPigService {

}
