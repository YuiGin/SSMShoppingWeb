package packageMapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import packageModel.user;
/**
*  @author DAO
*/
public interface userBaseMapper {

    int insertuser(user object);

    int updateuser(user object);

    int update(user.UpdateBuilder object);

    List<user> queryuser(user object);

    user queryuserLimit1(user object);

}