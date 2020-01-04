package src.aProtasenia.lab2;
//Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
public class Lab5_3 {
    public static void main(String[] args) {
        int a = 90 / 5 +1;
        int [] progression = new int[a];
        int number = 90;
        for (int i : progression) {
            progression[i] = number;
            System.out.print(number + " ");
            number = number - 5;
        }
    }
}
