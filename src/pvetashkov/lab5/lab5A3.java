package pvetashkov.lab5;//выводит со средней строки по расположению в массиве
import java.util.Scanner;
import java.io.*;
public class lab5A3 {
    public static void main(String[] args) throws IOException {
        int n;
        String temp, sign;
        System.out.print("how many?_");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
        String str[]=new String[n];
        System.out.print("Type your strings...");
        for (int i=0;i<n;i++){
            str[i]=bread.readLine();
            System.out.println(str[i]+ " ");// вывод для меня. смотрю, работает ли.
        }
        for (int i=n-1;i>=0;i--) {
            for (int j = 0; j <n-1; j++) {
                if (str[j].length() >str[j+1].length()){
                    temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            } System.out.println(str[i]+" " +str[i].length()+"digits "+ "_");
           }
        System.out.print("To see longer strings press 'L', to see shorter press 's' ");
        sign=sc.next();
        if (sign.equals("L")){
            for (int i=0;i<n;i++){
                System.out.print(" length is "+str[i].length()+"for "+str[i]);
            }
        }
        else if(sign.equals("s")){
            for (int i=0;i<n/2;i++){
                System.out.println(" short length is "+str[i].length()+" in "+str[i]);
            }
        }

    }
}
