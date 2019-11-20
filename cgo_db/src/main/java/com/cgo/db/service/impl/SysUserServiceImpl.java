package com.cgo.db.service.impl;

import com.cgo.db.entity.SysUser;
import com.cgo.db.mapper.SysUserMapper;
import com.cgo.db.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
