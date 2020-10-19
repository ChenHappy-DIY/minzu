package com.chenxin.minzu.Controller;

import com.chenxin.minzu.Enity.NationalType;
import com.chenxin.minzu.Respotity.NationalTypeRespotity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 陈鑫
 * @create 2020-10-19 18:36
 */
@Api(tags = "民族类型信息接口")
@RestController
@RequestMapping("/nationaltype")
public class NationalTypeController {

    //映射到接口类，可以使用接口类中的方法
    @Autowired
    private NationalTypeRespotity nationalTypeRespotity;

    @RequestMapping(value = "/getnationalid", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "查询民族分类信息", notes = "查询民族分类信息")
    public NationalType getnationalid(@RequestParam(required = true) int id) throws Exception {

        NationalType nationalType = nationalTypeRespotity.findById(id);


        return nationalType;
    }

}
