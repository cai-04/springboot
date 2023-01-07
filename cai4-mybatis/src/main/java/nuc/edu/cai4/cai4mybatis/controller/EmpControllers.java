package nuc.edu.cai4.cai4mybatis.controller;

import nuc.edu.cai4.cai4mybatis.domain.Emp;
import nuc.edu.cai4.cai4mybatis.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("emps")
public class EmpControllers {
    @Autowired
    private EmpMapper empMapper;
    // 通过URL传递参数
    @GetMapping("/{empno}")
// 相应为JSON数据集
    @ResponseBody
// @PathVariable 通过参数名称获取参数
    public Emp getEmpByEmpno(@PathVariable("empno") Integer empno) {
        return empMapper.findEmpByEmpno(empno);
    }
}
