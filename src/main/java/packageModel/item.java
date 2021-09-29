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
public class item implements Serializable {

    private static final long serialVersionUID = 1632808907203L;


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
    private String name;

    /**
    * 
    * isNullAble:1
    */
    private String price;

    /**
    * 收藏数
    * isNullAble:1
    */
    private Integer scNum;

    /**
    * 购买数
    * isNullAble:1
    */
    private Integer gmNum;

    /**
    * 
    * isNullAble:1
    */
    private String url1;

    /**
    * 
    * isNullAble:1
    */
    private String url2;

    /**
    * 
    * isNullAble:1
    */
    private String url3;

    /**
    * 
    * isNullAble:1
    */
    private String url4;

    /**
    * 
    * isNullAble:1
    */
    private String url5;

    /**
    * 
    * isNullAble:1
    */
    private String ms;

    /**
    * 参数1
    * isNullAble:1
    */
    private String pam1;

    /**
    * 参数2
    * isNullAble:1
    */
    private String pam2;

    /**
    * 参数3
    * isNullAble:1
    */
    private String pam3;

    /**
    * 值3
    * isNullAble:1
    */
    private String val3;

    /**
    * 值2
    * isNullAble:1
    */
    private String val2;

    /**
    * 值1
    * isNullAble:1
    */
    private String val1;

    /**
    * 
    * isNullAble:1
    */
    private Integer type;

    /**
    * 折扣
    * isNullAble:1
    */
    private Integer zk;

    /**
    * 类别id
    * isNullAble:1
    */
    private Integer category_id_one;

    /**
    * 类别2级
    * isNullAble:1
    */
    private Integer category_id_two;

    /**
    * 0否 1是
    * isNullAble:1
    */
    private Integer isDelete;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setPrice(String price){this.price = price;}

    public String getPrice(){return this.price;}

    public void setScNum(Integer scNum){this.scNum = scNum;}

    public Integer getScNum(){return this.scNum;}

    public void setGmNum(Integer gmNum){this.gmNum = gmNum;}

    public Integer getGmNum(){return this.gmNum;}

    public void setUrl1(String url1){this.url1 = url1;}

    public String getUrl1(){return this.url1;}

    public void setUrl2(String url2){this.url2 = url2;}

    public String getUrl2(){return this.url2;}

    public void setUrl3(String url3){this.url3 = url3;}

    public String getUrl3(){return this.url3;}

    public void setUrl4(String url4){this.url4 = url4;}

    public String getUrl4(){return this.url4;}

    public void setUrl5(String url5){this.url5 = url5;}

    public String getUrl5(){return this.url5;}

    public void setMs(String ms){this.ms = ms;}

    public String getMs(){return this.ms;}

    public void setPam1(String pam1){this.pam1 = pam1;}

    public String getPam1(){return this.pam1;}

    public void setPam2(String pam2){this.pam2 = pam2;}

    public String getPam2(){return this.pam2;}

    public void setPam3(String pam3){this.pam3 = pam3;}

    public String getPam3(){return this.pam3;}

    public void setVal3(String val3){this.val3 = val3;}

    public String getVal3(){return this.val3;}

    public void setVal2(String val2){this.val2 = val2;}

    public String getVal2(){return this.val2;}

    public void setVal1(String val1){this.val1 = val1;}

    public String getVal1(){return this.val1;}

    public void setType(Integer type){this.type = type;}

    public Integer getType(){return this.type;}

    public void setZk(Integer zk){this.zk = zk;}

    public Integer getZk(){return this.zk;}

    public void setCategory_id_one(Integer category_id_one){this.category_id_one = category_id_one;}

    public Integer getCategory_id_one(){return this.category_id_one;}

    public void setCategory_id_two(Integer category_id_two){this.category_id_two = category_id_two;}

    public Integer getCategory_id_two(){return this.category_id_two;}

    public void setIsDelete(Integer isDelete){this.isDelete = isDelete;}

