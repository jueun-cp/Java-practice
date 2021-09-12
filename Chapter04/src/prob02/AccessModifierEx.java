package prob02;

class AccessEx{
	private String name;
	private int age;
	
	//getter, setter ÇÔ¼ö
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
}
public class AccessModifierEx {

	public static void main(String[] args) {
		AccessEx obj = new AccessEx();
		obj.setName("È«±æµ¿");
		obj.setAge(345);
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}

}
