package dbesan.lab10lamdas;

import java.util.Optional;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LambdaCalculator {
    private static double firstnumber;
    private static double secondnumber;
    private static String mathoperation;
    private static double result;
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        firstnumber = inputnumber();
        System.out.println("Введите второе число");
        secondnumber = inputnumber();
        System.out.println("Введите знак действие: +, *, /, - , % , Math.sqrt(), Math.pow()");
        mathoperation = mathoperation();
    }

    public double calculate() {
        BinaryOperator<Double> sum = (firstnumber, secondnumber) -> firstnumber + secondnumber;
        BinaryOperator<Double> min = (firstnumber, secondnumber) -> firstnumber - secondnumber;
        BinaryOperator<Double> multi = (firstnumber, secondnumber) -> firstnumber * secondnumber;
        BinaryOperator<Double> div = (firstnumber, secondnumber) -> firstnumber / secondnumber;
        return result;
    }

    public static double inputnumber() {
        Scanner scanner = new Scanner(System.in);
        int inputnumber = 0;
        while (!scanner.hasNextInt()) {
            System.out.println("Введено не число. Введите число.");
            scanner.nextLine();
        }
        inputnumber = scanner.nextInt();
        return inputnumber;
    }
    public static String mathoperation() {
        Scanner scanner = new Scanner(System.in);
        String tempinput = scanner.nextLine();
        String mathoperation = " ";
        Pattern pattern = Pattern.compile("[+ * / - %  sqrt pow]");
        Matcher matcher = pattern.matcher(tempinput);
        while (!matcher.find()) {
            System.out.println("Введите математическую операцию");
            scanner.nextLine();}
        mathoperation = tempinput;
        return mathoperation;
    }
}


