package src.irusy;
import java.util.Scanner;

public class CountSlovMassiv {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s += ' ';  // на случай если строка не оканчивается пробелом
        int counter = 0;

        for(int i = 1; i < s.length(); i++){
            if (s.charAt(i) == ' ' && s.charAt(i-1) != ' ')
                counter++;
        }
        System.out.println(counter);

    }

}
