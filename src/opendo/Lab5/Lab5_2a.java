import java.util.Scanner;

public class Lab5_2a {
    public static void main(String[] args) {
        //Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        String[] strs = new String[in.nextInt()];
        for (int i = 0; i < strs.length; i++) {
            System.out.print("Enter " + (i + 1) + " strings: ");
            Scanner in2 = new Scanner(System.in);
            strs[i] = in2.nextLine();
        }
        for (int i = strs.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (strs[j].length() < strs[j + 1].length()) {
                    String swap = strs[j];
                    strs[j] = strs[j + 1];
                    strs[j + 1] = swap;
                }
            }
        }
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);

        }
    }
}
