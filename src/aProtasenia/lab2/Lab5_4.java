package src.aProtasenia.lab2;
//Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….

public class Lab5_4 {
    public static void main(String[] args) {
        int [] progression = new int[20];
        int number = 2;
        for (int i : progression) {
            progression[i] = number;
            System.out.print(number + " ");
            number = number * 2;
        }
    }

}
