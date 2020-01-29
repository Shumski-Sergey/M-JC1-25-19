package dbesan.lab5strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Количество строк - не менее трех (иначе магии не будет)");
        int strcount = Integer.parseInt(reader.readLine());//количество строк
        int[] arrLen = new int[strcount]; //массив для длины
        String[] arrStr = new String[21474];
        int length = 0;//массив для содержимого - нужен заранее определенный массив, т.к. массивы динамически не изменяются, поэтому в таком виде.
        for (int i = 0; i < strcount; i++) {
            String string = new String();
            System.out.println("Введите строку");
            string = reader.readLine();
            for (char character : string.toCharArray()) { //превращаем строку в массив чаров, чтобы посчитать ее длину
                length = string.length();
            } //собсно, длина строки
            arrLen[i] = length; //на позицию i в массив записываем длинну массива
            arrStr[length] = string; // на позицию, которая соответствует длине массива записываем содержимое
        }
        Arrays.sort(arrLen); //сортируем массив с длинами
        int half = arrLen.length / 2; //выясняем среднее. с math.floor округляем нечетные в меньшую сторону. без - в большшую.
        for (int print = 0; print < arrLen.length; print++) {
            if (arrLen[print] <= arrLen[half]) {
                System.out.println(arrStr[arrLen[print]] + " " + arrLen[print]);
            } //идея такая собственно - берется значение длины из отсортированного массива с длинами и в массиве
            // с строками на соответствующей позиции - позиция = длине - ждет соответсвующая строка. признаю, решение не универсально из-за ограничений длины массива с строками

        }
    }
}

