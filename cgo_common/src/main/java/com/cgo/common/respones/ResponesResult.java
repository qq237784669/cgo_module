package com.cgo.common.respones;


import lombok.Data;

/**
 * 统一的返回响应 格式
 */
@Data
public class ResponesResult extends CommonRespones {

    private Result result;

    public ResponesResult(Result result,ResultCode resultCode){
        super(resultCode);
        this.result=result;
    }


    public static ResponesResult success(){
        return new ResponesResult(null,CommonCode.SUCCESS);
    }

    public static ResponesResult fail(){
        return new ResponesResult(null,CommonCode.FAIL);
    }
}
