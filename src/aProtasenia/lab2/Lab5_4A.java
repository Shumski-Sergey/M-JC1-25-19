package src.aProtasenia.lab2;
//Создать двухмерный квадратный массив, и заполнить его «бабочкой»,
//т.е таким образом:
//1 1 1 1 1
//0 1 1 1 0
//0 0 1 0 0
//0 1 1 1 0
//1 1 1 1 1
public class Lab5_4A {
    public static void main(String[] args) {
        int[][] binaryButterfly = {
                {1,1,1,1,1},
                {0,1,1,1,0},
                {0,0,1,0,1},
                {0,1,1,1,0},
                {1,1,1,1,1}
        };
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(binaryButterfly[i][j] + " ");
            }
            System.out.println();
        }
    }
}
