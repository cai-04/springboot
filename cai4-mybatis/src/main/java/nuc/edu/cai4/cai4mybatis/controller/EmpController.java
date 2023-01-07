package nuc.edu.cai4.cai4mybatis.controller;

import nuc.edu.cai4.cai4mybatis.domain.Dept;
import nuc.edu.cai4.cai4mybatis.domain.Emp;
import nuc.edu.cai4.cai4mybatis.service.IDeptService;
import nuc.edu.cai4.cai4mybatis.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private IEmpService empService;
    @Autowired
    private IDeptService deptService;
    @RequestMapping("/find1/{empno}")
    @ResponseBody
    public List<Emp> findByEmpno(@PathVariable("empno") Integer empno) {
        return empService.findByEmpno(empno);
    }
    @RequestMapping("/find2/{deptno}")
    @ResponseBody
    public List<Emp> findByDeptno(@PathVariable("deptno") Integer deptno) {
        return empService.findByDeptno(deptno);
    }
    @RequestMapping("/find3/{deptno}")
    @ResponseBody
    public Dept findByDeptno1(@PathVariable("deptno") Integer deptno) {
        return deptService.findByDeptno(deptno);
    }
}
