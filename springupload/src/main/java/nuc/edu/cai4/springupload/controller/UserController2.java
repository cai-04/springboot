package nuc.edu.cai4.springupload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/user2")
public class UserController2 {
    @ModelAttribute("name")
    public String init1(@RequestParam(value="name",required=false) String name)
    {
        return name;
    }
    @GetMapping("/hello1")
    public String hello1() {
        return "hello1";
    }
}
