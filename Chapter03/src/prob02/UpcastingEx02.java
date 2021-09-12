package prob02;

class Animal{
	void cry() {
		System.out.println("...");
	}
}

class Dog extends Animal{
	@Override
	void cry() {
		System.out.println("¸Û¸Û");
	}
}

class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("³Ä¿Ë");
	}
}

class Pig extends Animal{
	@Override
	void cry() {
		System.out.println("²Ü²Ü");
	}
}

class Zoo {
	void sound(Animal obj) {
		//ÄÚµåÀÇ ºÒÇÊ¿äÇÑ Áßº¹À» ÁÙÀÓ
		obj.cry();
	}
}
public class UpcastingEx02 {

	public static void main(String[] args) {
		//¾÷Ä³½ºÆÃ
		Animal a1 = new Dog(); 
		Animal a2 = new Cat(); 
		Animal a3 = new Pig(); 
		a1.cry();
		a2.cry();
		a3.cry();
		System.out.println("----------");
		Zoo obj = new Zoo();
		obj.sound(new Dog());
		obj.sound(new Cat());
		obj.sound(new Pig());
	}

}
