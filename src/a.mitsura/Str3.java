package a.mitsura;

public class Str3 {
    public static void main(String[] args) {
        String s1 = "I always knew my purpose";
        String[] s2 = s1.split(" +");
        StringBuilder word = new StringBuilder();
        for(String dev:s2){
            word.append(dev.charAt(dev.length()-1));
        }
        System.out.print(word);
    }
}
