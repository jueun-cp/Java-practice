package prob04;

interface 한국은행{
	void 입금();
	void 출금();
	void 이체();
	void 대출();
}

class 국민은행 implements 한국은행{
	@Override
	public void 입금() {
		System.out.println("이자율은 3%입니다");
	}
	@Override
	public void 출금() {
		// TODO Auto-generated method stub
	}
	@Override
	public void 이체() {
		// TODO Auto-generated method stub
	}
	@Override
	public void 대출() {
		// TODO Auto-generated method stub
	}
}

class 우리은행 implements 한국은행{
	@Override
	public void 입금() {	
		System.out.println("이자율은 10%입니다");
	}
	@Override
	public void 출금() {
		// TODO Auto-generated method stub
	}
	@Override
	public void 이체() {
		// TODO Auto-generated method stub
	}@
	Override
	public void 대출() {
		// TODO Auto-generated method stub
	}
}

public class InterfaceEx01 {

	public static void main(String[] args) {
		국민은행 b1 = new 국민은행();
		우리은행 b2 = new 우리은행();
		b1.입금();
		b2.입금();
	}

}
