package prob03;

class Method{
	static void methodMain() {
		Method obj = new Method();
		//static 안에서 생성된 객체의 의해 함수가 콜되서 사용가능
		obj.m1();
	}
	void m1() {
	}
}

public class StaticMethod {
	static int num = 10;
	
	static void m1() {
		System.out.println("static method");
	}
	public static void main(String[] args) {
		//static 함수 안에서는 static 변수만 사용가능
		System.out.println(num);
		
		StaticMethod obj = new StaticMethod();
		obj.m1();
		StaticMethod.m1();
	}

}
