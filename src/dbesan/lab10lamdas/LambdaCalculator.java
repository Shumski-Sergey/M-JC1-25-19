/*package dbesan.lab10lamdas;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
!!!!ОНО НЕ СДЕЛАНО!!!
public class LambdaCalculator {
    private static int firstnumber;
    private static int secondnumber;
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        firstnumber = inputnumber();
        System.out.println("Введите второе число");
        secondnumber = inputnumber();
        System.out.println("Введите знак действие: +, *, /, - , % , Math.sqrt(), Math.pow()");
    }

    public static Object calculate() {

        return null;
    }

    public static int inputnumber() {
        Scanner scanner = new Scanner(System.in);
        int inputnumber = 0;
        while (!scanner.hasNextInt()) {
            System.out.println("Введено не число. Введите число.");
            scanner.nextLine();
        }
        inputnumber = scanner.nextInt();
        return inputnumber;
    }
    public static String inputmath() {
        Scanner scanner = new Scanner(System.in);
        String tempinput = scanner.nextLine();
        String inputmath = " ";
        Pattern pattern = Pattern.compile("[+ * / - %  sqrt pow]");
        Matcher matcher = pattern.matcher(tempinput);
        while (!matcher.find()) {
            System.out.println("Введите математическую операцию");
            scanner.nextLine();}
        inputmath = tempinput;
        return inputmath;
    }
}*/


