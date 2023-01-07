package nuc.edu.cai4.cai4mybatis.controller;

import nuc.edu.cai4.cai4mybatis.domain.User;
import nuc.edu.cai4.cai4mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    // 注入用户服务类
    @Autowired
    private IUserService userService;
    // 1.通过URL传递参数
    @GetMapping("/{id}")
// 相应为JSON数据集
    @ResponseBody
// @PathVariable 通过参数名称获取参数
    public User get(@PathVariable("id") Integer id) {
        return userService.getUser(id);
    }


    @RequestMapping("/list1")
    @ResponseBody
    public List<User> list1() {
// 访问模型层得到数据
        List<User> users = userService.findAllUser();
        System.out.println(users);
        for (User user : users) {
            System.out.println(user.getUser_name());
        }
        return users;
    }


    @RequestMapping("/list2")
    @ResponseBody
    public List<User> list2(@RequestParam(value = "user_name", required = false) String user_name,
                            @RequestParam(value = "sex", required = false) String sex) {
// 访问模型层得到数据
        List<User> users = userService.findUsers(user_name,sex);
        for (User user : users) {
            System.out.println(user.getUser_name());
        }
        return users;
    }


    @RequestMapping("/insert")
    @ResponseBody
    public Integer insert(@RequestParam(value = "user_name", required = false) String user_name,
                          @RequestParam(value = "sex", required = false) String sex) {
// 访问模型层得到数据
        User user=new User();
        user.setUser_name(user_name);
        user.setSex(sex);
        userService.insertUser(user);
        return user.getId();
    }


    @RequestMapping("/delete")
    @ResponseBody
    public String delete(@PathVariable("id") Integer id) {
        return "删除数据["+userService.deleteUser(id)+"]条";
    }

    @RequestMapping("/update{id}")
    @ResponseBody
    public String updateUser(User user,@PathVariable("id") Integer id,@RequestParam(value = "user_name") String user_name,
                             @RequestParam(value = "sex") String sex) {
        int count=0;
        // 访问模型层得到数据
        user.setUser_name(user_name);
        user.setSex(sex);
        userService.updateUser(user);
        count++;
        return "更新数据["+count+"]条";
    }
}