package a.mitsura.streamTask;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaskOne {
    public static void main(String [] args){
        Scanner a = new Scanner(System.in);
            System.out.println("Enter your data");
            String s = a.nextLine();
        List<String> list = Arrays.asList(s.split(" "));
        String out = list
                .stream()
                .filter(element -> element.length()>6)
                .collect(Collectors.joining(","));
        System.out.print(out);
    }
}
