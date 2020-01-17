package src.aProtasenia.strings;
//Ввести n строк с консоли. Упорядочить и вывести строки в порядке
// возрастания (убывания) значений их длины.

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        System.out.print("Enter number");
        Scanner summator = new Scanner (System.in);
        int n = summator.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n;i++){
            System.out.print("Enter string"+ (i + 1) +": ");
            Scanner scanner2 = new Scanner(System.in);
            String str = scanner2.nextLine();
            strings[i] = str;
        }
        for (int i = 0;i < n;i++) {
            for (int j = i + 1; j < n; j++){
                if (strings[j].length() > strings[i].length()){
                    String l = strings[i];
                    strings[i] = strings[j];
                    strings[j] = l;
                }
            }
            System.out.print("String "+ (i + 1) +": "+strings[i]);
            System.out.println(" Length: " +strings[i].length());
        }
    }
}


