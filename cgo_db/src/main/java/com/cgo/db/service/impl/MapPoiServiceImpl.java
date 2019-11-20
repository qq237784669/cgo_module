package com.cgo.db.service.impl;

import com.cgo.db.entity.MapPoi;
import com.cgo.db.mapper.MapPoiMapper;
import com.cgo.db.service.IMapPoiService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 地图标注表 服务实现类
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Service
public class MapPoiServiceImpl extends ServiceImpl<MapPoiMapper, MapPoi> implements IMapPoiService {

}
