package prob01;

public class LogicalOperator {
	//논리 연산자
	public static void main(String[] args) {
		//or
		System.out.println(false || false); 
		System.out.println(false || true); 
		System.out.println(true || false); 
		System.out.println(true || true); 
		//and
		System.out.println(false && false); 
		System.out.println(false && true); 
		System.out.println(true && false); 
		System.out.println(true && true); 
		
		System.out.println(true && true && false);
		System.out.println(false || false || true);
		
		System.out.println(false || false && true); //잘못된 코드 
		System.out.println(false || (false && true)); //옳은 코드, 괄호 사용
		
		System.out.println(3 > 2 || false || 6 <= 3); 
		//부정연산자 
		System.out.println(!true);
		System.out.println(!(3 > 2));
	}

}
