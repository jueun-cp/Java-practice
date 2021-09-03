package Pack003;

import java.util.*;

//사용자 정의 클래스인 Member를 만들고 메소드 재정의
class Member{
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}

public class HashSetEx2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",30));
		
		System.out.println("총 객체수 : " + set.size());
	}

}
