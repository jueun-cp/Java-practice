package prob02;

class Car{
	int fuel = 100;
	String name;
	
	Car(){
		System.out.println("생성자 call");
		name = "붕붕이";
	}
	Car(String n, int f){
		System.out.println("인자 있는 생성자 call");
		fuel += f;
		name = n;
	}
	void move() {
		fuel -= 30;
		System.out.println("car move");
	}
	void stop() {
		fuel -= 10;
		System.out.println("car stop");
	}
	void inject() {
		fuel += 100;
	}
	void inject(int f) {
		fuel += f;
	}
	void showFuel() {
		System.out.println(fuel);
	}

}

public class ConstructorEx02 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("방방이",200);
		car1.move();
		car1.showFuel();
		car2.move();
		car2.showFuel();
	}
}
