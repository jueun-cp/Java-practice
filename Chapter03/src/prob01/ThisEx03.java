package prob01;
//�ٸ� ��ü�� �ڽ��� ������ �ѱ� ��
class Man{
	void m1() {
		Woman w = new Woman();
		if(w.merry(this)) {
			System.out.println("thank u");
		}else {
			System.out.println("OMG");
		}
	}
	int m2() {
		System.out.println("the money i have ~");
		return 500;
	}
	String m3() {
		return "����";
	}
}
class Woman{
	Boolean merry(Man m){
		if(m.m2() >= 10000 ) {
			return true;
		}else {
			String s = m.m3();
			switch(s) {
			case "�¼�" : return true;
			case "����" : return false;
			default : return false;
			}
		}
	}
}
public class ThisEx03 {

	public static void main(String[] args) {
		Man obj = new Man();
		obj.m1();
	}

}
