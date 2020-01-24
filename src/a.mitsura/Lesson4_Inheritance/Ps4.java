package a.mitsura.Lesson4_Inheritance;

public class Ps4 extends GamingConsoles {
    public Ps4(String year, int width, int length, String generation, String version) {
        super(year, width, length, generation);
        this.version = version;
    }

    String version;
}
