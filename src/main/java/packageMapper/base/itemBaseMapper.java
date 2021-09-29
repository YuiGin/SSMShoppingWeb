package packageMapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import packageModel.item;
/**
*  @author DAO
*/
public interface itemBaseMapper {

    int insertitem(item object);

    int updateitem(item object);

    int update(item.UpdateBuilder object);

    List<item> queryitem(item object);

    item queryitemLimit1(item object);

}