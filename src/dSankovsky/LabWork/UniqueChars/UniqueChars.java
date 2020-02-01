package dSankovsky.LabWork.UniqueChars;

import java.util.HashMap;
import java.util.Map;

public class UniqueChars {

    private Map<Character, Integer> map = new HashMap<>();
    private String text;
    private int mode;
    private boolean condition;

    public void calculate() {
        for (char c : text.toCharArray()) {
            if (SwitchMode(c)) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
    }

    public boolean SwitchMode(char c) {
        switch (mode) {
            case 0:
                condition = Character.isLetter(c);
                break;
            case 1:
                condition = Character.isDigit(c);
                break;
            case 2:
                condition = !Character.isLowerCase(c) && Character.isLetter(c);
                break;
            case 3:
                condition = Character.isLowerCase(c) && Character.isLetter(c);
        }
        return condition;
    }

    @Override
    public String toString() {
        String result = "";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            result += "char:" + entry.getKey() +
                    "; count:" + entry.getValue() + "\n";
        }
        return result;
    }

    public Map<Character, Integer> getMap() {
        return map;
    }

    public void setMap(Map<Character, Integer> map) {
        this.map = map;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
