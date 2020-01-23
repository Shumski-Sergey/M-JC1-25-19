package a.mitsura.Lesson4_Inheritance;

public class GamingConsoles extends Techniq {
    String generation;
    public GamingConsoles(String year, int width, int length, String generation) {
        super(year, width, length);
        this.generation = generation;
    }
}
