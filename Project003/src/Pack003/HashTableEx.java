package Pack003;

import java.util.*;

public class HashTableEx {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("Spring", "3");
		map.put("Summer", "6");
		map.put("Fall", "9");
		map.put("Winter", "12");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.println("���̵� : ");
			String id = scanner.nextLine();
			
			System.out.println("��й�ȣ : ");
			String pwd = scanner.nextLine();
			System.out.println("");
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pwd)) {
					System.out.println("login success");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
				} }else {
					System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�");
			}
		}
		
	}

}
