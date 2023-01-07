package nuc.edu.cai4.cai4mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Alias("orderDetail")
public class orderDetail {
    private Integer id;
    private Integer orders_id;
    private Integer items_id;
    private Integer items_num;
}
