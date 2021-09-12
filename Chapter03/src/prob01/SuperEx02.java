package prob01;

class Super02{
	Super02(){
		System.out.println("super ������ call");
	}
	Super02(int n){
		System.out.println("2��° super ������ call");
		System.out.println(n);
	}
}
class Sub02 extends Super02{
	Sub02(){
		super();
		System.out.println("sub ������ call");
	}
	//������ �����ε�
	Sub02(int n){
		//superŰ����� ������ �� ù �ٿ� ����� ��
		super(n + 100);
		System.out.println("2��° Sub ������ call");
	}
	//������ �����ε�
	Sub02(int a, int b){
		super(a*b);
		System.out.println("3���� sub ������ call");
	}
}

//������ ȣ�� => super()
public class SuperEx02 {
	public static void main(String[] args) {
		Super02 s1 = new Super02();
		//�����ε��� ������ ȣ��
		Sub02 s2 = new Sub02(100);
		Sub02 s3 = new Sub02(3,4);
	}
}
