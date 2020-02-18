package dbesan.lab10lamdas;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class LambdaCalculator {
    private static double firstnumber;
    private static double secondnumber;
    private static String mathoperation;
    private static double result;
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLU = "*";
    private static final String SPLIT = "/";
    private static final String PROC = "%";
    private static final String SQRT = "sqrt";
    private static final String POW = "pow";

    public static void main(String[] args) {
        printer();
    }

    private static void printer() {
        System.out.println("Введите первое число");
        firstnumber = inputnumber();
        System.out.println("Введите знак действие: +, *, /, - , % , Math.sqrt(), Math.pow()");
        mathoperation = mathoperation();
        if (mathoperation != SQRT) {
            System.out.println("Введите второе число");
            secondnumber = inputnumber();
        }
        System.out.println("Результат: " + firstnumber + " " + mathoperation + " " + secondnumber + "=");
        calculate();
    }

    public static void calculate() {
        Stream.of(firstnumber, secondnumber, mathoperation)
                .map(e -> {
                    if (mathoperation.equals(PLUS)) {
                        result = firstnumber + secondnumber;
                    } else if (mathoperation.equals(MINUS)) {
                        result = firstnumber - secondnumber;
                    } else if (mathoperation.equals(MULTIPLU)) {
                        result = firstnumber * secondnumber;
                    } else if (mathoperation.equals(SPLIT)) {
                        result = firstnumber / secondnumber;
                    } else if (mathoperation.equals(PROC)) {
                        result = firstnumber % secondnumber;
                    } else if (mathoperation.equals(SQRT)) {
                        result = Math.sqrt(firstnumber);
                    } else if (mathoperation.equals(POW)) {
                        result = Math.pow(firstnumber, secondnumber);
                    }
                    return result;
                })
                .forEach(System.out::print);
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
        Scanner scanner1 = new Scanner(System.in);
        String mathoperation = " ";
        Pattern pattern1 = Pattern.compile("[+ * / - %  sqrt pow]");
        String temp;
        Matcher matcher1 = pattern1.matcher(temp = scanner1.nextLine());
        if (matcher1.find()) {
            mathoperation = temp;
        } else {
            mathoperation();
        }
        return mathoperation;
    }
}


