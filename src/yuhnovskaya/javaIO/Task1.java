package src.yuhnovskaya.javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1. Ввести с консоли имя файла. Найти байт или байты с максимальным количеством повторов. Вывести их на экран через
// пробел. Закрыть поток ввода-вывода.
public class Task1 {
    public static void main(String[] avgs) {
        System.out.println("Enter file name:");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        List<Integer> array_bytes = new ArrayList<>();
        List<Integer> counter = new ArrayList<>();
        final int COUNTER_SIZE=256;
        System.out.println("Array of bytes:");
        try {
            FileInputStream fin = new FileInputStream(fileName);

            try {
                int i = -1;
                while ((i = fin.read()) != -1) {
                    array_bytes.add(i);
                    System.out.print(i+" ");
                }
            } finally {
                fin.close();
            }
        } catch (FileNotFoundException ex) {
            System.out.print(ex.getMessage());
        } catch (IOException ex) {
            System.out.print((ex.getMessage()));
        }
        for (int i=0; i<COUNTER_SIZE; i++){
        int number=0;
        for (int j=0; j<array_bytes.size()-1; j++){
            if (i==array_bytes.get(j)){
                number=number+1;
            }
        }
        counter.add(number);
        }
        System.out.println("\nArray of byte counter:");
        System.out.print(counter);
        int max=0;
        for (int i=max; i<COUNTER_SIZE; i++){
            if (counter.get(i)>counter.get(max)){
                max=i;
            }
        }
        for (int i=0; i<COUNTER_SIZE;i++){
            if (counter.get(i).equals(counter.get(max))){
                System.out.println("\nThe most frequently repeated bytes:");
                System.out.print(i+" ");
            }
        }
    }
}
//FILE NAME: src\yuhnovskaya\streamAPI\text.txt