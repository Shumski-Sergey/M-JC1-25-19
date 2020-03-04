package aantonovich.Training.Hospital;


public class Patient {
    private String surname;
    private String name;
    private int age;
    private boolean fluShot; // прививка от гриппа


    public String toString(){
        return surname+" "+name+" "+age+" лет. Прививка от гриппа: "+fluShot; }

    public String getSurname() {return surname;}

    public void setSurname(String surname) {this.surname = surname;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public boolean isFluShot() {return fluShot;}

    public void setFluShot(boolean fluShot) {this.fluShot = fluShot;}

    Patient(String surname, String name, int age, boolean fluShot){
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.fluShot = fluShot;
    }
}
