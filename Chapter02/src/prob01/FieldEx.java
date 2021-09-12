package prob01;

class Field{
	//클래스 내 생성되는 변수 
	int a;
	int b;
	int c,d = 30;
	
}

public class FieldEx {
	public static void main(String[] args) {
		//Field class 의 객체 생성
		Field f1 = new Field();
		Field f2 = new Field();
		
		f1.a = 100;
		f2.c = f1.a + 30;
		System.out.println("f1의 a " + f1.a);
		System.out.println("f1의 c " + f1.c);
		System.out.println("f2의 a " + f2.a);
		System.out.println("f2의 c " + f2.c);
		
		//객체를 식별하는 정수 값
		System.out.println(f1.hashCode());
		System.out.println(f2.hashCode());
		}
	}
