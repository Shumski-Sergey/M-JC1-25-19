package pvetashkov.lab6; //только начал
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
public class lab6A1 {
    public static void main(String[] args){
        Random rand=new Random();
        int mark;
        ArrayList<Integer> pupil=new ArrayList<>(30);
        for (int i=0; i<30;i++){
            mark=rand.nextInt(10);
            pupil.add(i, mark);
        }
        System.out.print(pupil);
    }
}
