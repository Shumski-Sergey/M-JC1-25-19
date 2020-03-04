//package dbesan.secondcontrol.IOTask;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Logics {
//    private static final String EXIT_PHRASE = "#ESC";
//    private static final int BUFF_SIZE = 1024;
//    public static void writertoFile() {
//        try {
//            File file = new File(getTargetFile());
//            FileWriter fileWriter = new FileWriter(file);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter, BUFF_SIZE);
//            int rand = (int)Math.random()*10;
//            while (file.length() <=32 ) {
//                bufferedWriter.write(rand);
//            }
//
//            bufferedWriter.close();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            writertoFile();
//        }
//    }
//    public static void ReadSortDelete() {
//        try {
//            String targetfile = getTargetFile();
//            FileInputStream inputfile = new FileInputStream(getTargetFile());
//           FileOutputStream copyToTarget = new FileOutputStream(targetfile);
//            ArrayList <Integer> arrayList  = new ArrayList();
//            int i;
//            while ((i = inputfile.read()) != -1) {
//                arrayList.add(i);
//                //                byte[] buffer = new byte[inputfile.available()];
////                inputfile.read(buffer, 0, inputfile.available());
////                copyToTarget.write(buffer, 0, buffer.length);
//}
//
//
//
//            inputfile.close();
//            copyToTarget.close();
//
//            System.out.println("Файл успешно записан.");
//        } catch (IOException e) {
//
//            System.out.println(e.getMessage());
//            ReadSortDelete();
//        }
//    }
//
//
//    ArrayList <Integer> SecondArrayList  = new ArrayList();
//            for(int x : arrayList){
//        if (x%2==0){
//            SecondArrayList.add(x);
//        }}
//            for(int y = SecondArrayList.size()-1 ; y > 0 ; i--){
//        for(int j = 0 ; j < y ; j++){
//            if( SecondArrayList.get(j) > SecondArrayList.get(j+1) ){
//                int tmp = SecondArrayList.get(j);
//                SecondArrayList.get(j) = SecondArrayList.get(j+1);
//                SecondArrayList.get(j+1) = tmp;
//            }
//        }
//    }
//}
//
//
//    private static String getTargetFile() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Задайте путь и имя файла. Например: C:/user/log.txt");
//        return scanner.nextLine();
//    }
//}
//
