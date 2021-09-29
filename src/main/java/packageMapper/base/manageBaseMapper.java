package packageMapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import packageModel.manage;
/**
*  @author DAO
*/
public interface manageBaseMapper {

    int insertmanage(manage object);

    int updatemanage(manage object);

    int update(manage.UpdateBuilder object);

    List<manage> querymanage(manage object);

    manage querymanageLimit1(manage object);

}