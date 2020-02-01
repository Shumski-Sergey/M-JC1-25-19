package src.pvetashkov.lab_Collect_beginning; // не доделал!!!!! не идет проверка должным образом
import java.io.*;
import java.util.ArrayList;
public class labCollectionB1 {
    public static void main(String [] args) throws IOException{
        System.out.println("Enter any text with repitting words");
        BufferedReader brd = new BufferedReader(new InputStreamReader(System.in));
        String str=brd.readLine();
        String[] preditog=str.split(" +");
        String[] itog=new String[preditog.length];
        ArrayList<String> dictionary=new ArrayList<>();

        for (int i=0; i<preditog.length;i++){
            int count=0;
            for (int j=1; j<preditog.length-1;j++){
            if (preditog[j].equals(preditog[j+1])){
            count++;
            }
            dictionary.add(i, (preditog[j])+count);}
            }
        System.out.println(dictionary);
        }
    }
