import java.util.Scanner;

public class Lab3_2a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input integer number: ");
        int numb = in.nextInt();
        in.close();

        int i;
        for (i = 2; i < numb; i++) ;
        if (numb % i != 0) {
            System.out.println("The number " + numb + " is simple");
        } else if (numb == 2) {
            System.out.println("The number " + numb + " is simple");
        } else {
            System.out.println("The number " + numb + " is composite");
        }

    }
}

