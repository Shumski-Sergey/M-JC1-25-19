package a.mitsura.Lesson4_Inheritance;

public class Techniq{
    private String year;
    private int width;
    private int length;

    public Techniq(String year, int width, int length) {
        this.year = year;
        this.width = width;
        this.length = length;
    }
    public void inSocket(){
        System.out.println("In socket put on");
        System.out.println("year of presenting is "+year+", width is "+width+", length is "+length+", ");
    }
}
