package prob02;

public class DataType {
	//데이터 타입
	public static void main(String[] args) {
		//숫자
		System.out.println(10); 
 		//문자
		System.out.println('한'); // 문자
 		//문자열
		System.out.println("호랑이"); 
 		System.out.println("1000"); 
 		
 		//숫자 + 숫자 = 숫자
 		System.out.println(10 + 20);
 		//숫자 + 문자열 = 문자열
 		System.out.println(10 + "호랑이");
 		//문자열 + 숫자 = 문자열
 		System.out.println("호랑이" + 10); 
 		//문자열 + 문자열 = 문자열
 		System.out.println("호랑이" + "코끼리");
 		//좌측부터 계산
 		System.out.println(10 + "호랑이" + 20); // 10호랑이20
 		System.out.println(10 + 20 + "호랑이"); // 30호랑이
 		System.out.println("호랑이" + 10 + 20); // 호랑이1020
 		//숫자 두개를 한라인에 출력하고 싶을 때 사용 
 		System.out.println(10 + "" + 20 );    //1020
	}

}
