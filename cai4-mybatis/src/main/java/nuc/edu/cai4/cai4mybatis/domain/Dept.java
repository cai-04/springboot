package nuc.edu.cai4.cai4mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Alias("Dept")
public class Dept {
    private Integer deptno;
    private String dname;
    //private String location;
    private String loc;
    //一个部门有多名员工
    private List<Emp> emps;


}
