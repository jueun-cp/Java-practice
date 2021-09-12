package prob03;

class Variable{
	static int number = 1234;
	String name;
	
	void m1() {
		int thing = 300;
	}
}
public class StaticVariable {

	public static void main(String[] args) {
		Variable obj1 = new Variable();
		Variable obj2= new Variable();
		
		//static 변수는 객체이름 혹은 클래스 이름으로 접근가능
		System.out.println(obj1.number);
		obj2.number = 500;
		System.out.println(obj2.number);
		System.out.println(Variable.number);
	}

}
