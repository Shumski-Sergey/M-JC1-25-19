package a.mitsura.Lesson4_Inheritance;

public class VR extends Techniq {
    public VR(String year, int width, int length, String model) {
        super(year, width, length);
        this.model = model;
    }

    String model;
}
