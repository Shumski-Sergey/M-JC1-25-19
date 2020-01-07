package src.aProtasenia.lab4;
// Имеется целое число, определить является ли это число простым,
//т.е. делится без остатка только на 1 и себя

public class Lab4_a2 {
    public static void main(String[] args) {
        int number = 29;
        for (int y = 2; y < number; y++) {
            if (number % y == 0) {
                System.out.print("Число сложное");
                return;
            }
        } System.out.print("Число простое");
    }
}
