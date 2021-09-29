package packageMapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import packageModel.car;
/**
*  @author DAO
*/
public interface carBaseMapper {

    int insertcar(car object);

    int updatecar(car object);

    int update(car.UpdateBuilder object);

    List<car> querycar(car object);

    car querycarLimit1(car object);

}