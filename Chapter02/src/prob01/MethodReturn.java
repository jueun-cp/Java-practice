package prob01;
//��ȯ���� �ִ� �Լ��� ���� ��� return�� �� �����
class A{
	String m1() {
		return "a�� m1";
	}
	//return�� Ŭ���� BŸ������
	B m2() {
		return new B();
	}
	//BŬ������ ���ڸ� �ް� return�� BŬ������
	B m3(B b) {
		return b;
	}
}
class B{
	void say() {
		System.out.println("�� b");
	}
}
class C{
	//return Ű���带 ���� �� ����� �� ����
	int m1(int a, int b) {
		if(a > b) {
			return 100;
		}else {
			return 200;
		}
	}
	void m2() {
		//��ȯ���� ��� �ܵ����� ��밡����
		//�Լ��� �����ߴܿ���
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
		//return�Ǵ� ���� B�� ��ü�̹Ƿ� B�� �Լ��� ȣ���� �� ����
		objA.m3(new B()).say();
		
		C objC = new C();
		objC.m1(100, 200);
		objC.m3(3);
	}
}
