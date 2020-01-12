package a.mitsura.Lesson3_Strings;

public class StrB1_secondTry {
    public static void main(String[] args){
       String s="nothing to change and";
       StringBuilder str=new StringBuilder(s);
       str.append("nothing to lose");
       for(int i=0; i>=0; i++){
           System.out.println(str);
       }
    }
}
