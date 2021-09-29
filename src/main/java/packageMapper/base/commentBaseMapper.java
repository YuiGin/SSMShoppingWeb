package packageMapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import packageModel.comment;
/**
*  @author DAO
*/
public interface commentBaseMapper {

    int insertcomment(comment object);

    int updatecomment(comment object);

    int update(comment.UpdateBuilder object);

    List<comment> querycomment(comment object);

    comment querycommentLimit1(comment object);

}