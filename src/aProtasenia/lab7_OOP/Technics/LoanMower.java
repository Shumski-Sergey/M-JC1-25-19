package aProtasenia.lab7_OOP.Technics;

class LoanMower extends GardenEquipment {
    LoanMower(String model, int power, int weight, boolean powerON) {
    this.setModel(model);
    this.setPower(power);
    this.setWeight(weight);
    this.setPowerON(powerON);
    }
}
