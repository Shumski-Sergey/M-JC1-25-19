package src.yuhnovskaya.Control2;

import java.util.List;
import java.util.Scanner;

/**
 * Created by user on 04.03.2020.
 */
public class FillArray {
    List list;
    public FillArray(List list){
        this.list=list;}
    public  static void Fill_Array(List list){
        Scanner scanner=new Scanner(System.in);
        while(true){
            int digit=scanner.nextInt();
            if(digit==666)break;
            list.add(digit);
        }

    }
}
