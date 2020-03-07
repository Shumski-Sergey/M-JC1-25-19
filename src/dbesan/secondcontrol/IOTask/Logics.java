package dbesan.secondcontrol.IOTask;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Logics {
    static void generatefile() {
        try {
            System.out.println("Генерируем файл");
            File file = new File(getTargetFile());
            Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF8"));
            while (file.length() != (1 * 1048576)) {
                String x = Integer.toString((int) (Math.random() * 10));
                writer.write(x);
            }
            writer.close();
        } catch (IOException e) {

            System.out.println(e.getMessage());
            generatefile();
        }
    }

    static void readDeleteSort() throws IOException {
        System.out.println("Читаем файл");
        List<Character> chars = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(new File(getTargetFile())));
            int c;
            while ((c = reader.read()) != -1) {
                chars.add((char) c);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        List<Character> parited = new ArrayList<>();
        for (char x : chars) {
            if (x % 2 == 0) {
                parited.add(x);
            }
        }
        Collections.sort(parited);
        System.out.println("Записываем новый");
        try {
            String targetfile = getTargetFile();
            FileOutputStream copyToTarget = new FileOutputStream(targetfile);
            for (int i = 0; i < parited.size(); i++) {
                copyToTarget.write(parited.get(i));
            }
            copyToTarget.close();
        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }


    private static String getTargetFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте путь и имя файла. Например: C:/user/log.txt");
        return scanner.nextLine();
    }
}


