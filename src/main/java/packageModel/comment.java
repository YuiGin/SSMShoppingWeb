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
public class comment implements Serializable {

    private static final long serialVersionUID = 1632808904252L;


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
    private Integer user_id;

    /**
    * 
    * isNullAble:1
    */
    private Integer item_id;

    /**
    * 
    * isNullAble:1
    */
    private String content;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime addTime;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setUser_id(Integer user_id){this.user_id = user_id;}

    public Integer getUser_id(){return this.user_id;}

    public void setItem_id(Integer item_id){this.item_id = item_id;}

    public Integer getItem_id(){return this.item_id;}

    public void setContent(String content){this.content = content;}

    public String getContent(){return this.content;}

    public void setAddTime(java.time.LocalDateTime addTime){this.addTime = addTime;}

    public java.time.LocalDateTime getAddTime(){return this.addTime;}
    @Override
    public String toString() {
        return "comment{" +
                "id='" + id + '\'' +
                "user_id='" + user_id + '\'' +
                "item_id='" + item_id + '\'' +
                "content='" + content + '\'' +
                "addTime='" + addTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private comment set;

        private ConditionBuilder where;

        public UpdateBuilder set(comment set){
            this.set = set;
            return this;
        }

        public comment getSet(){
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

    public static class QueryBuilder extends comment{
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

        private List<Integer> user_idList;

        public List<Integer> getUser_idList(){return this.user_idList;}

        private Integer user_idSt;

        private Integer user_idEd;

        public Integer getUser_idSt(){return this.user_idSt;}

        public Integer getUser_idEd(){return this.user_idEd;}

        private List<Integer> item_idList;

        public List<Integer> getItem_idList(){return this.item_idList;}

        private Integer item_idSt;

        private Integer item_idEd;

        public Integer getItem_idSt(){return this.item_idSt;}

        public Integer getItem_idEd(){return this.item_idEd;}

        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}
        private List<java.time.LocalDateTime> addTimeList;

        public List<java.time.LocalDateTime> getAddTimeList(){return this.addTimeList;}

        private java.time.LocalDateTime addTimeSt;

        private java.time.LocalDateTime addTimeEd;

        public java.time.LocalDateTime getAddTimeSt(){return this.addTimeSt;}

        public java.time.LocalDateTime getAddTimeEd(){return this.addTimeEd;}

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

        public QueryBuilder fuzzyContent (List<String> fuzzyContent){
            this.fuzzyContent = fuzzyContent;
            return this;
        }

        public QueryBuilder fuzzyContent (String ... fuzzyContent){
            this.fuzzyContent = solveNullList(fuzzyContent);
            return this;
        }

        public QueryBuilder rightFuzzyContent (List<String> rightFuzzyContent){
            this.rightFuzzyContent = rightFuzzyContent;
            return this;
        }

        public QueryBuilder rightFuzzyContent (String ... rightFuzzyContent){
            this.rightFuzzyContent = solveNullList(rightFuzzyContent);
            return this;
        }

        public QueryBuilder content(String content){
            setContent(content);
            return this;
        }

        public QueryBuilder contentList(String ... content){
            this.contentList = solveNullList(content);
            return this;
        }

        public QueryBuilder contentList(List<String> content){
            this.contentList = content;
            return this;
        }

        public QueryBuilder fetchContent(){
            setFetchFields("fetchFields","content");
            return this;
        }

        public QueryBuilder excludeContent(){
            setFetchFields("excludeFields","content");
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

        public comment build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> user_idList;

        public List<Integer> getUser_idList(){return this.user_idList;}

        private Integer user_idSt;

        private Integer user_idEd;

        public Integer getUser_idSt(){return this.user_idSt;}

        public Integer getUser_idEd(){return this.user_idEd;}

        private List<Integer> item_idList;

        public List<Integer> getItem_idList(){return this.item_idList;}

        private Integer item_idSt;

        private Integer item_idEd;

        public Integer getItem_idSt(){return this.item_idSt;}

        public Integer getItem_idEd(){return this.item_idEd;}

        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}
        private List<java.time.LocalDateTime> addTimeList;

        public List<java.time.LocalDateTime> getAddTimeList(){return this.addTimeList;}

        private java.time.LocalDateTime addTimeSt;

        private java.time.LocalDateTime addTimeEd;

        public java.time.LocalDateTime getAddTimeSt(){return this.addTimeSt;}

        public java.time.LocalDateTime getAddTimeEd(){return this.addTimeEd;}


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

        public ConditionBuilder fuzzyContent (List<String> fuzzyContent){
            this.fuzzyContent = fuzzyContent;
            return this;
        }

        public ConditionBuilder fuzzyContent (String ... fuzzyContent){
            this.fuzzyContent = solveNullList(fuzzyContent);
            return this;
        }

        public ConditionBuilder rightFuzzyContent (List<String> rightFuzzyContent){
            this.rightFuzzyContent = rightFuzzyContent;
            return this;
        }

        public ConditionBuilder rightFuzzyContent (String ... rightFuzzyContent){
            this.rightFuzzyContent = solveNullList(rightFuzzyContent);
            return this;
        }

        public ConditionBuilder contentList(String ... content){
            this.contentList = solveNullList(content);
            return this;
        }

        public ConditionBuilder contentList(List<String> content){
            this.contentList = content;
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

        private comment obj;

        public Builder(){
            this.obj = new comment();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder user_id(Integer user_id){
            this.obj.setUser_id(user_id);
            return this;
        }
        public Builder item_id(Integer item_id){
            this.obj.setItem_id(item_id);
            return this;
        }
        public Builder content(String content){
            this.obj.setContent(content);
            return this;
        }
        public Builder addTime(java.time.LocalDateTime addTime){
            this.obj.setAddTime(addTime);
            return this;
        }
        public comment build(){return obj;}
    }

}
