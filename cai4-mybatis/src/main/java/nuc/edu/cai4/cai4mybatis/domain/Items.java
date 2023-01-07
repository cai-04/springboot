package nuc.edu.cai4.cai4mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Alias("Items")
public class Items {
    private Integer id;
    private String name;
    private float price;
    private String detail;
    private String pic;
    private Date datetime;
}
