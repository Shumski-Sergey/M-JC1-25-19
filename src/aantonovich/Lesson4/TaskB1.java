package aantonovich.Lesson4; // найти в строке не только запятые,
// но и другие знаки препинания. Подсчитать общее их количество

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        char[] s = {'.',',','?','!',';',':','"','(',')','-'};// массив знаков препинания
        int punct = 0; // счетчик
        System.out.println("Введите строку со знаками препинания:");
        Scanner scan = new Scanner(System.in);
        String sc = scan.next();
        char[] ch =sc.toCharArray(); // переводим строку в char
        for (char value1 : s) {
            for (char value2 : ch) {
                if (value1 == value2) {// сравниваем каждый символ строки со знаками
                    punct++;          // препинания и если совпадение, то счетчик +1
                }
            }
        }
    System.out.println("В строке " + punct + " знаков препинания");
    }
}