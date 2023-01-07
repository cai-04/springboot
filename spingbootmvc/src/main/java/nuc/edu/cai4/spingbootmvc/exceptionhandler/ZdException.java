package nuc.edu.cai4.spingbootmvc.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor //有参构造函数
@NoArgsConstructor //无参构造函数
public class ZdException extends RuntimeException {

    private Integer code; //状态码

    private String msg; //异常信息
}
