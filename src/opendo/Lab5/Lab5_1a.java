import java.util.Scanner;

public class Lab5_1a {
    public static void main(String[] args) {
        //Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        String[] numbOfStr = new String[in.nextInt()];
        for (int i = 0; i < numbOfStr.length; i++) {
            System.out.print("Enter " + (i + 1) + " strings: ");
            Scanner in2 = new Scanner(System.in);
            numbOfStr[i] = in2.nextLine();
        }
        int strMin = numbOfStr[0].length();
        int strMax = numbOfStr[0].length();
        for (int j = 0; j < numbOfStr.length; j++) {
            if (numbOfStr[j].length() < strMin) {
                strMin = numbOfStr[j].length();
            }
            if (numbOfStr[j].length() > strMax) {
                strMax = numbOfStr[j].length();
            }
        }

        for (int i = 0; i < numbOfStr.length; i++) {
            if (numbOfStr[i].length() == strMin) {
                System.out.println("The shortest string: " + numbOfStr[i] + ". String length: " + strMin);
            }
        }

        for (int i = 0; i < numbOfStr.length; i++) {
            if (numbOfStr[i].length() == strMax) {
                System.out.println("The longest string: " + numbOfStr[i] + ". String length: " + strMax);
            }
        }
    }
}
