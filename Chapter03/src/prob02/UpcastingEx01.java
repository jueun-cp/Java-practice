package prob02;

class Super{
	void m1() {
		System.out.println("�θ�" + 1);
	}
	void m3() {
		System.out.println("�θ�" + 3);
	}
}
class Sub extends Super{
	void m2() {
		System.out.println("�ڽ�" + 2);
	}
	void m4() {
		System.out.println("�ڽ�" + 4);
	}
}

public class UpcastingEx01 {

	public static void main(String[] args) {
		//��ĳ����
		Super obj = new Sub();
		obj.m1();
		//�ڻ迡�� �Լ��� �ִ��� Ȯ���ϰ�
		//������ �ڽ��Լ� ����, ������ �θ��Լ� ���
		obj.m3();
		
	}

}
