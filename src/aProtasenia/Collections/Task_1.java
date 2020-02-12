package src.aProtasenia.Collections;

//Создать список оценок учеников с помощью ArrayList, заполнить
//случайными оценками. Удалить неудовлетворительные оценки из списка.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        List<Integer> schoolGrades = new ArrayList<>();
        Random randomNumber = new Random();
        for (int i = 0; i<15; i++) {
            schoolGrades.add(randomNumber.nextInt(11));
        }
        System.out.println( schoolGrades);
        schoolGrades.removeIf(mark -> { return mark < 4; });

        System.out.println(schoolGrades);

    }
}
