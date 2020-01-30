package riliuchik.lab7_collections.Lab7_taskB1;

import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GetDictionary {
    public TreeMap<String, Integer> dictionary(String str) {
        TreeMap<String, Integer> list = new TreeMap<>();
        Pattern p = Pattern.compile("[А-яЁёA-z]+");
        Matcher matcher = p.matcher(str.toLowerCase());
        while (matcher.find()) {
            String temp = matcher.group();
            if (list.containsKey(temp)) list.put(temp, list.get(temp) + 1);
            else list.put(temp, 1);
        }
        return list;
    }
}