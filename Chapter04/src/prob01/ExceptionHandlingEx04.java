package prob01;
//finally
//try-catch에 오류가 있던 없던 finally는 실행됨

class Exception04{
	void m1(int a, int b) {
		if(a>b) {
			System.out.println("m1" + 1);
		}else {
			System.out.println("m1" + 2);
			return;
		}
		System.out.println("m1" + 3);
	}
	void m2(int a, int b) {
		try {
			if(a>b) {
				System.out.println("m2" + 1);
			}else {
				System.out.println("m2" + 2);
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("m2" + 3);
		}
	}
}
public class ExceptionHandlingEx04 {

	public static void main(String[] args) {
		try {
			int a = 10 / 1;
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			System.out.println(1);
		}
		Exception04 obj = new Exception04();
		obj.m1(10, 20);
		obj.m2(20, 30);;
	}

}
