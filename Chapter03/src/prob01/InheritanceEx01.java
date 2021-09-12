package prob01;

class Parent{
	void m1() {
		System.out.println("parent01");
	}
	void m2() {
		System.out.println("parent02");		
	}
}
class Child extends Parent{
	void m2() {
		System.out.println("child02");
	}
	void m3() {		
		System.out.println("child03");
	}
}
public class InheritanceEx01 {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		Child c1 = new Child();
		p1.m2();
		//자식클래스에 없는 함수를 호출하면 부모클래스의 함수를 콜함
		c1.m1();
		//부모클래스와 동일한 함수가 존재하면 자식클래스의 함수를 콜함 
		c1.m2();
		c1.m3();
		
	}

}
