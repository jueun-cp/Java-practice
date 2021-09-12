package prob01;
//반환형이 있는 함수를 만들 경우 return을 꼭 줘야함
class A{
	String m1() {
		return "a의 m1";
	}
	//return을 클래스 B타입으로
	B m2() {
		return new B();
	}
	//B클래스의 인자를 받고 return도 B클래스로
	B m3(B b) {
		return b;
	}
}
class B{
	void say() {
		System.out.println("나 b");
	}
}
class C{
	//return 키워드를 여러 개 사용할 수 있음
	int m1(int a, int b) {
		if(a > b) {
			return 100;
		}else {
			return 200;
		}
	}
	void m2() {
		//반환값이 없어도 단독으로 사용가능함
		//함수의 실행중단역할
		return;
	}
	void m3(int num) {
		for(int i=0; i<10; i++) {
			if(i == num) {
				System.out.println("find");
				return;
			}
		}
		System.out.println("non found");
	}
}
public class MethodReturn {
	public static void main(String[] args) {
		A objA = new A();
		String s1 = objA.m1();
		System.out.println(s1 + " " + objA.m1());
		
		B objB = new B();
		objB.say();
		//return되는 것이 B의 객체이므로 B의 함수를 호출할 수 있음
		objA.m3(new B()).say();
		
		C objC = new C();
		objC.m1(100, 200);
		objC.m3(3);
	}
}
