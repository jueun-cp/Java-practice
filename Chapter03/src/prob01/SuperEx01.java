package prob01;


class Super01{
	int a = 10;
	void m1() {
		System.out.println("super m1");
	}
	void m2() {
		System.out.println("super m2");
	}
}
class Sub01 extends Super01{
	void show() {
		System.out.println(a);
		System.out.println(this.a);
		//부모클래스의 멤버에 접근가능
		System.out.println(super.a);
	}
	void m2() {
		System.out.println("sub m2");
		//super키워드로 부모함수 m2를 콜함
		super.m2();
		
	}
}

//super 키워드 사용
public class SuperEx01 {

	public static void main(String[] args) {
		Sub01 s = new Sub01();
		s.m1();
		s.m2();
	}

}
