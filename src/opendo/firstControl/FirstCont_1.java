import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstCont_1 {
    //В данной строке найти количество цифр. Вывести количество и сумму цифр.(С клавиатуры)
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        sumOfNumber(str);
    }

    public static void sumOfNumber (String str){
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(str);
        int n = 0;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (matcher.find()) {
                sum += Integer.parseInt(matcher.group());
                n++;
            }
        }
        System.out.println("Количество цифр в строке: " + n);
        System.out.println("Сумма цифр:" + sum);
    }
}


