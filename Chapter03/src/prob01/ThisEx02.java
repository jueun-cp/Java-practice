package prob01;
//ü�̴�
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
		//.�� �̿��� ���ο� �ִ� �Լ��� ���
		b1.m1().m2().m3().m2().m1().m2().m3();
		b2.m3().m2();
	}

}
