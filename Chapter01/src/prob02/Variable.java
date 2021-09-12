package prob02;

public class Variable {
	public static void main(String[] args) {
		//변수를 사용하는 방법(1)
		int a;
		a = 10;
		System.out.println(a);
		
		//변수를 사용하는 방법(2)
		int b, c, d;
		b = 1;
		c = 2;
		d = 3;
		System.out.println(b + " " + c + " " + d);
		
		//변수를 사용하는 방법(3)
		int e = 10, f = 20, g = 30;
		int h, i = 40, j;
		h = 50;
		j = 60;
		System.out.println(e + " " + f + " " + g);
		System.out.println(h + " " + i + " " + j);

		//데이터를 재대입이 가능
		int a10 = 10;
		System.out.println(a10);
		a10 = 20;
		System.out.println(a10);

		//교환프로그램(1)
		int aa = 88, bb = 99;
		System.out.println(aa + " " + bb);
		int temp;
		temp = aa;   // temp = 88
		aa = bb;     // aa = 99
		bb = temp;   // bb = 88
		System.out.println(aa + " " + bb + " " + temp);

		//교환프로그램(2)
		int cc = 100, dd = 200;
		int tt = cc;
		cc = dd;
		dd = tt;
		System.out.println(cc + " " + dd + " " + tt);
	}
}
