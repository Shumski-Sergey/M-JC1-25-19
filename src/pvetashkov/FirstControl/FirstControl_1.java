package src.pvetashkov.FirstControl;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;
import java.util.ArrayList;

public class FirstControl_1 {
    public static void main(String[] args) throws IOException {
        String str, num = ("[0-9]");
        String[] simvol;
        ArrayList<Integer> itog = new ArrayList<>();
        int count = 0, sum = 0;
        Pattern p = Pattern.compile(num);
        System.out.println("enter any sentence with Nums");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        simvol = str.split(" +");
        for (int i = 0; i < simvol.length; i++) {
            Matcher m = p.matcher(simvol[i]);
            if (m.find()) {
                count++;
                itog.add(Integer.parseInt(simvol[i]));
            }
        }
        System.out.print(count + " , summ is " + sum);
    }
}
