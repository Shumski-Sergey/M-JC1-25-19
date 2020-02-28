package a.mitsura.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task3 {
    public static final int HOW_MUCH_MARKS = 12;
    public static final int ACCEPT_MARK = 3;

    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        Random a = new Random();
        for (int i = 0; i < HOW_MUCH_MARKS; i++) {
            marks.add(a.nextInt(11));
        }
        System.out.println("All the marks are: " + marks);
        int bestMark=0;
        for (Iterator<Integer> iterator = marks.iterator(); iterator.hasNext(); ) {
            Integer next =  iterator.next();
                if(next>bestMark){
                    bestMark=next;
                }
        }
        System.out.println(bestMark);
    }
}