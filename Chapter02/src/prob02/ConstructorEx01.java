package prob02;

class Constructor{
	//멤버 필드
	String name = "생성자";
	int num = 100;
	
	//default 생성자
	Constructor() {
		//멤버 필드 값을 초기화해줌
		name = "초기화";
		num = 200;
		System.out.println("생성자 call");
	}
	//생성자 오버로딩
	//생성자를 오버로딩할 때 default 생성자를 만들어주기 
	Constructor(int n, String s){ 
		name = s;
		num = n;
	}
	void info() {
		System.out.println(name + " " + num);
	}
}

public class ConstructorEx01 {

	public static void main(String[] args) {
		//Constructor()을 통해 생성자가 호출됨
		Constructor obj1 = new Constructor();
		Constructor obj2 = new Constructor();
		Constructor obj3 = new Constructor(100,"obj3생성자");
		Constructor obj4 = new Constructor(200,"obj4생성자");
		
		obj1.info();
		obj2.info();
		obj3.info();
		obj4.info();
	}

}
