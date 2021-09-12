package prob01;

public class TernartOperator {
	//삼항 연산자
	public static void main(String[] args) {
		//조건식 ? 반환값1 : 반환값2
		int num1 =5;
		int num2 = 7;
		int result;
		
		result = (num1-num2 >0) ? num1 : num2;
		System.out.println("더 큰 수는 ? " + result);
	}

}
