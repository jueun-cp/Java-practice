package prob04;

interface Car{
	 void sound();
}
class Truck implements Car{
	@Override
	public void sound() {
		System.out.println("�θ�������");
	}
}
public class Interface {
	public static void main(String[] args) {
		//��ĳ����
		Car car = new Truck();
		car.sound();
	}	
}
