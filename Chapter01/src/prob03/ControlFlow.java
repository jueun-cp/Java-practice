package prob03;

public class ControlFlow {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i<3) {
				//만나자마자 반복문의 증감식(i++)으로 넘어감
				continue;
			}
			System.out.println(i);
			if(i == 7) {
				//반복문 탈출
				break;
			}
		}
		System.out.println("for 반복문 끝");
		
		int num = 0;
		while(true) {
			num++;
			if(num % 2 != 0) {
				System.out.println("홀수 "+num);
				continue;
			}
			if(num == 10) {
				System.out.println("종료 직전 " + num);
				break;
			}
		}
	}
}
