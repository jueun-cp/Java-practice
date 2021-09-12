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
		//(1)익명 클래스 이용
		A01 a1 = new A01() {
			
			@Override
			public void m1() {
				System.out.println(1);
			}
		};
		
		//(2)람다함수
		A01 a2 = () -> {
			System.out.println(2);
		};
		a2.m1();
		
		//(3)인수o return x
		B01 b1 = (n) -> {
			System.out.println(n);
		};
		
		//(4)인수x return o
		C01 c1 = () -> {
			System.out.println(3);
			return 100;
		};
		
		//(5)인수o return o
		D01 d1 = (n,s) -> {
			return n+s;
		};
		System.out.println(d1.m1(100, "호랑이"));
		
	}

}
