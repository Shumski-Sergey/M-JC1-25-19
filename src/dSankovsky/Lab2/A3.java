package dSankovsky.Lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A3 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число A");     //ввод двух цифр с клавиатуры
        String first = reader.readLine();
        int numbA = Integer.parseInt(first);
        System.out.println("Введите число B");
        String second = reader.readLine();
        int numbB = Integer.parseInt(second);
        System.out.println("Введите число C");
        String third = reader.readLine();
        int numbC = Integer.parseInt(third);
        int[] numb = {numbA, numbB, numbC};  //теперь переменные А, В, С в массиве с номерами 0, 1, 2 соответств
        //здесь начинается пузырьковая сортировка

        for (int i = numb.length - 1; i > 0; i--) {    //цикл i начинает проверять с конца, а j - с начала массива
            for (int j = 0; j < i; j++) { //таким образом получается, что самый большой элемент массива становится на крайнюю правую позицию
                if (numb[j] > numb[j + 1]) {   //и после первого круга цикл i как бы изолирует этот правый элемент, ведь мы уже знаем, что он самый большой, а значит его нет смысла трогать
                    int temp;    //тут 4 строки обмена значений массива
                    temp = numb[j];
                    numb[j] = numb[j + 1];
                    numb[j + 1] = temp;
                }
            }
        }
        System.out.println("A = " + numb[0] + "; B = " + numb[1] + "; C = " + numb[2]);
        //изначально А, В и С были в массиве под номерами 0, 1, 2. В таком же порядке и выводим, хотя значения там уже отсортированны
    }
}
