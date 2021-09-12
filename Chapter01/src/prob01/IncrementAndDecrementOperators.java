package prob01;

public class IncrementAndDecrementOperators {
	//증감 연산자
	public static void main(String[] args) {
		int a = 10, b = 0;
		//실행 순서 차이
		b = a++; //대입후 증가
		System.out.println(a + " " +b);
		b = ++a; //증가 후 대입
		System.out.println(a + " " +b);
	}

}
