package nuc.edu.cai4.spingbootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/index")
public class indexController {
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        return "hello spring boot!!!";
    }
    @RequestMapping({ "/index","/"})
    public String index(){
        return "index";
    }
    /*@RequestMapping(value = "hello")
    public String sayHello(Mode1 mode1) {
        mode1.addAttribute("name","cai4");
        return "index.html";
    }*/

}
