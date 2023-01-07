package nuc.edu.cai4.cai4mybatis.controller;

import nuc.edu.cai4.cai4mybatis.domain.Classes;
import nuc.edu.cai4.cai4mybatis.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/class")
public class ClassController {
    @Autowired
    private IClassService classService;

    @RequestMapping("/getclass/{id}")
    @ResponseBody
    public Classes getClass(@PathVariable("id") Integer id) {
        return classService.getClass(id);
    }

    @RequestMapping("/getclass2/{id}")
    @ResponseBody
    public Classes getClass2(@PathVariable("id") Integer id) {
        return classService.getClass(id);
    }
}
