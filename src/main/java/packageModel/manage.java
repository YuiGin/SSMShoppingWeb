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
public class manage implements Serializable {

    private static final long serialVersionUID = 1632808918466L;


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
    private String userName;

    /**
    * 
    * isNullAble:1
    */
    private String passWord;

    /**
    * 
    * isNullAble:1
    */
    private String realName;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setUserName(String userName){this.userName = userName;}

    public String getUserName(){return this.userName;}

    public void setPassWord(String passWord){this.passWord = passWord;}

    public String getPassWord(){return this.passWord;}

    public void setRealName(String realName){this.realName = realName;}

    public String getRealName(){return this.realName;}
    @Override
    public String toString() {
        return "manage{" +
                "id='" + id + '\'' +
                "userName='" + userName + '\'' +
                "passWord='" + passWord + '\'' +
                "realName='" + realName + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private manage set;

        private ConditionBuilder where;

        public UpdateBuilder set(manage set){
            this.set = set;
            return this;
        }

        public manage getSet(){
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

    public static class QueryBuilder extends manage{
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

        private List<String> userNameList;

        public List<String> getUserNameList(){return this.userNameList;}


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName(){return this.fuzzyUserName;}

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName(){return this.rightFuzzyUserName;}
        private List<String> passWordList;

        public List<String> getPassWordList(){return this.passWordList;}


        private List<String> fuzzyPassWord;

        public List<String> getFuzzyPassWord(){return this.fuzzyPassWord;}

        private List<String> rightFuzzyPassWord;

        public List<String> getRightFuzzyPassWord(){return this.rightFuzzyPassWord;}
        private List<String> realNameList;

        public List<String> getRealNameList(){return this.realNameList;}


        private List<String> fuzzyRealName;

        public List<String> getFuzzyRealName(){return this.fuzzyRealName;}

        private List<String> rightFuzzyRealName;

        public List<String> getRightFuzzyRealName(){return this.rightFuzzyRealName;}
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

        public QueryBuilder fuzzyUserName (List<String> fuzzyUserName){
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public QueryBuilder fuzzyUserName (String ... fuzzyUserName){
            this.fuzzyUserName = solveNullList(fuzzyUserName);
            return this;
        }

        public QueryBuilder rightFuzzyUserName (List<String> rightFuzzyUserName){
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public QueryBuilder rightFuzzyUserName (String ... rightFuzzyUserName){
            this.rightFuzzyUserName = solveNullList(rightFuzzyUserName);
            return this;
        }

        public QueryBuilder userName(String userName){
            setUserName(userName);
            return this;
        }

        public QueryBuilder userNameList(String ... userName){
            this.userNameList = solveNullList(userName);
            return this;
        }

        public QueryBuilder userNameList(List<String> userName){
            this.userNameList = userName;
            return this;
        }

        public QueryBuilder fetchUserName(){
            setFetchFields("fetchFields","userName");
            return this;
        }

        public QueryBuilder excludeUserName(){
            setFetchFields("excludeFields","userName");
            return this;
        }

        public QueryBuilder fuzzyPassWord (List<String> fuzzyPassWord){
            this.fuzzyPassWord = fuzzyPassWord;
            return this;
        }

        public QueryBuilder fuzzyPassWord (String ... fuzzyPassWord){
            this.fuzzyPassWord = solveNullList(fuzzyPassWord);
            return this;
        }

        public QueryBuilder rightFuzzyPassWord (List<String> rightFuzzyPassWord){
            this.rightFuzzyPassWord = rightFuzzyPassWord;
            return this;
        }

        public QueryBuilder rightFuzzyPassWord (String ... rightFuzzyPassWord){
            this.rightFuzzyPassWord = solveNullList(rightFuzzyPassWord);
            return this;
        }

        public QueryBuilder passWord(String passWord){
            setPassWord(passWord);
            return this;
        }

        public QueryBuilder passWordList(String ... passWord){
            this.passWordList = solveNullList(passWord);
            return this;
        }

        public QueryBuilder passWordList(List<String> passWord){
            this.passWordList = passWord;
            return this;
        }

        public QueryBuilder fetchPassWord(){
            setFetchFields("fetchFields","passWord");
            return this;
        }

        public QueryBuilder excludePassWord(){
            setFetchFields("excludeFields","passWord");
            return this;
        }

        public QueryBuilder fuzzyRealName (List<String> fuzzyRealName){
            this.fuzzyRealName = fuzzyRealName;
            return this;
        }

        public QueryBuilder fuzzyRealName (String ... fuzzyRealName){
            this.fuzzyRealName = solveNullList(fuzzyRealName);
            return this;
        }

        public QueryBuilder rightFuzzyRealName (List<String> rightFuzzyRealName){
            this.rightFuzzyRealName = rightFuzzyRealName;
            return this;
        }

        public QueryBuilder rightFuzzyRealName (String ... rightFuzzyRealName){
            this.rightFuzzyRealName = solveNullList(rightFuzzyRealName);
            return this;
        }

        public QueryBuilder realName(String realName){
            setRealName(realName);
            return this;
        }

        public QueryBuilder realNameList(String ... realName){
            this.realNameList = solveNullList(realName);
            return this;
        }

        public QueryBuilder realNameList(List<String> realName){
            this.realNameList = realName;
            return this;
        }

        public QueryBuilder fetchRealName(){
            setFetchFields("fetchFields","realName");
            return this;
        }

        public QueryBuilder excludeRealName(){
            setFetchFields("excludeFields","realName");
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

        public manage build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> userNameList;

        public List<String> getUserNameList(){return this.userNameList;}


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName(){return this.fuzzyUserName;}

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName(){return this.rightFuzzyUserName;}
        private List<String> passWordList;

        public List<String> getPassWordList(){return this.passWordList;}


        private List<String> fuzzyPassWord;

        public List<String> getFuzzyPassWord(){return this.fuzzyPassWord;}

        private List<String> rightFuzzyPassWord;

        public List<String> getRightFuzzyPassWord(){return this.rightFuzzyPassWord;}
        private List<String> realNameList;

        public List<String> getRealNameList(){return this.realNameList;}


        private List<String> fuzzyRealName;

        public List<String> getFuzzyRealName(){return this.fuzzyRealName;}

        private List<String> rightFuzzyRealName;

        public List<String> getRightFuzzyRealName(){return this.rightFuzzyRealName;}

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

        public ConditionBuilder fuzzyUserName (List<String> fuzzyUserName){
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public ConditionBuilder fuzzyUserName (String ... fuzzyUserName){
            this.fuzzyUserName = solveNullList(fuzzyUserName);
            return this;
        }

        public ConditionBuilder rightFuzzyUserName (List<String> rightFuzzyUserName){
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public ConditionBuilder rightFuzzyUserName (String ... rightFuzzyUserName){
            this.rightFuzzyUserName = solveNullList(rightFuzzyUserName);
            return this;
        }

        public ConditionBuilder userNameList(String ... userName){
            this.userNameList = solveNullList(userName);
            return this;
        }

        public ConditionBuilder userNameList(List<String> userName){
            this.userNameList = userName;
            return this;
        }

        public ConditionBuilder fuzzyPassWord (List<String> fuzzyPassWord){
            this.fuzzyPassWord = fuzzyPassWord;
            return this;
        }

        public ConditionBuilder fuzzyPassWord (String ... fuzzyPassWord){
            this.fuzzyPassWord = solveNullList(fuzzyPassWord);
            return this;
        }

        public ConditionBuilder rightFuzzyPassWord (List<String> rightFuzzyPassWord){
            this.rightFuzzyPassWord = rightFuzzyPassWord;
            return this;
        }

        public ConditionBuilder rightFuzzyPassWord (String ... rightFuzzyPassWord){
            this.rightFuzzyPassWord = solveNullList(rightFuzzyPassWord);
            return this;
        }

        public ConditionBuilder passWordList(String ... passWord){
            this.passWordList = solveNullList(passWord);
            return this;
        }

        public ConditionBuilder passWordList(List<String> passWord){
            this.passWordList = passWord;
            return this;
        }

        public ConditionBuilder fuzzyRealName (List<String> fuzzyRealName){
            this.fuzzyRealName = fuzzyRealName;
            return this;
        }

        public ConditionBuilder fuzzyRealName (String ... fuzzyRealName){
            this.fuzzyRealName = solveNullList(fuzzyRealName);
            return this;
        }

        public ConditionBuilder rightFuzzyRealName (List<String> rightFuzzyRealName){
            this.rightFuzzyRealName = rightFuzzyRealName;
            return this;
        }

        public ConditionBuilder rightFuzzyRealName (String ... rightFuzzyRealName){
            this.rightFuzzyRealName = solveNullList(rightFuzzyRealName);
            return this;
        }

        public ConditionBuilder realNameList(String ... realName){
            this.realNameList = solveNullList(realName);
            return this;
        }

        public ConditionBuilder realNameList(List<String> realName){
            this.realNameList = realName;
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

        private manage obj;

        public Builder(){
            this.obj = new manage();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder userName(String userName){
            this.obj.setUserName(userName);
            return this;
        }
        public Builder passWord(String passWord){
            this.obj.setPassWord(passWord);
            return this;
        }
        public Builder realName(String realName){
            this.obj.setRealName(realName);
            return this;
        }
        public manage build(){return obj;}
    }

}
