package prob03;


final class A{
	
}

class B{
	final int NUM = 10;
	final void m1() {
		System.out.println("final �Լ�");
	}
}

class C extends B{
//final Ű���尡 �پ������Ƿ� �������̵� �Ұ���
//	void m1() {	}
}

//final Ű���尡 �پ��־� ��� �Ұ���
//class D extends A{}
public class Final {

	public static void main(String[] args) {
		B obj = new B();
//		obj.NUM = 20;
		obj.m1();
	}

}
