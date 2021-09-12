package prob02;
//접근 지정자

class Access{
	//접근 지정자를 적지않으면 default가 생략되어 있음
	private int a; //Access 클래스 내에서만 사용가능
	public int b;
	
	void m1() {
		a = 100;
		b = 200;
	}
	
	private void m2() {
		//데이터 은닉
		//외부에서 사용불가, 내부에서만 사용가능
	}
}
public class AccessModifier {

	public static void main(String[] args) {
		Access obj = new Access();
		obj.b = 10;
//		obj.a = 100; 접근불가
		System.out.println(obj.b);
	}

}
