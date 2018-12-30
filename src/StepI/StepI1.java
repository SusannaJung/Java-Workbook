package StepI;

import java.util.Scanner;

public class StepI1 {
	
	private int menu;
	private int total = 0;
	private int price[] = { 15000, 10000, 7000, 2000 };

	
	public StepI1() {
		input();
	}


	void input() {
		
		Scanner s = new Scanner(System.in);
		while (true) {
			ShowMenu();
			System.out.print("메뉴를 선택해주세요.(종료:5) ");
			menu = s.nextInt();
			while (menu < 1 || 5 < menu) {
				System.out.println("잘못 입력하셨습니다.");
				System.out.print("메뉴를 선택해주세요.(종료:5) ");
				menu = s.nextInt();
			}

			if (menu == 5) {
				System.out.println("현재까지의 주문 금액은 " + total + "원입니다.\n");
				break;
			}
			
			total += price[menu - 1];
			System.out.println("현재까지의 주문 금액은 " + total + "원입니다.\n");
			
		}
		System.out.println("\n총 주문 금액은 " + total + "원입니다.");

	}
	
	void ShowMenu() {
		System.out.println("1.피자(15,000원) 2.스파게티(10,000원) 3.샐러드(7,000원) 4.음료수(2,000원)");
	}

}
