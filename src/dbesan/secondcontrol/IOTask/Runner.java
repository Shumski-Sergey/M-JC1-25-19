package dbesan.secondcontrol.IOTask;


import java.io.IOException;

import static dbesan.secondcontrol.IOTask.Logics.generatefile;
import static dbesan.secondcontrol.IOTask.Logics.readDeleteSort;

public class Runner {
    public static void main(String[] args) throws IOException {
        generatefile();
        readDeleteSort();

    }
}
