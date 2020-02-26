package dSankovsky.StreamIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
//create file with path, name and creation time of files in folder
public class A2 {
    public static void main(String[] args) throws IOException {
        File folder = new File("src\\dSankovsky\\StreamAPI");
        FileWriter fileWriter = new FileWriter("src\\dSankovsky\\StreamIO\\pathData.txt");
        for (File file : folder.listFiles()) {
            try {
                BasicFileAttributes view = Files.getFileAttributeView(Paths.get(file.getAbsolutePath()), BasicFileAttributeView.class).readAttributes();
                FileTime fileTime = view.creationTime();
                fileWriter.write(file.getAbsolutePath() + " " + file.getName() + " " + fileTime + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        fileWriter.close();

    }
}
