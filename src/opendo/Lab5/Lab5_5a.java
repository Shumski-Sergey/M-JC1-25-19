import java.util.Scanner;

public class Lab5_5a {
    public static void main(String[] args) {
        //Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского алфавита,
        // а среди них – количество слов с равным числом гласных и согласных букв.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int numbOfWords = in.nextInt();
        String[] strs = new String[numbOfWords];
        int numbLat = 0;
        int identical = 0;
        for (int i = 0; i < numbOfWords; i++) {
            System.out.print("Enter " + (i + 1) + " word: ");
            Scanner in2 = new Scanner(System.in);
            strs[i] = in2.nextLine();
            for (int j = 0; j < strs[i].length(); j++) {
                if ((strs[i].charAt(j) >= '\u0041' && strs[i].charAt(j) <= '\u005A') ||
                        (strs[i].charAt(j) >= '\u0061' && strs[i].charAt(j) <= '\u007A')) {
                    numbLat++;
                    break;
                }
                int c = 0;
                int v = 0;
                for (int k = 0; k < strs[i].length(); k++) {
                    if (strs[i].charAt(k) == 'A' || strs[i].charAt(k) == 'a' ||
                            strs[i].charAt(k) == 'E' || strs[i].charAt(k) == 'e' ||
                            strs[i].charAt(k) == 'I' || strs[i].charAt(k) == 'i' ||
                            strs[i].charAt(k) == 'O' || strs[i].charAt(k) == 'o' ||
                            strs[i].charAt(k) == 'U' || strs[i].charAt(k) == 'u')
                        v++;
                    else c++;
                }
                if (v == c)
                    identical++;
            }
            System.out.println("Number of words containing only latin characters: " + numbLat);
            System.out.println("Number of words with an equal number of vowels and consonants: " + identical);
        }
    }
}

