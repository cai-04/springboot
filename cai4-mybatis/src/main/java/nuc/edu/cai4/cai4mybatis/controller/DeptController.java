package nuc.edu.cai4.cai4mybatis.controller;

import nuc.edu.cai4.cai4mybatis.domain.Dept;
import nuc.edu.cai4.cai4mybatis.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("dept")
public class DeptController {
    @Autowired
    private DeptMapper deptMapper;
    // 通过URL传递参数
    @GetMapping("/{deptno}")
// 相应为JSON数据集
    @ResponseBody
// @PathVariable 通过参数名称获取参数
    public Dept getDeptByDeptno(@PathVariable("deptno") Integer deptno)
    {
        return deptMapper.findDeptByDeptno(deptno);
    }
}