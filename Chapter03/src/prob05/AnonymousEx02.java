package prob05;

interface A{
	void m1();
}

class B{
	void show(A a) {
		a.m1();
	}
}

public class AnonymousEx02 {

	public static void main(String[] args) {
		A obj1 = new A() {
			@Override
			public void m1() {
				System.out.println(1);
			}
		};
		B obj2 = new B();
		obj2.show(new A() {
			@Override
			public void m1() {
				System.out.println(2);
			}
		});
		obj1.m1();
	}

}
