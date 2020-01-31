package riliuchik.FirstControl;

public class ExceptionWithMessage extends Exception {
    public ExceptionWithMessage() {
        System.out.print("Неправильно введены данные. ");
    }
}