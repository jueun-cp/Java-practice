package prob03;

public class MultiFor {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("[" + i + " " + j + "]");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("o ");
				} else {
					System.out.print("x ");
				}
			}
			System.out.println();
		}
	}

}
