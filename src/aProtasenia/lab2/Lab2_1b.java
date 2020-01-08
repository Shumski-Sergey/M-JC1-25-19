package src.aProtasenia.lab2;

public class Lab2_1b {
    public static void main(String[] args) {
        int x = (int)(Math.random() * 151 + 5);
        if (x > 25 && x < 100) {
            System.out.print(x + " в данном интервале");}
            else { System.out.print(x + " за пределами данного интервала");
        }
    }
}
