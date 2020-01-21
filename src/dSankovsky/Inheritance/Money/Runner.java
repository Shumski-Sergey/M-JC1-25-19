package dSankovsky.Inheritance.Money;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Runner {

    public static void main(String[] args) throws IOException {
        Pattern pattern = Pattern.compile(",");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Money moneyArr[] = new Money[2];
        Operations operations = new Operations();

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter the amount of money: ");
            String enteredMoney = reader.readLine();
            String[] arr = pattern.split(enteredMoney);
            moneyArr[i] = new Money(Long.parseLong(arr[0]), (char) Integer.parseInt(arr[1]));
        }
        System.out.println("Enter the operation (0 - sum, 1 - sub, 2 - div, 3 - divWithConst, 4 - mulWithConst, 5 - equal): ");
        String operationNumb = reader.readLine();

        switch (Integer.parseInt(operationNumb)) {
            case 0:
                operations.sumMoney(moneyArr[0], moneyArr[1]);
                break;
            case 1:
                operations.subMoney(moneyArr[0], moneyArr[1]);
                break;
        }
    }
}



