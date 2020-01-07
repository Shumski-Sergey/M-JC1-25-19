package pvetashkov.lab3;
public class lab3t2A4 {
public static void main(String[] args){
    int a=2;
    int array[]=new int[20];
    for (int i=0; i<=19; i++){
        array[i]=a;
        a=a*2;
        System.out.print("_"+ array[i]);
    }
}
}
