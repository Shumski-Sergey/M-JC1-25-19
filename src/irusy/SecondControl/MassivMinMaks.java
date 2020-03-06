package src.irusy.SecondControl;
import java.util.Scanner;

public class MassivMinMaks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        MyList arr = new MyList();
        for(int i =0; i < n; i++){
            arr.add(in.nextInt());
        }
        in.close();

        System.out.println("Max: " + arr.findMax() + " \nMin: " + arr.findMin() + " \nSum without max and min: " + arr.findSumWithoutMaxMin());
    }
}
