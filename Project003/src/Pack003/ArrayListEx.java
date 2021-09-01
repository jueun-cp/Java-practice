package Pack003;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		//ArrList 생성
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		//add()메소드를 이용한 요소의 저장
		arrList.add(40);
		arrList.add(20);
		arrList.add(10);
		arrList.add(50);
		arrList.add(30);
		
		//for문과 get()메소드를 이용한 요소 출력
		for(Integer e : arrList) {
			System.out.println(e);
		}
		System.out.println("--------------------------");
		
		//remove()메소드를 이용한 요소의 제거
		arrList.remove(1);
		System.out.println(arrList);
		System.out.println("--------------------------");
		
		//Collections.sort()메소드를 이용한 요소의 정렬
		Collections.sort(arrList);
		System.out.println(arrList);
		System.out.println("--------------------------");
		
		//iterator.sort()메소드를 이용한 요소의 정렬
		Iterator<Integer> iter = arrList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next()+" ");
		}System.out.println("--------------------------");
		
		//set()메소드를 이용한 요소의 변경
		arrList.set(0, 20);
		for (int e : arrList) {
			System.out.println(e);
		}System.out.println("--------------------------");
		
		//size()메소드를 이용한 요소의 총개수
		System.out.println("크기 : " + arrList.size());
	}
}
