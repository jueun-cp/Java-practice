package prob01;
//�μ� ������ ����
//ǥ��Ÿ��, �����Ŭ����, ǥ��Ŭ����
class Parameter{
	void m1(int a, int b) {
		System.out.println(a+" "+b);
	}
	void m2(int a, char b, boolean c, float d, String e) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	//class�� ���ڷ� �־��� ���
	void m3(Animal a) {
		//Animal Ŭ�������� �ۼ��� �Լ��� ����� �� ����
		a.info();
	}
}
class Animal{
	void info() {
		System.out.println("�����̴�");		
	}
}
public class MethodParameter {

	public static void main(String[] args) {
		String s = "ȣ����";
		Parameter p = new Parameter();
		p.m1(3, 4);
		p.m2(3, 'a', false, 3.14f, s);
		
		Animal animal = new Animal();
		p.m3(animal);
		//�� ���ó�� ���� ��ü�� �־��� ���� �ְ� new Animal()�� �ٷ� �־��൵ ��
		p.m3(new Animal());
	}

}
