package a.mitsura.Lesson3_Strings;

import java.util.Scanner;
public class Str1 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter your text");
        String text=enter.nextLine();
        int a=text.length();
        int b=text.replaceAll("[,.?!-;]", "").length();
        System.out.println(a-b);
    }
}