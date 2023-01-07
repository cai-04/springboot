package nuc.edu.cai4.spingbootmvc.controller;

import nuc.edu.cai4.spingbootmvc.entity.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


public class LoginController {
    @RequestMapping("/user/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model,
            HttpSession session) {
        if (!username.isEmpty() && "123456".equals(password)) {
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "用户名或密码错误！");
            return "index";
        }
    }

    @RequestMapping("/user/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/index.html";
    }

    @GetMapping("/getUser")
    @ResponseBody
    public User getUser(@RequestBody User user) {
        //System.out.println(user.toString());
        return user;
    }



}
