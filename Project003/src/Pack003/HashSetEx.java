package Pack003;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		// String 객체를 중복없이 저장
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet");
		//Java는 한번만 저장됨
		set.add("Java");
		set.add("iBATIS");
		
		//저장된 객체 수 얻기
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
		//반복자
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);	
		}
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);	
		}
		set.clear();
		if(set.isEmpty()) { System.out.println("비어있음");}
	}
}
