package KKropa.Lab_11_InputOutputStreams.A1;

import java.io.*;
import java.util.*;

//1. Ввести с консоли имя файла.
// Найти байт или байты с максимальным количеством повторов.
// Вывести их на экран через пробел. Закрыть поток ввода-вывода.
public class Lab_11_A1 {
    public static void main (String [] args) throws IOException {


        try {
            InputStream inputStream = new FileInputStream("./src/KKropa/Lab_11_InputOutputStreams/A1/Text_A1.txt");
            Map<Integer, Integer> listOfBytes = new HashMap<>();
            ByteSearch(inputStream, listOfBytes);

            System.out.println("The largest number of repeating byte is: " + Collections.max(listOfBytes.keySet()));
            System.out.println("Repeat Bytes " + Collections.max(listOfBytes.values()));


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void ByteSearch(InputStream inputStream, Map<Integer, Integer> listOfBytes) throws IOException {
        Integer numberOfByte;
        Integer maxQuantity = 0;
        while ((numberOfByte=inputStream.read())!=-1){

            if (listOfBytes.containsKey(numberOfByte)){
                Integer quantity = (Integer) listOfBytes.get(numberOfByte)+1;
                listOfBytes.put(numberOfByte, quantity);

                if (quantity>maxQuantity){
                    maxQuantity=quantity;
                }
            }
            else{
                listOfBytes.put(numberOfByte, 1);
            }
        }
    }


}
