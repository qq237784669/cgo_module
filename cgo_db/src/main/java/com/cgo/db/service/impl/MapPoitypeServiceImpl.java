package com.cgo.db.service.impl;

import com.cgo.db.entity.MapPoitype;
import com.cgo.db.mapper.MapPoitypeMapper;
import com.cgo.db.service.IMapPoitypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 地图标注类别表 服务实现类
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Service
public class MapPoitypeServiceImpl extends ServiceImpl<MapPoitypeMapper, MapPoitype> implements IMapPoitypeService {

}
