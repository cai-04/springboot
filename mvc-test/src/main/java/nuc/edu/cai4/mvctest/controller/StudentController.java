package nuc.edu.cai4.mvctest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    //@ResponseBody
    public  String hello() {
        return "add";
    }
}
