package prob03;

import java.util.Random;

public class RandomClassMethod {

	public static void main(String[] args) {
		Random rand = new Random();
		//int형 난수를 발생
		System.out.println(rand.nextInt());

		for (int i = 0; i < 10; i++) {
			//0이상 10미만의 int형 난수 발생
			int num = rand.nextInt(10);
			System.out.println(num);
		}
	}

}
