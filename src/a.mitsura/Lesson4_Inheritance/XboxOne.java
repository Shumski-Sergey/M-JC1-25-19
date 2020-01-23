package a.mitsura.Lesson4_Inheritance;

public class XboxOne extends GamingConsoles {
    String color;
    public XboxOne(String year, int width, int length, String generation, String color) {
        super(year, width, length, generation);
        this.color = color;
    }
}
