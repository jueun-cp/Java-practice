package prob03;

public class Switch {
	public static void main(String[] args) {
		int num = 10;
		switch (num) {
		case 10: {
			System.out.println(10);
			break;
		}
		case 20: { 
			//case�б⹮���� ����Ǵ� ������ 1���� �̻��� ��� break�� ������ ������ ������ ����
			System.out.println(20);
			System.out.println(100);
		}
			break;
		case 30: {
			System.out.println(30);
			break;
		}
		default:
			System.out.println("���� �ƹ� �ش������ ���� ��� �̰� ���۵�");
		}

		//���� ��� ���α׷�
		int jumsu = 83;
		int q = jumsu / 10;
		switch (q) {
		case 9: {
			System.out.println("A�����Դϴ�");
			break;
		}
		case 8: {
			System.out.println("B�����Դϴ�");
			break;
		}
		case 7: {
			System.out.println("C�����Դϴ�");
			break;
		}
		case 6: {
			System.out.println("D�����Դϴ�");
			break;
		}
		default:
			System.out.println("F�����Դϴ�");
		}

	}
}
