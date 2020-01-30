package d.grigirchik.examples.oop;

public class main {
	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.say();

		Tiger tiger=new Tiger("tig", 2);
		tiger.sayTiger();
		tiger.say();

		Dog dog = new Dog("Dog",1);
		dog.say();
		System.out.println(dog.name+" "+tiger.name);
	}
}
