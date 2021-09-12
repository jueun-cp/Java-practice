package prob01;

public class StringClassMethod {

	public static void main(String[] args) {
		String s = "무궁화꽃이피었습니다";
		
		//(1)길이
		System.out.println(s.length());
		
		//(2)해당 인덱스에 있는 문자뽑기
		char c = s.charAt(3);
		System.out.println(c);
		
		//(3) 글자를 찾으면 인덱스 번호(위치값)를 return 해줌, 못찾으면 -1를 return
		System.out.println(s.indexOf("화꽃이"));
		System.out.println(s.indexOf("목꽃이"));
		
		int n = s.indexOf("화꽃이");
		if(n != -1) {
			System.out.println(n + "번째 find");
		} else {
			System.out.println("not found");
		}
		
		//(4)찾는 글자를 다른 글자로 바꿔줌
		//원본 데이터가 갱신되진 않음
		System.out.println(s.replace("꽃이", "나무가"));
		System.out.println(s);
//		s = "대한민국"; //기존의 데이터를 삭제하고 새로운 객체 생성
		
		//(5)부분적으로 특정부분의 데이터를 잘라내는 것
		//원본 데이터 변경x
		System.out.println(s.substring(5));
		System.out.println(s.substring(3,6));
		
		//(6)글자 앞뒤의 공백제거
		String s2 = "   App   le";
		System.out.println(s2.trim());
		System.out.println(s2);
		
		//(7)소문자 -> 대문자 , 대문자 -> 소문자
		//문자 카운팅할 때 쓰임
		String s3 = "APple";
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		//(8)데이터를 받았을 때 처리법 (네트워크)
		byte[] data = new byte[] {65,'B','C'};
		//배열명, 변환시키고싶은 인덱스 번호, 배열의 크기(앞에 숫자가 0이라는 전제하에
		String s4 = new String(data,0,data.length);
		System.out.println(s4);
		
		//(9)데이터를 전송할 때 처리법 (네트워크)
		String s5 = "Banana";
		byte[] data1 = s5.getBytes();
		for(byte value : data1) {
			System.out.println((char)value);
		}
			
	}

}
