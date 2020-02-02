package a.mitsura.KP;

import java.util.ArrayList;
import java.util.Collections;

public class Task3 {
    public static void main(String[] args){
        //Creating of the ArrayList
        ArrayList<Integer> rabbit = new ArrayList<>();
        //Adding values
        rabbit.add(5);
        rabbit.add(10);
        rabbit.add(2);
        rabbit.add(10);
        rabbit.add(3);
        rabbit.add(4);
        rabbit.add(2);
        rabbit.add(2);
        //Creating cells for most frequent number and times of frequents
        int freqNumber=0;
        int howMuchFreq=0;
        for(int i=0; i<rabbit.size(); i++){
            //Looking for the most times of frequents
            int a=Collections.frequency(rabbit, i);
            if(howMuchFreq<a){
                freqNumber=i;
                howMuchFreq=a;
            }
        }
        System.out.println("the most frequent number is "+freqNumber);
        System.out.println("it's exists in your list "+howMuchFreq+" times");
    }
}
