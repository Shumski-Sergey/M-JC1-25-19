package src.aProtasenia.strings;
//Ввести n строк с консоли, найти самую короткую и самую длинную строки.
// Вывести найденные строки и их длину.
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner str1 = new Scanner(System.in);
        int n = str1.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter string" +(i+1));
            Scanner str2 = new Scanner(System.in);
            String maxMinStrings=str2.nextLine();
            strings[i] = maxMinStrings;
        }
        int shortest =0;
        int longest = 0;
        for (int j=longest+1; j < n; j++) {
            if (strings[j].length() > strings[longest].length()){
                longest = j;
            }
            if (strings[j].length() < strings[shortest].length()){
                shortest = j;
            }
        }
        System.out.println("The shortest string" + strings[shortest]);
        System.out.println("Length: " + strings[shortest].length());
        System.out.println("The longest string"  + strings[longest]);
        System.out.println("Length: " + strings[longest].length());
    }
    }

