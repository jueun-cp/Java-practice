package prob02;

import java.util.*;

public class IteratorEx {
	public static void main(String[] args) {
		// set�� �������̽��̹Ƿ� ��ü�� ������ �� ��� HashSet�� ���� ��������
		Set<String> set = new HashSet<String>();
		Iterator<String> iterator = set.iterator();
		// ����� ��ü ����ŭ ����(�ݺ�)�Ѵ�
		while(iterator.hasNext()) { 
			// ��ü �ϳ��� ������
			String str = iterator.next();
		}
	}
}
