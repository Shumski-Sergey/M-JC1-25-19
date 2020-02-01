package aantonovich.FirstControl;

import java.util.Scanner;

// В данной строке найти количество цифр. Вывести количество и сумму цифр.(С клавиатуры)
public class Task1 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        System.out.println("Enter the string:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {// проверяем является ли символ i цифрой
                count++;
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        if(count >=1)
        System.out.println("In line " + count + " digits and their sum = " + sum);
        else
        System.out.println("There are no numbers in the line");
    }
}