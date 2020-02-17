package src.pvetashkov.Generics;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
public class labGenericsB1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Type here ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] mass = str.split(" +");
        ArrayList arr = new ArrayList();
        for (int i = 0; i < mass.length; i++) {
            arr.add(mass[i]);
            System.out.println(arr.get(i));
        }
        System.out.println("and number of element");
        Scanner sc=new Scanner(System.in);
        int a;
        try { a=sc.nextInt();
            System.out.println("this is "+arr.get(a-1));
        } catch (Exception e){
            System.out.println("type NUMBER!");
        }


    }
}