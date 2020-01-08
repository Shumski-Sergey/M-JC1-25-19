import java.util.Scanner;

public class Lab5_3a {
    public static void main(String[] args) {
        //Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int numbOfStrs = in.nextInt();
        String[] strs = new String[numbOfStrs];
        for (int i = 0; i < numbOfStrs; i++) {
            System.out.print("Enter " + (i + 1) + " string: ");
            Scanner in2 = new Scanner(System.in);
            strs[i] = in2.nextLine();
        }
        float averageLength = 0f;
        for (int i = 0; i < numbOfStrs; i++) {
            averageLength += strs[i].length();
        }
        averageLength /= numbOfStrs;
        System.out.println("Lines that are less than average length (" + averageLength + "):");
        for (int i = 0; i < numbOfStrs; i++) {
            if (strs[i].length() < averageLength)
                System.out.println("№" + (i + 1) + ": " + strs[i] + "(length:" + strs[i].length() + ")");
        }
    }
}


