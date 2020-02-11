package riliuchik.lab1_conceptOfOOP;

//Создайте число. Определите, является ли число четным или не четным, вывести текстовое сообщение.

public class Lab1_taskB2 {
    public static void main(String[] args) {
        int x = 7;
        if (x % 2 == 0) {
            System.out.println("Число " + x + " является чётным");
        } else {
            System.out.println("Число " + x + " не является чётным");
        }
    }
}