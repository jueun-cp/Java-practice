package prob03;

class Method{
	static void methodMain() {
		Method obj = new Method();
		//static �ȿ��� ������ ��ü�� ���� �Լ��� �ݵǼ� ��밡��
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
		//static �Լ� �ȿ����� static ������ ��밡��
		System.out.println(num);
		
		StaticMethod obj = new StaticMethod();
		obj.m1();
		StaticMethod.m1();
	}

}
