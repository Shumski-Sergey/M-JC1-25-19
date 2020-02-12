package src.yuhnovskaya.Lab6_OOP.A1;

public class ON_OFF {
    public static void main(String[] avgs){
        ForKitchen fridge =new ForKitchen("LG",400, "on", "fridge","LSR100RU");
        ForKitchen washer=new ForKitchen("Bosh", 100, "off", "washer", "SPV66MX20R");
        System.out.print(fridge.getType());
        fridge.isOn();
        System.out.print(washer.getType());
        washer.isOn();
    }
}

