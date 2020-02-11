package dSankovsky.StreamAPI;

import dSankovsky.FirstControl.UtilClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//get line, write in String words (greater than 6 characters length) with comma. no comma at the end
public class A2 {
    public static void main(String[] args) throws IOException {
        UtilClass utilClass  =new UtilClass();
        List<String> list = new ArrayList<>(Arrays.asList(utilClass.EnterTheLine().split(" +")));
        String line = list.stream().filter(s -> s.length()>6).collect(Collectors.joining(", "));
        System.out.println(line);
    }
}
