package dmitrypolyakov.TaskLines;

/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 24.01.2020
 * <p>
 * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество
 */

public class Loops1 {
    public static void main(String[] args) {
        String text = ". !?;:-ф--рац ,,ауцацуа. шлваыс!?";
        int before = text.length();
        int after = text.replaceAll("[,.!?:;-]", "").length();
        System.out.println("Количество знаков препинания в тексте: " + (before - after));
    }
}