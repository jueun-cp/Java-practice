package prob01;

class Method{
	void m1() {
		System.out.println("��ȯ�� x �μ����� x");
	}
	
	void m2(int num) {
		System.out.println("��ȯ�� x �μ����� o");
		System.out.println("���޹��� �μ� " + num);
	}
	
	int m3() {
		System.out.println("��ȯ�� o �μ����� x");
		return 10;
	}
	
	int m4(int num) {
		System.out.println("��ȯ�� o �μ����� o");
		System.out.println("���޹��� �μ� " +num +" ��ȯ�� �μ� " + num*3);
		return num*3;
	}
}

public class MethodEx {

	public static void main(String[] args) {
		Method obj = new Method();
		obj.m1();
		obj.m2(1);
		obj.m3();
		obj.m4(2);
		
	}

}
