package dbesan.lab9collections.Smartable.service;


import dbesan.lab9collections.Smartable.service.impl.Smartable;

import java.util.*;

public class SmartableService implements Smartable {
    @Override
    public List<Integer> removeInRange(List<Integer> list, int element, int start, int end) {
        for (int i = start; i < end; i++) {
            if (list.get(i).equals(element)) {
                list.remove(i);
            }
        }
        return list;
    }

    @Override
    public boolean isUnique(Map<String, String> map) {
        boolean result = true;
        List list = new ArrayList();
        for (Map.Entry firstentry : map.entrySet()) {
            String firstvalue = (String) firstentry.getValue();
            list.add(firstvalue);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    result = false;
                }
            }
        }
        return result;
    }


    @Override
    public Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> map3 = new HashMap<>();
        for (Map.Entry firstentry1 : map1.entrySet()) {
            int firstvalue1 = (int) firstentry1.getValue();
            String firstkey1 = (String) firstentry1.getKey();
            if (map2.containsKey(firstkey1) && map2.containsValue(firstvalue1)) {
                map3.put(firstkey1, firstvalue1);
            }
        }

        return map3;
    }

    @Override
    public int countCommon(List<Integer> list1, List<Integer> list2) {
        return 0;
    }

    @Override
    public Set<String> removeEvenLength(Set<String> set) {
        return null;
    }

    @Override
    public int maxOccurrences(List<Integer> list) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        Map.Entry<Character, Integer> maxEntry = null;
        for (int i = 0; i < list.size(); i++) {
            String text = String.valueOf(list.get(i));
            for (char character : text.toCharArray()) {
                if (Character.isDigit(character)) {
                    if (map.containsKey(character)) {
                        map.put(character, map.get(character) + 1);
                    } else {
                        map.put(character, 1);
                    }
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry; //
            }
        }
        return result;
    }
}
