package prob04;

interface Car{
	 void sound();
}
class Truck implements Car{
	@Override
	public void sound() {
		System.out.println("부르르르릉");
	}
}
public class Interface {
	public static void main(String[] args) {
		//업캐스팅
		Car car = new Truck();
		car.sound();
	}	
}
