package date0913;

import java.util.Scanner;

public class Code07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * // 1������ int[][] arr = { { 5, 5, 5, 5 }, { 10, 10, 10 }, { 20, 20, 20, 20 }, {
		 * 30, 30 } };
		 * 
		 * for (int i = 0; i < arr[3].length; i++) { System.out.println(arr[3][i]); }
		 * System.out.println("1������:" + arr[3].length);
		 * 
		 * // 2������ int[] arr1 = new int[] { 10, 15, 47, 23, 51 }; int sum = 0; for (int
		 * j = 0; j < arr1.length; j++) { sum += arr1[j]; }
		 * System.out.println("\n2������: " + sum);
		 * 
		 * // 3������ int sum3 = 0; int[][] arr3 = { { 5, 5, 5, 5, 5, }, { 10, 10, 10, 10,
		 * 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } }; for (int x = 0; x <
		 * arr3.length; x++) { for (int y = 0; y < arr3[x].length; y++) { sum3 +=
		 * arr3[x][y]; } } System.out.println("\n3������: " + sum3);
		 * 
		 * // 4������ // 1-9������ ������ ������ ��� System.out.println("\n4������"); int[] arr4 = { 1,
		 * 2, 3, 4, 5, 6, 7, 8, 9 };// arr4[0]~arr4[8] int ar1 = (int) (Math.random() *
		 * 10);// math.random()*10 0.0<=x<9.9 int ar2 = (int) (Math.random() * 10);//
		 * (int)math.random()*10 0<=x<9 int ar3 = (int) (Math.random() * 10);
		 * 
		 * System.out.print("1~9������ ������ ���� 3�ڸ� ���� ���: "); System.out.print(arr4[ar1 -
		 * 2]);// (int)math.random()*10�� 0 1 2 3 4 5 6 7 8 System.out.print(arr4[ar2 -
		 * 2]); System.out.println(arr4[ar3 - 2]);
		 * 
		 * // 5������ int max = 0; int ind = 0; int[] arr5 = { 78, 54, 89, 57, 84, 65, 74,
		 * 91, 84, 67, 52, 94, 82 }; for (int i5 = 0; i5 < arr5.length; i5++) { if (max
		 * < arr5[i5]) { max = arr5[i5]; ind = i5; } } System.out.println("\n5��������");
		 * System.out.println("�ִ밪: " + max); System.out.println("�ε�����: " + ind);
		 * 
		 * // 6������ System.out.println("\n6������"); System.out.println("���� �׼��� �Է��ϼ���.");
		 * 
		 * Scanner a6 = new Scanner(System.in); int b6 = a6.nextInt(); int[] am = new
		 * int[5]; // �� �� �հ� //�迭 ����� ���� ���ÿ�\
		 * 
		 * while (true) { if (b6 >= 50000) { am[0] = b6 / 50000;// ������ ���� b6 = b6 %
		 * 50000;
		 * 
		 * continue; } else if (b6 >= 10000) { am[1] = b6 / 10000;// ���� ���� b6 = b6 %
		 * 10000;
		 * 
		 * continue; } else if (b6 >= 1000) { am[2] = b6 / 1000;// õ�� ���� b6 = b6 % 1000;
		 * 
		 * continue; } else if (b6 >= 100) { am[3] = b6 / 100;// ��� ���� b6 = b6 % 100;
		 * 
		 * continue; } else { // 10�� am[4] = b6 / 10;// ������ ���� b6 = b6 % 10; break; } }
		 * // for(int i6=0; i6<am.length; i6++) { System.out.println("������ " + am[0] +
		 * "�� ," + "���� " + am[1] + "�� ," + "õ�� " + am[2] + "�� ," + "��� " + am[3] + "�� ,"
		 * + "�ʿ� " + am[4] + "��");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * // 7������ System.out.println("\n7������"); int[] arr7 = new int[] { 3, 2, 5 };
		 * 
		 * for (int j7 = 0; j7 < arr7.length; j7++) { System.out.print(arr7[j7] +
		 * " : "); for (int i7 = 0; i7 < arr7[j7]; i7++) { System.out.print("*"); }
		 * System.out.println(""); }
		 * 
		 * // 8������ System.out.println("\n8������"); int a8[] = { 10, 20, 30 }; int b8[] = {
		 * 40, 50, 60 }; int c[] = new int[6];
		 * 
		 * int x = 0; for (int i8 = 0; i8 < 3; i8++) { for (int j8 = 0; j8 < 2; j8++) {
		 * 
		 * if (j8 == 0) {// ¦�� c[x] = a8[i8]; x += 1; } else {// Ȧ�� c[x] = b8[i8]; x +=
		 * 1; } // else��
		 * 
		 * } // for�� } System.out.print("c ="); for (int c8 = 0; c8 < c.length; c8++) {
		 * System.out.print(" " + c[c8]); }
		 * 
		 */
		// 10������

		while (true) {
			System.out.println("�޴� \n1.�����Է�  2.������ȸ  3.������ȸ  4.����");
			Scanner menu_0 = new Scanner(System.in);
			int menu = menu_0.nextInt();
			int[][] table = new int[5][3];

			switch (menu) {
			case 1:
				while (true) {
					Scanner score_0 = new Scanner(System.in);

					for (int i10 = 0; i10 < 5; i10++) {// i10 ��

						if (i10 == 0) {// ��
							System.out.println("��浿�� ������ ������� �Է��Ͻÿ�: ");
							for (int j10 = 0; j10 < 3; j10++) {// j10 ��
								table[i10][j10] = score_0.nextInt();
								if (j10 == 2)
									break;
							}
						} else if (i10 == 1) {
							System.out.println("��浿�� ������ ������� �Է��Ͻÿ�: ");
							for (int j10 = 0; j10 < 3; j10++) {// j10 ��
								table[i10][j10] = score_0.nextInt();
								if (j10 == 2)
									break;
							}
						} else if (i10 == 2) {
							System.out.println("�̱浿�� ������ ������� �Է��Ͻÿ�: ");
							for (int j10 = 0; j10 < 3; j10++) {// j10 ��
								table[i10][j10] = score_0.nextInt();
								if (j10 == 2)
									break;
							}
						} else if (i10 == 3) {
							System.out.println("�ڱ浿�� ������ ������� �Է��Ͻÿ�: ");
							for (int j10 = 0; j10 < 3; j10++) {// j10 ��
								table[i10][j10] = score_0.nextInt();
								if (j10 == 2)
									break;
							}
						} else {// i10==4
							System.out.println("ȫ�浿�� ������ ������� �Է��Ͻÿ�: ");
							for (int j10 = 0; j10 < 3; j10++) {// j10 ��
								table[i10][j10] = score_0.nextInt();
								if (j10 == 2)
									break;
							}
							break;
						}
					}
					break;
				} // �޴��� ���ư�

			case 2:// ������ȸ
				while (true) {
					System.out.println("������ ��ȸ�� �л��� �̸��� �Է��Ͻÿ�");
					Scanner student_0 = new Scanner(System.in);
					String student = student_0.next();

					// ��浿0 ��浿1 �̱浿2 �ڱ浿3 ȫ�浿4
					switch (student) {
					case "��浿":
						for (int j10 = 0; j10 < 3; j10++)
							System.out.println(table[0][j10] + " ");
						break;
					case "��浿":
						for (int j10 = 0; j10 < 3; j10++)
							System.out.println(table[0][j10] + " ");
						break;
					case "�̱浿":
						for (int j10 = 0; j10 < 3; j10++)
							System.out.println(table[0][j10] + " ");
						break;
					case "�ڱ浿":
						for (int j10 = 0; j10 < 3; j10++)
							System.out.println(table[0][j10] + " ");
						break;
					case "ȫ�浿":
						for (int j10 = 0; j10 < 3; j10++)
							System.out.println(table[0][j10] + " ");
						break;
					default:
						System.out.println("�߸��Է��Ͽ����ϴ�.");
					}// switch
					break;
				} // while

			case 3:
				break;
			case 4:
				break;

			}// switch

		} // while

		/*
		 * 
		 * // 9������ System.out.println("\n\n9������"); int[] seats = { 0, 0, 0, 0, 0, 0, 0
		 * }; // �¼� �ʱ�ȭ int z9 = 0; // �� ���ŵ� �¼� ���� int sale = 0; // �����
		 * 
		 * sale = 12000 * z9; while (true) {
		 * System.out.println("������ �¼���ȣ�� �Է��Ͻÿ�(1~7): ");
		 * 
		 * Scanner a9 = new Scanner(System.in); int b9 = a9.nextInt(); // b9�� ������ �¼�
		 * ��ȣ-1
		 * 
		 * while (seats[b9 - 1] == 1) { System.out.println("�̹� ���Ű� �Ϸ�� �¼��Դϴ�.");
		 * System.out.println("��ȭ���� �� ������� " + sale + " �Դϴ�.\n"); break;
		 * 
		 * } // while while (seats[b9 - 1] == 0) { System.out.println("���ŵǾ����ϴ�");
		 * seats[b9 - 1] = 1; // 1���¼��� �迭������ 0���¼� z9 = 0; for (int i9 = 0; i9 <
		 * seats.length; i9++) { if (seats[i9] == 1) { z9++; sale = z9 * 12000; } else
		 * break; } System.out.println("��ȭ���� �� ������� " + sale + " �Դϴ�.\n");
		 * 
		 * break; } // while
		 * 
		 * } // while
		 * 
		 * //
		 */
	}// main�Լ�

}
