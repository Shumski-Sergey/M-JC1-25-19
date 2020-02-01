package src.pvetashkov.lab_Collect_beginning;
import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;
public class labCollectionA4 {
    public static void main(String [] args){
        int mln=1000000; //млн это понятно))
        int chirik=10000; // чирик это червонец, 10 т.е.
        long a,b,c,d,e,f;
        Random rnd=new Random();
        ArrayList<Integer> arr=new ArrayList<>(mln);
        LinkedList<Integer> link=new LinkedList<>();
        a=System.nanoTime();
        for (int i=0; i< mln; i++){
            arr.add(i, rnd.nextInt(mln / 2));
        }
        b=System.nanoTime();
        for (int i=0; i<chirik; i++){
            i=rnd.nextInt(mln);
            arr.remove(i);
        }
        e=System.nanoTime();
        System.out.println(((b-a)/mln)+" millisecs for filling 1 mln elm-s in ArrList and "+ ((e-a)/mln)+ " mill. for deleting 10 000 elm-s");
        c=System.currentTimeMillis();
        for (int i=0; i<mln; i++){
            link.add(i, rnd.nextInt(mln/2));
            }
        d=System.currentTimeMillis();
        for (int i=0; i<chirik; i++){
            i=rnd.nextInt(mln);
            link.remove(i);
        }
        f=System.currentTimeMillis();
        System.out.println(((d-c))+" millisecs for filling LinkedList and "+((f-c))+" sec for removing");
        if((b-a)<(d-c)){
            System.out.println("Filling Arrlist slower than LinkedList");
        }
        else {System.out.println("Filling ArrList faster, than LinkedList");}
    }
}
