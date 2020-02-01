package iyakushevich.FirstControl;

import java.util.List;
import java.util.Scanner;

import static iyakushevich.FirstControl.Task2_util.Task2Util.*;

/**
 * 2. Заменить каждый элемент списка с четным номером на соседний слева элемент.
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность символов: ");
        String line = scanner.nextLine();


        List<Character> characters = strToCharList(line);
        System.out.println("Вы ввели следующую последовательность: \t\t\t\t" + characters);

        replaceEven(characters);
        System.out.println("Последовательность после замены четных элементов: \t" + characters);
    }
}
