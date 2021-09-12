package prob01;
//인수 전달의 종류
//표준타입, 사용자클래스, 표준클래스
class Parameter{
	void m1(int a, int b) {
		System.out.println(a+" "+b);
	}
	void m2(int a, char b, boolean c, float d, String e) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	//class를 인자로 넣어줄 경우
	void m3(Animal a) {
		//Animal 클래스에서 작성된 함수도 사용할 수 있음
		a.info();
	}
}
class Animal{
	void info() {
		System.out.println("동물이다");		
	}
}
public class MethodParameter {

	public static void main(String[] args) {
		String s = "호랑이";
		Parameter p = new Parameter();
		p.m1(3, 4);
		p.m2(3, 'a', false, 3.14f, s);
		
		Animal animal = new Animal();
		p.m3(animal);
		//위 방식처럼 만든 객체를 넣어줄 수도 있고 new Animal()를 바로 넣어줘도 됨
		p.m3(new Animal());
	}

}
