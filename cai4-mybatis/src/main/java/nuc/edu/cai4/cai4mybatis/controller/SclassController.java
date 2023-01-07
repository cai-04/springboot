package nuc.edu.cai4.cai4mybatis.controller;

import nuc.edu.cai4.cai4mybatis.domain.Classes;
import nuc.edu.cai4.cai4mybatis.mapper.SclassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("class")
public class SclassController {
    @Autowired
    private SclassMapper sclassMapper;

    // 通过URL传递参数
    @GetMapping("/{id}")
    // 相应为JSON数据集
    @ResponseBody
    // @PathVariable 通过参数名称获取参数
    public Classes getSclassById(@PathVariable("id") Integer id) {
        return sclassMapper.findClassById(id);
    }
}

