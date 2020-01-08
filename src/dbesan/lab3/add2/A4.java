package dbesan.lab3.add2;

public class A4 {
    public static void main(String[] args) {
        int[][] butterfly;
        butterfly = new int[5][5];
        for (int i = 0; i < butterfly.length; i++) {
            for (int j = i; j < (butterfly.length)-i; j++) {
               butterfly[i][j]=1;
                butterfly[(butterfly.length-1) - i][j] = 1;

            }

        }
        for (int i = 0; i < butterfly.length; i++) {
            for (int j = 0; j < butterfly[i].length; j++) {
                System.out.print(butterfly[i][j]);
            }
            System.out.println();

        }
    }
}
