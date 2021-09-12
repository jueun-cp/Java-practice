package prob04;

//추상클래스는 객체를 생성시킬 수 없음
abstract class Animal{
	abstract void sound();
}
//실체클래스
class Tiger extends Animal{
	@Override
	void sound() {
		System.out.println("어흥");
	}
}

public class Abstract {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.sound();
	}
}
