package prob02;
//���� ������

class Access{
	//���� �����ڸ� ���������� default�� �����Ǿ� ����
	private int a; //Access Ŭ���� �������� ��밡��
	public int b;
	
	void m1() {
		a = 100;
		b = 200;
	}
	
	private void m2() {
		//������ ����
		//�ܺο��� ���Ұ�, ���ο����� ��밡��
	}
}
public class AccessModifier {

	public static void main(String[] args) {
		Access obj = new Access();
		obj.b = 10;
//		obj.a = 100; ���ٺҰ�
		System.out.println(obj.b);
	}

}
