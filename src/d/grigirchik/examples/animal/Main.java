package d.grigirchik.examples.animal;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		dog.eat();
		dog.say();
		dog.bark();
		dog.showName();
	}
}
