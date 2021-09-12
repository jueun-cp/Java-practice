package prob01;
//throw

class Exception02{
	void m1() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 발생");
		}
	}
	void m2() throws Exception{
		System.out.println("예외 떠넘기기");
		throw new Exception();
	}
}
public class ExceptionHandlingEx02 {

	public static void main(String[] args) {
		Exception02 obj = new Exception02();
		obj.m1();
		//unhandled exception
		try {
			obj.m2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
