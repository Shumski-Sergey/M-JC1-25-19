package d.grigirchik.examples.oop;


public class Animal {

	protected String name;
	private int age;

	public Animal(){}

	public Animal(String nameOf, int age){
		this.name=nameOf;
		this.age=age;
	}

	public void say(){
		System.out.println("It's an animal");
	}
}
