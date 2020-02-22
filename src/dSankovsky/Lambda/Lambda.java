package dSankovsky.Lambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//make calculator with lambda
public class Lambda {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the expression: ");
        String[] arr = reader.readLine().split(" ");
        Calculate(Double.parseDouble(arr[0]), Double.parseDouble(arr[2]), arr[1]);
    }

    public static void Calculate(double value1, double value2, String sign) {
        Operation<Double, String> calculation = (v1, v2, sign1) -> {
            switch (sign) {
                case "+":
                    return v1 + v2;
                case "-":
                    return v1 - v2;
                case "*":
                    return v1 * v2;
                case "/":
                    return v1 / v2;
                case "^":
                    return Math.pow(v1, v2);
                default:
                    throw new IllegalArgumentException();
            }
        };
        System.out.println(calculation.getResult(value1,value2,sign));
    }
}


