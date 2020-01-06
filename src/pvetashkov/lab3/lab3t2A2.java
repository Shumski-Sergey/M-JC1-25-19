package pvetashkov.lab3;
public class lab3t2A2 {
    public static void main(String [] args){
        int array[]=new int[55];
        int a=1;
        for (int i=0; i<54; i++){
            array[i]=a;
            a=a+2;
            System.out.print(+array[i]+".");
        }
    }
}
