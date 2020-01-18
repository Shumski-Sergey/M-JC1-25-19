package src.irusy;
import java.util.Scanner;


public class PrepinCountMassiv {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int counter = 0;
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '.' || s.charAt(i) == '?' ||s.charAt(i) == '!' ||s.charAt(i) == ',' ||s.charAt(i) == ';'
                    ||s.charAt(i) == ':' || s.charAt(i) == '-' || s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '\"')
                counter++;
        }

        System.out.println(counter);
    }

}
