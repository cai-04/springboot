package nuc.edu.cai4.cai4mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("User")
public class User {
    private Integer id;
    private String user_name;
    private String birthday;
    private String sex;
    private String address;
    List<Orders> ordersList;
}
