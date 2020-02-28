package a.mitsura.Generics;

import java.io.File;
import java.util.ArrayList;

public class Mission1 {
    public static void main(String[] args) {

        File file = new File("D:\\M-JC1-25-19\\src\\a.mitsura\\Eng.txt");
        if (!file.isDirectory() || !file.exists())
            return;

        ArrayList<File> listFile = new ArrayList<>();

        for (File elem : file.listFiles())
            listFile.add(elem);
            for (int i = 0; i < 5; i++)
                System.out.println(listFile.get(i).getName());
    }
}
