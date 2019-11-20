package com.cgo.db.service.impl;

import com.cgo.db.entity.SysLoginlog;
import com.cgo.db.mapper.SysLoginlogMapper;
import com.cgo.db.service.ISysLoginlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录日志表 服务实现类
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Service
public class SysLoginlogServiceImpl extends ServiceImpl<SysLoginlogMapper, SysLoginlog> implements ISysLoginlogService {

}
