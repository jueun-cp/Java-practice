package prob02;

public class Variable {
	public static void main(String[] args) {
		//������ ����ϴ� ���(1)
		int a;
		a = 10;
		System.out.println(a);
		
		//������ ����ϴ� ���(2)
		int b, c, d;
		b = 1;
		c = 2;
		d = 3;
		System.out.println(b + " " + c + " " + d);
		
		//������ ����ϴ� ���(3)
		int e = 10, f = 20, g = 30;
		int h, i = 40, j;
		h = 50;
		j = 60;
		System.out.println(e + " " + f + " " + g);
		System.out.println(h + " " + i + " " + j);

		//�����͸� ������� ����
		int a10 = 10;
		System.out.println(a10);
		a10 = 20;
		System.out.println(a10);

		//��ȯ���α׷�(1)
		int aa = 88, bb = 99;
		System.out.println(aa + " " + bb);
		int temp;
		temp = aa;   // temp = 88
		aa = bb;     // aa = 99
		bb = temp;   // bb = 88
		System.out.println(aa + " " + bb + " " + temp);

		//��ȯ���α׷�(2)
		int cc = 100, dd = 200;
		int tt = cc;
		cc = dd;
		dd = tt;
		System.out.println(cc + " " + dd + " " + tt);
	}
}
