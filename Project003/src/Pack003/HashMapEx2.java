package Pack003;

import java.util.*;

class Student {
	public int sno;
	public String name;
	
	// 생성자
	public Student(int sno, String name) { 
		this.sno = sno;
		this.name = name;
	}
	
	// 학번가 이름이 동일할 경우 true 리터
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return (sno == student.sno) && (name.equals(student.name));
		} else {
			return false;
		}
	}
	
	// 학번과 이름이 같다면 동일한 값을 리턴
	public int hashCode() {
		return sno+name.hashCode();
	}
}

public class HashMapEx2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1,"홍길동"), 95); 
		map.put(new Student(1,"홍길동"), 95); 
		map.put(new Student(2,"홍나방"), 100); 
		
		System.out.println("총 Entry 수: " + map.size());
	}	
}
