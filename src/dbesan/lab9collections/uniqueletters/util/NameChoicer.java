package dbesan.lab9collections.uniqueletters.util;

import java.util.HashMap;
import java.util.Map;

import static dbesan.lab9collections.uniqueletters.util.Constants.*;

public class NameChoicer {

    private static Map<Integer, String> VariantCounts = new HashMap<>();

    public static void maker() {
        VariantCounts.put(ONECHOICE, "UniqueChars UniqueChars = new UniqueChars();\n" +
                "            UniqueChars.setText(getText());\n" +
                "            UniqueChars.calculate();\n" +
                "            System.out.print(UniqueChars.toString());");
        VariantCounts.put(SECONDCHOICE, "UniqueDigits UniqueDigits = new UniqueDigits();\n" +
                "            UniqueDigits.setText(getText());\n" +
                "            UniqueDigits.calculate();\n" +
                "            System.out.print(UniqueDigits.toString());");
        VariantCounts.put(THIRDCHOICE, " UniqueLetters UniqueLetters = new UniqueLetters();\n" +
                "            UniqueLetters.setText(getText());\n" +
                "            UniqueLetters.calculate();\n" +
                "            System.out.print(UniqueLetters.toString()");
        VariantCounts.put(FOURCHOICE, "UniqueUpperCase UniqueUpperCase = new UniqueUpperCase();\n" +
                "            UniqueUpperCase.setText(getText());\n" +
                "            UniqueUpperCase.calculate();\n" +
                "            System.out.print(UniqueUpperCase.toString());");
        VariantCounts.put(FIVECHOICE, "UniqueUpperCase UniqueUpperCase = new UniqueUpperCase();\n" +
                "            UniqueUpperCase.setText(getText());\n" +
                "            UniqueUpperCase.calculate();\n" +
                "            System.out.print(UniqueUpperCase.toString());");
    }

    public static String getVariantCounts(int key) {
        return VariantCounts.get(ONECHOICE);
    }
}