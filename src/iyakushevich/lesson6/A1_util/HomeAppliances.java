package iyakushevich.lesson6.A1_util;

public class HomeAppliances {

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    public void turnOn() {
        System.out.println(toString() + " is turned on");
    }
}
