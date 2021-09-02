package Pack003;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		// String ��ü�� �ߺ����� ����
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet");
		//Java�� �ѹ��� �����
		set.add("Java");
		set.add("iBATIS");
		
		//����� ��ü �� ���
		int size = set.size();
		System.out.println("�� ��ü�� : " + size);
		
		//�ݺ���
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);	
		}
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("�� ��ü��: " + set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);	
		}
		set.clear();
		if(set.isEmpty()) { System.out.println("�������");}
	}
}
