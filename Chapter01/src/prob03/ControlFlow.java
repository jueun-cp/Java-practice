package prob03;

public class ControlFlow {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i<3) {
				//�����ڸ��� �ݺ����� ������(i++)���� �Ѿ
				continue;
			}
			System.out.println(i);
			if(i == 7) {
				//�ݺ��� Ż��
				break;
			}
		}
		System.out.println("for �ݺ��� ��");
		
		int num = 0;
		while(true) {
			num++;
			if(num % 2 != 0) {
				System.out.println("Ȧ�� "+num);
				continue;
			}
			if(num == 10) {
				System.out.println("���� ���� " + num);
				break;
			}
		}
	}
}
