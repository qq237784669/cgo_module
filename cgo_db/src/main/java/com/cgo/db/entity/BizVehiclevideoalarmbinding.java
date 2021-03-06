package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_VehicleVideoAlarmBinding")
public class BizVehiclevideoalarmbinding extends Model<BizVehiclevideoalarmbinding> {

    private static final long serialVersionUID=1L;

    @TableId("VideoAlarmConfigId")
    private Integer VideoAlarmConfigId;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("VehicleId")
    private Integer VehicleId;

    @TableField("CreateBy")
    private String CreateBy;


    @Override
    protected Serializable pkVal() {
        return this.VideoAlarmConfigId;
    }

}
