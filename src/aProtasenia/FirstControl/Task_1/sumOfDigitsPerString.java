package src.aProtasenia.FirstControl.Task_1;

public class sumOfDigitsPerString {
    public static void sumOfDigits(String str) {
        int sum = 0;
        for (char c : str.replaceAll("\\D", "").toCharArray()) {
            int sumDigits = c - '0';
            sum += sumDigits;
        }
        System.out.println("Sum of digits per string: " + sum);
    }
}
