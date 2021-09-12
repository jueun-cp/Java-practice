package prob02;

import java.util.*;

public class IteratorEx {
	public static void main(String[] args) {
		// set은 인터페이스이므로 객체를 생성할 수 없어서 HashSet을 통해 생성했음
		Set<String> set = new HashSet<String>();
		Iterator<String> iterator = set.iterator();
		// 저장된 객체 수만큼 루핑(반복)한다
		while(iterator.hasNext()) { 
			// 객체 하나를 가져옴
			String str = iterator.next();
		}
	}
}
