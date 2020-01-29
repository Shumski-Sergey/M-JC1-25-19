package src.pvetashkov.lab6creditki;

public class Bank {
    private String title;
   // private String name;
    private String number;
    private String type;

public void Bank(String title, String name, String number, String type) {
    this.title = title;
   // this.name = name;
    this.number = number;
    this.type = type;}

    public String getTitle () {
        return title;    }
    public void setTitle (String title){
        this.title = title;    }
   // public String getName () {
      //  return name;    }
  //  public void setName (String name){
   //     this.name = name;    }
    public String getNumber () {
        return number;    }
    public void setNumber (String number){
        this.number = number;    }
    public String getType () {
        return type;    }

    public void setType(String type) {

    }
}