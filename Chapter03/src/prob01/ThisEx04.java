package prob01;

//this()
class D {
	D(){
		System.out.println("»ý»óÀÚ call");
	}
	D(int a){
		this();
		System.out.println(a);
	}
	D(int a, int b){
		this(a+b);
		System.out.println(a+ " " + b);
	}
}
public class ThisEx04 {
	public static void main(String[] args) {
		D d = new D(10,20);
	}

}
