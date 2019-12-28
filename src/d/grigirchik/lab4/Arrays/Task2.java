package d.grigirchik.lab4.Arrays;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int max;
        int min;
        int student;
        int position1 = 0;
        int position2 = 0;
        int sumBetweenMinMax = 0;
        System.out.println("Enter a number of students , don't enter zero");
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("This is not a number. Please try again");
                scanner.next();
            }
            number = scanner.nextInt();
            if (number == 0) {
                System.out.println("You enter Zero, please try again");
            }
        }
        while (number == 0);
        int[] mas = new int[number];
        for (int i = 0; i < mas.length; i++) { // заполнение массива рандомными оценками
            mas[i] = (int) (1 + Math.random() * 100);
            student = i;
            System.out.println("student number " + student + ": " + mas[i]);
        }
        max = mas[0];
        min = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] >= max) {
                max = mas[i];
                position2 = i;
            }
            if (mas[i] <= min) {
                min = mas[i];
                position1 = i;
            }
        }
        System.out.println("");
        System.out.println("Max grade position:" + position2 + " " + max);
        System.out.println("Min grade position: " + position1 + " " + min);
        if (position1 <= position2) {
            for (int i = position1; i <= position2; i++) {
                sumBetweenMinMax = sumBetweenMinMax + mas[i];
            }
        } else {
            for (int i = position2; i <= position1; i++) {
                sumBetweenMinMax = sumBetweenMinMax + mas[i];
            }
        }
        System.out.println("Sum between Min and Max: " + sumBetweenMinMax);
    }
}
