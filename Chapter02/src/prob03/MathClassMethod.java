package prob03;

public class MathClassMethod {
	public static void main(String[] args) {
		//abs
		int v1 = Math.abs(-5);
		System.out.println(v1);

		//ceil
		double v2 = Math.ceil(5.3);
		double v3 = Math.ceil(-5.3);
		System.out.println(v2 + " " + v3);

		//floor
		double v4 = Math.floor(5.3);
		double v5 = Math.floor(-5.3);
		System.out.println(v4 + " " + v5);

		//max
		int v6 = Math.max(5, 9);
		System.out.println(v6);

		//min
		int v7 = Math.min(5, 9);
		System.out.println(v7);

		//rint
		double v8 = Math.rint(5.3);
		System.out.println(v8);

		//round
		long v9 = Math.round(5.3);
		long v10 = Math.round(5.7);
		System.out.println(v9);
		System.out.println(v10);
	}
}
