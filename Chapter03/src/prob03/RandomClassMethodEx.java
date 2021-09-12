package prob03;

import java.util.Random;

class Animal {
	void cry() {
		System.out.println("...");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal {
	void cry() {
		System.out.println("�Ŀ�");
	}
}

class Pig extends Animal {
	void cry() {
		System.out.println("�ܲ�");
	}
}

public class RandomClassMethodEx {

	public static void main(String[] args) {
		//��ĳ����
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Pig();

		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			int num = rand.nextInt(3);
			switch (num) {
			case 0: {
				a1.cry();
				break;
			}
			case 1: {
				a2.cry();
				break;
			}
			case 2: {
				a3.cry();
				break;
			}}
		}
		System.out.println("-----------------");
		//��ĳ���ð� �迭�� �̿�, ���� ������ ���
		Animal[] arr = new Animal[] {new Dog(), new Cat(), new Pig()};
		for(int i = 0 ; i< 10 ; i++) {
			arr[rand.nextInt(3)].cry();
		}
	}
}
