package src.pvetashkov.lab6creditki;

public class Bank {
    private String title;
    private String syspay;
    private String number;

    public Bank(String title, String number, String syspay) {
        this.title = title;
        this.number=number;
        this.syspay=syspay;
    }
    public String getTitle () {return title;    }
    public void setTitle (String title){ this.title = title;    }
    public String getNumber () {return number; }
    public void setNumber (String number){this.number=number;}
    public String getSyspay(){ return syspay;  }
    public void setSyspay(String syspay){ this.syspay=syspay; }

    }
