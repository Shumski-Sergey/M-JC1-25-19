package riliuchik.lab7_collections.Lab7_taskA3;

import java.util.List;
import java.util.Iterator;

public class Lists {
    public void classRegister(List<Pupils> listOfPupils) {
        for (Pupils positionInRegister : listOfPupils) System.out.println(positionInRegister);
    }

    public Pupils bestPupil(List<Pupils> listOfPupils) {
        Pupils bestPupil = listOfPupils.get(0);
        Iterator<Pupils> iterator = listOfPupils.iterator();
        while (iterator.hasNext()) {
            Pupils pupilForCheck = iterator.next();
            if (pupilForCheck.getMark() > bestPupil.getMark()) {
                bestPupil = pupilForCheck;
            }
        }
        return bestPupil;
    }
}