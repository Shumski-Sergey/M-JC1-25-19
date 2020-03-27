package aProtasenia.lab7_OOP.Technics;

public class Technics {
    private String model;
    private int weight, power;
    public void setWeight(int wei) { weight = wei;} public int getWeight() { return weight; }
    public void setPower(int pw) { power = pw;} public int getPower() { return power; }
    public void setModel(String md) {model = md; }public String getModel() {return model;}
    private boolean powerON;
    boolean getPowerON() {
        return powerON;
    } void setPowerON(boolean powerON) { this.powerON = powerON; }
}





