package nuc.edu.cai4.mvctest.controller;

import nuc.edu.cai4.mvctest.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    //测试thymeleaf
    @RequestMapping({"/index","/"})
    //@ResponseBody
    public  String hello() {
        return "index";
    }

    //测试HTML页面输出内容
    @RequestMapping("/getStu")
    public String getStu(Model model) {
        //Student student= new Student(1,"cai4");
        model.addAttribute("name","cai4");
        return "index";
    }


    @RequestMapping("/getBymv")
    public ModelAndView getStu(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        modelAndView.addObject("name","cai4");
        return modelAndView;
    }
}
