package prob05;
//익명클래스와 익명객체
class Zoo{
	void m1(Animal a) {
		a.m1();
	}
}

interface Animal{
	void m1();
}

class Tiger implements Animal{
	@Override
	public void m1() {
		System.out.println(1);
	}
}

public class AnonymousEx01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		Animal t2 = new Tiger();
		
		//(1)
		Animal t3 = new Animal() {
			@Override
			public void m1() {
				System.out.println(2);
			}
		};
		
		//(2)
		new Animal() { 
			@Override
			public void m1() {
				System.out.println(3);
			}
		}.m1(); //익명 객체로 함수 호출
		
		//(3)
		Zoo t4 = new Zoo();
		t4.m1(new Animal() {
			@Override
			public void m1() {
				System.out.println(4);
			}
		});
		t1.m1();   //1
		t2.m1();   //1
		t3.m1();   //2
		t4.m1(t1); //1
		
	}
}
