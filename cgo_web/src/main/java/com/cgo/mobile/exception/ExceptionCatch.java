package com.cgo.mobile.exception;

import com.cgo.common.excption.CustomException;
import com.cgo.common.respones.CommonCode;
import com.cgo.common.respones.CommonRespones;
import com.cgo.common.respones.ResultCode;
import com.google.common.collect.ImmutableMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 统一异常捕获类
 **/
@RestControllerAdvice//控制器增强
@Slf4j
public class ExceptionCatch {



    //定义map，配置异常类型所对应的错误代码  volatile 防止汇编指令重排序的情况
    private volatile static ImmutableMap<Class<? extends Throwable>,ResultCode> EXCEPTIONS;
    //定义map的builder对象，去构建ImmutableMap
    private static ImmutableMap.Builder<Class<? extends Throwable>, ResultCode> builder = ImmutableMap.builder();

    //捕获CustomException此类异常
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public CommonRespones customException(CustomException customException){
        //记录日志
        log.error("catch exception:  >>>>>  ",customException.getMessage());
        ResultCode resultCode = customException.getResultCode();
        return new CommonRespones(resultCode);
    }
    //捕获Exception此类异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public CommonRespones exception(Exception exception){
        //记录日志
        log.error("catch exception:  >>>>>  ",exception.getMessage());

        //  预防并发情况下的重复创建 双重锁
        if(EXCEPTIONS == null){
            synchronized (ExceptionCatch.class){
                if (EXCEPTIONS!=null){
                    EXCEPTIONS = builder.build();//EXCEPTIONS构建成功
                }
            }
        }

        //从EXCEPTIONS中找异常类型所对应的错误代码，如果找到了将错误代码响应给用户，如果找不到给用户响应99999异常
        ResultCode resultCode = EXCEPTIONS.get(exception.getClass());
        if(resultCode !=null){
            return new CommonRespones(resultCode);
        }else{
            //返回99999异常
            return new CommonRespones(CommonCode.SERVER_ERROR);
        }


    }

    static {
        //定义异常类型所对应的错误代码
        builder.put(HttpMessageNotReadableException.class,CommonCode.INVALID_PARAM);
    }
}
