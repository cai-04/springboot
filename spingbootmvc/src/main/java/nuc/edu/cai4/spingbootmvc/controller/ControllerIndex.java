package nuc.edu.cai4.spingbootmvc.controller;

import nuc.edu.cai4.spingbootmvc.util.Res;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ControllerIndex {
    @RequestMapping("/index222")
    public Res sayhello() {
        return new Res().ok();
    }
    @RequestMapping("/index333")
    public Res saySpring() {
        return new Res().error();
    }
}
