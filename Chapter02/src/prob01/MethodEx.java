package prob01;

class Method{
	void m1() {
		System.out.println("반환형 x 인수전달 x");
	}
	
	void m2(int num) {
		System.out.println("반환형 x 인수전달 o");
		System.out.println("전달받은 인수 " + num);
	}
	
	int m3() {
		System.out.println("반환형 o 인수전달 x");
		return 10;
	}
	
	int m4(int num) {
		System.out.println("반환형 o 인수전달 o");
		System.out.println("전달받은 인수 " +num +" 반환할 인수 " + num*3);
		return num*3;
	}
}

public class MethodEx {

	public static void main(String[] args) {
		Method obj = new Method();
		obj.m1();
		obj.m2(1);
		obj.m3();
		obj.m4(2);
		
	}

}
