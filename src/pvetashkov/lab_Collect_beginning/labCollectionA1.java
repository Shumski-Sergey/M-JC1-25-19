package pvetashkov.lab_Collect_beginning; //только начал
import java.util.ArrayList;
import java.util.Random;
public class labCollectionA1 {
    public static void main(String[] args){
        Random rand=new Random();
        int mark;
        ArrayList<Integer> pupil=new ArrayList<>(30);
        for (int i=0; i<30;i++){
            mark=rand.nextInt(10);
            pupil.add(i, mark);
        }
        System.out.print(pupil);
        System.out.println();
        for (int i=0; i<30; i++){
            if (pupil.get(i) <4){
                pupil.remove(i);
        }
            System.out.print(pupil.get(i)+"-");}
    }
}
