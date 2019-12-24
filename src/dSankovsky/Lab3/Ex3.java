package dSankovsky.Lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        String first = reader.readLine();
        int numb = Integer.parseInt(first);
        int compNumb = 1;
        int mulNumb = 0;
        if (numb < 0) {      // следующие 3 строки, по сути, костыль, решающий вопрос с вводом отрицательных чисел
            numb = -numb;    //надо будет в будущем это исправить, но пока так
            System.out.print("- ");
        }
        while (compNumb < numb) {
            compNumb = compNumb * 1000;   //принцип как в первой задаче, но только тут отделяются сразу по 3 разряда
            mulNumb++;
        }
        int[] cash;
        cash = new int[mulNumb];   //в этот массив будут заноситься по 3 разряда числа, а потом они будут выводиться с конца массива

        int newNumb, sum = 0;
        for (int i = 1; i <= mulNumb; i++) {
            newNumb = numb % 1000;
            cash[i - 1] = newNumb;
            numb = (numb - newNumb) / 1000;
        }
        for (int i = mulNumb - 1; i >= 0; i--) {
            System.out.print(cash[i] + " ");
        }

    }
}
