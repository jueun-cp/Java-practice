package prob01;

public class TernartOperator {
	//���� ������
	public static void main(String[] args) {
		//���ǽ� ? ��ȯ��1 : ��ȯ��2
		int num1 =5;
		int num2 = 7;
		int result;
		
		result = (num1-num2 >0) ? num1 : num2;
		System.out.println("�� ū ���� ? " + result);
	}

}
