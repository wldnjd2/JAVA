package date0910;

import java.util.Scanner;

public class Code16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("6������--------------------------");
		int c1 = 0;// ���� �ܰ� �ʱ�ȭ
		while (true) {
			System.out.println("***********00���࿡ ���Ű� ȯ���մϴ� ^-^**********");
			System.out.println("           ���Ͻô� �޴��� �������ּ���\n"
					+ "");
			System.out.println("                  ����\n                  ���\n                 �ܾ���ȸ\n         "
					+ "         ����\n");
			Scanner s = new Scanner(System.in);
			String s1 = s.next(); // s1 �޴� ���� ����

			switch (s1) {
			case "����":
				System.out.println("�Ա� �ݾ��� �Է��Ͻÿ�");
				// s.close();
				Scanner s2 = new Scanner(System.in);
				int s3 = s2.nextInt(); // �Ա� �ݾ��� ���� s3�� ����
				if (s3 > 0) {
					System.out.println("���ݿϷ�");
					c1 += s3; // �ܾ��� �ʱ�ȭ
					System.out.println("���� �ݾ��� "+c1+"�� �Դϴ�.\n\n");
				} else {
					System.out.println("�߸��Է��߽��ϴ�\n\n");
				}
				break;

			case "���":
				System.out.println("����� �ݾ��� �Է��Ͻÿ�");
				Scanner s4 = new Scanner(System.in);
				int s5 = s4.nextInt(); // ��� �ݾ� ���� s5�� ����
				if (s5 > c1)
					System.out.println("�ܾ� ����\n\n");
				else {
					System.out.println("��ݿϷ�");
					c1 -= s5;
					System.out.println("���� �ݾ��� "+c1+"�� �Դϴ�.\n\n");
				}
				break;
			// continue;
			case "�ܾ���ȸ":
				System.out.println("�ܰ� :" + c1 + "��\n\n");
				break;
			case "����":
				System.out.println("���α׷��� �����մϴ�.");
				while(true);
			default: {
				System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �������ּ���.\n\n");
				break;

			} // ����ġ��

			// System.out.println();
			}

		}

	}// main�Լ�

}// class
