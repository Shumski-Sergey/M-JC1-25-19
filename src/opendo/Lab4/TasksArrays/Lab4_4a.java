public class Lab4_4a {
    /*Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….*/
    public static void main(String args[]) {
        int numb=2;
        for (int i = 1; i<=20; i++) {
            numb =numb*2;
            System.out.print(numb+" ");
        }
    }
}

