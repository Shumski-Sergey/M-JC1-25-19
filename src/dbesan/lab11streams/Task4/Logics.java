package dbesan.lab11streams.Task4;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Logics {

    static void countrer() {
        int count = 0;
        String fileName = getString();
        try {
            List<String> fileContentCollection = Files.lines(Paths.get(fileName), StandardCharsets.UTF_8)
                    .collect(Collectors.toList());
            String fileContent = fileContentCollection.toString();
            Pattern pattern = Pattern.compile("world(\\w*)");
            Matcher matcher = pattern.matcher(fileContent);
            while (matcher.find()) {
                count++;
            }
            System.out.println(count);
        } catch (Exception e) {
            System.out.print("Файл не найден!");
        }
    }

    private static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расположение файла(world.txt для теста)");
        return scanner.nextLine();
    }
}
