package prob02;

class Overloading{
	void method01() {
		System.out.println(1);
	}
	//overloading
	void method01(int a) {
		System.out.println(2);
	}
	void method01(int a, int b) {
		System.out.println(3);
	}
	void method01(String s) {
		System.out.println(4);
	}
	
	//ī�� ǥ������� �ۼ�
	int getAreaRect(int w, int h) {
		//���簢�� ����
		return w*h;
	}
	int getAreatRect(int length) {
		//���簢�� ����
		return length * length;
	}
}
public class OverloadingEx {
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.method01();
		obj.method01(2);
		obj.method01(2,3);
		obj.method01("hi");
		
		int a = obj.getAreaRect(30, 50);
		int b = obj.getAreatRect(50);
		System.out.println(a + " " + b);
	}
}
