package nuc.edu.cai4.cai4mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.util.Date;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Alias("Orders")
public class Orders {
    private Integer id;
    private Integer userId;
    //private User user;
    private String number;
    private Date createtime;
    private String note;
    private String orderName;
    //private List<orderDetail> orderDetails;
}
