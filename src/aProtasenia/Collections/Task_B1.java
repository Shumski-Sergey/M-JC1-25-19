package aProtasenia.Collections;
//B1.Имеется текст. Следует составить для него частотный словарь

import java.util.LinkedList;
import java.util.Scanner;

public class Task_B1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words with a space: ");
        String words = scanner.nextLine();

        String[] wordsArray = words.split("\\s|\\.\\s|\\.");

        LinkedList<String> wordsList = new LinkedList<>();
        for (int i = 0; i < wordsArray.length; i++) {
            int k = 0;
            for (int j = 0; j < wordsArray.length; j++) {
                if (wordsArray[i].equals(wordsArray[j])) {
                    k++;
                }
                if (j == wordsArray.length - 1) {
                    wordsList.add(k + " " + wordsArray[i]);
                }
            }
        }
        System.out.println(wordsList);
        for (int i = 0; i < wordsList.size(); i++) {
            for (int j = 0; j < wordsList.size(); j++) {
                if(wordsList.get(i).equals(wordsList.get(j)) && i != j){
                    wordsList.remove(j);
                }
            }
        }
        System.out.println(wordsList);
    }
}
