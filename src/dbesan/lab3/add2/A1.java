package dbesan.lab3.add2;

import java.io.*;
import java.util.*;
public class A1 {
    public static void main(String[] args) throws IOException {
        int arr [] = {1,5,8,9,6,3,7,8,32,1,3,5,7,8, 99};
        int temp;
        for (int i = 0; i<arr.length;i++)
        if(arr[i] > arr[i+1]){
            temp = arr[i];
            arr [i+1]=arr[i];
            arr [i] = arr[i+1];
            

        }




        //List<Integer> list = new ArrayList<>(Arrays.asList(myArrayInt));
        {


        }


    }
}