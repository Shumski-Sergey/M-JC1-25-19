package src.aProtasenia.lab2;
//Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….

public class Lab5_1 {
    public static void main(String[] args) {
        int a = (9999 - 1000) / 3 + 1;
        int [] progression = new int[a];
        int number = 1000;
        for (int i = 0; i < progression.length; i++) {
            System.out.println(number + " ");
            number = number + 3;
        }
    }
}
