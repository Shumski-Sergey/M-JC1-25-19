package src.pvetashkov.lab_Collect_beginning;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;
public class CollectionA3 {
    public static void main(String[] args) {
        ArrayList<Integer> licey = new ArrayList<>(30);
        Random rnd = new Random();
        int mark ;
        for (int i = 0; i < 30; i++) {
            mark = rnd.nextInt(10);
            licey.add(i, mark);
            System.out.print(licey.get(i) + "_");
        }
        Iterator<Integer> itr = licey.iterator();
        int best=0;
        while (itr.hasNext()) {
            int thebest = itr.next();
            if (best < thebest) {
                best = thebest;
            }
        }
            System.out.println("the higest mark is " + best);
        }
    }
