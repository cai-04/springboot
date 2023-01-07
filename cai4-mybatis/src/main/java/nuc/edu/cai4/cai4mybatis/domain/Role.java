package nuc.edu.cai4.cai4mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Alias("Role")
public class Role {
    private Integer id;
    private String name;
    private List<Student> stuList;
}
