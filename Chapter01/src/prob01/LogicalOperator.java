package prob01;

public class LogicalOperator {
	//�� ������
	public static void main(String[] args) {
		//or
		System.out.println(false || false); 
		System.out.println(false || true); 
		System.out.println(true || false); 
		System.out.println(true || true); 
		//and
		System.out.println(false && false); 
		System.out.println(false && true); 
		System.out.println(true && false); 
		System.out.println(true && true); 
		
		System.out.println(true && true && false);
		System.out.println(false || false || true);
		
		System.out.println(false || false && true); //�߸��� �ڵ� 
		System.out.println(false || (false && true)); //���� �ڵ�, ��ȣ ���
		
		System.out.println(3 > 2 || false || 6 <= 3); 
		//���������� 
		System.out.println(!true);
		System.out.println(!(3 > 2));
	}

}
