package dbesan.lab11streams.Task1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Logics {
    public static void wherereqest() {
        String[] whereArgs = {"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null};
        Map<String, String> whereMap = new HashMap<>(whereArgs.length / 2);
        for (int i = 0; i < whereArgs.length; i += 2) {
            whereMap.put(whereArgs[i], whereArgs[i + 1]);
        }
        Map<String, String> result = whereMap.entrySet()
                .stream()
                .filter(map -> null != map.getValue())
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
        result.forEach((key, value) -> System.out.format("%s = '%s'%n", key, value));
        String[] resultstr = result.entrySet().stream()
                .flatMap(e -> Stream.of(e.getKey(), e.getValue()))
                .toArray(String[]::new);
        System.out.println(String.join(" ", resultstr));
    }
}
