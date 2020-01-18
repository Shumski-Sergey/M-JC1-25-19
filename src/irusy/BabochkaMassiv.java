package src.irusy;

public class BabochkaMassiv {
    public static void main(String[] args){
        int n = 5;
        int[][] a = new int [n][n];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= n / 2 && j >= i && j < n - i)   //Разбираемся с верхним треугольником
                    a[i][j] = 1;
                else if (i >= n / 2 && j >= n - i - 1 && j < i + 1 )   //Потом с нижним
                    a[i][j] = 1;
                else
                    a[i][j] = 0;
                System.out.print(a[i][j]);
            }
            System.out.println(' ');
        }
    }

}
