package nuc.edu.cai4.jieduanceyan.exp4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
   /* @RequestMapping("/login")
    @ResponseBody
    public String login( ){  return  "redirect:/ indexs.html"; }*/


    @RequestMapping("/main")

    public String main() {

        System.out.println("MainController main方法被调用。。。");

        //根据Thymeleaf默认模板，将返回resources/templates/main.html

        return   "main";

    }
}
