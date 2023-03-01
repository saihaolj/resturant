package com.smart.resturant.mapper;

import com.smart.resturant.entity.User;
import org.apache.ibatis.annotations.Mapper;

/** 用户模块的持久层接口 */
@Mapper
public interface UserMapper {
    /**
     * 插入用户的数据
     * @param user 用户的数据
     * @return 受影响的行数（增、删、改，都有受影响的行数作为返回值，可以根据返回值来判断是否执行成功）
     */
    Integer insert(User user);

    /**
     * 根据用户名来查询用户的数据
     * @param username 用户名
     * @return 如果找到对应的用户，则返回用户的数据；如果没有找到，则返回null值
     */
    User findByUsername(String username);
}
