package src.aProtasenia.strings;
//Ввести n строк с консоли. Вывести на консоль те строки,
// длина которых меньше (больше) средней, а также длину.
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextByte();
        String[] str = new String[n];
        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            System.out.println("Enter word №" + (i + 1));
            str[i] = sc2.nextLine();
        }
        double average = 0; //total amount of words lengths:
        for (String sum : str) {
            average += sum.length();
        }
        //arithmetic mean of these words:
        average /= str.length;
        System.out.println("Average line length = (" + average + ")");

        for (int i = 0; i < n; i++) {
            if (str[i].length() < average) {
                System.out.println("Shorter string than average length: ");
                System.out.println(str[i] + " length = " + str[i].length());
            }
        }
    }
}



