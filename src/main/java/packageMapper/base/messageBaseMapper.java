package packageMapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import packageModel.message;
/**
*  @author DAO
*/
public interface messageBaseMapper {

    int insertmessage(message object);

    int updatemessage(message object);

    int update(message.UpdateBuilder object);

    List<message> querymessage(message object);

    message querymessageLimit1(message object);

}