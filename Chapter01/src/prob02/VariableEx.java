package prob02;

public class VariableEx {
	//������ �̿��� ����
	public static void main(String[] args) {
		int a = 17, b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);

		//������ �켱���� ������� > �񱳿��� > ������
		System.out.println(a > b * 7);
		System.out.println(a > b * 7 || a - 10 > b);
	}

}
