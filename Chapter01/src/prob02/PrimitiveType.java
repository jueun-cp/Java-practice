package prob02;

public class PrimitiveType {
	//기본타입 8가지
	public static void main(String[] args) {
		byte apple; // apple이란 공간에 메모리 1byte 줘 (컴퓨터에 메모리 요구하기)
		apple = -128; // '=' 대입연산자
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
		
		// char cat = 1234; <= 이렇게 사용하지 않음
		char cat = '한';
		System.out.println((int)Character.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);
		System.out.println(cat);
		
		boolean dog = true;
		System.out.println(dog);
	}
}
