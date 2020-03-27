package aProtasenia.lab7_OOP.Technics;

class Television extends Electronics {
    Television(String model, int power, int weight, boolean powerON) {
    this.setModel(model);
    this.setPower(power);
    this.setWeight(weight);
    this.setPowerON(powerON);
    }
}
