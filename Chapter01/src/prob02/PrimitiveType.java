package prob02;

public class PrimitiveType {
	//�⺻Ÿ�� 8����
	public static void main(String[] args) {
		byte apple; // apple�̶� ������ �޸� 1byte �� (��ǻ�Ϳ� �޸� �䱸�ϱ�)
		apple = -128; // '=' ���Կ�����
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println("apple " + apple);
		
		short banana = 3000;
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println("banana " + banana);
		
		int orange = 20000;
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println("orange " + orange);
		
		long melon = 100000;
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println("melon " + melon);
		
		float tiger = 3.14f;
		System.out.println("tiger " + tiger);
		
		double lion = 3.14;
		System.out.println("lion " + lion);
		
		// char cat = 1234; <= �̷��� ������� ����
		char cat = '��';
		System.out.println((int)Character.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);
		System.out.println(cat);
		
		boolean dog = true;
		System.out.println(dog);
	}
}
