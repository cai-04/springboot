package nuc.edu.cai4.spingbootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class testrestful {
    @GetMapping("/{id}")
    public String getBookById(@PathVariable
            Integer id) {
        System.out.println(id);
        return "hello";
    }
    @DeleteMapping("")
    public String delBookById(Integer id) {
        return "hello";
    }
    @GetMapping("")
    public String getAll() {
        return "all";
    }
}
