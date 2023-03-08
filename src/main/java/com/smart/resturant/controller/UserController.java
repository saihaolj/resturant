package com.smart.resturant.controller;

import com.smart.resturant.entity.User;
import com.smart.resturant.service.IUserService;
import com.smart.resturant.service.ex.InsertException;
import com.smart.resturant.service.ex.UsernameDuplicatedException;
import com.smart.resturant.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

// @Controller
@RestController // @Controller + @ResponseBody
@RequestMapping("users")
public class UserController extends BaseController {
    @Autowired
    private IUserService userService;

    /*
    // @ResponseBody // 表示此方法的响应结果以json格式进行数据的响应给到前端
    public JsonResult<Void> reg(User user){
        // 创建响应结果的对象
        JsonResult<Void> result = new JsonResult<>();
        try {
            userService.reg(user);
            result.setState(200);
            result.setMessage("用户注册成功");
        } catch (UsernameDuplicatedException e) {
            result.setState(4000);
            result.setMessage("用户名被占用");
        } catch (InsertException e) {
            result.setState(5000);
            result.setMessage("注册时产生未知的异常");
        }
        return result;
    }
    */

    /**
     * 取决于SpringBoot的“约定大于配置”的开发理念来进行的，省略大量的配置甚至注解的编写
     * 1.接收数据方式：请求处理方法的参数列表设置为pojo类型来接受前端的数据，
     * SpringBoot会将前端的url地址中的参数名和pojo类的数据名进行比较，
     * 如果这两个名称相同，则将值注入到pojo类中对应的属性上
     *
     * @param user
     * @return
     */
    @RequestMapping("reg")
    public JsonResult<Void> reg(User user) {
        userService.reg(user);
        return new JsonResult<>(OK);
    }

    /**
     * 2.接收数据方式：请求处理方法的参数列表设置为非pojo类型，
     * SpringBoot会将请求的参数名和方法的参数名直接进行比较，
     * 如果名称相同，则自动完成值的依赖注入
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("login")
    public JsonResult<User> login(String username, String password, HttpSession session) {
        User data = userService.login(username, password);
        // 向session对象中完成数据的绑定（session是全局的）
        session.setAttribute("uid", data.getUid());
        session.setAttribute("username", data.getUsername());

        // 获取session中绑定的数据
        System.out.println(getUidFromSession(session));
        System.out.println(getUsernameFromSession(session));

        return new JsonResult<User>(OK, data);
    }

    @RequestMapping("get_by_uid")
    public JsonResult<User> getByUid(HttpSession session) {
        User data = userService.getByUid(getUidFromSession(session));
        return new JsonResult<>(OK, data);
    }
}
