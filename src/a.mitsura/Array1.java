package a.mitsura;

public class Array1 {
    public static void main(String[] args){
        int [] array={2,7,6,3,0,1};
        for(int i=0; i<array.length;i++){
            int minIndex=i;
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[minIndex]){
                    minIndex=j; } }
        int temp=array[i];
            array[i]=array[minIndex];
            array[minIndex]=temp;}
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
