package prob03;

public class For {

	public static void main(String[] args) {
		int num = 10;
		for (int i = 0; i < 3; i++) {
			System.out.println("ȣ����" + i);
		}
		
		//��ǥ���� 3���� ���
		for (int i = 0; i < 5; i++) {
		}
		for (int i = 1; i <= 5; i++) {
		}
		//����ó�� ���� (��ǥ�� ���)
		int n = 5;
		for (int i = -n; i <= n; i++) {
			// 5*2+1 ��ŭ �ݺ���
		}

		//1���� 10���� ��
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		//������ 5��
		int gugudan = 5;
		for (int i = 1; i < 10; i++) {
			System.out.println(gugudan + " * " + i + " = " + n * i);
		}
	}

}
