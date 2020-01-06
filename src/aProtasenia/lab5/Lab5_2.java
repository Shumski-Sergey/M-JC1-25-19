package src.aProtasenia.lab5;
//Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
public class Lab5_2 {
    public static void main(String[] args) {
        int[] progression = new int[55];
        int number = 1;
        for (int i : progression) {
            progression[i] = number;
            System.out.print(number + " ");
            number = number + 2;
        }
    }
}
