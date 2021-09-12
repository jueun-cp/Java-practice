package prob02;

import java.util.LinkedList;

interface A02{
	void m1();
}
interface B02{
	int m1();
}
class C02{
	void m2(A02 a) {
		a.m1();
	}
	void m3(B02 b) {
		System.out.println(b.m1());
	}
}
public class LambdaFunctionEx02 {

	public static void main(String[] args) {
		A02 a = () -> {
			System.out.println(1);
		};
		B02 b = () -> {
			System.out.println(2);
			return 100;
		};
		C02 c = new C02();
		c.m2(a);
		
		c.m2(() -> {
			System.out.println(3);
		});
		c.m3(()->100);
		//위와 아래와 동일한 코드
		c.m3(()->{
			return 100;
		});
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.removeIf(D02 -> D02 % 2 == 0);
		list.removeIf(D02 -> {return D02 % 2 == 0;});
	}

}
