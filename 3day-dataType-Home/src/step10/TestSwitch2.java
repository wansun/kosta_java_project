package step10;

public class TestSwitch2 {
	public static void main(String[] args) {
		int grade = 10;
		switch (grade) {
		case 1:
			System.out.println("�Ϲ���");
			break; // �ش�  switch ���� ����� 
		case 2:
			System.out.println("�ϰ��");
			break;
		case 3: case 4: case 5: 
			System.out.println("�����");
			break;
		default: // �� �� ����� 
			System.out.println("��������");
		}// switch
	}// main method
}// class





