import java.util.Scanner;

public class Lab3_2b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int numb = in.nextInt();
        in.close();

        int divider=1;
        System.out.println("Dividers of " + numb + ":");
        for (int i = 1; i <= numb; i++) {
            if (numb%divider == 0) {
                System.out.println(divider);
            }
            divider++;
        }
    }
}
