package prob04;
//인터페이스 다중상속
class A{
	void m1() {
		System.out.println("A클래스 함수 m1");
	}
}

interface B{
	//함수 프로토타입 (=함수 원형)
	void m2();
}

interface C{
	void m3();
}

//클래스 A를 상속받고 인터페이스 b,c를 상속받음
class D extends A implements B,C {
	@Override
	public void m2() {
		System.out.println("D클래스 함수 m2");
	}
	@Override
	public void m3() {
		System.out.println("D클래스 함수 m3");
	}
}
@FunctionalInterface
interface E{
	//함수를 두개 작성하면 어노테이션 때문에 오류가 남
	void m1();
//	void m2();
}

public class InterfaceEx02 {

	public static void main(String[] args) {
		D obj = new D();
		obj.m1();
		obj.m2();
		obj.m3();
		
	}

}
