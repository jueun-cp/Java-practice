package prob04;

class Baduk{
	Ai ai;
	Baduk(Ai ai){
		System.out.println("대국을 시작합니다");
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
		System.out.println("인공지능은 알파고입니다");
	}
	@Override
	public void stop() {
		System.out.println("알파고가 점수 계산을 시작합니다");
	}
}

class Betago implements Ai{
	@Override
	public void play() {
		System.out.println("인공지능은 베타고입니다");
	}
	@Override
	public void stop() {
		System.out.println("베타고가 점수 계산을 시작합니다");
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