    public Integer getIsDelete(){return this.isDelete;}
    @Override
    public String toString() {
        return "item{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "price='" + price + '\'' +
                "scNum='" + scNum + '\'' +
                "gmNum='" + gmNum + '\'' +
                "url1='" + url1 + '\'' +
                "url2='" + url2 + '\'' +
                "url3='" + url3 + '\'' +
                "url4='" + url4 + '\'' +
                "url5='" + url5 + '\'' +
                "ms='" + ms + '\'' +
                "pam1='" + pam1 + '\'' +
                "pam2='" + pam2 + '\'' +
                "pam3='" + pam3 + '\'' +
                "val3='" + val3 + '\'' +
                "val2='" + val2 + '\'' +
                "val1='" + val1 + '\'' +
                "type='" + type + '\'' +
                "zk='" + zk + '\'' +
                "category_id_one='" + category_id_one + '\'' +
                "category_id_two='" + category_id_two + '\'' +
                "isDelete='" + isDelete + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private item set;

        private ConditionBuilder where;

        public UpdateBuilder set(item set){
            this.set = set;
            return this;
        }

        public item getSet(){
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

    public static class QueryBuilder extends item{
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

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> priceList;

        public List<String> getPriceList(){return this.priceList;}


        private List<String> fuzzyPrice;

        public List<String> getFuzzyPrice(){return this.fuzzyPrice;}

        private List<String> rightFuzzyPrice;

        public List<String> getRightFuzzyPrice(){return this.rightFuzzyPrice;}
        private List<Integer> scNumList;

        public List<Integer> getScNumList(){return this.scNumList;}

        private Integer scNumSt;

        private Integer scNumEd;

        public Integer getScNumSt(){return this.scNumSt;}

        public Integer getScNumEd(){return this.scNumEd;}

        private List<Integer> gmNumList;

        public List<Integer> getGmNumList(){return this.gmNumList;}

        private Integer gmNumSt;

        private Integer gmNumEd;

        public Integer getGmNumSt(){return this.gmNumSt;}

        public Integer getGmNumEd(){return this.gmNumEd;}

        private List<String> url1List;

        public List<String> getUrl1List(){return this.url1List;}


        private List<String> fuzzyUrl1;

        public List<String> getFuzzyUrl1(){return this.fuzzyUrl1;}

        private List<String> rightFuzzyUrl1;

        public List<String> getRightFuzzyUrl1(){return this.rightFuzzyUrl1;}
        private List<String> url2List;

        public List<String> getUrl2List(){return this.url2List;}


        private List<String> fuzzyUrl2;

        public List<String> getFuzzyUrl2(){return this.fuzzyUrl2;}

        private List<String> rightFuzzyUrl2;

        public List<String> getRightFuzzyUrl2(){return this.rightFuzzyUrl2;}
        private List<String> url3List;

        public List<String> getUrl3List(){return this.url3List;}


        private List<String> fuzzyUrl3;

        public List<String> getFuzzyUrl3(){return this.fuzzyUrl3;}

        private List<String> rightFuzzyUrl3;

        public List<String> getRightFuzzyUrl3(){return this.rightFuzzyUrl3;}
        private List<String> url4List;

        public List<String> getUrl4List(){return this.url4List;}


        private List<String> fuzzyUrl4;

        public List<String> getFuzzyUrl4(){return this.fuzzyUrl4;}

        private List<String> rightFuzzyUrl4;

        public List<String> getRightFuzzyUrl4(){return this.rightFuzzyUrl4;}
        private List<String> url5List;

        public List<String> getUrl5List(){return this.url5List;}


        private List<String> fuzzyUrl5;

        public List<String> getFuzzyUrl5(){return this.fuzzyUrl5;}

        private List<String> rightFuzzyUrl5;

        public List<String> getRightFuzzyUrl5(){return this.rightFuzzyUrl5;}
        private List<String> msList;

        public List<String> getMsList(){return this.msList;}


        private List<String> fuzzyMs;

        public List<String> getFuzzyMs(){return this.fuzzyMs;}

        private List<String> rightFuzzyMs;

        public List<String> getRightFuzzyMs(){return this.rightFuzzyMs;}
        private List<String> pam1List;

        public List<String> getPam1List(){return this.pam1List;}


        private List<String> fuzzyPam1;

        public List<String> getFuzzyPam1(){return this.fuzzyPam1;}

        private List<String> rightFuzzyPam1;

        public List<String> getRightFuzzyPam1(){return this.rightFuzzyPam1;}
        private List<String> pam2List;

        public List<String> getPam2List(){return this.pam2List;}


        private List<String> fuzzyPam2;

        public List<String> getFuzzyPam2(){return this.fuzzyPam2;}

        private List<String> rightFuzzyPam2;

        public List<String> getRightFuzzyPam2(){return this.rightFuzzyPam2;}
        private List<String> pam3List;

        public List<String> getPam3List(){return this.pam3List;}


        private List<String> fuzzyPam3;

        public List<String> getFuzzyPam3(){return this.fuzzyPam3;}

        private List<String> rightFuzzyPam3;

        public List<String> getRightFuzzyPam3(){return this.rightFuzzyPam3;}
        private List<String> val3List;

        public List<String> getVal3List(){return this.val3List;}


        private List<String> fuzzyVal3;

        public List<String> getFuzzyVal3(){return this.fuzzyVal3;}

        private List<String> rightFuzzyVal3;

        public List<String> getRightFuzzyVal3(){return this.rightFuzzyVal3;}
        private List<String> val2List;

        public List<String> getVal2List(){return this.val2List;}


        private List<String> fuzzyVal2;

        public List<String> getFuzzyVal2(){return this.fuzzyVal2;}

        private List<String> rightFuzzyVal2;

        public List<String> getRightFuzzyVal2(){return this.rightFuzzyVal2;}
        private List<String> val1List;

        public List<String> getVal1List(){return this.val1List;}


        private List<String> fuzzyVal1;

        public List<String> getFuzzyVal1(){return this.fuzzyVal1;}

        private List<String> rightFuzzyVal1;

        public List<String> getRightFuzzyVal1(){return this.rightFuzzyVal1;}
        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<Integer> zkList;

        public List<Integer> getZkList(){return this.zkList;}

        private Integer zkSt;

        private Integer zkEd;

        public Integer getZkSt(){return this.zkSt;}

        public Integer getZkEd(){return this.zkEd;}

        private List<Integer> category_id_oneList;

        public List<Integer> getCategory_id_oneList(){return this.category_id_oneList;}

        private Integer category_id_oneSt;

        private Integer category_id_oneEd;

        public Integer getCategory_id_oneSt(){return this.category_id_oneSt;}

        public Integer getCategory_id_oneEd(){return this.category_id_oneEd;}

        private List<Integer> category_id_twoList;

        public List<Integer> getCategory_id_twoList(){return this.category_id_twoList;}

        private Integer category_id_twoSt;

        private Integer category_id_twoEd;

        public Integer getCategory_id_twoSt(){return this.category_id_twoSt;}

        public Integer getCategory_id_twoEd(){return this.category_id_twoEd;}

        private List<Integer> isDeleteList;

        public List<Integer> getIsDeleteList(){return this.isDeleteList;}

        private Integer isDeleteSt;

        private Integer isDeleteEd;

        public Integer getIsDeleteSt(){return this.isDeleteSt;}

        public Integer getIsDeleteEd(){return this.isDeleteEd;}

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

        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }

        public QueryBuilder fuzzyPrice (List<String> fuzzyPrice){
            this.fuzzyPrice = fuzzyPrice;
            return this;
        }

        public QueryBuilder fuzzyPrice (String ... fuzzyPrice){
            this.fuzzyPrice = solveNullList(fuzzyPrice);
            return this;
        }

        public QueryBuilder rightFuzzyPrice (List<String> rightFuzzyPrice){
            this.rightFuzzyPrice = rightFuzzyPrice;
            return this;
        }

        public QueryBuilder rightFuzzyPrice (String ... rightFuzzyPrice){
            this.rightFuzzyPrice = solveNullList(rightFuzzyPrice);
            return this;
        }

        public QueryBuilder price(String price){
            setPrice(price);
            return this;
        }

        public QueryBuilder priceList(String ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public QueryBuilder priceList(List<String> price){
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

        public QueryBuilder scNumBetWeen(Integer scNumSt,Integer scNumEd){
            this.scNumSt = scNumSt;
            this.scNumEd = scNumEd;
            return this;
        }

        public QueryBuilder scNumGreaterEqThan(Integer scNumSt){
            this.scNumSt = scNumSt;
            return this;
        }
        public QueryBuilder scNumLessEqThan(Integer scNumEd){
            this.scNumEd = scNumEd;
            return this;
        }


        public QueryBuilder scNum(Integer scNum){
            setScNum(scNum);
            return this;
        }

        public QueryBuilder scNumList(Integer ... scNum){
            this.scNumList = solveNullList(scNum);
            return this;
        }

        public QueryBuilder scNumList(List<Integer> scNum){
            this.scNumList = scNum;
            return this;
        }

        public QueryBuilder fetchScNum(){
            setFetchFields("fetchFields","scNum");
            return this;
        }

        public QueryBuilder excludeScNum(){
            setFetchFields("excludeFields","scNum");
            return this;
        }

        public QueryBuilder gmNumBetWeen(Integer gmNumSt,Integer gmNumEd){
            this.gmNumSt = gmNumSt;
            this.gmNumEd = gmNumEd;
            return this;
        }

        public QueryBuilder gmNumGreaterEqThan(Integer gmNumSt){
            this.gmNumSt = gmNumSt;
            return this;
        }
        public QueryBuilder gmNumLessEqThan(Integer gmNumEd){
            this.gmNumEd = gmNumEd;
            return this;
        }


        public QueryBuilder gmNum(Integer gmNum){
            setGmNum(gmNum);
            return this;
        }

        public QueryBuilder gmNumList(Integer ... gmNum){
            this.gmNumList = solveNullList(gmNum);
            return this;
        }

        public QueryBuilder gmNumList(List<Integer> gmNum){
            this.gmNumList = gmNum;
            return this;
        }

        public QueryBuilder fetchGmNum(){
            setFetchFields("fetchFields","gmNum");
            return this;
        }

        public QueryBuilder excludeGmNum(){
            setFetchFields("excludeFields","gmNum");
            return this;
        }

        public QueryBuilder fuzzyUrl1 (List<String> fuzzyUrl1){
            this.fuzzyUrl1 = fuzzyUrl1;
            return this;
        }

        public QueryBuilder fuzzyUrl1 (String ... fuzzyUrl1){
            this.fuzzyUrl1 = solveNullList(fuzzyUrl1);
            return this;
        }

        public QueryBuilder rightFuzzyUrl1 (List<String> rightFuzzyUrl1){
            this.rightFuzzyUrl1 = rightFuzzyUrl1;
            return this;
        }

        public QueryBuilder rightFuzzyUrl1 (String ... rightFuzzyUrl1){
            this.rightFuzzyUrl1 = solveNullList(rightFuzzyUrl1);
            return this;
        }

        public QueryBuilder url1(String url1){
            setUrl1(url1);
            return this;
        }

        public QueryBuilder url1List(String ... url1){
            this.url1List = solveNullList(url1);
            return this;
        }

        public QueryBuilder url1List(List<String> url1){
            this.url1List = url1;
            return this;
        }

        public QueryBuilder fetchUrl1(){
            setFetchFields("fetchFields","url1");
            return this;
        }

        public QueryBuilder excludeUrl1(){
            setFetchFields("excludeFields","url1");
            return this;
        }

        public QueryBuilder fuzzyUrl2 (List<String> fuzzyUrl2){
            this.fuzzyUrl2 = fuzzyUrl2;
            return this;
        }

        public QueryBuilder fuzzyUrl2 (String ... fuzzyUrl2){
            this.fuzzyUrl2 = solveNullList(fuzzyUrl2);
            return this;
        }

        public QueryBuilder rightFuzzyUrl2 (List<String> rightFuzzyUrl2){
            this.rightFuzzyUrl2 = rightFuzzyUrl2;
            return this;
        }

        public QueryBuilder rightFuzzyUrl2 (String ... rightFuzzyUrl2){
            this.rightFuzzyUrl2 = solveNullList(rightFuzzyUrl2);
            return this;
        }

        public QueryBuilder url2(String url2){
            setUrl2(url2);
            return this;
        }

        public QueryBuilder url2List(String ... url2){
            this.url2List = solveNullList(url2);
            return this;
        }

        public QueryBuilder url2List(List<String> url2){
            this.url2List = url2;
            return this;
        }

        public QueryBuilder fetchUrl2(){
            setFetchFields("fetchFields","url2");
            return this;
        }

        public QueryBuilder excludeUrl2(){
            setFetchFields("excludeFields","url2");
            return this;
        }

        public QueryBuilder fuzzyUrl3 (List<String> fuzzyUrl3){
            this.fuzzyUrl3 = fuzzyUrl3;
            return this;
        }

        public QueryBuilder fuzzyUrl3 (String ... fuzzyUrl3){
            this.fuzzyUrl3 = solveNullList(fuzzyUrl3);
            return this;
        }

        public QueryBuilder rightFuzzyUrl3 (List<String> rightFuzzyUrl3){
            this.rightFuzzyUrl3 = rightFuzzyUrl3;
            return this;
        }

        public QueryBuilder rightFuzzyUrl3 (String ... rightFuzzyUrl3){
            this.rightFuzzyUrl3 = solveNullList(rightFuzzyUrl3);
            return this;
        }

        public QueryBuilder url3(String url3){
            setUrl3(url3);
            return this;
        }

        public QueryBuilder url3List(String ... url3){
            this.url3List = solveNullList(url3);
            return this;
        }

        public QueryBuilder url3List(List<String> url3){
            this.url3List = url3;
            return this;
        }

        public QueryBuilder fetchUrl3(){
            setFetchFields("fetchFields","url3");
            return this;
        }

        public QueryBuilder excludeUrl3(){
            setFetchFields("excludeFields","url3");
            return this;
        }

        public QueryBuilder fuzzyUrl4 (List<String> fuzzyUrl4){
            this.fuzzyUrl4 = fuzzyUrl4;
            return this;
        }

        public QueryBuilder fuzzyUrl4 (String ... fuzzyUrl4){
            this.fuzzyUrl4 = solveNullList(fuzzyUrl4);
            return this;
        }

        public QueryBuilder rightFuzzyUrl4 (List<String> rightFuzzyUrl4){
            this.rightFuzzyUrl4 = rightFuzzyUrl4;
            return this;
        }

        public QueryBuilder rightFuzzyUrl4 (String ... rightFuzzyUrl4){
            this.rightFuzzyUrl4 = solveNullList(rightFuzzyUrl4);
            return this;
        }

        public QueryBuilder url4(String url4){
            setUrl4(url4);
            return this;
        }

        public QueryBuilder url4List(String ... url4){
            this.url4List = solveNullList(url4);
            return this;
        }

        public QueryBuilder url4List(List<String> url4){
            this.url4List = url4;
            return this;
        }

        public QueryBuilder fetchUrl4(){
            setFetchFields("fetchFields","url4");
            return this;
        }

        public QueryBuilder excludeUrl4(){
            setFetchFields("excludeFields","url4");
            return this;
        }

        public QueryBuilder fuzzyUrl5 (List<String> fuzzyUrl5){
            this.fuzzyUrl5 = fuzzyUrl5;
            return this;
        }

        public QueryBuilder fuzzyUrl5 (String ... fuzzyUrl5){
            this.fuzzyUrl5 = solveNullList(fuzzyUrl5);
            return this;
        }

        public QueryBuilder rightFuzzyUrl5 (List<String> rightFuzzyUrl5){
            this.rightFuzzyUrl5 = rightFuzzyUrl5;
            return this;
        }

        public QueryBuilder rightFuzzyUrl5 (String ... rightFuzzyUrl5){
            this.rightFuzzyUrl5 = solveNullList(rightFuzzyUrl5);
            return this;
        }

        public QueryBuilder url5(String url5){
            setUrl5(url5);
            return this;
        }

        public QueryBuilder url5List(String ... url5){
            this.url5List = solveNullList(url5);
            return this;
        }

        public QueryBuilder url5List(List<String> url5){
            this.url5List = url5;
            return this;
        }

        public QueryBuilder fetchUrl5(){
            setFetchFields("fetchFields","url5");
            return this;
        }

        public QueryBuilder excludeUrl5(){
            setFetchFields("excludeFields","url5");
            return this;
        }

        public QueryBuilder fuzzyMs (List<String> fuzzyMs){
            this.fuzzyMs = fuzzyMs;
            return this;
        }

        public QueryBuilder fuzzyMs (String ... fuzzyMs){
            this.fuzzyMs = solveNullList(fuzzyMs);
            return this;
        }

        public QueryBuilder rightFuzzyMs (List<String> rightFuzzyMs){
            this.rightFuzzyMs = rightFuzzyMs;
            return this;
        }

        public QueryBuilder rightFuzzyMs (String ... rightFuzzyMs){
            this.rightFuzzyMs = solveNullList(rightFuzzyMs);
            return this;
        }

        public QueryBuilder ms(String ms){
            setMs(ms);
            return this;
        }

        public QueryBuilder msList(String ... ms){
            this.msList = solveNullList(ms);
            return this;
        }

        public QueryBuilder msList(List<String> ms){
            this.msList = ms;
            return this;
        }

        public QueryBuilder fetchMs(){
            setFetchFields("fetchFields","ms");
            return this;
        }

        public QueryBuilder excludeMs(){
            setFetchFields("excludeFields","ms");
            return this;
        }

        public QueryBuilder fuzzyPam1 (List<String> fuzzyPam1){
            this.fuzzyPam1 = fuzzyPam1;
            return this;
        }

        public QueryBuilder fuzzyPam1 (String ... fuzzyPam1){
            this.fuzzyPam1 = solveNullList(fuzzyPam1);
            return this;
        }

        public QueryBuilder rightFuzzyPam1 (List<String> rightFuzzyPam1){
            this.rightFuzzyPam1 = rightFuzzyPam1;
            return this;
        }

        public QueryBuilder rightFuzzyPam1 (String ... rightFuzzyPam1){
            this.rightFuzzyPam1 = solveNullList(rightFuzzyPam1);
            return this;
        }

        public QueryBuilder pam1(String pam1){
            setPam1(pam1);
            return this;
        }

        public QueryBuilder pam1List(String ... pam1){
            this.pam1List = solveNullList(pam1);
            return this;
        }

        public QueryBuilder pam1List(List<String> pam1){
            this.pam1List = pam1;
            return this;
        }

        public QueryBuilder fetchPam1(){
            setFetchFields("fetchFields","pam1");
            return this;
        }

        public QueryBuilder excludePam1(){
            setFetchFields("excludeFields","pam1");
            return this;
        }

        public QueryBuilder fuzzyPam2 (List<String> fuzzyPam2){
            this.fuzzyPam2 = fuzzyPam2;
            return this;
        }

        public QueryBuilder fuzzyPam2 (String ... fuzzyPam2){
            this.fuzzyPam2 = solveNullList(fuzzyPam2);
            return this;
        }

        public QueryBuilder rightFuzzyPam2 (List<String> rightFuzzyPam2){
            this.rightFuzzyPam2 = rightFuzzyPam2;
            return this;
        }

        public QueryBuilder rightFuzzyPam2 (String ... rightFuzzyPam2){
            this.rightFuzzyPam2 = solveNullList(rightFuzzyPam2);
            return this;
        }

        public QueryBuilder pam2(String pam2){
            setPam2(pam2);
            return this;
        }

        public QueryBuilder pam2List(String ... pam2){
            this.pam2List = solveNullList(pam2);
            return this;
        }

        public QueryBuilder pam2List(List<String> pam2){
            this.pam2List = pam2;
            return this;
        }

        public QueryBuilder fetchPam2(){
            setFetchFields("fetchFields","pam2");
            return this;
        }

        public QueryBuilder excludePam2(){
            setFetchFields("excludeFields","pam2");
            return this;
        }

        public QueryBuilder fuzzyPam3 (List<String> fuzzyPam3){
            this.fuzzyPam3 = fuzzyPam3;
            return this;
        }

        public QueryBuilder fuzzyPam3 (String ... fuzzyPam3){
            this.fuzzyPam3 = solveNullList(fuzzyPam3);
            return this;
        }

        public QueryBuilder rightFuzzyPam3 (List<String> rightFuzzyPam3){
            this.rightFuzzyPam3 = rightFuzzyPam3;
            return this;
        }

        public QueryBuilder rightFuzzyPam3 (String ... rightFuzzyPam3){
            this.rightFuzzyPam3 = solveNullList(rightFuzzyPam3);
            return this;
        }

        public QueryBuilder pam3(String pam3){
            setPam3(pam3);
            return this;
        }

        public QueryBuilder pam3List(String ... pam3){
            this.pam3List = solveNullList(pam3);
            return this;
        }

        public QueryBuilder pam3List(List<String> pam3){
            this.pam3List = pam3;
            return this;
        }

        public QueryBuilder fetchPam3(){
            setFetchFields("fetchFields","pam3");
            return this;
        }

        public QueryBuilder excludePam3(){
            setFetchFields("excludeFields","pam3");
            return this;
        }

        public QueryBuilder fuzzyVal3 (List<String> fuzzyVal3){
            this.fuzzyVal3 = fuzzyVal3;
            return this;
        }

        public QueryBuilder fuzzyVal3 (String ... fuzzyVal3){
            this.fuzzyVal3 = solveNullList(fuzzyVal3);
            return this;
        }

        public QueryBuilder rightFuzzyVal3 (List<String> rightFuzzyVal3){
            this.rightFuzzyVal3 = rightFuzzyVal3;
            return this;
        }

        public QueryBuilder rightFuzzyVal3 (String ... rightFuzzyVal3){
            this.rightFuzzyVal3 = solveNullList(rightFuzzyVal3);
            return this;
        }

        public QueryBuilder val3(String val3){
            setVal3(val3);
            return this;
        }

        public QueryBuilder val3List(String ... val3){
            this.val3List = solveNullList(val3);
            return this;
        }

        public QueryBuilder val3List(List<String> val3){
            this.val3List = val3;
            return this;
        }

        public QueryBuilder fetchVal3(){
            setFetchFields("fetchFields","val3");
            return this;
        }

        public QueryBuilder excludeVal3(){
            setFetchFields("excludeFields","val3");
            return this;
        }

        public QueryBuilder fuzzyVal2 (List<String> fuzzyVal2){
            this.fuzzyVal2 = fuzzyVal2;
            return this;
        }

        public QueryBuilder fuzzyVal2 (String ... fuzzyVal2){
            this.fuzzyVal2 = solveNullList(fuzzyVal2);
            return this;
        }

        public QueryBuilder rightFuzzyVal2 (List<String> rightFuzzyVal2){
            this.rightFuzzyVal2 = rightFuzzyVal2;
            return this;
        }

        public QueryBuilder rightFuzzyVal2 (String ... rightFuzzyVal2){
            this.rightFuzzyVal2 = solveNullList(rightFuzzyVal2);
            return this;
        }

        public QueryBuilder val2(String val2){
            setVal2(val2);
            return this;
        }

        public QueryBuilder val2List(String ... val2){
            this.val2List = solveNullList(val2);
            return this;
        }

        public QueryBuilder val2List(List<String> val2){
            this.val2List = val2;
            return this;
        }

        public QueryBuilder fetchVal2(){
            setFetchFields("fetchFields","val2");
            return this;
        }

        public QueryBuilder excludeVal2(){
            setFetchFields("excludeFields","val2");
            return this;
        }

        public QueryBuilder fuzzyVal1 (List<String> fuzzyVal1){
            this.fuzzyVal1 = fuzzyVal1;
            return this;
        }

        public QueryBuilder fuzzyVal1 (String ... fuzzyVal1){
            this.fuzzyVal1 = solveNullList(fuzzyVal1);
            return this;
        }

        public QueryBuilder rightFuzzyVal1 (List<String> rightFuzzyVal1){
            this.rightFuzzyVal1 = rightFuzzyVal1;
            return this;
        }

        public QueryBuilder rightFuzzyVal1 (String ... rightFuzzyVal1){
            this.rightFuzzyVal1 = solveNullList(rightFuzzyVal1);
            return this;
        }

        public QueryBuilder val1(String val1){
            setVal1(val1);
            return this;
        }

        public QueryBuilder val1List(String ... val1){
            this.val1List = solveNullList(val1);
            return this;
        }

        public QueryBuilder val1List(List<String> val1){
            this.val1List = val1;
            return this;
        }

        public QueryBuilder fetchVal1(){
            setFetchFields("fetchFields","val1");
            return this;
        }

        public QueryBuilder excludeVal1(){
            setFetchFields("excludeFields","val1");
            return this;
        }

        public QueryBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public QueryBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public QueryBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public QueryBuilder type(Integer type){
            setType(type);
            return this;
        }

        public QueryBuilder typeList(Integer ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public QueryBuilder typeList(List<Integer> type){
            this.typeList = type;
            return this;
        }

        public QueryBuilder fetchType(){
            setFetchFields("fetchFields","type");
            return this;
        }

        public QueryBuilder excludeType(){
            setFetchFields("excludeFields","type");
            return this;
        }

        public QueryBuilder zkBetWeen(Integer zkSt,Integer zkEd){
            this.zkSt = zkSt;
            this.zkEd = zkEd;
            return this;
        }

        public QueryBuilder zkGreaterEqThan(Integer zkSt){
            this.zkSt = zkSt;
            return this;
        }
        public QueryBuilder zkLessEqThan(Integer zkEd){
            this.zkEd = zkEd;
            return this;
        }


        public QueryBuilder zk(Integer zk){
            setZk(zk);
            return this;
        }

        public QueryBuilder zkList(Integer ... zk){
            this.zkList = solveNullList(zk);
            return this;
        }

        public QueryBuilder zkList(List<Integer> zk){
            this.zkList = zk;
            return this;
        }

        public QueryBuilder fetchZk(){
            setFetchFields("fetchFields","zk");
            return this;
        }

        public QueryBuilder excludeZk(){
            setFetchFields("excludeFields","zk");
            return this;
        }

        public QueryBuilder category_id_oneBetWeen(Integer category_id_oneSt,Integer category_id_oneEd){
            this.category_id_oneSt = category_id_oneSt;
            this.category_id_oneEd = category_id_oneEd;
            return this;
        }

        public QueryBuilder category_id_oneGreaterEqThan(Integer category_id_oneSt){
            this.category_id_oneSt = category_id_oneSt;
            return this;
        }
        public QueryBuilder category_id_oneLessEqThan(Integer category_id_oneEd){
            this.category_id_oneEd = category_id_oneEd;
            return this;
        }


        public QueryBuilder category_id_one(Integer category_id_one){
            setCategory_id_one(category_id_one);
            return this;
        }

        public QueryBuilder category_id_oneList(Integer ... category_id_one){
            this.category_id_oneList = solveNullList(category_id_one);
            return this;
        }

        public QueryBuilder category_id_oneList(List<Integer> category_id_one){
            this.category_id_oneList = category_id_one;
            return this;
        }

        public QueryBuilder fetchCategory_id_one(){
            setFetchFields("fetchFields","category_id_one");
            return this;
        }

        public QueryBuilder excludeCategory_id_one(){
            setFetchFields("excludeFields","category_id_one");
            return this;
        }

        public QueryBuilder category_id_twoBetWeen(Integer category_id_twoSt,Integer category_id_twoEd){
            this.category_id_twoSt = category_id_twoSt;
            this.category_id_twoEd = category_id_twoEd;
            return this;
        }

        public QueryBuilder category_id_twoGreaterEqThan(Integer category_id_twoSt){
            this.category_id_twoSt = category_id_twoSt;
            return this;
        }
        public QueryBuilder category_id_twoLessEqThan(Integer category_id_twoEd){
            this.category_id_twoEd = category_id_twoEd;
            return this;
        }


        public QueryBuilder category_id_two(Integer category_id_two){
            setCategory_id_two(category_id_two);
            return this;
        }

        public QueryBuilder category_id_twoList(Integer ... category_id_two){
            this.category_id_twoList = solveNullList(category_id_two);
            return this;
        }

        public QueryBuilder category_id_twoList(List<Integer> category_id_two){
            this.category_id_twoList = category_id_two;
            return this;
        }

        public QueryBuilder fetchCategory_id_two(){
            setFetchFields("fetchFields","category_id_two");
            return this;
        }

        public QueryBuilder excludeCategory_id_two(){
            setFetchFields("excludeFields","category_id_two");
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

        public item build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> priceList;

        public List<String> getPriceList(){return this.priceList;}


        private List<String> fuzzyPrice;

        public List<String> getFuzzyPrice(){return this.fuzzyPrice;}

        private List<String> rightFuzzyPrice;

        public List<String> getRightFuzzyPrice(){return this.rightFuzzyPrice;}
        private List<Integer> scNumList;

        public List<Integer> getScNumList(){return this.scNumList;}

        private Integer scNumSt;

        private Integer scNumEd;

        public Integer getScNumSt(){return this.scNumSt;}

        public Integer getScNumEd(){return this.scNumEd;}

        private List<Integer> gmNumList;

        public List<Integer> getGmNumList(){return this.gmNumList;}

        private Integer gmNumSt;

        private Integer gmNumEd;

        public Integer getGmNumSt(){return this.gmNumSt;}

        public Integer getGmNumEd(){return this.gmNumEd;}

        private List<String> url1List;

        public List<String> getUrl1List(){return this.url1List;}


        private List<String> fuzzyUrl1;

        public List<String> getFuzzyUrl1(){return this.fuzzyUrl1;}

        private List<String> rightFuzzyUrl1;

        public List<String> getRightFuzzyUrl1(){return this.rightFuzzyUrl1;}
        private List<String> url2List;

        public List<String> getUrl2List(){return this.url2List;}


        private List<String> fuzzyUrl2;

        public List<String> getFuzzyUrl2(){return this.fuzzyUrl2;}

        private List<String> rightFuzzyUrl2;

        public List<String> getRightFuzzyUrl2(){return this.rightFuzzyUrl2;}
        private List<String> url3List;

        public List<String> getUrl3List(){return this.url3List;}


        private List<String> fuzzyUrl3;

        public List<String> getFuzzyUrl3(){return this.fuzzyUrl3;}

        private List<String> rightFuzzyUrl3;

        public List<String> getRightFuzzyUrl3(){return this.rightFuzzyUrl3;}
        private List<String> url4List;

        public List<String> getUrl4List(){return this.url4List;}


        private List<String> fuzzyUrl4;

        public List<String> getFuzzyUrl4(){return this.fuzzyUrl4;}

        private List<String> rightFuzzyUrl4;

        public List<String> getRightFuzzyUrl4(){return this.rightFuzzyUrl4;}
        private List<String> url5List;

        public List<String> getUrl5List(){return this.url5List;}


        private List<String> fuzzyUrl5;

        public List<String> getFuzzyUrl5(){return this.fuzzyUrl5;}

        private List<String> rightFuzzyUrl5;

        public List<String> getRightFuzzyUrl5(){return this.rightFuzzyUrl5;}
        private List<String> msList;

        public List<String> getMsList(){return this.msList;}


        private List<String> fuzzyMs;

        public List<String> getFuzzyMs(){return this.fuzzyMs;}

        private List<String> rightFuzzyMs;

        public List<String> getRightFuzzyMs(){return this.rightFuzzyMs;}
        private List<String> pam1List;

        public List<String> getPam1List(){return this.pam1List;}


        private List<String> fuzzyPam1;

        public List<String> getFuzzyPam1(){return this.fuzzyPam1;}

        private List<String> rightFuzzyPam1;

        public List<String> getRightFuzzyPam1(){return this.rightFuzzyPam1;}
        private List<String> pam2List;

        public List<String> getPam2List(){return this.pam2List;}


        private List<String> fuzzyPam2;

        public List<String> getFuzzyPam2(){return this.fuzzyPam2;}

        private List<String> rightFuzzyPam2;

        public List<String> getRightFuzzyPam2(){return this.rightFuzzyPam2;}
        private List<String> pam3List;

        public List<String> getPam3List(){return this.pam3List;}


        private List<String> fuzzyPam3;

        public List<String> getFuzzyPam3(){return this.fuzzyPam3;}

        private List<String> rightFuzzyPam3;

        public List<String> getRightFuzzyPam3(){return this.rightFuzzyPam3;}
        private List<String> val3List;

        public List<String> getVal3List(){return this.val3List;}


        private List<String> fuzzyVal3;

        public List<String> getFuzzyVal3(){return this.fuzzyVal3;}

        private List<String> rightFuzzyVal3;

        public List<String> getRightFuzzyVal3(){return this.rightFuzzyVal3;}
        private List<String> val2List;

        public List<String> getVal2List(){return this.val2List;}


        private List<String> fuzzyVal2;

        public List<String> getFuzzyVal2(){return this.fuzzyVal2;}

        private List<String> rightFuzzyVal2;

        public List<String> getRightFuzzyVal2(){return this.rightFuzzyVal2;}
        private List<String> val1List;

        public List<String> getVal1List(){return this.val1List;}


        private List<String> fuzzyVal1;

        public List<String> getFuzzyVal1(){return this.fuzzyVal1;}

        private List<String> rightFuzzyVal1;

        public List<String> getRightFuzzyVal1(){return this.rightFuzzyVal1;}
        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<Integer> zkList;

        public List<Integer> getZkList(){return this.zkList;}

        private Integer zkSt;

        private Integer zkEd;

        public Integer getZkSt(){return this.zkSt;}

        public Integer getZkEd(){return this.zkEd;}

        private List<Integer> category_id_oneList;

        public List<Integer> getCategory_id_oneList(){return this.category_id_oneList;}

        private Integer category_id_oneSt;

        private Integer category_id_oneEd;

        public Integer getCategory_id_oneSt(){return this.category_id_oneSt;}

        public Integer getCategory_id_oneEd(){return this.category_id_oneEd;}

        private List<Integer> category_id_twoList;

        public List<Integer> getCategory_id_twoList(){return this.category_id_twoList;}

        private Integer category_id_twoSt;

        private Integer category_id_twoEd;

        public Integer getCategory_id_twoSt(){return this.category_id_twoSt;}

        public Integer getCategory_id_twoEd(){return this.category_id_twoEd;}

        private List<Integer> isDeleteList;

        public List<Integer> getIsDeleteList(){return this.isDeleteList;}

        private Integer isDeleteSt;

        private Integer isDeleteEd;

        public Integer getIsDeleteSt(){return this.isDeleteSt;}

        public Integer getIsDeleteEd(){return this.isDeleteEd;}


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

        public ConditionBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public ConditionBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public ConditionBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public ConditionBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public ConditionBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public ConditionBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public ConditionBuilder fuzzyPrice (List<String> fuzzyPrice){
            this.fuzzyPrice = fuzzyPrice;
            return this;
        }

        public ConditionBuilder fuzzyPrice (String ... fuzzyPrice){
            this.fuzzyPrice = solveNullList(fuzzyPrice);
            return this;
        }

        public ConditionBuilder rightFuzzyPrice (List<String> rightFuzzyPrice){
            this.rightFuzzyPrice = rightFuzzyPrice;
            return this;
        }

        public ConditionBuilder rightFuzzyPrice (String ... rightFuzzyPrice){
            this.rightFuzzyPrice = solveNullList(rightFuzzyPrice);
            return this;
        }

        public ConditionBuilder priceList(String ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public ConditionBuilder priceList(List<String> price){
            this.priceList = price;
            return this;
        }

        public ConditionBuilder scNumBetWeen(Integer scNumSt,Integer scNumEd){
            this.scNumSt = scNumSt;
            this.scNumEd = scNumEd;
            return this;
        }

        public ConditionBuilder scNumGreaterEqThan(Integer scNumSt){
            this.scNumSt = scNumSt;
            return this;
        }
        public ConditionBuilder scNumLessEqThan(Integer scNumEd){
            this.scNumEd = scNumEd;
            return this;
        }


        public ConditionBuilder scNumList(Integer ... scNum){
            this.scNumList = solveNullList(scNum);
            return this;
        }

        public ConditionBuilder scNumList(List<Integer> scNum){
            this.scNumList = scNum;
            return this;
        }

        public ConditionBuilder gmNumBetWeen(Integer gmNumSt,Integer gmNumEd){
            this.gmNumSt = gmNumSt;
            this.gmNumEd = gmNumEd;
            return this;
        }

        public ConditionBuilder gmNumGreaterEqThan(Integer gmNumSt){
            this.gmNumSt = gmNumSt;
            return this;
        }
        public ConditionBuilder gmNumLessEqThan(Integer gmNumEd){
            this.gmNumEd = gmNumEd;
            return this;
        }


        public ConditionBuilder gmNumList(Integer ... gmNum){
            this.gmNumList = solveNullList(gmNum);
            return this;
        }

        public ConditionBuilder gmNumList(List<Integer> gmNum){
            this.gmNumList = gmNum;
            return this;
        }

        public ConditionBuilder fuzzyUrl1 (List<String> fuzzyUrl1){
            this.fuzzyUrl1 = fuzzyUrl1;
            return this;
        }

        public ConditionBuilder fuzzyUrl1 (String ... fuzzyUrl1){
            this.fuzzyUrl1 = solveNullList(fuzzyUrl1);
            return this;
        }

        public ConditionBuilder rightFuzzyUrl1 (List<String> rightFuzzyUrl1){
            this.rightFuzzyUrl1 = rightFuzzyUrl1;
            return this;
        }

        public ConditionBuilder rightFuzzyUrl1 (String ... rightFuzzyUrl1){
            this.rightFuzzyUrl1 = solveNullList(rightFuzzyUrl1);
            return this;
        }

        public ConditionBuilder url1List(String ... url1){
            this.url1List = solveNullList(url1);
            return this;
        }

        public ConditionBuilder url1List(List<String> url1){
            this.url1List = url1;
            return this;
        }

        public ConditionBuilder fuzzyUrl2 (List<String> fuzzyUrl2){
            this.fuzzyUrl2 = fuzzyUrl2;
            return this;
        }

        public ConditionBuilder fuzzyUrl2 (String ... fuzzyUrl2){
            this.fuzzyUrl2 = solveNullList(fuzzyUrl2);
            return this;
        }

        public ConditionBuilder rightFuzzyUrl2 (List<String> rightFuzzyUrl2){
            this.rightFuzzyUrl2 = rightFuzzyUrl2;
            return this;
        }

        public ConditionBuilder rightFuzzyUrl2 (String ... rightFuzzyUrl2){
            this.rightFuzzyUrl2 = solveNullList(rightFuzzyUrl2);
            return this;
        }

        public ConditionBuilder url2List(String ... url2){
            this.url2List = solveNullList(url2);
            return this;
        }

        public ConditionBuilder url2List(List<String> url2){
            this.url2List = url2;
            return this;
        }

        public ConditionBuilder fuzzyUrl3 (List<String> fuzzyUrl3){
            this.fuzzyUrl3 = fuzzyUrl3;
            return this;
        }

        public ConditionBuilder fuzzyUrl3 (String ... fuzzyUrl3){
            this.fuzzyUrl3 = solveNullList(fuzzyUrl3);
            return this;
        }

        public ConditionBuilder rightFuzzyUrl3 (List<String> rightFuzzyUrl3){
            this.rightFuzzyUrl3 = rightFuzzyUrl3;
            return this;
        }

        public ConditionBuilder rightFuzzyUrl3 (String ... rightFuzzyUrl3){
            this.rightFuzzyUrl3 = solveNullList(rightFuzzyUrl3);
            return this;
        }

        public ConditionBuilder url3List(String ... url3){
            this.url3List = solveNullList(url3);
            return this;
        }

        public ConditionBuilder url3List(List<String> url3){
            this.url3List = url3;
            return this;
        }

        public ConditionBuilder fuzzyUrl4 (List<String> fuzzyUrl4){
            this.fuzzyUrl4 = fuzzyUrl4;
            return this;
        }

        public ConditionBuilder fuzzyUrl4 (String ... fuzzyUrl4){
            this.fuzzyUrl4 = solveNullList(fuzzyUrl4);
            return this;
        }

        public ConditionBuilder rightFuzzyUrl4 (List<String> rightFuzzyUrl4){
            this.rightFuzzyUrl4 = rightFuzzyUrl4;
            return this;
        }

        public ConditionBuilder rightFuzzyUrl4 (String ... rightFuzzyUrl4){
            this.rightFuzzyUrl4 = solveNullList(rightFuzzyUrl4);
            return this;
        }

        public ConditionBuilder url4List(String ... url4){
            this.url4List = solveNullList(url4);
            return this;
        }

        public ConditionBuilder url4List(List<String> url4){
            this.url4List = url4;
            return this;
        }

        public ConditionBuilder fuzzyUrl5 (List<String> fuzzyUrl5){
            this.fuzzyUrl5 = fuzzyUrl5;
            return this;
        }

        public ConditionBuilder fuzzyUrl5 (String ... fuzzyUrl5){
            this.fuzzyUrl5 = solveNullList(fuzzyUrl5);
            return this;
        }

        public ConditionBuilder rightFuzzyUrl5 (List<String> rightFuzzyUrl5){
            this.rightFuzzyUrl5 = rightFuzzyUrl5;
            return this;
        }

        public ConditionBuilder rightFuzzyUrl5 (String ... rightFuzzyUrl5){
            this.rightFuzzyUrl5 = solveNullList(rightFuzzyUrl5);
            return this;
        }

        public ConditionBuilder url5List(String ... url5){
            this.url5List = solveNullList(url5);
            return this;
        }

        public ConditionBuilder url5List(List<String> url5){
            this.url5List = url5;
            return this;
        }

        public ConditionBuilder fuzzyMs (List<String> fuzzyMs){
            this.fuzzyMs = fuzzyMs;
            return this;
        }

        public ConditionBuilder fuzzyMs (String ... fuzzyMs){
            this.fuzzyMs = solveNullList(fuzzyMs);
            return this;
        }

        public ConditionBuilder rightFuzzyMs (List<String> rightFuzzyMs){
            this.rightFuzzyMs = rightFuzzyMs;
            return this;
        }

        public ConditionBuilder rightFuzzyMs (String ... rightFuzzyMs){
            this.rightFuzzyMs = solveNullList(rightFuzzyMs);
            return this;
        }

        public ConditionBuilder msList(String ... ms){
            this.msList = solveNullList(ms);
            return this;
        }

        public ConditionBuilder msList(List<String> ms){
            this.msList = ms;
            return this;
        }

        public ConditionBuilder fuzzyPam1 (List<String> fuzzyPam1){
            this.fuzzyPam1 = fuzzyPam1;
            return this;
        }

        public ConditionBuilder fuzzyPam1 (String ... fuzzyPam1){
            this.fuzzyPam1 = solveNullList(fuzzyPam1);
            return this;
        }

        public ConditionBuilder rightFuzzyPam1 (List<String> rightFuzzyPam1){
            this.rightFuzzyPam1 = rightFuzzyPam1;
            return this;
        }

        public ConditionBuilder rightFuzzyPam1 (String ... rightFuzzyPam1){
            this.rightFuzzyPam1 = solveNullList(rightFuzzyPam1);
            return this;
        }

        public ConditionBuilder pam1List(String ... pam1){
            this.pam1List = solveNullList(pam1);
            return this;
        }

        public ConditionBuilder pam1List(List<String> pam1){
            this.pam1List = pam1;
            return this;
        }

        public ConditionBuilder fuzzyPam2 (List<String> fuzzyPam2){
            this.fuzzyPam2 = fuzzyPam2;
            return this;
        }

        public ConditionBuilder fuzzyPam2 (String ... fuzzyPam2){
            this.fuzzyPam2 = solveNullList(fuzzyPam2);
            return this;
        }

        public ConditionBuilder rightFuzzyPam2 (List<String> rightFuzzyPam2){
            this.rightFuzzyPam2 = rightFuzzyPam2;
            return this;
        }

        public ConditionBuilder rightFuzzyPam2 (String ... rightFuzzyPam2){
            this.rightFuzzyPam2 = solveNullList(rightFuzzyPam2);
            return this;
        }

        public ConditionBuilder pam2List(String ... pam2){
            this.pam2List = solveNullList(pam2);
            return this;
        }

        public ConditionBuilder pam2List(List<String> pam2){
            this.pam2List = pam2;
            return this;
        }

        public ConditionBuilder fuzzyPam3 (List<String> fuzzyPam3){
            this.fuzzyPam3 = fuzzyPam3;
            return this;
        }

        public ConditionBuilder fuzzyPam3 (String ... fuzzyPam3){
            this.fuzzyPam3 = solveNullList(fuzzyPam3);
            return this;
        }

        public ConditionBuilder rightFuzzyPam3 (List<String> rightFuzzyPam3){
            this.rightFuzzyPam3 = rightFuzzyPam3;
            return this;
        }

        public ConditionBuilder rightFuzzyPam3 (String ... rightFuzzyPam3){
            this.rightFuzzyPam3 = solveNullList(rightFuzzyPam3);
            return this;
        }

        public ConditionBuilder pam3List(String ... pam3){
            this.pam3List = solveNullList(pam3);
            return this;
        }

        public ConditionBuilder pam3List(List<String> pam3){
            this.pam3List = pam3;
            return this;
        }

        public ConditionBuilder fuzzyVal3 (List<String> fuzzyVal3){
            this.fuzzyVal3 = fuzzyVal3;
            return this;
        }

        public ConditionBuilder fuzzyVal3 (String ... fuzzyVal3){
            this.fuzzyVal3 = solveNullList(fuzzyVal3);
            return this;
        }

        public ConditionBuilder rightFuzzyVal3 (List<String> rightFuzzyVal3){
            this.rightFuzzyVal3 = rightFuzzyVal3;
            return this;
        }

        public ConditionBuilder rightFuzzyVal3 (String ... rightFuzzyVal3){
            this.rightFuzzyVal3 = solveNullList(rightFuzzyVal3);
            return this;
        }

        public ConditionBuilder val3List(String ... val3){
            this.val3List = solveNullList(val3);
            return this;
        }

        public ConditionBuilder val3List(List<String> val3){
            this.val3List = val3;
            return this;
        }

        public ConditionBuilder fuzzyVal2 (List<String> fuzzyVal2){
            this.fuzzyVal2 = fuzzyVal2;
            return this;
        }

        public ConditionBuilder fuzzyVal2 (String ... fuzzyVal2){
            this.fuzzyVal2 = solveNullList(fuzzyVal2);
            return this;
        }

        public ConditionBuilder rightFuzzyVal2 (List<String> rightFuzzyVal2){
            this.rightFuzzyVal2 = rightFuzzyVal2;
            return this;
        }

        public ConditionBuilder rightFuzzyVal2 (String ... rightFuzzyVal2){
            this.rightFuzzyVal2 = solveNullList(rightFuzzyVal2);
            return this;
        }

        public ConditionBuilder val2List(String ... val2){
            this.val2List = solveNullList(val2);
            return this;
        }

        public ConditionBuilder val2List(List<String> val2){
            this.val2List = val2;
            return this;
        }

        public ConditionBuilder fuzzyVal1 (List<String> fuzzyVal1){
            this.fuzzyVal1 = fuzzyVal1;
            return this;
        }

        public ConditionBuilder fuzzyVal1 (String ... fuzzyVal1){
            this.fuzzyVal1 = solveNullList(fuzzyVal1);
            return this;
        }

        public ConditionBuilder rightFuzzyVal1 (List<String> rightFuzzyVal1){
            this.rightFuzzyVal1 = rightFuzzyVal1;
            return this;
        }

        public ConditionBuilder rightFuzzyVal1 (String ... rightFuzzyVal1){
            this.rightFuzzyVal1 = solveNullList(rightFuzzyVal1);
            return this;
        }

        public ConditionBuilder val1List(String ... val1){
            this.val1List = solveNullList(val1);
            return this;
        }

        public ConditionBuilder val1List(List<String> val1){
            this.val1List = val1;
            return this;
        }

        public ConditionBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public ConditionBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public ConditionBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public ConditionBuilder typeList(Integer ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public ConditionBuilder typeList(List<Integer> type){
            this.typeList = type;
            return this;
        }

        public ConditionBuilder zkBetWeen(Integer zkSt,Integer zkEd){
            this.zkSt = zkSt;
            this.zkEd = zkEd;
            return this;
        }

        public ConditionBuilder zkGreaterEqThan(Integer zkSt){
            this.zkSt = zkSt;
            return this;
        }
        public ConditionBuilder zkLessEqThan(Integer zkEd){
            this.zkEd = zkEd;
            return this;
        }


        public ConditionBuilder zkList(Integer ... zk){
            this.zkList = solveNullList(zk);
            return this;
        }

        public ConditionBuilder zkList(List<Integer> zk){
            this.zkList = zk;
            return this;
        }

        public ConditionBuilder category_id_oneBetWeen(Integer category_id_oneSt,Integer category_id_oneEd){
            this.category_id_oneSt = category_id_oneSt;
            this.category_id_oneEd = category_id_oneEd;
            return this;
        }

        public ConditionBuilder category_id_oneGreaterEqThan(Integer category_id_oneSt){
            this.category_id_oneSt = category_id_oneSt;
            return this;
        }
        public ConditionBuilder category_id_oneLessEqThan(Integer category_id_oneEd){
            this.category_id_oneEd = category_id_oneEd;
            return this;
        }


        public ConditionBuilder category_id_oneList(Integer ... category_id_one){
            this.category_id_oneList = solveNullList(category_id_one);
            return this;
        }

        public ConditionBuilder category_id_oneList(List<Integer> category_id_one){
            this.category_id_oneList = category_id_one;
            return this;
        }

        public ConditionBuilder category_id_twoBetWeen(Integer category_id_twoSt,Integer category_id_twoEd){
            this.category_id_twoSt = category_id_twoSt;
            this.category_id_twoEd = category_id_twoEd;
            return this;
        }

        public ConditionBuilder category_id_twoGreaterEqThan(Integer category_id_twoSt){
            this.category_id_twoSt = category_id_twoSt;
            return this;
        }
        public ConditionBuilder category_id_twoLessEqThan(Integer category_id_twoEd){
            this.category_id_twoEd = category_id_twoEd;
            return this;
        }


        public ConditionBuilder category_id_twoList(Integer ... category_id_two){
            this.category_id_twoList = solveNullList(category_id_two);
            return this;
        }

        public ConditionBuilder category_id_twoList(List<Integer> category_id_two){
            this.category_id_twoList = category_id_two;
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

        private item obj;

        public Builder(){
            this.obj = new item();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder price(String price){
            this.obj.setPrice(price);
            return this;
        }
        public Builder scNum(Integer scNum){
            this.obj.setScNum(scNum);
            return this;
        }
        public Builder gmNum(Integer gmNum){
            this.obj.setGmNum(gmNum);
            return this;
        }
        public Builder url1(String url1){
            this.obj.setUrl1(url1);
            return this;
        }
        public Builder url2(String url2){
            this.obj.setUrl2(url2);
            return this;
        }
        public Builder url3(String url3){
            this.obj.setUrl3(url3);
            return this;
        }
        public Builder url4(String url4){
            this.obj.setUrl4(url4);
            return this;
        }
        public Builder url5(String url5){
            this.obj.setUrl5(url5);
            return this;
        }
        public Builder ms(String ms){
            this.obj.setMs(ms);
            return this;
        }
        public Builder pam1(String pam1){
            this.obj.setPam1(pam1);
            return this;
        }
        public Builder pam2(String pam2){
            this.obj.setPam2(pam2);
            return this;
        }
        public Builder pam3(String pam3){
            this.obj.setPam3(pam3);
            return this;
        }
        public Builder val3(String val3){
            this.obj.setVal3(val3);
            return this;
        }
        public Builder val2(String val2){
            this.obj.setVal2(val2);
            return this;
        }
        public Builder val1(String val1){
            this.obj.setVal1(val1);
            return this;
        }
        public Builder type(Integer type){
            this.obj.setType(type);
            return this;
        }
        public Builder zk(Integer zk){
            this.obj.setZk(zk);
            return this;
        }
        public Builder category_id_one(Integer category_id_one){
            this.obj.setCategory_id_one(category_id_one);
            return this;
        }
        public Builder category_id_two(Integer category_id_two){
            this.obj.setCategory_id_two(category_id_two);
            return this;
        }
        public Builder isDelete(Integer isDelete){
            this.obj.setIsDelete(isDelete);
            return this;
        }
        public item build(){return obj;}
    }

}
