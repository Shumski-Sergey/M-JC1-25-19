package dSankovsky.SecondControl;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A3 {
    public static void main(String[] args) throws IOException {
        String inputPath = "src\\dSankovsky\\SecondControl\\inputFile.txt";
        String outputPath = "src\\dSankovsky\\SecondControl\\otputFile.txt";

        WriteInputFile(inputPath);
        WriteOutputFile(inputPath, outputPath);


    }

    private static void WriteOutputFile(String inputPath, String outputPath) throws IOException {
        FileReader fileReader = new FileReader(inputPath);
        Scanner scanner = new Scanner(fileReader);
        FileWriter nFileWriter = new FileWriter(outputPath);
        while (scanner.hasNext()) {
            int numb = Integer.valueOf(scanner.nextLine());
            if (numb % 2 == 0) {
                nFileWriter.write(numb + "\n");
            }
        }
        nFileWriter.close();
    }

    private static void WriteInputFile(String inputPath) throws IOException {
        FileWriter fileWriter = new FileWriter(inputPath);
        int i = 0;
        do {
            fileWriter.write((int) (Math.random() * 100) + "\n");
            i++;
        } while (i < 100);
        fileWriter.close();
    }
}
