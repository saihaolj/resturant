package com.smart.resturant.service;

import com.smart.resturant.entity.User;

/** 用户模块业务层接口 */
public interface IUserService {
    /**
     * 用户注册方法
     * @param user 用户的数据对象
     */
    void reg(User user);

    /**
     * 用户登录功能
     * @param username 用户名
     * @param password 用户密码
     * @return 当前匹配的用户数据，如果没有则返回null值
     */
    User login(String username , String password);

    /**
     * 查询用户个人信息功能
     * @param uid 用户uid
     * @return 当前匹配的用户数据，如果没有则返回null值
     */
    User getByUid(Integer uid);


}
