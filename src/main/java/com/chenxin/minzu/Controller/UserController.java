package com.chenxin.minzu.Controller;

import com.chenxin.minzu.Enity.User;
import com.chenxin.minzu.Respotity.UserRespotity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
/**
 * @author 陈鑫
 * @create 2020-10-17 11:39
 */
@Api(tags = "用户信息接口")
@RestController
@RequestMapping("/user")
public class UserController {

    //映射到接口类，可以使用接口类中的方法
    @Autowired
    private UserRespotity userRespotity;

    //写具体的接口，接口需要使用的接口类中已有的方法
    @Operation(summary = "得到所有用户信息" )
    @RequestMapping(value = "/usersinfo", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "用户信息列表！", notes = "用户信息列表！")
    public String ExportWord(HttpServletRequest request,
                             HttpServletResponse response,
                             @RequestParam(required = false) String userid) throws Exception {

        List<User> users = userRespotity.findAll();

        return "users";
    }

    @RequestMapping(value = "/getinfoid", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "更改用户信息", notes = "更改用户信息")
    public User getinfoid(@RequestParam(required = false) int id) throws Exception {

        //List<User> users=userRespotity.findAll();
        User user=userRespotity.findById(id);
        //System.out.println(ids);
        return user;
    }

    /**
     * 增加和更改用户
     * @param user
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "增加或更改用户", notes = "增加或更改用户")
    public User getinfo(@RequestBody User user) throws Exception {

        //List<User> users=userRespotity.findAll();
        User users=userRespotity.save(user);
        //System.out.println(ids);
        return users;
    }

    @RequestMapping(value = "/deleteUser",method = RequestMethod.DELETE)
    @ResponseBody
    @ApiOperation(value = "删除用户",notes = "删除用户")
    public User deleteUser(@RequestParam(required = false) int id)throws Exception{
        User user = userRespotity.deleteById(id);

        return user;
    }
}
