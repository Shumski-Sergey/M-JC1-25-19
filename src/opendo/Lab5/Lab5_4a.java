import java.util.Scanner;

public class Lab5_4a {
    public static void main(String[] args) {
        //Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
        // Если таких слов несколько, найти первое из них.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int numbOfWords = in.nextInt();
        String[] word = new String[numbOfWords];
        int[] unNumb = new int[numbOfWords];

        for (int i = 0; i < numbOfWords; i++) {
            System.out.print("Enter " + (i + 1) + " word: ");
            Scanner in2 = new Scanner(System.in);
            word[i] = in2.nextLine();
            int charWord = word[i].length();
            for (int j = 0; j < word[i].length(); j++) {
                for (int k = j + 1; k < word[i].length(); k++) { //сравниваем j букву и k(последующие)
                    if (word[i].charAt(j) == word[i].charAt(k)) {
                        charWord--;
                        break;
                    }
                }
            }
            unNumb[i] = charWord;
        }
        int minNumb = unNumb[0];
        for (int i = 0; i < numbOfWords - 1; i++) {
            if (unNumb[i + 1] < unNumb[i])
                minNumb = unNumb[i + 1];
        }

        System.out.print("A word with a minimum number of different symbols: ");
        for (int i = 0; i < numbOfWords; i++) {
            if (unNumb[i] == minNumb) {
                System.out.println(word[i]);
                break;
            }
        }
    }
}


