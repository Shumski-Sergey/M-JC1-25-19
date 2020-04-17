//package aantonovich.StreamAPI;
//
//// Считать с консоли имя файла. Файл содержит слова, разделенные знаками препинания.
//// Вывести в консоль количество слов "Chicago", которые встречаются в файле. Закрыть потоки
//
//import java.io.*;
//import java.util.Scanner;
//import java.util.regex.MatchResult;
//
//public class Task4 {
//    public static final File file = new File("src" +File.separator+ "aantonovich"+
//            File.separator+ "StreamAPI"+ File.separator+ "Chicago.txt");
//    public static void main(String[] args) {
//        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))){
//            long count = scanner.findAll("Chicago").map(MatchResult::group).count();
//            System.out.println(count);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}
