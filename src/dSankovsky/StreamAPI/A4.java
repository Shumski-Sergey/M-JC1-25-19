package dSankovsky.StreamAPI;

import java.io.*;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.MatchResult;

//read file, find all words "chlorine" and print
public class A4 {
    public static void main(String[] args) throws Exception {

        Reader fileReader = new FileReader("src\\dSankovsky\\StreamAPI\\test.txt");
        Scanner scanner = new Scanner(fileReader);
        scanner.findAll("chlorine").map(MatchResult::group).forEach(System.out::println);
        fileReader.close();
    }
}
