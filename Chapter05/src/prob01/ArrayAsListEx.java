package prob01;

import java.util.*;

public class ArrayAsListEx {

	public static void main(String[] args) {
		//고정된 객체들로 구성된 List를 생성할 때
		
		List<String> list1 = Arrays.asList("홍길동","신용권","강자바");
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value : list2) {
			System.out.println(value);
		}
	}
}
