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
public class OrderDetail implements Serializable {

    private static final long serialVersionUID = 1632808928411L;


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
    private Integer order_id;

    /**
    * 0.未退货 1已退货
    * isNullAble:1
    */
    private Integer status;

    /**
    * 
    * isNullAble:1
    */
    private Integer num;

    /**
    * 
    * isNullAble:1
    */
    private String total;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setItem_id(Integer item_id){this.item_id = item_id;}

    public Integer getItem_id(){return this.item_id;}

    public void setOrder_id(Integer order_id){this.order_id = order_id;}

    public Integer getOrder_id(){return this.order_id;}

    public void setStatus(Integer status){this.status = status;}

    public Integer getStatus(){return this.status;}

    public void setNum(Integer num){this.num = num;}

    public Integer getNum(){return this.num;}

    public void setTotal(String total){this.total = total;}

    public String getTotal(){return this.total;}
    @Override
    public String toString() {
        return "OrderDetail{" +
                "id='" + id + '\'' +
                "item_id='" + item_id + '\'' +
                "order_id='" + order_id + '\'' +
                "status='" + status + '\'' +
                "num='" + num + '\'' +
                "total='" + total + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private OrderDetail set;

        private ConditionBuilder where;

        public UpdateBuilder set(OrderDetail set){
            this.set = set;
            return this;
        }

        public OrderDetail getSet(){
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

    public static class QueryBuilder extends OrderDetail{
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

        private List<Integer> order_idList;

        public List<Integer> getOrder_idList(){return this.order_idList;}

        private Integer order_idSt;

        private Integer order_idEd;

        public Integer getOrder_idSt(){return this.order_idSt;}

        public Integer getOrder_idEd(){return this.order_idEd;}

        private List<Integer> statusList;

        public List<Integer> getStatusList(){return this.statusList;}

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){return this.statusSt;}

        public Integer getStatusEd(){return this.statusEd;}

        private List<Integer> numList;

        public List<Integer> getNumList(){return this.numList;}

        private Integer numSt;

        private Integer numEd;

        public Integer getNumSt(){return this.numSt;}

        public Integer getNumEd(){return this.numEd;}

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

        public QueryBuilder order_idBetWeen(Integer order_idSt,Integer order_idEd){
            this.order_idSt = order_idSt;
            this.order_idEd = order_idEd;
            return this;
        }

        public QueryBuilder order_idGreaterEqThan(Integer order_idSt){
            this.order_idSt = order_idSt;
            return this;
        }
        public QueryBuilder order_idLessEqThan(Integer order_idEd){
            this.order_idEd = order_idEd;
            return this;
        }


        public QueryBuilder order_id(Integer order_id){
            setOrder_id(order_id);
            return this;
        }

        public QueryBuilder order_idList(Integer ... order_id){
            this.order_idList = solveNullList(order_id);
            return this;
        }

        public QueryBuilder order_idList(List<Integer> order_id){
            this.order_idList = order_id;
            return this;
        }

        public QueryBuilder fetchOrder_id(){
            setFetchFields("fetchFields","order_id");
            return this;
        }

        public QueryBuilder excludeOrder_id(){
            setFetchFields("excludeFields","order_id");
            return this;
        }

        public QueryBuilder statusBetWeen(Integer statusSt,Integer statusEd){
            this.statusSt = statusSt;
            this.statusEd = statusEd;
            return this;
        }

        public QueryBuilder statusGreaterEqThan(Integer statusSt){
            this.statusSt = statusSt;
            return this;
        }
        public QueryBuilder statusLessEqThan(Integer statusEd){
            this.statusEd = statusEd;
            return this;
        }


        public QueryBuilder status(Integer status){
            setStatus(status);
            return this;
        }

        public QueryBuilder statusList(Integer ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public QueryBuilder statusList(List<Integer> status){
            this.statusList = status;
            return this;
        }

        public QueryBuilder fetchStatus(){
            setFetchFields("fetchFields","status");
            return this;
        }

        public QueryBuilder excludeStatus(){
            setFetchFields("excludeFields","status");
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

        public OrderDetail build(){return this;}
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

        private List<Integer> order_idList;

        public List<Integer> getOrder_idList(){return this.order_idList;}

        private Integer order_idSt;

        private Integer order_idEd;

        public Integer getOrder_idSt(){return this.order_idSt;}

        public Integer getOrder_idEd(){return this.order_idEd;}

        private List<Integer> statusList;

        public List<Integer> getStatusList(){return this.statusList;}

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){return this.statusSt;}

        public Integer getStatusEd(){return this.statusEd;}

        private List<Integer> numList;

        public List<Integer> getNumList(){return this.numList;}

        private Integer numSt;

        private Integer numEd;

        public Integer getNumSt(){return this.numSt;}

        public Integer getNumEd(){return this.numEd;}

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

        public ConditionBuilder order_idBetWeen(Integer order_idSt,Integer order_idEd){
            this.order_idSt = order_idSt;
            this.order_idEd = order_idEd;
            return this;
        }

        public ConditionBuilder order_idGreaterEqThan(Integer order_idSt){
            this.order_idSt = order_idSt;
            return this;
        }
        public ConditionBuilder order_idLessEqThan(Integer order_idEd){
            this.order_idEd = order_idEd;
            return this;
        }


        public ConditionBuilder order_idList(Integer ... order_id){
            this.order_idList = solveNullList(order_id);
            return this;
        }

        public ConditionBuilder order_idList(List<Integer> order_id){
            this.order_idList = order_id;
            return this;
        }

        public ConditionBuilder statusBetWeen(Integer statusSt,Integer statusEd){
            this.statusSt = statusSt;
            this.statusEd = statusEd;
            return this;
        }

        public ConditionBuilder statusGreaterEqThan(Integer statusSt){
            this.statusSt = statusSt;
            return this;
        }
        public ConditionBuilder statusLessEqThan(Integer statusEd){
            this.statusEd = statusEd;
            return this;
        }


        public ConditionBuilder statusList(Integer ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public ConditionBuilder statusList(List<Integer> status){
            this.statusList = status;
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

        private OrderDetail obj;

        public Builder(){
            this.obj = new OrderDetail();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder item_id(Integer item_id){
            this.obj.setItem_id(item_id);
            return this;
        }
        public Builder order_id(Integer order_id){
            this.obj.setOrder_id(order_id);
            return this;
        }
        public Builder status(Integer status){
            this.obj.setStatus(status);
            return this;
        }
        public Builder num(Integer num){
            this.obj.setNum(num);
            return this;
        }
        public Builder total(String total){
            this.obj.setTotal(total);
            return this;
        }
        public OrderDetail build(){return obj;}
    }

}
