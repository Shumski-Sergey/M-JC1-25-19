package aProtasenia.lab7_OOP.Technics;

class Cultivator extends GardenEquipment {
    Cultivator(String model, int power, int weight, boolean powerON) {
    this.setModel(model);
    this.setPower(power);
    this.setWeight(weight);
    this.setPowerON(powerON);
    }
}
