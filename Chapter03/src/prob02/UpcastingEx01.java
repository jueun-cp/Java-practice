package prob02;

class Super{
	void m1() {
		System.out.println("부모" + 1);
	}
	void m3() {
		System.out.println("부모" + 3);
	}
}
class Sub extends Super{
	void m2() {
		System.out.println("자식" + 2);
	}
	void m4() {
		System.out.println("자식" + 4);
	}
}

public class UpcastingEx01 {

	public static void main(String[] args) {
		//업캐스팅
		Super obj = new Sub();
		obj.m1();
		//자삭에게 함수가 있는지 확인하고
		//있으면 자식함수 실행, 없으면 부모함수 사용
		obj.m3();
		
	}

}
