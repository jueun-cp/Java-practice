package prob01;

import java.util.*;

public class ArrayListEx2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/Jsp");
		list.add(2,"DB");
		
		int size = list.size();
		System.out.println("ÃÑ °´Ã¼¼ö: " + size );
		System.out.println("---------------------------");
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println("---------------------------");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println("---------------------------");
		
		System.out.println(list);
		System.out.println("---------------------------");
		list.remove(2);
		System.out.println(list);
		System.out.println("---------------------------");
		list.remove(2);
		System.out.println(list);
		System.out.println("---------------------------");
		
		for(int i = 0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : "+ str);
		}
	}

}

