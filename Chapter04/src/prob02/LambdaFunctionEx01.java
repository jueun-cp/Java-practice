package prob02;

interface A01{
	void m1();
}
interface B01{
	void m1(int num);
}
interface C01{
	int m1();
}
interface D01{
	String m1(int num, String str);
}
interface E01{
	int m1();
}
public class LambdaFunctionEx01 {

	public static void main(String[] args) {
		//(1)�͸� Ŭ���� �̿�
		A01 a1 = new A01() {
			
			@Override
			public void m1() {
				System.out.println(1);
			}
		};
		
		//(2)�����Լ�
		A01 a2 = () -> {
			System.out.println(2);
		};
		a2.m1();
		
		//(3)�μ�o return x
		B01 b1 = (n) -> {
			System.out.println(n);
		};
		
		//(4)�μ�x return o
		C01 c1 = () -> {
			System.out.println(3);
			return 100;
		};
		
		//(5)�μ�o return o
		D01 d1 = (n,s) -> {
			return n+s;
		};
		System.out.println(d1.m1(100, "ȣ����"));
		
	}

}
