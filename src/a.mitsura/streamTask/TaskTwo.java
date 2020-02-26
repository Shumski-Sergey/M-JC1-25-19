package a.mitsura.streamTask;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskTwo {
    public static void main(String [] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your data");
        String s = a.nextLine();
        String out = Stream.of(s.split(" "))
                .filter(element -> element.matches("\\d+"))
                .collect(Collectors.joining(" "));
        System.out.print(out);
    }
}
