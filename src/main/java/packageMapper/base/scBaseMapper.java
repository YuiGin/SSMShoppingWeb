package packageMapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import packageModel.sc;
/**
*  @author DAO
*/
public interface scBaseMapper {

    int insertsc(sc object);

    int updatesc(sc object);

    int update(sc.UpdateBuilder object);

    List<sc> querysc(sc object);

    sc queryscLimit1(sc object);

}