package tabukara.lab11.library;

public class Book {
    private int id;
    private String Writer;
    public Book(int id, String Writer){
        this.id = id;
        this.Writer = Writer;
    }
    public  int getId(){ return id;}
    public void setId(int id){this.id = id;}

    public String getWriter(){ return Writer;}
    public void setWriter(String Writer){this.Writer = Writer;}
}
