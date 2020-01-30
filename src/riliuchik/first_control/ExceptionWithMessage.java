package riliuchik.first_control;

public class ExceptionWithMessage extends Exception {
    public ExceptionWithMessage() {
        System.out.print("Неправильно введены данные. ");
    }
}