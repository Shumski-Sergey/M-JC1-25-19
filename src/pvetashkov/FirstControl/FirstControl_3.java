package src.pvetashkov.FirstControl;

import java.io.*;
import java.util.ArrayList;

public class FirstControl_3 {
    public static void main(String[] args) throws IOException {
        String str;
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Type here anything");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
            arr.add(str);
        }
        System.out.println("All you type was " + arr); // можно циклом вывести красиво, но это лишние строки. экономим))
        int index = 0, longest = arr.get(0).length();
        for (int i = 0; i < 5; i++) {
            if (arr.get(i).length() > longest) {
                longest = arr.get(i).length();
                index = arr.indexOf(arr.get(i));
            }
        }
        System.out.print("I could! The longest string is '" + arr.get(index) + "'. It has " + longest + " symbols");
    }

}