package src.aProtasenia.FirstControl.Task_1;

public class numberOfDigitsPerString {

    public static void numOfDigits (String str) {
        int numDigits = str.length() - str.replaceAll("\\d+", "").length();
        System.out.println("Number of digits per string: "+ numDigits);
    }
}
