package d.grigirchik.laba6.taska1;


//A1.Создать иерархию классов, описывающих бытовую технику. Создать
//				несколько объектов описанных классов, часть из них включить в розетку.
//				Иерархия должна иметь хотя бы три уровня.

public class Technika {
	public static void main(String[] args) {
		BytTech sony=new BytTech("Sony", 220);
		BytTech samsung = new BytTech ("Samsung", 250);

		sony.run();

		PCtech pCtech = new PCtech();
		pCtech.run();
		Laptop laptop = new Laptop();
		laptop.run();
		Fridge fridge = new Fridge();
		fridge.run();
	}
}
