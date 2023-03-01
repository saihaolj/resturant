package com.smart.resturant.service;

import com.smart.resturant.ResturantApplication;
import com.smart.resturant.entity.User;
import com.smart.resturant.mapper.UserMapper;
import com.smart.resturant.service.ex.ServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

// @SpringBootTest：表示标注当前的类是一个测试类，不会随同项目一块打包
@SpringBootTest(classes = ResturantApplication.class)
// @RunWith：表示启动这个单元测试类（不写的话单元测试类是不能够运行的），许哟啊传递一个参数，必须是SpringRunner的实力类型
@RunWith(SpringRunner.class)
public class UserServiceTests {
    // idea有检测的功能，接口是不能狗直接创建Bean的（Mybatis底层创建了动态代理来帮忙实现，动态代理技术来解决）
    @Autowired
    private IUserService userService;
    /**
     * 单元测试方法：就可以单独独立运行，不用启动整个项目，可以做单元测试，提升了代码的测试效率
     * 1.必须被@Test注解修饰
     * 2.返回值必须是void
     * 3.方法的参数列表不指定任何类型
     * 4.方法的返回修饰符必须是public
     */
    @Test
    public void reg(){
        try {
            User user = new User();
            user.setUsername("lisi");
            user.setPassword("123");
            userService.reg(user);
            System.out.println("OK");
        } catch (ServiceException e) {
            // 获取类的对象，再获取类的名称
            System.out.println(e.getClass().getSimpleName());
            // 获取异常的具体描述信息
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

}
