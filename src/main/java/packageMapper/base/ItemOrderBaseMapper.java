package packageMapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import packageModel.ItemOrder;
/**
*  @author DAO
*/
public interface ItemOrderBaseMapper {

    int insertItemOrder(ItemOrder object);

    int updateItemOrder(ItemOrder object);

    int update(ItemOrder.UpdateBuilder object);

    List<ItemOrder> queryItemOrder(ItemOrder object);

    ItemOrder queryItemOrderLimit1(ItemOrder object);

}