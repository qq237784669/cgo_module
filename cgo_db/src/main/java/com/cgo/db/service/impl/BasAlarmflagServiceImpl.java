package com.cgo.db.service.impl;

import com.cgo.db.entity.BasAlarmflag;
import com.cgo.db.mapper.BasAlarmflagMapper;
import com.cgo.db.service.IBasAlarmflagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 报警标志位表
AlarmType:1-终端报警;2-平台报警;4-故障 服务实现类
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Service
public class BasAlarmflagServiceImpl extends ServiceImpl<BasAlarmflagMapper, BasAlarmflag> implements IBasAlarmflagService {

}
