package Pack003;

import java.util.*;

class Student {
	public int sno;
	public String name;
	
	// ������
	public Student(int sno, String name) { 
		this.sno = sno;
		this.name = name;
	}
	
	// �й��� �̸��� ������ ��� true ����
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return (sno == student.sno) && (name.equals(student.name));
		} else {
			return false;
		}
	}
	
	// �й��� �̸��� ���ٸ� ������ ���� ����
	public int hashCode() {
		return sno+name.hashCode();
	}
}

public class HashMapEx2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1,"ȫ�浿"), 95); 
		map.put(new Student(1,"ȫ�浿"), 95); 
		map.put(new Student(2,"ȫ����"), 100); 
		
		System.out.println("�� Entry ��: " + map.size());
	}	
}
