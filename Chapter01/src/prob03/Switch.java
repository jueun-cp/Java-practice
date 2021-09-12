package prob03;

public class Switch {
	public static void main(String[] args) {
		int num = 10;
		switch (num) {
		case 10: {
			System.out.println(10);
			break;
		}
		case 20: { 
			//case분기문에서 실행되는 문장이 1문장 이상일 경우 break를 밖으로 스코프 밖으로 빼줌
			System.out.println(20);
			System.out.println(100);
		}
			break;
		case 30: {
			System.out.println(30);
			break;
		}
		default:
			System.out.println("위와 아무 해당사항이 없을 경우 이게 동작됨");
		}

		//학점 계산 프로그램
		int jumsu = 83;
		int q = jumsu / 10;
		switch (q) {
		case 9: {
			System.out.println("A학점입니다");
			break;
		}
		case 8: {
			System.out.println("B학점입니다");
			break;
		}
		case 7: {
			System.out.println("C학점입니다");
			break;
		}
		case 6: {
			System.out.println("D학점입니다");
			break;
		}
		default:
			System.out.println("F학점입니다");
		}

	}
}
