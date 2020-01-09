package pvetashkov.lab5;//проверка на числа не идет. если сам забуду исправить- напомните, пож-та!
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class lab5A5 {
    public static void main(String[] args) throws IOException {
        int count = 0, glcount = 0, soglcount = 0;
        String shablon = ("[a-zA-Z^d]+");
        String shsogl = ("[b-zB-Z^aAeEuUiIoOjJ]+");
        String shgl = ("[eEuUiIoOaAjJ^d]+");
        Pattern p = Pattern.compile(shablon);
        Pattern psogl = Pattern.compile(shsogl);
        Pattern pgl = Pattern.compile(shgl);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any words and press ENTER");
        String str; //отключилось привычное объявление строки, мол redundant
        str = br.readLine();
        StringBuilder sbl = new StringBuilder(str);
        String[] stroka = str.split(" +");
        for (int i = 0; i < stroka.length; i++) {
            for ( i = 0; i < stroka.length; i++) {
                Matcher m = p.matcher(stroka[i]);
                if (m.find()) {
                    count++;
                    System.out.println(" " + stroka[i] + " without Nums " + count + " ;");
                }}
               for ( int j = 0; j < stroka.length; j++) {
                    Matcher m=p.matcher(stroka[j]);
                    Matcher mm = psogl.matcher(stroka[j]);
                    Matcher mmm = pgl.matcher(stroka[j]);
                    if (m.find()) {
                        while (mm.find()) {
                            soglcount++;
                        }
                        while (mmm.find()) {
                            glcount++;
                        }
                    }
                    if (soglcount == glcount && glcount != 0) {
                        System.out.println("eq " + stroka[j] + "_");}
                    }
                }
            }
        }