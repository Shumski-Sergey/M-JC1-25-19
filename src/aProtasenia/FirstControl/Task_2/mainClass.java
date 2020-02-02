package src.aProtasenia.FirstControl.Task_2;
//Заменить каждый элемент списка с четным номером на соседний слева элемент

import java.util.List;
import java.util.Scanner;


import static src.aProtasenia.FirstControl.Task_2.listFilling.*;

public class mainClass {
    public static void main(String[] args) {
        System.out.println("Enter the string:  ");
        Scanner sum = new Scanner(System.in);
        String str = sum.nextLine();

        List<Character> listItems = strToChar(str);
        replacedList(listItems);
    }
}

