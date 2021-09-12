package prob02;

class Animal{
	void cry() {
		System.out.println("...");
	}
}

class Dog extends Animal{
	@Override
	void cry() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("�Ŀ�");
	}
}

class Pig extends Animal{
	@Override
	void cry() {
		System.out.println("�ܲ�");
	}
}

class Zoo {
	void sound(Animal obj) {
		//�ڵ��� ���ʿ��� �ߺ��� ����
		obj.cry();
	}
}
public class UpcastingEx02 {

	public static void main(String[] args) {
		//��ĳ����
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
