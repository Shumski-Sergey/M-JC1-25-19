package opendo;

public class Lab2_1b {
    public static void main(String[] args) {
        int a=(int)(5+Math.random()*156);
        System.out.println("Случайно выбранное число из промежутка [5;155]: " + a);

        if (a<25 && a>100) {
            System.out.println("Число " + a + " не попало в интервал (25; 100).");
        } else {
            System.out.println("Число " + a + " попало в интервал (25; 100).");
        }
    }
}
