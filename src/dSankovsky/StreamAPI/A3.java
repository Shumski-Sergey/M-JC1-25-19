package dSankovsky.StreamAPI;

import dSankovsky.FirstControl.UtilClass;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//get the line, write all numbers in new var, print with a space
public class A3 {
    public static void main(String[] args) throws IOException {
        UtilClass utilClass = new UtilClass();
        List<String> list = Arrays.stream(utilClass.EnterTheLine().split(" +")).filter(s -> s.matches("\\d+")).collect(Collectors.toList());
        list.forEach(s -> System.out.print(s + " "));

        //or
        //Stream.of(utilClass.EnterTheLine().split(" +")).filter(s->s.matches("\\d+")).forEach(s->System.out.print(s+" "));

    }
}
