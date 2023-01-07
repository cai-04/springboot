package nuc.edu.cai4.cai4mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Alias("Emp")
public class Emp {
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private Date hiredate;
    private Float sal;
    private Float comm;
    //一名员工只能在一个部门
    //private Dept deptno;
    private Dept deptno;

}
