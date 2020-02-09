package riliuchik.lab7_collections.fileCollections.Lab7_1_taskA1;

public class Pupils {
    private String nameOfPupil;
    private byte mark;

    public Pupils(String nameOfPupil, byte mark) {
        this.nameOfPupil = nameOfPupil;
        this.mark = mark;
    }

    public String getNameOfPupil() {
        return nameOfPupil;
    }

    public byte getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return getNameOfPupil() + " - оценка " + getMark();
    }
}