package src.aProtasenia.lab6_strings;
//Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.

public class Task_11 {
    public static void main(String[] args) {
        String text = "And I say unto you, ask, and it shall be given you; seek, and ye shall find; " +
                "knock, and it shall be opened unto you. For everyone who asks receives, and he who seeks finds," +
                " and to him who knocks it will be opened.";

        text = text.replaceAll("[.,:;]", "");
        String[] words = text.split(" ");
        StringBuilder upgrade = new StringBuilder();
        for(String word : words) {
            upgrade.append(word.charAt(word.length()-1));
        }
        System.out.print(upgrade);
    }
}

