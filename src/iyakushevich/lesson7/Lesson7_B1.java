package iyakushevich.lesson7;

import iyakushevich.lesson7.B1_util.FrequencyDictionary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * B1.Имеется текст. Следует составить для него частотный словарь
 */

public class Lesson7_B1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст: ");
        String text = bufferedReader.readLine();
        text = text.toLowerCase();

        FrequencyDictionary.countWords(text);
    }
}
