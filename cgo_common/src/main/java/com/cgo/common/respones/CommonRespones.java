package com.cgo.common.respones;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CommonRespones {
    //操作是否成功
    boolean success;

    //操作代码
    int code;

    //提示信息
    String message;

    public CommonRespones(ResultCode resultCode){
        this.success = resultCode.success();
        this.code = resultCode.code();
        this.message = resultCode.message();
    }

}
