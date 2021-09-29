package packageMapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import packageModel.OrderDetail;
/**
*  @author DAO
*/
public interface OrderDetailBaseMapper {

    int insertOrderDetail(OrderDetail object);

    int updateOrderDetail(OrderDetail object);

    int update(OrderDetail.UpdateBuilder object);

    List<OrderDetail> queryOrderDetail(OrderDetail object);

    OrderDetail queryOrderDetailLimit1(OrderDetail object);

}