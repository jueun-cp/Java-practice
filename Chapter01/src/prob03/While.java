package prob03;

public class While {
	public static void main(String[] args) {
//		int num = 0;
//		while(true) {
//			System.out.println(num + " ");
//			num++;
//		}
		
		int a = 0;
		while(true) {
			System.out.println(a);
			if(a == 5) {
				System.out.println("탈출하기 직전");
				break;
			}
			a++;
		}
	}
}
