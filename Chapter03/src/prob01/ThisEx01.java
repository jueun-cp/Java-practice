package prob01;
// ����� ������� �μ� ������ �������� ������ ��
class A{
	int a,b;
	int size;
	
	A(int a, int b, int size){
		this.a = a;
		this.b = b;
		this.size = size;
		System.out.println();
	}
	void show() {
		System.out.println(this.a + " "+this.b);
	}
}

public class ThisEx01 {
	public static void main(String[] args) {
		A a = new A(10, 20, 30);
		a.show();
	}

}
