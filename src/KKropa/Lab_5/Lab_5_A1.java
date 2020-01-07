package KKropa.Lab_5;

public class Lab_5_A1 {
    public static void main (String [] args){
            int [] array = {2,15,4,16,3,6,9,1,3};
            int max=0;
            int Index=0;

            for (int i=0; i<array.length; i++){
                if (max<=array[i]){
                    max=array[i];
                    Index=i;
                }
            }System.out.println("Index of maximum element: "+Index);

    }
}
