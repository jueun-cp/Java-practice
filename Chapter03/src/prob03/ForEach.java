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
		}System.out.println(" "); //�ٹٲ�
		
		str[0] = "ȣ����";
		str[1] = "����";
		str[2] = "�䳢";
		str[3] = "�ź���";
		str[4] = "�ڳ���";
		
		for(String x : str) {
			System.out.print(x + " ");
		}System.out.println(" ");
		
	}

}
