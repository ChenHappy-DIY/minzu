package com.chenxin.minzu.Controller;

import com.chenxin.minzu.Enity.NationalMain;
import com.chenxin.minzu.Respotity.NationMainRespotity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 陈鑫
 * @create 2020-10-19 18:38
 */
@Api(tags = "民族具体信息接口")
@RestController
@RequestMapping("/nationalmain")
public class NationalMainController {

    //映射到接口类，可以使用接口类中的方法
    @Autowired
    private NationMainRespotity nationMainRespotity;

    @RequestMapping(value = "/getnationalid", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "查询民族信息", notes = "查询民族信息")
    public NationalMain getnationalid(@RequestParam(required = true) int id) throws Exception {

      NationalMain nationalMain = nationMainRespotity.findById(id);
        List<NationalMain> nationalMains=nationMainRespotity.findAll();

        //List<National> N1 = nationMainRespotity.findByType_id(id);

       return nationalMain;
    }
}
