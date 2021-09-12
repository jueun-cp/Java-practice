package prob03;

public class ForEach {

	public static void main(String[] args) {
		int[] arr = new int[5];
		String[] str = new String[5];

		for (int i = 0; i < 5; i++) {
			arr[i] = i;
		}
		for (int x : arr) {
			System.out.print(x);
		}System.out.println(" "); //ÁÙ¹Ù²Þ
		
		str[0] = "È£¶ûÀÌ";
		str[1] = "»çÀÚ";
		str[2] = "Åä³¢";
		str[3] = "°ÅºÏÀÌ";
		str[4] = "ÄÚ³¢¸®";
		
		for(String x : str) {
			System.out.print(x + " ");
		}System.out.println(" ");
		
	}

}
