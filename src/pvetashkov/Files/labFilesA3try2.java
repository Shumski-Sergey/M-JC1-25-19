package src.pvetashkov.Files;
import java.io.*;
public class labFilesA3try2 {
    private static void Reading() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bwrtr =new BufferedWriter (new FileWriter("C:\\Users\\Pavel\\Desktop\\labafilesA3.txt"));
        String str=br.readLine();
        String[] text=str.split(" +");
        for (int i=0; i<text.length; i++){
            bwrtr.write(text[i]);
            bwrtr.write("_");
        if (text[i].equals("#esc")) {
            System.out.println("ESCAPE was found");
            bwrtr.write("-=ESCAPE=-");
            break;
            }
        }
        br.close();
        bwrtr.close();

    }
    public static void main(String []args) throws IOException {
        File labafilesA3=new File("C:\\Users\\Pavel\\Desktop\\labafilesA3.txt");
        if (labafilesA3.exists()) {
           System.out.println("File will be rewrited");
        }
        else {
            labafilesA3.createNewFile();
        }
        System.out.println("Type here smt lowcase. To exit type #esc ");
        Reading();
    }
}
