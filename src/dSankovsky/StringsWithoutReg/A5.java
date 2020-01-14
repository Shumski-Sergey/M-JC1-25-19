package dSankovsky.StringsWithoutReg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//find amount of words with only letters and with same amount of vowels and consonants
public class A5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of lines");
        String numb = reader.readLine();
        int numbOfLines = Integer.parseInt(numb);
        String[] wordArr = new String[numbOfLines];

        for (int i = 0; i < wordArr.length; i++) {
            System.out.println("Enter the line");
            wordArr[i] = reader.readLine();
            wordArr[i] = wordArr[i].toLowerCase();
        }

        int numbVow = 0, numbCons = 0, numbWords = 0, numbWordsWithVowAndCons = 0;

        for (String s : wordArr) {
            FindVowelAndConsonansWord findVowelAndConsonansWord = new FindVowelAndConsonansWord(numbVow, numbCons, numbWords, numbWordsWithVowAndCons, s).invoke();
            numbVow = findVowelAndConsonansWord.getNumbVow();
            numbCons = findVowelAndConsonansWord.getNumbCons();
            numbWords = findVowelAndConsonansWord.getNumbWords();
            numbWordsWithVowAndCons = findVowelAndConsonansWord.getNumbWordsWithVowAndCons();
        }
        System.out.println("Words with only Lettes: " + numbWords);
        System.out.println("Words with Vowels and Consonants: " + numbWordsWithVowAndCons);
    }

    public static boolean isVowel(char vowel) {
        return vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u';

    }
    public static class FindVowelAndConsonansWord {
        private int numbVow;
        private int numbCons;
        private int numbWords;
        private int numbWordsWithVowAndCons;
        private String s;

        public FindVowelAndConsonansWord(int numbVow, int numbCons, int numbWords, int numbWordsWithVowAndCons, String s) {
            this.numbVow = numbVow;
            this.numbCons = numbCons;
            this.numbWords = numbWords;
            this.numbWordsWithVowAndCons = numbWordsWithVowAndCons;
            this.s = s;
        }

        public int getNumbVow() {
            return numbVow;
        }

        public int getNumbCons() {
            return numbCons;
        }

        public int getNumbWords() {
            return numbWords;
        }

        public int getNumbWordsWithVowAndCons() {
            return numbWordsWithVowAndCons;
        }

        public FindVowelAndConsonansWord invoke() {
            boolean isLetter = false;
            char[] letterArr = s.toCharArray();
            for (int i = 0; i < letterArr.length; i++) {
                if (!Character.isLetter(letterArr[i])) {
                    break;
                } else if (i == letterArr.length - 1) {
                    isLetter = true;
                    numbWords++;
                }
                if (isVowel(letterArr[i])) {
                    numbVow++;
                } else {
                    numbCons++;
                }
            }
            if (!isLetter) {
                numbCons = 0;
                numbVow = 0;

            } else if (numbCons == numbVow) {
                numbWordsWithVowAndCons++;
                numbCons = 0;
                numbVow = 0;
            }
            return this;
        }
    }
}

