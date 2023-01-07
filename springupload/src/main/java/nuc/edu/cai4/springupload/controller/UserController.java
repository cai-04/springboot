package nuc.edu.cai4.springupload.controller;

import nuc.edu.cai4.springupload.entity.User;
import nuc.edu.cai4.springupload.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/user")
public class UserController {

        @Autowired
        private IUserService iUserService;
        @ModelAttribute
        public void init0() {
            System.out.println("init0....");
        }
        @ModelAttribute
        public void init1() {
            System.out.println("init1....");
        }
        @GetMapping("/getUserById/{id}")
        @ResponseBody
        public String getUserById(@PathVariable Integer id) {
            User user = iUserService.getUserById(id);
            return user.getUsername();
        }
        @ModelAttribute
        public void init2() {
            System.out.println("init2....");
        }

    @ModelAttribute
    public void init(Model model) {
        User user=new User();
        user.setId(4);
        user.setUsername("zs");
        user.setNote("zs_note");
        model.addAttribute("user", user);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @ModelAttribute("name")
    public String init1(@RequestParam(value="username",required=false) String username)
    {
        return username;
    }

    @GetMapping("/hello1")
    public String hello1() {
        return "hello1";
    }
    }

