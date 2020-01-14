package pvetashkov.lab_Collect_beginning;
import java.util.Random;
import java.util.ArrayList;
public class labCollectionA2 {
    public static void main(String[]args){
        //Collection my=createCollection();
        ArrayList<Integer> nums=new ArrayList<>(25);
        Random rand=new Random();
        int count;
        for (int i=0; i<25; i++){
            count=rand.nextInt(200);
             nums.add(i, count);
             System.out.print(nums.get(i) + " ");
        }
        System.out.println();
        for (int i=0; i<24; i++){
                if (nums.get(i).equals(nums.get(i+1))){
                nums.remove(i);}
            System.out.print(nums.get(i)+" ");
            }
    }
}
