package iyakushevich.lesson6;

//A1.Создать иерархию классов, описывающих бытовую технику. Создать
//несколько объектов описанных классов, часть из них включить в розетку.
//Иерархия должна иметь хотя бы три уровня.

import iyakushevich.lesson6.A1_util.rooms.KitchenAppliances;
import iyakushevich.lesson6.A1_util.rooms.LivingRoomAppliances;
import iyakushevich.lesson6.A1_util.rooms.kitchen.Fridge;
import iyakushevich.lesson6.A1_util.rooms.kitchen.Microwave;
import iyakushevich.lesson6.A1_util.rooms.livingroom.AirConditioning;

public class Lesson6_A1 {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        Microwave microwave = new Microwave();
        AirConditioning airCond = new AirConditioning();

        fridge.turnOn();        //in the kitchen
        microwave.turnOn();     //in the kitchen
        airCond.turnOn();       //in the living room

        System.out.println();

        KitchenAppliances kitchenAppliances = new KitchenAppliances();
        LivingRoomAppliances livingRoomAppliances = new LivingRoomAppliances();

        kitchenAppliances.turnOn();
        livingRoomAppliances.turnOn();
    }
}
