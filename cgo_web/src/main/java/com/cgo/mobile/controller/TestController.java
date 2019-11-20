package com.cgo.mobile.controller;


import com.cgo.common.respones.CommonCode;
import com.cgo.common.respones.ResponesResult;
import com.cgo.common.respones.Result;
import com.cgo.db.entity.Aa;
import com.cgo.db.service.IAaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Api("测试接口")
@RestController
public class TestController   {

    @Autowired
    IAaService iAaService;



    @RequestMapping("/a")
    @ApiOperation(value = "查询所有",httpMethod="POST")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name="name",value = "用户名称"),
                    @ApiImplicitParam(name="password",value = "用户密码")
            }
    )
    public ResponesResult findList(String name, String password) {
        return new ResponesResult(new Result<Aa>().setData(iAaService.list()), CommonCode.SUCCESS);
    }
}
