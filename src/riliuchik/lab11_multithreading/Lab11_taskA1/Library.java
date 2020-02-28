package riliuchik.lab11_multithreading.Lab11_taskA1;

public class Library {
    String nameOfReader;
    String nameOfBook;
    boolean availableToTakeInTheReadingRoom;
    boolean availableToTakeHome;
    Status status;

    public Library(String nameOfBook, boolean availableToTakeInTheReadingRoom, boolean availableToTakeHome) {
        this.nameOfBook = nameOfBook;
        this.availableToTakeInTheReadingRoom = availableToTakeInTheReadingRoom;
        this.availableToTakeHome = availableToTakeHome;
        this.status = Status.AVAILABLE;
    }

    public String getNameOfReader() {
        return nameOfReader;
    }

    public void setNameOfReader(String nameOfReader) {
        this.nameOfReader = nameOfReader;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public boolean isAvailableToTakeInTheReadingRoom() {
        return availableToTakeInTheReadingRoom;
    }

    public boolean isAvailableToTakeHome() {
        return availableToTakeHome;
    }

    public Status getStatus() {
        return status;
    }
}