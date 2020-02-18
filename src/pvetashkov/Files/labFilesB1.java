package src.pvetashkov.Files;
import java.io.*;
public class labFilesB1 {
    private static void Reading() throws IOException { //отсюда прочли
        try {
            FileReader frdr = new FileReader("C:\\Users\\Pavel\\IdeaProjects\\M-JC1-25-19\\src\\pvetashkov\\Files\\source.txt");
            frdr.close();
        }
       catch ( Exception E){
          System.out.println("WE have mistake");
        }
    }
    private static void Writing() throws IOException{//сюда записали
        try{
        FileWriter fwrtr=new FileWriter("C:\\Users\\Pavel\\IdeaProjects\\M-JC1-25-19\\src\\pvetashkov\\Files\\end.txt");
        fwrtr.close();}
        catch (Exception e) {
            System.out.println("Smt wrong!");
        }
    }
    private static void ReWriting() throws IOException { // а тут размножили до 100 метров.
        try{
            FileReader frdr = new FileReader("C:\\Users\\Pavel\\IdeaProjects\\M-JC1-25-19\\src\\pvetashkov\\Files\\end.txt");
            frdr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter fwrtr = new FileWriter("C:\\Users\\Pavel\\IdeaProjects\\M-JC1-25-19\\src\\pvetashkov\\Files\\end.txt", true);
            fwrtr.close();
        } catch (Exception e) {
            System.out.println("Smt wrong!");
        }
    }
    public static void main(String [] args) throws IOException{
        double kil=1024; // размер в килах
        double metr=1024*kil; //размер в метрах
        Reading();
        Writing();
        while ("C:\\Users\\Pavel\\IdeaProjects\\M-JC1-25-19\\src\\pvetashkov\\Files\\end.txt".length()<(100*metr)){
            ReWriting();
        }
        System.out.println("All right!");
    }
}
