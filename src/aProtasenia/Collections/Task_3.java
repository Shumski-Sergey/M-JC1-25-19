package src.aProtasenia.Collections;

/*Создать список оценок учеников с помощью ArryList, заполнить случайными
        оценками. Найти самую высокую оценку с использованием итератора.*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        List<Integer> schoolGrades = new ArrayList<>();
        Random randomNumber = new Random();
        for (int i = 0; i<15; i++) {
            schoolGrades.add(randomNumber.nextInt(11));
        }
        System.out.println( schoolGrades);
        schoolGrades.removeIf(mark -> { return mark < 4; });

        System.out.println(schoolGrades);
        int maxGrade = schoolGrades.get(0);
        Iterator<Integer> iterator = schoolGrades.iterator();
        while (iterator.hasNext()) {
            int maxSearch = iterator.next();
            if (maxSearch > maxGrade) {
                maxGrade = maxSearch;
            }
        }
        System.out.println("Max school grade: " + maxGrade);
    }
}
