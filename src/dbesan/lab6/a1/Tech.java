package dbesan.lab6.a1;

import dbesan.lab6.a1.Util.IO;

public class Tech implements IO {
    public Tech(String name, int power)  {
        this.name = name;
        this.power = power;
    }

    private String name;
    private int power;

    @Override
    public void on() {
        System.out.println(name + " is on");
    }

    @Override
    public void off() {
        System.out.println(name + " is off");

    }
}


