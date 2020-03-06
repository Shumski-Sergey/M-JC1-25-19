package iromankova.secondControl;
//2. Найти в массиве число, которое повторяется наибольшее количество раз.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task_2 {

    public static void main(String[] args) {
        int [] numbers = {2,2,1,3,9,4,5,2,2};
        Arrays.sort (numbers);
        int maxCount = Integer.MIN_VALUE;
        int prevNumber = numbers[0];
        int currentCount = 0;
        Set<Integer> results = new HashSet<> ();
        maxCount = getMaxCount (numbers, maxCount, prevNumber, currentCount, results);
        System.out.println (maxCount);
        System.out.println (results);
    }

    private static int getMaxCount(int[] numbers, int maxCount, int prevNumber, int currentCount, Set<Integer> results) {
        for(int num :numbers) {
            if (prevNumber == num) currentCount++;
            else {
                maxCount = Math.max (currentCount, maxCount);
                if (maxCount == currentCount)
                    results.add (prevNumber);
                prevNumber = num;
                currentCount = 1;
            }
        }
        return maxCount;
    }
}
