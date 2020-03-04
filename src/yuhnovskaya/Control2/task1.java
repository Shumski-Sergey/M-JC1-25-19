package src.yuhnovskaya.Control2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 04.03.2020.
 */
public class task1 {
    public static void main(String[] avgs){
        ArrayList<Integer> list=new ArrayList<>();
        final int FINAL_NUMBER=666;
        Scanner scanner=new Scanner(System.in);
        while(true){
            int digit=scanner.nextInt();
            if(digit==FINAL_NUMBER)break;
            list.add(digit);
        }
        Integer minimal=list.stream().min(Integer::compare).get();
        Integer maximum=list.stream().max(Integer::compare).get();
        Integer sum=list.stream().reduce(0,(acc,x)->acc+x)-minimal-maximum;
        System.out.println(minimal);
        System.out.println(maximum);
        System.out.println(sum);
    }
 }
