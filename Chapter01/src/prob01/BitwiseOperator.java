package prob01;

public class BitwiseOperator {
	
	static String hexaToBinary(int n) {
		String s = Integer.toBinaryString(n);
		while(s.length() < 32) {
			s = "0" + s;
		}
		StringBuffer s1 = new StringBuffer(s);
		
		//4비트씩 끊어주기
		for(int i = 0; i< 7; i++) {
			s1.insert((7-i)*4, " ");
		}
		return s1.toString();
	}
	public static void main(String[] args) {
		int a = 0x3b12cd5a;
		int b = 0x0000ff00;
		int c = 0x0ff00000;
		int d = 0x0000cd5a;
		
		System.out.println("a : " + hexaToBinary(a));
		System.out.println("b : " + hexaToBinary(b));
		System.out.println("c : " + hexaToBinary(c));
		System.out.println("d : " + hexaToBinary(d));
		System.out.println("-----------------------");
		
		//시프트 연산, >> : 오른쪽으로 밀기 
		int mask = 0x0080;
		char n = 0x00dc;
		String s2 = hexaToBinary(n);
		System.out.println(hexaToBinary(mask));
		System.out.println(s2);
		System.out.println("------------------------");
		
		String[] products = new String[]{"냉장고","전자레인지","선풍기","에어프라이기","시계","컴퓨터","충전기","에어컨"};
		for(int i=0; i<8; i++) {
			String s3 = (n & (mask >> i)) == 0 ? "off" : "on";
			System.out.println(products[i] += s3);
		}
	}
}
