package src.pvetashkov.generics.lab.generics;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class A1 {// as Velcom "And Tomorrow will be youth"
    public static void main(String []args) throws IOException{
        System.out.println("Enter any nums with commas and brakes ");// comma это запятая. свят-свят...
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=new String();
        str=br.readLine();
        System.out.println("You entered this nums "+ str);
        String[] arr=str.split(", +");// раздел по запятой и пробелу/ам
        Set<String> modernized=new HashSet<>(Arrays.asList(arr));
        System.out.println("without repeatted nums "+modernized);
    }
}
