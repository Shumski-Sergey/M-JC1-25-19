package d.grigirchik.examples.animal.intefaces;

import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

public class Test {
	public static void main(String[] args) {
		Animal animal = new Animal(1);
		Person person1 = new Person("Bob");
		animal.sleep();
		person1.sayHello();
		animal.showInfo();
		person1.showInfo();
		//полиморфизм
		Info info1 = new Animal(1);
		Info info2 = new Person("Bob");
		info1.showInfo();
		info2.showInfo();
		outputInfo(info1);
		outputInfo(info2);
		outputInfo(animal);
		outputInfo(person1);
	}
		public static void outputInfo(Info info){
		info.showInfo();
	}
}
