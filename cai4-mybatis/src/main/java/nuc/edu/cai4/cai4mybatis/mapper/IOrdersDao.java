package nuc.edu.cai4.cai4mybatis.mapper;

import nuc.edu.cai4.cai4mybatis.domain.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IOrdersDao {
    Orders findOrderId(Integer id);
}
