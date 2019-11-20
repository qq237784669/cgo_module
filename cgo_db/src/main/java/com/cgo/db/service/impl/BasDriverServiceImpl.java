package com.cgo.db.service.impl;

import com.cgo.db.entity.BasDriver;
import com.cgo.db.mapper.BasDriverMapper;
import com.cgo.db.service.IBasDriverService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 驾驶员信息表 服务实现类
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Service
public class BasDriverServiceImpl extends ServiceImpl<BasDriverMapper, BasDriver> implements IBasDriverService {

}
