package a.mitsura.Lesson4_Inheritance.FirstTask.Consoles.VR;

public class Starter {
    public static void main(String []args){
        XboxOne xbox=new XboxOne("2017", 20, 42, "One", "Yellow");
        xbox.inSocket();
        VR vr = new VR("2015", 30, 51, "Slim");
        vr.inSocket();
    }
}
