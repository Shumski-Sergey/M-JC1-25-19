package aantonovich.Training;

import java.util.Scanner;

public class PageCount {
    public static final int WRITE = 10;  // на одной странице помещается 10 записей
    public static int PAGES;
    public static int NUMBER_OF_NEWS;

    public static void main(String[] args) {
        System.out.println("Введите количество новостей");
        Scanner scanner = new Scanner(System.in);
        NUMBER_OF_NEWS = scanner.nextInt();
        if (NUMBER_OF_NEWS % WRITE > 0){
            PAGES = NUMBER_OF_NEWS/WRITE + 1;
        }else{
            PAGES = NUMBER_OF_NEWS/WRITE;
        }
        System.out.println(PAGES);
    }
}
