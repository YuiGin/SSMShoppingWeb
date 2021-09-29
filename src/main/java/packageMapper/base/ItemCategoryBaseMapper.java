package packageMapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import packageModel.ItemCategory;
/**
*  @author DAO
*/
public interface ItemCategoryBaseMapper {

    int insertItemCategory(ItemCategory object);

    int updateItemCategory(ItemCategory object);

    int update(ItemCategory.UpdateBuilder object);

    List<ItemCategory> queryItemCategory(ItemCategory object);

    ItemCategory queryItemCategoryLimit1(ItemCategory object);

}