import java.util.Scanner;

public class Lab3_3a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input integer number: ");
        long numb = in.nextLong();
        in.close();
        System.out.println("Number in accounting format: ");

        System.out.printf("%,d", numb); // %,d - вывод целого числа с разделением тысяч. Всё гениальное просто:D
    }
}

