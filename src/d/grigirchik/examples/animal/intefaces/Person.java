package d.grigirchik.examples.animal.intefaces;

public class Person implements Info {
	public String name;

	public Person(String name){
		this.name = name;
	}

	public void sayHello(){
		System.out.println("Hello");
	}

	public void showInfo(){
		System.out.println("Id is:" +this.name);
	}
}
