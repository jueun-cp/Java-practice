package prob02;

public class TypeConversion {
	//타입 변환
	public static void main(String[] args) {
		 int a = 10;
		 int b = 20;
		 short c = 30;
		 
		 //강제 타입 변환
		 b = (int)c;
		 c = (short)a;
		 System.out.println(b + " " + c);
	
		 //메모리에 할당받은 바이트 크기가 작은 타입에서 큰 타입의 변환은
		 //자바가 자동으로 타입을 변환해줌
		 double e = 10;
		 double f = e + a;
		 System.out.println(f);
	}
}
