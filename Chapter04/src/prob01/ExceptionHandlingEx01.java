package prob01;

public class ExceptionHandlingEx01 {

	public static void main(String[] args) {
		//(1)ArithmeticException
		try {
			int a = 10 / 0;
		} catch (Exception e) {
			//handle exception
			e.printStackTrace();
		}
		
		//(2)ArrayIndexOutOfBoundsException
		int[] arr = {1,2,3};
		try {
			arr[3] = 10;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//(3)NullPointException
		String s = "����ȭ�����Ǿ����ϴ�";
		System.out.println(s.length());
		s = null;
		try {
			System.out.println(s.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
