package a.mitsura.Collections;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {

    public static final int MAX_MARK = 5;
    public static final int ACCEPT_MARK = 3;

    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        Random a = new Random();
        for(int i = 0; i< MAX_MARK; i++){
            marks.add(a.nextInt(6));
        }
        System.out.println("All the marks are: " + marks);
        for(int i=0; i<marks.size(); i++) {
            if(marks.get(i)<ACCEPT_MARK){
                marks.remove(i);
                i--;
            }
        }
        System.out.println("Your new list is consists of: "+marks);
    }
}
