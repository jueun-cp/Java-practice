package prob01;
//thread Class
public class ExceptionHandlingEx03 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println(i);
			try {
				//�ش� ���ڸ�ŭ ���α׷��� ���� ������
				//�� �� ó���ϴ� ���� �Ϲ���
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			//���� ó���� �ڵ�
//			try { Thread.sleep(2000); } catch (Exception e) { }
		}
		
	}

}
