package prob01;

public class StringClassMethod {

	public static void main(String[] args) {
		String s = "����ȭ�����Ǿ����ϴ�";
		
		//(1)����
		System.out.println(s.length());
		
		//(2)�ش� �ε����� �ִ� ���ڻ̱�
		char c = s.charAt(3);
		System.out.println(c);
		
		//(3) ���ڸ� ã���� �ε��� ��ȣ(��ġ��)�� return ����, ��ã���� -1�� return
		System.out.println(s.indexOf("ȭ����"));
		System.out.println(s.indexOf("�����"));
		
		int n = s.indexOf("ȭ����");
		if(n != -1) {
			System.out.println(n + "��° find");
		} else {
			System.out.println("not found");
		}
		
		//(4)ã�� ���ڸ� �ٸ� ���ڷ� �ٲ���
		//���� �����Ͱ� ���ŵ��� ����
		System.out.println(s.replace("����", "������"));
		System.out.println(s);
//		s = "���ѹα�"; //������ �����͸� �����ϰ� ���ο� ��ü ����
		
		//(5)�κ������� Ư���κ��� �����͸� �߶󳻴� ��
		//���� ������ ����x
		System.out.println(s.substring(5));
		System.out.println(s.substring(3,6));
		
		//(6)���� �յ��� ��������
		String s2 = "   App   le";
		System.out.println(s2.trim());
		System.out.println(s2);
		
		//(7)�ҹ��� -> �빮�� , �빮�� -> �ҹ���
		//���� ī������ �� ����
		String s3 = "APple";
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		//(8)�����͸� �޾��� �� ó���� (��Ʈ��ũ)
		byte[] data = new byte[] {65,'B','C'};
		//�迭��, ��ȯ��Ű����� �ε��� ��ȣ, �迭�� ũ��(�տ� ���ڰ� 0�̶�� �����Ͽ�
		String s4 = new String(data,0,data.length);
		System.out.println(s4);
		
		//(9)�����͸� ������ �� ó���� (��Ʈ��ũ)
		String s5 = "Banana";
		byte[] data1 = s5.getBytes();
		for(byte value : data1) {
			System.out.println((char)value);
		}
			
	}

}
