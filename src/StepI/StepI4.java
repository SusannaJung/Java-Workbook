package StepI;

import java.util.Scanner;

public class StepI4 {
	
	private int order;
	private int total = 0;
	private int sale[] = {15000,10000,7000,2000};
	
	public StepI4() {
		input();
	}
	
	public void printTotal() {
		System.out.printf("\n총 주문 금액은 %d원입니다.\n", total);
	}
	
	void ShowMenu() {
		System.out.println("1. 피자(15,000원), 2. 스파게티(10,000원), 3. 샐러드(7,000원), 4. 음료수(2,000원)");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			ShowMenu();
			System.out.printf("메뉴를 선택해 주세요.(종료 : 5)");
			order = s.nextInt();
			if(order == 5) break;
			else
				total += sale[order-1];
			System.out.printf("현재까지의 주문 금액은 %d원입니다.\n\n", total);
		}
	}

}
