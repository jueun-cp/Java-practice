package prob01;

class Field{
	//Ŭ���� �� �����Ǵ� ���� 
	int a;
	int b;
	int c,d = 30;
	
}

public class FieldEx {
	public static void main(String[] args) {
		//Field class �� ��ü ����
		Field f1 = new Field();
		Field f2 = new Field();
		
		f1.a = 100;
		f2.c = f1.a + 30;
		System.out.println("f1�� a " + f1.a);
		System.out.println("f1�� c " + f1.c);
		System.out.println("f2�� a " + f2.a);
		System.out.println("f2�� c " + f2.c);
		
		//��ü�� �ĺ��ϴ� ���� ��
		System.out.println(f1.hashCode());
		System.out.println(f2.hashCode());
		}
	}
