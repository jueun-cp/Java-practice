package prob04;
//�������̽� ���߻��
class A{
	void m1() {
		System.out.println("AŬ���� �Լ� m1");
	}
}

interface B{
	//�Լ� ������Ÿ�� (=�Լ� ����)
	void m2();
}

interface C{
	void m3();
}

//Ŭ���� A�� ��ӹް� �������̽� b,c�� ��ӹ���
class D extends A implements B,C {
	@Override
	public void m2() {
		System.out.println("DŬ���� �Լ� m2");
	}
	@Override
	public void m3() {
		System.out.println("DŬ���� �Լ� m3");
	}
}
@FunctionalInterface
interface E{
	//�Լ��� �ΰ� �ۼ��ϸ� ������̼� ������ ������ ��
	void m1();
//	void m2();
}

public class InterfaceEx02 {

	public static void main(String[] args) {
		D obj = new D();
		obj.m1();
		obj.m2();
		obj.m3();
		
	}

}
