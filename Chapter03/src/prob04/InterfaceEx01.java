package prob04;

interface �ѱ�����{
	void �Ա�();
	void ���();
	void ��ü();
	void ����();
}

class �������� implements �ѱ�����{
	@Override
	public void �Ա�() {
		System.out.println("�������� 3%�Դϴ�");
	}
	@Override
	public void ���() {
		// TODO Auto-generated method stub
	}
	@Override
	public void ��ü() {
		// TODO Auto-generated method stub
	}
	@Override
	public void ����() {
		// TODO Auto-generated method stub
	}
}

class �츮���� implements �ѱ�����{
	@Override
	public void �Ա�() {	
		System.out.println("�������� 10%�Դϴ�");
	}
	@Override
	public void ���() {
		// TODO Auto-generated method stub
	}
	@Override
	public void ��ü() {
		// TODO Auto-generated method stub
	}@
	Override
	public void ����() {
		// TODO Auto-generated method stub
	}
}

public class InterfaceEx01 {

	public static void main(String[] args) {
		�������� b1 = new ��������();
		�츮���� b2 = new �츮����();
		b1.�Ա�();
		b2.�Ա�();
	}

}
