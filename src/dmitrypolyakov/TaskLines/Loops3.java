package dmitrypolyakov.TaskLines;

/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 28.01.2020
 *
 * Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов
 */

public class Loops3 {
    public static void main(String[] args) {
        String str = "Имеется строка с текстом";
        StringBuilder res = new StringBuilder();
        String [] words = str.split("\\s+");
        for ( String word : words )
            res.append(word.toCharArray()[word.length() - 1]);
        System.out.println("В строке: " + str);
        System.out.println("Результат: " + res.toString());
    }
}
