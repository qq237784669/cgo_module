package com.cgo.db.service.impl;

import com.cgo.db.entity.SysLog;
import com.cgo.db.mapper.SysLogMapper;
import com.cgo.db.service.ISysLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统日志表 服务实现类
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements ISysLogService {

}
