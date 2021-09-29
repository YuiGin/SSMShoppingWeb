package packageMapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import packageModel.news;
/**
*  @author DAO
*/
public interface newsBaseMapper {

    int insertnews(news object);

    int updatenews(news object);

    int update(news.UpdateBuilder object);

    List<news> querynews(news object);

    news querynewsLimit1(news object);

}