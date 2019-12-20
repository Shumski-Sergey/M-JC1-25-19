package tmurashka.lab3;

public class lab3_B1 {
    public static void main(String[] args) {
        int rnd = 5 + (int) (Math.random() * 155);
        if (25 < rnd && rnd < 100) {
            System.out.println("Число " + rnd + " попадает в интервал");
        }
        else {
            System.out.println("Число " + rnd + " не попадает в интервал");
        }
    }
}
