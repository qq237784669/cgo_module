package com.cgo.db.service.impl;

import com.cgo.db.entity.StdVehicletype;
import com.cgo.db.mapper.StdVehicletypeMapper;
import com.cgo.db.service.IStdVehicletypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 车辆类型表 按照JT/T 145-2006中5.4.9的规定 服务实现类
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Service
public class StdVehicletypeServiceImpl extends ServiceImpl<StdVehicletypeMapper, StdVehicletype> implements IStdVehicletypeService {

}
