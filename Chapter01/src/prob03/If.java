package prob03;

public class If {
	public static void main(String[] args) {
		//if��(1)
		System.out.println(1);
		if (true) {
			System.out.println(2);
			System.out.println(4);
		}
		; //;�� �������� (������)
		System.out.println(3);

		//if��(2)
		//�������� �ٲܼ� ������ ���׿������� �����ִ� ���� ����
		if (false) {
			System.out.println(5);
		} else {
			System.out.println(6);
		}

		//if��-���׿���(1)
		int a = 10, b = 5;
		int c;
		if (a > b) {
			c = 7;
		} else {
			c = 8;
		}
		System.out.println(c);

		c = a > b ? 7 : 8;
		System.out.println(c);

		//if��-���׿���(2)
		if (a > b) {
			System.out.println("ȣ����");
		} else {
			System.out.println("�ڳ���");
		}
		System.out.println(a > b ? "ȣ����" : "��Ű��");

		//���� ��� ���α׷�
		int num = 83;
		if (num >= 90) {
			System.out.println("A�����Դϴ�");
		} else if (num >= 80) {
			System.out.println("B�����Դϴ�");
		} else if (num >= 70) {
			System.out.println("C�����Դϴ�");
		} else if (num >= 60) {
			System.out.println("D�����Դϴ�");
		} else {
			System.out.println("F�����Դϴ�");
		}
	}
}
