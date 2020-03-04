package src.irusy.SecondControl;

import java.util.Scanner;

/**
 * Created by user on 04.03.2020.
 */
public class SecondTaskMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        FindMostCommon arr = new FindMostCommon();
        for(int i =0; i < n; i++){
            arr.add(in.nextInt());
        }
        in.close();

        int[] result = arr.findMostCommon();
        System.out.print(result[0] + " " + result[1]);
    }

}
