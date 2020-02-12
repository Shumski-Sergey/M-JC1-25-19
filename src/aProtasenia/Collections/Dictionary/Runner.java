package src.aProtasenia.Collections.Dictionary;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words: ");
        String words = scanner.nextLine();
        Dictionary hashMapDictionary = new Dictionary(words);
        System.out.println("Frequency dictionary: ");
        hashMapDictionary.getWordsFrequency();
    }
}
