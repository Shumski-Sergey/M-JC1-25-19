package riliuchik.lab7_collections.fileCollections.Lab7_1_taskA1;

import java.util.List;
import java.util.Iterator;

public class Lists {
    public void classRegister(List<Pupils> listOfPupils) {
        for (Pupils positionInRegister : listOfPupils) System.out.println(positionInRegister);
    }

    public List<Pupils> satisfactory(List<Pupils> listOfPupils) {
        Iterator<Pupils> iterator = listOfPupils.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getMark() < 4) {
                iterator.remove();
            }
        }
        return listOfPupils;
    }
}