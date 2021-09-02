package Pack003;

import java.util.*;

//해당 클래스는 돌아가지 않음, 인터페이스는 객체 생성이 불가능하였기 때문
public class SetCollectionEx {

	public static void main(String[] args) {
		Set<String> set = null;
		// 인터페이스라서 객체 생성안됨  
		
		// 객체 생성
		set.add("홍길동");
		set.add("신용권");
		
		// 객체 삭제
		set.remove("홍길동");
		
		//전체 객체를 대상으로 한번씩 반복해서 가져오는 반복자 사용
		Iterator<String> iterator = set.iterator();
		
	}
}
