package com.cgo.db.service.impl;

import com.cgo.db.entity.StdPlatecolor;
import com.cgo.db.mapper.StdPlatecolorMapper;
import com.cgo.db.service.IStdPlatecolorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 车牌颜色表 按照JT/T 145-2006中5.4.12的规定 服务实现类
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Service
public class StdPlatecolorServiceImpl extends ServiceImpl<StdPlatecolorMapper, StdPlatecolor> implements IStdPlatecolorService {

}
