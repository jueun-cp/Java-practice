package prob02;

class Constructor{
	//��� �ʵ�
	String name = "������";
	int num = 100;
	
	//default ������
	Constructor() {
		//��� �ʵ� ���� �ʱ�ȭ����
		name = "�ʱ�ȭ";
		num = 200;
		System.out.println("������ call");
	}
	//������ �����ε�
	//�����ڸ� �����ε��� �� default �����ڸ� ������ֱ� 
	Constructor(int n, String s){ 
		name = s;
		num = n;
	}
	void info() {
		System.out.println(name + " " + num);
	}
}

public class ConstructorEx01 {

	public static void main(String[] args) {
		//Constructor()�� ���� �����ڰ� ȣ���
		Constructor obj1 = new Constructor();
		Constructor obj2 = new Constructor();
		Constructor obj3 = new Constructor(100,"obj3������");
		Constructor obj4 = new Constructor(200,"obj4������");
		
		obj1.info();
		obj2.info();
		obj3.info();
		obj4.info();
	}

}
