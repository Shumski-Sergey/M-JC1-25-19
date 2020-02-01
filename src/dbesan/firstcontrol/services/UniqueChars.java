package dbesan.firstcontrol.services;

import dbesan.firstcontrol.services.impl.UniqueService;
import dbesan.firstcontrol.util.InputText;

import java.util.HashMap;
import java.util.Map;

public class UniqueChars implements UniqueService {
    private Map<String, Integer> map = new HashMap<>();
    private String text;
    private int countdigits = 0;
    private int summa = 0;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = InputText.Text();
    }

    public void calculateUniqueDigits() {
        for (char character : text.toCharArray()) {
            if (Character.isDigit(character)) {
                countdigits++;
                summa = +character;
            }
        }
        map.put("Количество", countdigits);
        map.put("Сумма", summa);
    }

    @Override
    public String toString() {
        System.out.println("Результат:");
        String result = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result += " " + entry.getKey() +
                    " " + entry.getValue() + "\n";
        }
        return result;
    }
}


