package prob03;

import java.util.Random;

public class RandomClassMethod {

	public static void main(String[] args) {
		Random rand = new Random();
		//int�� ������ �߻�
		System.out.println(rand.nextInt());

		for (int i = 0; i < 10; i++) {
			//0�̻� 10�̸��� int�� ���� �߻�
			int num = rand.nextInt(10);
			System.out.println(num);
		}
	}

}
