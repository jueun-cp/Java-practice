package prob04;

abstract class �������� {
	void Į() {
		System.out.println("Į ����� ����");
	}
	void ����() {};
}

class ������1 extends ��������{
	@Override
	void ����() {
		System.out.println("���� ����� �߱�");
		super.����();
	}
}

class ������2 extends ��������{
	@Override
	void ����() {
		System.out.println("���� ����� �ʱ�");
		super.����();
	}
}
public class AbstractEx {

	public static void main(String[] args) {
		������1 p1 = new ������1();
		������2 p2 = new ������2();
		p1.Į();
		p1.����();
		p2.Į();
		p2.����();
	}
}
