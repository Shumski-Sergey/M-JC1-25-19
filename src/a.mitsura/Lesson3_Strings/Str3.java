package a.mitsura.Lesson3_Strings;

public class Str3 {
    public static void main(String[] args) {
        String s1 = "I always knew my purpose";
        String[] s2 = s1.split(" +"); //Разбивает строку на ячейки массива
        StringBuilder word = new StringBuilder(); //Создание StrBuilder'a
        for(String dev:s2){
            word.append(dev.charAt(dev.length()-1));//CharAt возвращает символ(последнюю букву) из массива строки по указанному индексу
        }
        System.out.print(word);
    }
}
