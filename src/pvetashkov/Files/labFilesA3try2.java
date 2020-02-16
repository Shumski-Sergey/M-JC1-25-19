package src.pvetashkov.Files;

import java.io.*;

public class labFilesA3try2 {
    private static void Reading() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        FileWriter fwr=new FileWriter("C:\\Users\\Pavel\\Desktop\\labafilesA3.txt");
        fwr.write("c:\\Users\\Pavel\\Desktop\\labafilesA3");
        br.close();
        fwr.close();
    }
    public static void main(String []args) throws IOException {
        boolean s=false;
        File labafilesA3=new File("C:\\Users\\Pavel\\Desktop\\labafilesA3.txt");
        if (!labafilesA3.exists()) {
            labafilesA3.createNewFile();
        }
        else {
            System.out.println("It is. del old.");
        }
        System.out.println("Type here smt lowcase. To exit type #esc ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        do Reading();
        while (str.split(" +").equals("#esc"));
        return;
    }
}
