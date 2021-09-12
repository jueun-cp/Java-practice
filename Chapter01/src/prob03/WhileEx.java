package prob03;

public class WhileEx {
	//우박수 프로그램
	public static void main(String[] args) {
		int n = 77;
		while (true) {
			System.out.println(n);
			n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
			if (n == 1) {
				System.out.println(n);
				System.out.println("탈출하기 직전");
				break;
			}
		}

		//합 구하기
		//ex)1 + 2 + 3 + 4 = 10
		int n2 = 1234;
		int sum = 0;
		while (true) {
			int r = n2 % 10;
			n2 /= 10;
			System.out.println(n2);
			sum += r;
			if (n2 == 0) {
				break;
			}
		}
		System.out.println(sum);
	}
}
