package packageModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author DAO
*/
public class car implements Serializable {

    private static final long serialVersionUID = 1632808822975L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 
    * isNullAble:1
    */
    private Integer item_id;

    /**
    * 
    * isNullAble:1
    */
    private Integer user_id;

    /**
    * 
    * isNullAble:1
    */
    private Integer num;

    /**
    * 
    * isNullAble:1
    */
    private java.math.BigDecimal price;

    /**
    * 
    * isNullAble:1
    */
    private String total;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setItem_id(Integer item_id){this.item_id = item_id;}

    public Integer getItem_id(){return this.item_id;}

    public void setUser_id(Integer user_id){this.user_id = user_id;}

    public Integer getUser_id(){return this.user_id;}

    public void setNum(Integer num){this.num = num;}

    public Integer getNum(){return this.num;}

    public void setPrice(java.math.BigDecimal price){this.price = price;}

    public java.math.BigDecimal getPrice(){return this.price;}

    public void setTotal(String total){this.total = total;}

    public String getTotal(){return this.total;}
    @Override
    public String toString() {
        return "car{" +
                "id='" + id + '\'' +
                "item_id='" + item_id + '\'' +
                "user_id='" + user_id + '\'' +
                "num='" + num + '\'' +
                "price='" + price + '\'' +
                "total='" + total + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private car set;

        private ConditionBuilder where;

        public UpdateBuilder set(car set){
            this.set = set;
            return this;
        }

        public car getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends car{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> item_idList;

        public List<Integer> getItem_idList(){return this.item_idList;}

        private Integer item_idSt;

        private Integer item_idEd;

        public Integer getItem_idSt(){return this.item_idSt;}

        public Integer getItem_idEd(){return this.item_idEd;}

        private List<Integer> user_idList;

        public List<Integer> getUser_idList(){return this.user_idList;}

        private Integer user_idSt;

        private Integer user_idEd;

        public Integer getUser_idSt(){return this.user_idSt;}

        public Integer getUser_idEd(){return this.user_idEd;}

        private List<Integer> numList;

        public List<Integer> getNumList(){return this.numList;}

        private Integer numSt;

        private Integer numEd;

        public Integer getNumSt(){return this.numSt;}

        public Integer getNumEd(){return this.numEd;}

        private List<java.math.BigDecimal> priceList;

        public List<java.math.BigDecimal> getPriceList(){return this.priceList;}

        private java.math.BigDecimal priceSt;

        private java.math.BigDecimal priceEd;

        public java.math.BigDecimal getPriceSt(){return this.priceSt;}

        public java.math.BigDecimal getPriceEd(){return this.priceEd;}

        private List<String> totalList;

        public List<String> getTotalList(){return this.totalList;}


        private List<String> fuzzyTotal;

        public List<String> getFuzzyTotal(){return this.fuzzyTotal;}

        private List<String> rightFuzzyTotal;

        public List<String> getRightFuzzyTotal(){return this.rightFuzzyTotal;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder item_idBetWeen(Integer item_idSt,Integer item_idEd){
            this.item_idSt = item_idSt;
            this.item_idEd = item_idEd;
            return this;
        }

        public QueryBuilder item_idGreaterEqThan(Integer item_idSt){
            this.item_idSt = item_idSt;
            return this;
        }
        public QueryBuilder item_idLessEqThan(Integer item_idEd){
            this.item_idEd = item_idEd;
            return this;
        }


        public QueryBuilder item_id(Integer item_id){
            setItem_id(item_id);
            return this;
        }

        public QueryBuilder item_idList(Integer ... item_id){
            this.item_idList = solveNullList(item_id);
            return this;
        }

        public QueryBuilder item_idList(List<Integer> item_id){
            this.item_idList = item_id;
            return this;
        }

        public QueryBuilder fetchItem_id(){
            setFetchFields("fetchFields","item_id");
            return this;
        }

        public QueryBuilder excludeItem_id(){
            setFetchFields("excludeFields","item_id");
            return this;
        }

        public QueryBuilder user_idBetWeen(Integer user_idSt,Integer user_idEd){
            this.user_idSt = user_idSt;
            this.user_idEd = user_idEd;
            return this;
        }

        public QueryBuilder user_idGreaterEqThan(Integer user_idSt){
            this.user_idSt = user_idSt;
            return this;
        }
        public QueryBuilder user_idLessEqThan(Integer user_idEd){
            this.user_idEd = user_idEd;
            return this;
        }


        public QueryBuilder user_id(Integer user_id){
            setUser_id(user_id);
            return this;
        }

        public QueryBuilder user_idList(Integer ... user_id){
            this.user_idList = solveNullList(user_id);
            return this;
        }

        public QueryBuilder user_idList(List<Integer> user_id){
            this.user_idList = user_id;
            return this;
        }

        public QueryBuilder fetchUser_id(){
            setFetchFields("fetchFields","user_id");
            return this;
        }

        public QueryBuilder excludeUser_id(){
            setFetchFields("excludeFields","user_id");
            return this;
        }

        public QueryBuilder numBetWeen(Integer numSt,Integer numEd){
            this.numSt = numSt;
            this.numEd = numEd;
            return this;
        }

        public QueryBuilder numGreaterEqThan(Integer numSt){
            this.numSt = numSt;
            return this;
        }
        public QueryBuilder numLessEqThan(Integer numEd){
            this.numEd = numEd;
            return this;
        }


        public QueryBuilder num(Integer num){
            setNum(num);
            return this;
        }

        public QueryBuilder numList(Integer ... num){
            this.numList = solveNullList(num);
            return this;
        }

        public QueryBuilder numList(List<Integer> num){
            this.numList = num;
            return this;
        }

        public QueryBuilder fetchNum(){
            setFetchFields("fetchFields","num");
            return this;
        }

        public QueryBuilder excludeNum(){
            setFetchFields("excludeFields","num");
            return this;
        }

        public QueryBuilder priceBetWeen(java.math.BigDecimal priceSt,java.math.BigDecimal priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public QueryBuilder priceGreaterEqThan(java.math.BigDecimal priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public QueryBuilder priceLessEqThan(java.math.BigDecimal priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public QueryBuilder price(java.math.BigDecimal price){
            setPrice(price);
            return this;
        }

        public QueryBuilder priceList(java.math.BigDecimal ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public QueryBuilder priceList(List<java.math.BigDecimal> price){
            this.priceList = price;
            return this;
        }

        public QueryBuilder fetchPrice(){
            setFetchFields("fetchFields","price");
            return this;
        }

        public QueryBuilder excludePrice(){
            setFetchFields("excludeFields","price");
            return this;
        }

        public QueryBuilder fuzzyTotal (List<String> fuzzyTotal){
            this.fuzzyTotal = fuzzyTotal;
            return this;
        }

        public QueryBuilder fuzzyTotal (String ... fuzzyTotal){
            this.fuzzyTotal = solveNullList(fuzzyTotal);
            return this;
        }

        public QueryBuilder rightFuzzyTotal (List<String> rightFuzzyTotal){
            this.rightFuzzyTotal = rightFuzzyTotal;
            return this;
        }

        public QueryBuilder rightFuzzyTotal (String ... rightFuzzyTotal){
            this.rightFuzzyTotal = solveNullList(rightFuzzyTotal);
            return this;
        }

        public QueryBuilder total(String total){
            setTotal(total);
            return this;
        }

        public QueryBuilder totalList(String ... total){
            this.totalList = solveNullList(total);
            return this;
        }

        public QueryBuilder totalList(List<String> total){
            this.totalList = total;
            return this;
        }

        public QueryBuilder fetchTotal(){
            setFetchFields("fetchFields","total");
            return this;
        }

        public QueryBuilder excludeTotal(){
            setFetchFields("excludeFields","total");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public car build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> item_idList;

        public List<Integer> getItem_idList(){return this.item_idList;}

        private Integer item_idSt;

        private Integer item_idEd;

        public Integer getItem_idSt(){return this.item_idSt;}

        public Integer getItem_idEd(){return this.item_idEd;}

        private List<Integer> user_idList;

        public List<Integer> getUser_idList(){return this.user_idList;}

        private Integer user_idSt;

        private Integer user_idEd;

        public Integer getUser_idSt(){return this.user_idSt;}

        public Integer getUser_idEd(){return this.user_idEd;}

        private List<Integer> numList;

        public List<Integer> getNumList(){return this.numList;}

        private Integer numSt;

        private Integer numEd;

        public Integer getNumSt(){return this.numSt;}

        public Integer getNumEd(){return this.numEd;}

        private List<java.math.BigDecimal> priceList;

        public List<java.math.BigDecimal> getPriceList(){return this.priceList;}

        private java.math.BigDecimal priceSt;

        private java.math.BigDecimal priceEd;

        public java.math.BigDecimal getPriceSt(){return this.priceSt;}

        public java.math.BigDecimal getPriceEd(){return this.priceEd;}

        private List<String> totalList;

        public List<String> getTotalList(){return this.totalList;}


        private List<String> fuzzyTotal;

        public List<String> getFuzzyTotal(){return this.fuzzyTotal;}

        private List<String> rightFuzzyTotal;

        public List<String> getRightFuzzyTotal(){return this.rightFuzzyTotal;}

        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder item_idBetWeen(Integer item_idSt,Integer item_idEd){
            this.item_idSt = item_idSt;
            this.item_idEd = item_idEd;
            return this;
        }

        public ConditionBuilder item_idGreaterEqThan(Integer item_idSt){
            this.item_idSt = item_idSt;
            return this;
        }
        public ConditionBuilder item_idLessEqThan(Integer item_idEd){
            this.item_idEd = item_idEd;
            return this;
        }


        public ConditionBuilder item_idList(Integer ... item_id){
            this.item_idList = solveNullList(item_id);
            return this;
        }

        public ConditionBuilder item_idList(List<Integer> item_id){
            this.item_idList = item_id;
            return this;
        }

        public ConditionBuilder user_idBetWeen(Integer user_idSt,Integer user_idEd){
            this.user_idSt = user_idSt;
            this.user_idEd = user_idEd;
            return this;
        }

        public ConditionBuilder user_idGreaterEqThan(Integer user_idSt){
            this.user_idSt = user_idSt;
            return this;
        }
        public ConditionBuilder user_idLessEqThan(Integer user_idEd){
            this.user_idEd = user_idEd;
            return this;
        }


        public ConditionBuilder user_idList(Integer ... user_id){
            this.user_idList = solveNullList(user_id);
            return this;
        }

        public ConditionBuilder user_idList(List<Integer> user_id){
            this.user_idList = user_id;
            return this;
        }

        public ConditionBuilder numBetWeen(Integer numSt,Integer numEd){
            this.numSt = numSt;
            this.numEd = numEd;
            return this;
        }

        public ConditionBuilder numGreaterEqThan(Integer numSt){
            this.numSt = numSt;
            return this;
        }
        public ConditionBuilder numLessEqThan(Integer numEd){
            this.numEd = numEd;
            return this;
        }


        public ConditionBuilder numList(Integer ... num){
            this.numList = solveNullList(num);
            return this;
        }

        public ConditionBuilder numList(List<Integer> num){
            this.numList = num;
            return this;
        }

        public ConditionBuilder priceBetWeen(java.math.BigDecimal priceSt,java.math.BigDecimal priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public ConditionBuilder priceGreaterEqThan(java.math.BigDecimal priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public ConditionBuilder priceLessEqThan(java.math.BigDecimal priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public ConditionBuilder priceList(java.math.BigDecimal ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public ConditionBuilder priceList(List<java.math.BigDecimal> price){
            this.priceList = price;
            return this;
        }

        public ConditionBuilder fuzzyTotal (List<String> fuzzyTotal){
            this.fuzzyTotal = fuzzyTotal;
            return this;
        }

        public ConditionBuilder fuzzyTotal (String ... fuzzyTotal){
            this.fuzzyTotal = solveNullList(fuzzyTotal);
            return this;
        }

        public ConditionBuilder rightFuzzyTotal (List<String> rightFuzzyTotal){
            this.rightFuzzyTotal = rightFuzzyTotal;
            return this;
        }

        public ConditionBuilder rightFuzzyTotal (String ... rightFuzzyTotal){
            this.rightFuzzyTotal = solveNullList(rightFuzzyTotal);
            return this;
        }

        public ConditionBuilder totalList(String ... total){
            this.totalList = solveNullList(total);
            return this;
        }

        public ConditionBuilder totalList(List<String> total){
            this.totalList = total;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private car obj;

        public Builder(){
            this.obj = new car();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder item_id(Integer item_id){
            this.obj.setItem_id(item_id);
            return this;
        }
        public Builder user_id(Integer user_id){
            this.obj.setUser_id(user_id);
            return this;
        }
        public Builder num(Integer num){
            this.obj.setNum(num);
            return this;
        }
        public Builder price(java.math.BigDecimal price){
            this.obj.setPrice(price);
            return this;
        }
        public Builder total(String total){
            this.obj.setTotal(total);
            return this;
        }
        public car build(){return obj;}
    }

}
