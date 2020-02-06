package tabukara.lab4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students in the group: ");
        int n = in.nextInt();
        int stud[] = new int[n];
        int i;
        System.out.print("The student marks is: ");
        for (i = 0; i < n; i++) {
            stud[i] = (int) (Math.random() * 11);
            System.out.print(+stud[i] + " ");
        }
        int maxn = 0;
        int max = stud[maxn];
        for (i = 1; i < n; i++) {
            if (stud[i] > max) {
                max = stud[i];
                maxn = i;
            }
        }
        String answer = "";
        for (i = 0; i < n; i++) {
            if (stud[i] == max) {
                max = stud[i];
                maxn = i;
                answer = answer + maxn + " ";
            }
        }
        System.out.println("\n starting from zero the number of maximum  mark is: " + answer);


    }
}
