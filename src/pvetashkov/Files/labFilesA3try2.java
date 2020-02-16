package src.pvetashkov.Files;// при нахождении ключевого вообще ничего не записывает в файл

import java.io.*;

public class labFilesA3try2 {
    private static void Reading() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        FileWriter fwr=new FileWriter("C:\\Users\\Pavel\\Desktop\\labafilesA3.txt");
        String str=br.readLine();
        String[] text=str.split(" +");
        for (int i=0; i< text.length; i++)
        if (text[i].equals("#esc")) {
            fwr.write(text[i] + "_");
            System.out.println("ESCAPE was found");
            //return;} //без реторна записывает, с ним - вообще ничего.
        }else{
            fwr.write(text[i]+" "); }
        br.close();
        fwr.close();
    }
    public static void main(String []args) throws IOException {
        File labafilesA3=new File("C:\\Users\\Pavel\\Desktop\\labafilesA3.txt");
        if (labafilesA3.exists()) {
            labafilesA3.delete();// если уже имеется - сносим его.
            System.out.println("Old file was deleted. New file was created");
        }
        else {
            labafilesA3.createNewFile();
        }
        System.out.println("Type here smt lowcase. To exit type #esc ");
        Reading();
    }
}
