package prob02;

public class DataType {
	//������ Ÿ��
	public static void main(String[] args) {
		//����
		System.out.println(10); 
 		//����
		System.out.println('��'); // ����
 		//���ڿ�
		System.out.println("ȣ����"); 
 		System.out.println("1000"); 
 		
 		//���� + ���� = ����
 		System.out.println(10 + 20);
 		//���� + ���ڿ� = ���ڿ�
 		System.out.println(10 + "ȣ����");
 		//���ڿ� + ���� = ���ڿ�
 		System.out.println("ȣ����" + 10); 
 		//���ڿ� + ���ڿ� = ���ڿ�
 		System.out.println("ȣ����" + "�ڳ���");
 		//�������� ���
 		System.out.println(10 + "ȣ����" + 20); // 10ȣ����20
 		System.out.println(10 + 20 + "ȣ����"); // 30ȣ����
 		System.out.println("ȣ����" + 10 + 20); // ȣ����1020
 		//���� �ΰ��� �Ѷ��ο� ����ϰ� ���� �� ��� 
 		System.out.println(10 + "" + 20 );    //1020
	}

}
