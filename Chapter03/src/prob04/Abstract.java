package prob04;

//�߻�Ŭ������ ��ü�� ������ų �� ����
abstract class Animal{
	abstract void sound();
}
//��üŬ����
class Tiger extends Animal{
	@Override
	void sound() {
		System.out.println("����");
	}
}

public class Abstract {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.sound();
	}
}
