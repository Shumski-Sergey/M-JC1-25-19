package riliuchik.lab4.fileArrays;

import java.util.Scanner;

//В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.

public class Lab4_1_taskA1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество учеников в классе: ");
        int num;
        do {
            while (!in.hasNextInt()) {
                System.out.print("Вы ввели не число, попробуйте ещё раз: ");
                in.next();
            }
            num = in.nextInt();
            if (num < 1) {
                System.out.print("Вы ввели количество меньше 1, попробуйте ещё раз: ");
            }
        }
        while (num < 1);
        System.out.print("Преподователь разозлился и поставил оценки так, как ему удобнее: ");
        int array[] = new int[num];
        int i;
        for (i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * 11);
            System.out.print(array[i] + " ");
        }
        int maxIndex = 0;
        int max = array[maxIndex];
        for (i = 1; i < num; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        String output = "";
        for (i = 0; i < num; i++) {
            if (array[i] == max) {
                max = array[i];
                maxIndex = i;
                output += maxIndex + " ";
            }
        }
        System.out.print("\nНомера максимальных оценок (отсчет номеров начинается с нуля): " + output);
    }
}