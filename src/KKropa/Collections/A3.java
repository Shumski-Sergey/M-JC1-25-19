package KKropa.Collections;

import java.util.ArrayList;
import java.util.Collections;

//3.Создать список оценок учеников с помощью ArryList, заполнить случайными оценками.
// Найти самую высокую оценку с использованием итератора.
public class A3 {
    public static void main(String[] args) {
        int quantityElements = 10;
        int max = 0;

        ArrayList<Integer> marks = new ArrayList<>();

        for (int i = 0; i < quantityElements; i++) {
            int a = (int) (Math.random() * 10 + 1);
            marks.add(i, a);
        }
        System.out.println("Marks of students: " + marks);

        for (Integer i : marks) {
            if (i > max) {
                max = i;
            }

        }
        System.out.println("Maximum rating: " + max);

    }
}
