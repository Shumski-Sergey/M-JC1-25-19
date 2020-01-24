package d.grigirchik.laba6.taska1;

public class BytTech implements Runable { //супер класс
	public String name;
	public int power;

	public BytTech() {
	}

	public BytTech(String name, int power) { //конструктор для присваения значений поля
		this.name = name;
		this.power = power;
	}

	public void run() {
		System.out.println("Данная техника включена: " + this.getClass().getSimpleName());
		if (name != null)
			System.out.println(name + " потребляемая мощность: " + power);

	}

}
