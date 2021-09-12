package prob03;

public class If {
	public static void main(String[] args) {
		//if문(1)
		System.out.println(1);
		if (true) {
			System.out.println(2);
			System.out.println(4);
		}
		; //;은 생략가능 (생략형)
		System.out.println(3);

		//if문(2)
		//삼항으로 바꿀수 있으면 삼항연산으로 적어주는 것이 좋음
		if (false) {
			System.out.println(5);
		} else {
			System.out.println(6);
		}

		//if문-삼항연산(1)
		int a = 10, b = 5;
		int c;
		if (a > b) {
			c = 7;
		} else {
			c = 8;
		}
		System.out.println(c);

		c = a > b ? 7 : 8;
		System.out.println(c);

		//if문-삼항연산(2)
		if (a > b) {
			System.out.println("호랑이");
		} else {
			System.out.println("코끼리");
		}
		System.out.println(a > b ? "호랑이" : "코키리");

		//학점 계산 프로그램
		int num = 83;
		if (num >= 90) {
			System.out.println("A학점입니다");
		} else if (num >= 80) {
			System.out.println("B학점입니다");
		} else if (num >= 70) {
			System.out.println("C학점입니다");
		} else if (num >= 60) {
			System.out.println("D학점입니다");
		} else {
			System.out.println("F학점입니다");
		}
	}
}
