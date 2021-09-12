package prob01;

class Super02{
	Super02(){
		System.out.println("super 생성자 call");
	}
	Super02(int n){
		System.out.println("2번째 super 생성자 call");
		System.out.println(n);
	}
}
class Sub02 extends Super02{
	Sub02(){
		super();
		System.out.println("sub 생성자 call");
	}
	//생성자 오버로딩
	Sub02(int n){
		//super키워드는 생성자 젤 첫 줄에 적어야 함
		super(n + 100);
		System.out.println("2번째 Sub 생성자 call");
	}
	//생성자 오버로딩
	Sub02(int a, int b){
		super(a*b);
		System.out.println("3번쨰 sub 생성자 call");
	}
}

//생성자 호출 => super()
public class SuperEx02 {
	public static void main(String[] args) {
		Super02 s1 = new Super02();
		//오버로딩된 생성자 호출
		Sub02 s2 = new Sub02(100);
		Sub02 s3 = new Sub02(3,4);
	}
}
