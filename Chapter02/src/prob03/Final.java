package prob03;


final class A{
	
}

class B{
	final int NUM = 10;
	final void m1() {
		System.out.println("final 함수");
	}
}

class C extends B{
//final 키워드가 붙어있으므로 오버라이딩 불가능
//	void m1() {	}
}

//final 키워드가 붙어있어 상속 불가능
//class D extends A{}
public class Final {

	public static void main(String[] args) {
		B obj = new B();
//		obj.NUM = 20;
		obj.m1();
	}

}
