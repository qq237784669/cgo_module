package com.cgo.db.service.impl;

import com.cgo.db.entity.BizVehicleonlinelog;
import com.cgo.db.mapper.BizVehicleonlinelogMapper;
import com.cgo.db.service.IBizVehicleonlinelogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 车辆上下线日志表 上线一条记录时间只填上线时间字段 下线一条记录时间只填下线时间字段 服务实现类
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Service
public class BizVehicleonlinelogServiceImpl extends ServiceImpl<BizVehicleonlinelogMapper, BizVehicleonlinelog> implements IBizVehicleonlinelogService {

}
