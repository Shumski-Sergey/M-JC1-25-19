package dbesan.secondcontrol.maxAndMinValues;


public class Logics {
    public static void maxAndMinValues(int[] arr){

 int max = 0;
 int min = arr[0];
  for (int i: arr){
     if (i>max){
         max = i;}
  else if(i<min){
         min = i;
     }
  }
 System.out.println(max);
        System.out.println(min);

 }
    }


