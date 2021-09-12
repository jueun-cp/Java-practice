package prob03;

import java.util.Random;

class Animal {
	void cry() {
		System.out.println("...");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	void cry() {
		System.out.println("냐옹");
	}
}

class Pig extends Animal {
	void cry() {
		System.out.println("꿀꿀");
	}
}

public class RandomClassMethodEx {

	public static void main(String[] args) {
		//업캐스팅
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
		//업캐스팅과 배열을 이용, 위와 동일한 결과
		Animal[] arr = new Animal[] {new Dog(), new Cat(), new Pig()};
		for(int i = 0 ; i< 10 ; i++) {
			arr[rand.nextInt(3)].cry();
		}
	}
}
