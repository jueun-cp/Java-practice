package prob02;

public class TypeConversion {
	//Ÿ�� ��ȯ
	public static void main(String[] args) {
		 int a = 10;
		 int b = 20;
		 short c = 30;
		 
		 //���� Ÿ�� ��ȯ
		 b = (int)c;
		 c = (short)a;
		 System.out.println(b + " " + c);
	
		 //�޸𸮿� �Ҵ���� ����Ʈ ũ�Ⱑ ���� Ÿ�Կ��� ū Ÿ���� ��ȯ��
		 //�ڹٰ� �ڵ����� Ÿ���� ��ȯ����
		 double e = 10;
		 double f = e + a;
		 System.out.println(f);
	}
}
