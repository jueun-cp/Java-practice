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
		//�ڽ�Ŭ������ ���� �Լ��� ȣ���ϸ� �θ�Ŭ������ �Լ��� ����
		c1.m1();
		//�θ�Ŭ������ ������ �Լ��� �����ϸ� �ڽ�Ŭ������ �Լ��� ���� 
		c1.m2();
		c1.m3();
		
	}

}
