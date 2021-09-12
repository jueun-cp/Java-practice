package prob03;

public class For {

	public static void main(String[] args) {
		int num = 10;
		for (int i = 0; i < 3; i++) {
			System.out.println("호랑이" + i);
		}
		
		//대표적인 3가지 방식
		for (int i = 0; i < 5; i++) {
		}
		for (int i = 1; i <= 5; i++) {
		}
		//공식처럼 사용됨 (좌표시 사용)
		int n = 5;
		for (int i = -n; i <= n; i++) {
			// 5*2+1 만큼 반복됨
		}

		//1부터 10까지 합
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		//구구단 5단
		int gugudan = 5;
		for (int i = 1; i < 10; i++) {
			System.out.println(gugudan + " * " + i + " = " + n * i);
		}
	}

}
