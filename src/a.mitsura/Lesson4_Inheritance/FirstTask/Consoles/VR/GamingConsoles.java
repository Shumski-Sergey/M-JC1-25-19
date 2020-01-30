package a.mitsura.Lesson4_Inheritance.FirstTask.Consoles.VR;

public class GamingConsoles extends Techniq {
    String generation;
    public GamingConsoles(String year, int width, int length, String generation) {
        super(year, width, length);
        this.generation = generation;
    }
}
