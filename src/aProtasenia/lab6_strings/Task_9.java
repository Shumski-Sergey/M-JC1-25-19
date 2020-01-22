package src.aProtasenia.lab6_strings;
//Найти в строке не только запятые, но и другие знаки препинания.
// Подсчитать общее их количество

public class Task_9 {
    public static void main(String[] args) {
        String text = "When the waves of death compassed me, the floods of ungodly men made me afraid; " +
                "The sorrows of hell compassed me about; the snares of death prevented me; " +
                "In my distress I called upon the LORD, and cried to my God: and he did hear my voice out of his temple," +
                " and my cry did enter into his ears.";
        int past = text.length();
        int future = text.replaceAll("[,.:;]", "").length();
        System.out.println("The number of punctuation marks in the text: " + (past - future));
    }
}
