package aantonovich.Training;

// Найти в массиве число, которое повторяется наибольшее количество раз.

import java.util.ArrayList;
import java.util.Collections;

public class MaximumNumberOfTimes {
    static int  ELEMENT = 10;
    static int RANGE = 5; // диапозон чисел
    static int mostCommonNumber = 0;
    static int quantity = 0;
    public static void main(String[] args) {
        ArrayList<Integer> collection = new ArrayList<>();
        for (int i = 0; i < ELEMENT; i++) {
            collection.add(i, (int) (Math.random() * RANGE + 1));
        }
        System.out.println(collection);

        for (int i = 0; i < collection.size(); i++){
            int frequency = Collections.frequency(collection, i);
            if (quantity <= frequency) {
                mostCommonNumber = i;
                quantity = frequency;
            }
        }
        System.out.println("The most common number is " + mostCommonNumber);
        System.out.println("This number is repeated " + quantity + " times.");
    }
}
