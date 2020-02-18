package dbesan.lab12inout.TaskB1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*Считать из одного файла текст НА РУССКОМ и НА АНГЛ. и вывести в другой. Нагенерить(создать) файл минимум 100мб.*/
public class Logics {
    static void writeFromTo() throws IOException {
        writerFromInToOut();

    }

    private static void writerFromInToOut() {
        try {
            FileInputStream inputfile = new FileInputStream(getTargetFile());
            String targetfile = getTargetFile();
            FileOutputStream copyToTarget = new FileOutputStream(targetfile);
            int i;
            while ((i = inputfile.read()) != -1) {
                byte[] buffer = new byte[inputfile.available()];
                inputfile.read(buffer, 0, inputfile.available());
                copyToTarget.write(buffer, 0, buffer.length);
            }
            inputfile.close();
            copyToTarget.close();

            System.out.println("Файл успешно записан.");
        } catch (IOException e) {

            System.out.println(e.getMessage());
            writerFromInToOut();
        }
    }

    private static String getTargetFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте путь и имя файла. Например: C:/user/log.txt");
        return scanner.nextLine();
    }
}

