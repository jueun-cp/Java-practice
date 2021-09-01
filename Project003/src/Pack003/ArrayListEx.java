package Pack003;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		//ArrList ����
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		//add()�޼ҵ带 �̿��� ����� ����
		arrList.add(40);
		arrList.add(20);
		arrList.add(10);
		arrList.add(50);
		arrList.add(30);
		
		//for���� get()�޼ҵ带 �̿��� ��� ���
		for(Integer e : arrList) {
			System.out.println(e);
		}
		System.out.println("--------------------------");
		
		//remove()�޼ҵ带 �̿��� ����� ����
		arrList.remove(1);
		System.out.println(arrList);
		System.out.println("--------------------------");
		
		//Collections.sort()�޼ҵ带 �̿��� ����� ����
		Collections.sort(arrList);
		System.out.println(arrList);
		System.out.println("--------------------------");
		
		//iterator.sort()�޼ҵ带 �̿��� ����� ����
		Iterator<Integer> iter = arrList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next()+" ");
		}System.out.println("--------------------------");
		
		//set()�޼ҵ带 �̿��� ����� ����
		arrList.set(0, 20);
		for (int e : arrList) {
			System.out.println(e);
		}System.out.println("--------------------------");
		
		//size()�޼ҵ带 �̿��� ����� �Ѱ���
		System.out.println("ũ�� : " + arrList.size());
	}
}
