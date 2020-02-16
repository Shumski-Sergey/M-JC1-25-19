package iromankova.packageOfUsedClasses;

import java.util.Scanner;

public class InputOutput {

    // Ввести с консоли имя файла:
    public static String pathToTheFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу : ");
        return scanner.nextLine();
    }
}
