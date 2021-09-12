package prob01;
//thread Class
public class ExceptionHandlingEx03 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println(i);
			try {
				//해당 숫자만큼 프로그램이 쉬고 동작함
				//한 줄 처리하는 것이 일반적
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			//한줄 처리한 코드
//			try { Thread.sleep(2000); } catch (Exception e) { }
		}
		
	}

}
