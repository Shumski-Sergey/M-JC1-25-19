package aantonovich.Lesson5.Strings;
//Имеется строка с текстом. Подсчитать количество слов в тексте
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        int word = text.split(" +").length;
        System.out.println("В тексте " + word + " слов.");
    }
}
