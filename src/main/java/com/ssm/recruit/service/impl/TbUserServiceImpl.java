package com.ssm.recruit.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ssm.recruit.entity.TbUser;
import com.ssm.recruit.mapper.TbUserMapper;
import com.ssm.recruit.service.ITbUserService;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author sutuo
 * @since 2019-08-26
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements ITbUserService {

}
