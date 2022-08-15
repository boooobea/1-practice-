package first;

import java.util.Scanner;

public class Can {

	public static void main(String[] agrs) {

		// 음료 화면보여줌
		// 돈 넣음
		// 음료 선택
		// 음료 제공

		// 1. 음료 종류
		final String[] canName = { "스프라이트", "콜라", "밀키스" };
		final int[] canCost = { 1100, 1000, 1200 };
		final int[] canInven = { 10, 5, 3 };

		int index = 0;
		int money = 0;
		int selectedCan = -1;
		int isExit = 0;

		// 2. 음료 화면보여주기
		do {

			for (index = 0; index < 3; index++) {

				System.out.printf("%d. %s (%d원)\n", index, canName[index], canCost[index]);
			} // for
				System.out.println("[현재 금액: " + money + " ]");
			// 2. 돈 넣음

			do {

				Scanner sc = new Scanner(System.in);
				System.out.println("[돈을 넣어 주세요.]");
				money = money + sc.nextInt();
				System.out.println("[현재 금액: " + money + " ]");

				do {

					System.out.println("[주문할 음료를 선택하세요]");
					selectedCan = sc.nextInt();

					if (canInven[selectedCan] <= 0) {
						System.out.printf("[%s 음료의 재고가 없습니다. 다른 음료를 선택하세요]", canName[selectedCan]);
					} // if:재고부족

				} while (canInven[selectedCan] <= 0);

				if (canCost[selectedCan] > money) {
					System.out.println("[금액이 부족합니다.]");
				} // if:금액부족

			} while (canCost[selectedCan] > money);

			// 4. 음료 제공
			money = money - canCost[selectedCan];

			canInven[selectedCan] = canInven[selectedCan] - 1;
			System.out.printf("[%s 음료를 구매하였습니다.]\n", canName[selectedCan]);

			System.out.printf("[남은 잔액 : %d ]\n", money);

			for (index = 0; index < 3; index++) {

				System.out.printf("%d. %s (%d원)\n", index, canName[index], canCost[index]);
			} // for

			System.out.println("[거스름 돈을 반환하시겠습니까? ( yes : 1 // no : 0 )");

			Scanner sc = new Scanner(System.in);
			isExit = sc.nextInt();

		} while (isExit == 0);

	}// main
}// end class
