package prob02;

public class VariableEx {
	//변수를 이용한 연산
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

		//연산의 우선순위 산술연산 > 비교연산 > 논리연산
		System.out.println(a > b * 7);
		System.out.println(a > b * 7 || a - 10 > b);
	}

}
