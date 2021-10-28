package date0913;

import java.util.Scanner;

public class Code07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * // 1번문제 int[][] arr = { { 5, 5, 5, 5 }, { 10, 10, 10 }, { 20, 20, 20, 20 }, {
		 * 30, 30 } };
		 * 
		 * for (int i = 0; i < arr[3].length; i++) { System.out.println(arr[3][i]); }
		 * System.out.println("1번문제:" + arr[3].length);
		 * 
		 * // 2번문제 int[] arr1 = new int[] { 10, 15, 47, 23, 51 }; int sum = 0; for (int
		 * j = 0; j < arr1.length; j++) { sum += arr1[j]; }
		 * System.out.println("\n2번문제: " + sum);
		 * 
		 * // 3번문제 int sum3 = 0; int[][] arr3 = { { 5, 5, 5, 5, 5, }, { 10, 10, 10, 10,
		 * 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } }; for (int x = 0; x <
		 * arr3.length; x++) { for (int y = 0; y < arr3[x].length; y++) { sum3 +=
		 * arr3[x][y]; } } System.out.println("\n3번문제: " + sum3);
		 * 
		 * // 4번문제 // 1-9사이의 숫자중 세개를 출력 System.out.println("\n4번문제"); int[] arr4 = { 1,
		 * 2, 3, 4, 5, 6, 7, 8, 9 };// arr4[0]~arr4[8] int ar1 = (int) (Math.random() *
		 * 10);// math.random()*10 0.0<=x<9.9 int ar2 = (int) (Math.random() * 10);//
		 * (int)math.random()*10 0<=x<9 int ar3 = (int) (Math.random() * 10);
		 * 
		 * System.out.print("1~9사이의 숫자중 랜덤 3자리 숫자 출력: "); System.out.print(arr4[ar1 -
		 * 2]);// (int)math.random()*10은 0 1 2 3 4 5 6 7 8 System.out.print(arr4[ar2 -
		 * 2]); System.out.println(arr4[ar3 - 2]);
		 * 
		 * // 5번문제 int max = 0; int ind = 0; int[] arr5 = { 78, 54, 89, 57, 84, 65, 74,
		 * 91, 84, 67, 52, 94, 82 }; for (int i5 = 0; i5 < arr5.length; i5++) { if (max
		 * < arr5[i5]) { max = arr5[i5]; ind = i5; } } System.out.println("\n5번문제답");
		 * System.out.println("최대값: " + max); System.out.println("인덱스값: " + ind);
		 * 
		 * // 6번문제 System.out.println("\n6번문제"); System.out.println("돈의 액수를 입력하세요.");
		 * 
		 * Scanner a6 = new Scanner(System.in); int b6 = a6.nextInt(); int[] am = new
		 * int[5]; // 총 돈 합계 //배열 선언과 생성 동시에\
		 * 
		 * while (true) { if (b6 >= 50000) { am[0] = b6 / 50000;// 오만원 개수 b6 = b6 %
		 * 50000;
		 * 
		 * continue; } else if (b6 >= 10000) { am[1] = b6 / 10000;// 만원 개수 b6 = b6 %
		 * 10000;
		 * 
		 * continue; } else if (b6 >= 1000) { am[2] = b6 / 1000;// 천원 개수 b6 = b6 % 1000;
		 * 
		 * continue; } else if (b6 >= 100) { am[3] = b6 / 100;// 백원 개수 b6 = b6 % 100;
		 * 
		 * continue; } else { // 10원 am[4] = b6 / 10;// 오만원 개수 b6 = b6 % 10; break; } }
		 * // for(int i6=0; i6<am.length; i6++) { System.out.println("오만원 " + am[0] +
		 * "개 ," + "만원 " + am[1] + "개 ," + "천원 " + am[2] + "개 ," + "백원 " + am[3] + "개 ,"
		 * + "십원 " + am[4] + "개");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * // 7번문제 System.out.println("\n7번문제"); int[] arr7 = new int[] { 3, 2, 5 };
		 * 
		 * for (int j7 = 0; j7 < arr7.length; j7++) { System.out.print(arr7[j7] +
		 * " : "); for (int i7 = 0; i7 < arr7[j7]; i7++) { System.out.print("*"); }
		 * System.out.println(""); }
		 * 
		 * // 8번문제 System.out.println("\n8번문제"); int a8[] = { 10, 20, 30 }; int b8[] = {
		 * 40, 50, 60 }; int c[] = new int[6];
		 * 
		 * int x = 0; for (int i8 = 0; i8 < 3; i8++) { for (int j8 = 0; j8 < 2; j8++) {
		 * 
		 * if (j8 == 0) {// 짝수 c[x] = a8[i8]; x += 1; } else {// 홀수 c[x] = b8[i8]; x +=
		 * 1; } // else문
		 * 
		 * } // for문 } System.out.print("c ="); for (int c8 = 0; c8 < c.length; c8++) {
		 * System.out.print(" " + c[c8]); }
		 * 
		 */
		// 10번문제

		while (true) {
			System.out.println("메뉴 \n1.성적입력  2.성적조회  3.석차조회  4.종료");
			Scanner menu_0 = new Scanner(System.in);
			int menu = menu_0.nextInt();
			int[][] table = new int[5][3];

			switch (menu) {
			case 1:
				while (true) {
					Scanner score_0 = new Scanner(System.in);

					for (int i10 = 0; i10 < 5; i10++) {// i10 행

						if (i10 == 0) {// 행
							System.out.println("고길동의 성적을 순서대로 입력하시오: ");
							for (int j10 = 0; j10 < 3; j10++) {// j10 열
								table[i10][j10] = score_0.nextInt();
								if (j10 == 2)
									break;
							}
						} else if (i10 == 1) {
							System.out.println("김길동의 성적을 순서대로 입력하시오: ");
							for (int j10 = 0; j10 < 3; j10++) {// j10 열
								table[i10][j10] = score_0.nextInt();
								if (j10 == 2)
									break;
							}
						} else if (i10 == 2) {
							System.out.println("이길동의 성적을 순서대로 입력하시오: ");
							for (int j10 = 0; j10 < 3; j10++) {// j10 열
								table[i10][j10] = score_0.nextInt();
								if (j10 == 2)
									break;
							}
						} else if (i10 == 3) {
							System.out.println("박길동의 성적을 순서대로 입력하시오: ");
							for (int j10 = 0; j10 < 3; j10++) {// j10 열
								table[i10][j10] = score_0.nextInt();
								if (j10 == 2)
									break;
							}
						} else {// i10==4
							System.out.println("홍길동의 성적을 순서대로 입력하시오: ");
							for (int j10 = 0; j10 < 3; j10++) {// j10 열
								table[i10][j10] = score_0.nextInt();
								if (j10 == 2)
									break;
							}
							break;
						}
					}
					break;
				} // 메뉴로 돌아감

			case 2:// 성적조회
				while (true) {
					System.out.println("성적을 조회할 학생의 이름을 입력하시오");
					Scanner student_0 = new Scanner(System.in);
					String student = student_0.next();

					// 고길동0 김길동1 이길동2 박길동3 홍길동4
					switch (student) {
					case "고길동":
						for (int j10 = 0; j10 < 3; j10++)
							System.out.println(table[0][j10] + " ");
						break;
					case "김길동":
						for (int j10 = 0; j10 < 3; j10++)
							System.out.println(table[0][j10] + " ");
						break;
					case "이길동":
						for (int j10 = 0; j10 < 3; j10++)
							System.out.println(table[0][j10] + " ");
						break;
					case "박길동":
						for (int j10 = 0; j10 < 3; j10++)
							System.out.println(table[0][j10] + " ");
						break;
					case "홍길동":
						for (int j10 = 0; j10 < 3; j10++)
							System.out.println(table[0][j10] + " ");
						break;
					default:
						System.out.println("잘못입력하였습니다.");
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
		 * // 9번문제 System.out.println("\n\n9번문제"); int[] seats = { 0, 0, 0, 0, 0, 0, 0
		 * }; // 좌석 초기화 int z9 = 0; // 총 예매된 좌석 갯수 int sale = 0; // 매출액
		 * 
		 * sale = 12000 * z9; while (true) {
		 * System.out.println("예매할 좌석번호를 입력하시오(1~7): ");
		 * 
		 * Scanner a9 = new Scanner(System.in); int b9 = a9.nextInt(); // b9는 예매할 좌석
		 * 번호-1
		 * 
		 * while (seats[b9 - 1] == 1) { System.out.println("이미 예매가 완료된 좌석입니다.");
		 * System.out.println("영화관의 총 매출액은 " + sale + " 입니다.\n"); break;
		 * 
		 * } // while while (seats[b9 - 1] == 0) { System.out.println("예매되었습니다");
		 * seats[b9 - 1] = 1; // 1번좌석이 배열에서는 0번좌석 z9 = 0; for (int i9 = 0; i9 <
		 * seats.length; i9++) { if (seats[i9] == 1) { z9++; sale = z9 * 12000; } else
		 * break; } System.out.println("영화관의 총 매출액은 " + sale + " 입니다.\n");
		 * 
		 * break; } // while
		 * 
		 * } // while
		 * 
		 * //
		 */
	}// main함수

}
