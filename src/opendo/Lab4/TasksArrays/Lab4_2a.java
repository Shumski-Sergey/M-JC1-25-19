public class Lab4_2a {
    /*Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….*/
    public static void main(String args[]) {
        int numb=1;
        for (int i = 1; i<=55; i++) {
            numb +=2;
            System.out.print(numb+" ");
        }
    }
}

