package prob04;

class Baduk{
	Ai ai;
	Baduk(Ai ai){
		System.out.println("�뱹�� �����մϴ�");
		this.ai = ai;
	}
	void play() {
		ai.play();
	}
	void stop() {
		ai.stop();
	}
}

interface Ai{
	void play();
	void stop();
}

class Alpago implements Ai{
	@Override
	public void play() {
		System.out.println("�ΰ������� ���İ��Դϴ�");
	}
	@Override
	public void stop() {
		System.out.println("���İ� ���� ����� �����մϴ�");
	}
}

class Betago implements Ai{
	@Override
	public void play() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�");
	}
	@Override
	public void stop() {
		System.out.println("��Ÿ�� ���� ����� �����մϴ�");
	}
}

public class InterfaceEx03 {
	public static void main(String[] args) {
		Baduk baduk1 = new Baduk(new Alpago());
		baduk1.play();
		baduk1.stop();
		
		Baduk baduk2 = new Baduk(new Betago());
		baduk2.play();
		baduk2.stop();
	}
}
