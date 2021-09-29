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
public class ItemOrder implements Serializable {

    private static final long serialVersionUID = 1632808914701L;


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
    private String code;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime addTime;

    /**
    * 
    * isNullAble:1
    */
    private String total;

    /**
    * 
    * isNullAble:1
    */
    private Integer isDelete;

    /**
    * 0.新建代发货1.已取消 2已已发货3.到收货4已评价
    * isNullAble:1
    */
    private Integer status;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setItem_id(Integer item_id){this.item_id = item_id;}

    public Integer getItem_id(){return this.item_id;}

    public void setUser_id(Integer user_id){this.user_id = user_id;}

    public Integer getUser_id(){return this.user_id;}

    public void setCode(String code){this.code = code;}

    public String getCode(){return this.code;}

    public void setAddTime(java.time.LocalDateTime addTime){this.addTime = addTime;}

    public java.time.LocalDateTime getAddTime(){return this.addTime;}

    public void setTotal(String total){this.total = total;}

    public String getTotal(){return this.total;}

    public void setIsDelete(Integer isDelete){this.isDelete = isDelete;}

    public Integer getIsDelete(){return this.isDelete;}

    public void setStatus(Integer status){this.status = status;}

    public Integer getStatus(){return this.status;}
    @Override
    public String toString() {
        return "ItemOrder{" +
                "id='" + id + '\'' +
                "item_id='" + item_id + '\'' +
                "user_id='" + user_id + '\'' +
                "code='" + code + '\'' +
                "addTime='" + addTime + '\'' +
                "total='" + total + '\'' +
                "isDelete='" + isDelete + '\'' +
                "status='" + status + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ItemOrder set;

        private ConditionBuilder where;

        public UpdateBuilder set(ItemOrder set){
            this.set = set;
            return this;
        }

        public ItemOrder getSet(){
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

    public static class QueryBuilder extends ItemOrder{
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

        private List<String> codeList;

        public List<String> getCodeList(){return this.codeList;}


        private List<String> fuzzyCode;

        public List<String> getFuzzyCode(){return this.fuzzyCode;}

        private List<String> rightFuzzyCode;

        public List<String> getRightFuzzyCode(){return this.rightFuzzyCode;}
        private List<java.time.LocalDateTime> addTimeList;

        public List<java.time.LocalDateTime> getAddTimeList(){return this.addTimeList;}

        private java.time.LocalDateTime addTimeSt;

        private java.time.LocalDateTime addTimeEd;

        public java.time.LocalDateTime getAddTimeSt(){return this.addTimeSt;}

        public java.time.LocalDateTime getAddTimeEd(){return this.addTimeEd;}

        private List<String> totalList;

        public List<String> getTotalList(){return this.totalList;}


        private List<String> fuzzyTotal;

        public List<String> getFuzzyTotal(){return this.fuzzyTotal;}

        private List<String> rightFuzzyTotal;

        public List<String> getRightFuzzyTotal(){return this.rightFuzzyTotal;}
        private List<Integer> isDeleteList;

        public List<Integer> getIsDeleteList(){return this.isDeleteList;}

        private Integer isDeleteSt;

        private Integer isDeleteEd;

        public Integer getIsDeleteSt(){return this.isDeleteSt;}

        public Integer getIsDeleteEd(){return this.isDeleteEd;}

        private List<Integer> statusList;

        public List<Integer> getStatusList(){return this.statusList;}

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){return this.statusSt;}

        public Integer getStatusEd(){return this.statusEd;}

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

        public QueryBuilder fuzzyCode (List<String> fuzzyCode){
            this.fuzzyCode = fuzzyCode;
            return this;
        }

        public QueryBuilder fuzzyCode (String ... fuzzyCode){
            this.fuzzyCode = solveNullList(fuzzyCode);
            return this;
        }

        public QueryBuilder rightFuzzyCode (List<String> rightFuzzyCode){
            this.rightFuzzyCode = rightFuzzyCode;
            return this;
        }

        public QueryBuilder rightFuzzyCode (String ... rightFuzzyCode){
            this.rightFuzzyCode = solveNullList(rightFuzzyCode);
            return this;
        }

        public QueryBuilder code(String code){
            setCode(code);
            return this;
        }

        public QueryBuilder codeList(String ... code){
            this.codeList = solveNullList(code);
            return this;
        }

        public QueryBuilder codeList(List<String> code){
            this.codeList = code;
            return this;
        }

        public QueryBuilder fetchCode(){
            setFetchFields("fetchFields","code");
            return this;
        }

        public QueryBuilder excludeCode(){
            setFetchFields("excludeFields","code");
            return this;
        }

        public QueryBuilder addTimeBetWeen(java.time.LocalDateTime addTimeSt,java.time.LocalDateTime addTimeEd){
            this.addTimeSt = addTimeSt;
            this.addTimeEd = addTimeEd;
            return this;
        }

        public QueryBuilder addTimeGreaterEqThan(java.time.LocalDateTime addTimeSt){
            this.addTimeSt = addTimeSt;
            return this;
        }
        public QueryBuilder addTimeLessEqThan(java.time.LocalDateTime addTimeEd){
            this.addTimeEd = addTimeEd;
            return this;
        }


        public QueryBuilder addTime(java.time.LocalDateTime addTime){
            setAddTime(addTime);
            return this;
        }

        public QueryBuilder addTimeList(java.time.LocalDateTime ... addTime){
            this.addTimeList = solveNullList(addTime);
            return this;
        }

        public QueryBuilder addTimeList(List<java.time.LocalDateTime> addTime){
            this.addTimeList = addTime;
            return this;
        }

        public QueryBuilder fetchAddTime(){
            setFetchFields("fetchFields","addTime");
            return this;
        }

        public QueryBuilder excludeAddTime(){
            setFetchFields("excludeFields","addTime");
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

        public QueryBuilder isDeleteBetWeen(Integer isDeleteSt,Integer isDeleteEd){
            this.isDeleteSt = isDeleteSt;
            this.isDeleteEd = isDeleteEd;
            return this;
        }

        public QueryBuilder isDeleteGreaterEqThan(Integer isDeleteSt){
            this.isDeleteSt = isDeleteSt;
            return this;
        }
        public QueryBuilder isDeleteLessEqThan(Integer isDeleteEd){
            this.isDeleteEd = isDeleteEd;
            return this;
        }


        public QueryBuilder isDelete(Integer isDelete){
            setIsDelete(isDelete);
            return this;
        }

        public QueryBuilder isDeleteList(Integer ... isDelete){
            this.isDeleteList = solveNullList(isDelete);
            return this;
        }

        public QueryBuilder isDeleteList(List<Integer> isDelete){
            this.isDeleteList = isDelete;
            return this;
        }

        public QueryBuilder fetchIsDelete(){
            setFetchFields("fetchFields","isDelete");
            return this;
        }

        public QueryBuilder excludeIsDelete(){
            setFetchFields("excludeFields","isDelete");
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

        public ItemOrder build(){return this;}
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

        private List<String> codeList;

        public List<String> getCodeList(){return this.codeList;}


        private List<String> fuzzyCode;

        public List<String> getFuzzyCode(){return this.fuzzyCode;}

        private List<String> rightFuzzyCode;

        public List<String> getRightFuzzyCode(){return this.rightFuzzyCode;}
        private List<java.time.LocalDateTime> addTimeList;

        public List<java.time.LocalDateTime> getAddTimeList(){return this.addTimeList;}

        private java.time.LocalDateTime addTimeSt;

        private java.time.LocalDateTime addTimeEd;

        public java.time.LocalDateTime getAddTimeSt(){return this.addTimeSt;}

        public java.time.LocalDateTime getAddTimeEd(){return this.addTimeEd;}

        private List<String> totalList;

        public List<String> getTotalList(){return this.totalList;}


        private List<String> fuzzyTotal;

        public List<String> getFuzzyTotal(){return this.fuzzyTotal;}

        private List<String> rightFuzzyTotal;

        public List<String> getRightFuzzyTotal(){return this.rightFuzzyTotal;}
        private List<Integer> isDeleteList;

        public List<Integer> getIsDeleteList(){return this.isDeleteList;}

        private Integer isDeleteSt;

        private Integer isDeleteEd;

        public Integer getIsDeleteSt(){return this.isDeleteSt;}

        public Integer getIsDeleteEd(){return this.isDeleteEd;}

        private List<Integer> statusList;

        public List<Integer> getStatusList(){return this.statusList;}

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){return this.statusSt;}

        public Integer getStatusEd(){return this.statusEd;}


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

        public ConditionBuilder fuzzyCode (List<String> fuzzyCode){
            this.fuzzyCode = fuzzyCode;
            return this;
        }

        public ConditionBuilder fuzzyCode (String ... fuzzyCode){
            this.fuzzyCode = solveNullList(fuzzyCode);
            return this;
        }

        public ConditionBuilder rightFuzzyCode (List<String> rightFuzzyCode){
            this.rightFuzzyCode = rightFuzzyCode;
            return this;
        }

        public ConditionBuilder rightFuzzyCode (String ... rightFuzzyCode){
            this.rightFuzzyCode = solveNullList(rightFuzzyCode);
            return this;
        }

        public ConditionBuilder codeList(String ... code){
            this.codeList = solveNullList(code);
            return this;
        }

        public ConditionBuilder codeList(List<String> code){
            this.codeList = code;
            return this;
        }

        public ConditionBuilder addTimeBetWeen(java.time.LocalDateTime addTimeSt,java.time.LocalDateTime addTimeEd){
            this.addTimeSt = addTimeSt;
            this.addTimeEd = addTimeEd;
            return this;
        }

        public ConditionBuilder addTimeGreaterEqThan(java.time.LocalDateTime addTimeSt){
            this.addTimeSt = addTimeSt;
            return this;
        }
        public ConditionBuilder addTimeLessEqThan(java.time.LocalDateTime addTimeEd){
            this.addTimeEd = addTimeEd;
            return this;
        }


        public ConditionBuilder addTimeList(java.time.LocalDateTime ... addTime){
            this.addTimeList = solveNullList(addTime);
            return this;
        }

        public ConditionBuilder addTimeList(List<java.time.LocalDateTime> addTime){
            this.addTimeList = addTime;
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

        public ConditionBuilder isDeleteBetWeen(Integer isDeleteSt,Integer isDeleteEd){
            this.isDeleteSt = isDeleteSt;
            this.isDeleteEd = isDeleteEd;
            return this;
        }

        public ConditionBuilder isDeleteGreaterEqThan(Integer isDeleteSt){
            this.isDeleteSt = isDeleteSt;
            return this;
        }
        public ConditionBuilder isDeleteLessEqThan(Integer isDeleteEd){
            this.isDeleteEd = isDeleteEd;
            return this;
        }


        public ConditionBuilder isDeleteList(Integer ... isDelete){
            this.isDeleteList = solveNullList(isDelete);
            return this;
        }

        public ConditionBuilder isDeleteList(List<Integer> isDelete){
            this.isDeleteList = isDelete;
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

        private ItemOrder obj;

        public Builder(){
            this.obj = new ItemOrder();
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
        public Builder code(String code){
            this.obj.setCode(code);
            return this;
        }
        public Builder addTime(java.time.LocalDateTime addTime){
            this.obj.setAddTime(addTime);
            return this;
        }
        public Builder total(String total){
            this.obj.setTotal(total);
            return this;
        }
        public Builder isDelete(Integer isDelete){
            this.obj.setIsDelete(isDelete);
            return this;
        }
        public Builder status(Integer status){
            this.obj.setStatus(status);
            return this;
        }
        public ItemOrder build(){return obj;}
    }

}
