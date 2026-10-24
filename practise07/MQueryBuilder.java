package semestr1.practise07;

public class MQueryBuilder {
    private String table;
    private String fields = "*";
    private String whereClause = "";
    MQueryBuilder(String table){
        this.table = table;
    }
    public MQueryBuilder select(String fields){
        return this;
    }
    public MQueryBuilder where(String condition){
        return this;
    }
    public String build(){
        return "SELECT " + fields + " FROM " + table + (whereClause.isEmpty() ? "" : " WHERE " + whereClause);
    }

}
