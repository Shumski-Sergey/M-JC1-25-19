package src.yuhnovskaya.Control2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by user on 04.03.2020.
 */
public class Task2 {
    public static void main(String[] avgs) {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> counter = new ArrayList<>();
        final int COUNTER_SIZE=10;//числа от 0 до 10
        final int FINAL_NUMBER=666;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int digit = scanner.nextInt();
            if (digit == FINAL_NUMBER) break;
            list.add(digit);
        }
        for (int i = 0; i < COUNTER_SIZE; i++) {
            int number = 0;
            for (int j = 0; j < list.size()-1; j++) {
                if (i == list.get(j)) {
                    number = number + 1;
                }
            }
            counter.add(number);
        }
        int max = 0;
        for (int i=max;i<COUNTER_SIZE;i++){
            if(counter.get(i)>counter.get(max)){
                max=i;
            }
        }
        for (int i = 0; i < COUNTER_SIZE; i++) {
            if (counter.get(i).equals(counter.get(max))) {
                System.out.print(i);
            }
        }

    }
}
