package riliuchik.lab7_collections.fileCollections.Lab7_1_taskB1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

//Имеется текст. Следует составить для него частотный словарь.

public class Lab7_1_taskB1 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст:");
        String text = in.readLine();
        GetDictionary getDictionary = new GetDictionary();
        Map<String, Integer> dictionary = getDictionary.dictionary(text);
        System.out.println("Частотный словарь в алфавитном порядке:");
        for (Map.Entry e : dictionary.entrySet()) System.out.println(e.getKey() + " - " + e.getValue() + " раз");
    }
}