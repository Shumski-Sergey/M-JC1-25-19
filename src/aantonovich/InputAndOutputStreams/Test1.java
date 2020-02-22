package aantonovich.InputAndOutputStreams;

// найти совпадения начальной буквы слова и последней буквы предыдущего слова

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Test1 {
    private static final File FILE_DIRECTORY = new File("src" +File.separator+ "aantonovich"+ File.separator+ "InputAndOutputStreams");
    public static void main (String[] args){
        File file = new File(FILE_DIRECTORY, "test.txt");
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))){
            String previousWord = null;
            if (scanner.hasNext()){
                previousWord = scanner.next();
        }
            while (scanner.hasNext()){
                String nextWord = scanner.next();
                if (lastLetter(previousWord).equalsIgnoreCase(firstLetter(nextWord))){
                    System.out.println(previousWord + " : " + nextWord);
                }
                previousWord = nextWord;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
}
       private  static  String lastLetter(String word) {
        return word.substring(word.length() - 1);
}
       private static String firstLetter(String word){
        return word.substring(0, 1);
}
}