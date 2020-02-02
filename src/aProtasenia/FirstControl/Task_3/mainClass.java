package src.aProtasenia.FirstControl.Task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static src.aProtasenia.FirstControl.Task_3.numberOfStrings.numOfStrings;
import static src.aProtasenia.FirstControl.Task_3.stringsLength.strLength;

public class mainClass {
    public static void main(String[] args) {
        List<String> stringsList=new ArrayList<>();
        System.out.println("Enter your best " +numOfStrings+ " strings:");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numOfStrings; i++) {
            String str = scanner.nextLine();
            stringsList.add(str);
        }
        System.out.println("The longest string(strings) :");
        for (int i = 0; i < numOfStrings; i++) {
            if ((stringsList.get(i)).length() == strLength(stringsList)) {
                System.out.println(stringsList.get(i));
            }
        }
    }
}

