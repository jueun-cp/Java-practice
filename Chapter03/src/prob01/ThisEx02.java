package prob01;
//체이닝
class B{
	//(1)
	B m1() {
		return new B();
	}
	
	//(2)
	B m2() {
		B b = new B();
		return b;
	}
	
	//(3)
	B m3() {
		System.out.println("m3 call");
		return this;
	}
	
	
}
public class ThisEx02 {
	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();
		//.을 이용해 내부에 있는 함수를 사용
		b1.m1().m2().m3().m2().m1().m2().m3();
		b2.m3().m2();
	}

}
