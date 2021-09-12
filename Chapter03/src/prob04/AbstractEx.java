package prob04;

abstract class 대장장이 {
	void 칼() {
		System.out.println("칼 만들기 달인");
	}
	void 방패() {};
}

class 수강생1 extends 대장장이{
	@Override
	void 방패() {
		System.out.println("방패 만들기 중급");
		super.방패();
	}
}

class 수강생2 extends 대장장이{
	@Override
	void 방패() {
		System.out.println("방패 만들기 초급");
		super.방패();
	}
}
public class AbstractEx {

	public static void main(String[] args) {
		수강생1 p1 = new 수강생1();
		수강생2 p2 = new 수강생2();
		p1.칼();
		p1.방패();
		p2.칼();
		p2.방패();
	}
}
