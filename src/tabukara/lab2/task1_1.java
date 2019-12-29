package tabukara.lab2;

public class task1_1 {
    public static void main(String[] args) {
        int x = 10;
        double y = 11.45;
        double z = 8.25;
        double t = Math.abs(x - y);
        double i = Math.abs(x - z);
        if (t < i) {
            System.out.println("The value " + y + " is Closer to " + x);
        } else if (t == i) {
            System.out.println("The Value " + y + " And " + z + " Both have the same distance from " + x);
        } else {
            System.out.println("The value " + z + " is Closer to " + x);
        }


    }
}
