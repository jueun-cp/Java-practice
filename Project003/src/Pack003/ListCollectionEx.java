package Pack003;

import java.util.*;

public class ListCollectionEx {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		
		arrList.add("넷");
		arrList.add("둘");
		arrList.add("셋");
		arrList.add("하나");
		
		for (String value : arrList) {
			System.out.println(value);
		}
	}

}
