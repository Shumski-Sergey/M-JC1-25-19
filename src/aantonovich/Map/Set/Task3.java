package aantonovich.Map.Set;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Пользователь вводит через один пробел слова. Найти все группы анаграмм
// (слов, составленных из одних и тех же букв) в этой строке и вывести в консоль их
// каждую с новой строки, все слова должны идти через пробел в порядке, в котором они встречаются
// в строке. При этом допускается выводить одинаковые слова в одной строке анаграмм.
// Слова состоящие из разного количества одинаковых букв анаграммами не являются. Пример:
//
//Входная строка: «123 456 231 546 231 312 4556»
//
//Результат:
//123 231 231 312
//456 546
//4556
//Слова с разным регистром букв  не будут являться анаграммами. Решается данная проблема
// с помощью комманды которая переводит всю строку к строчному виду.
//    text = text.toLowerCase;
public class Task3 {
    public static void main (String[] args) {
        System.out.println("Enter words with a space:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        text = text.toLowerCase();
        String[] words = text.split(" ");
        // сон нос слон Сон крот кот рОт орт
        Map<String, String> anagram = new HashMap<>();
        for (String newWord : words) {
            char[] chars = newWord.toCharArray();
            Arrays.sort(chars);
            String wordKey = new String(chars);
            anagram.merge(wordKey, newWord, (a, b) -> a + " " + b);
        }
        for(String output: anagram.values()){
            System.out.println(output);
        }
    }
}