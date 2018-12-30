package StepI;

import java.util.Scanner;

public class StepI7 {
	
	private int count = 0;
	private int kind;
	private int sale[] = {700, 300, 1000, 500, 600};
	private int total = 0;
	private String more;
	
	public StepI7() {
		input();
	}
	
	public void printDrink() {
		System.out.printf("%d개의 음료를 선택 하여 총 %d원입니다.\n", count, total);
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			total += SelectCan();
			System.out.printf("더 필요하십니까? (Y/N)");
			more = s.next();
			if(more.equalsIgnoreCase("N")) break;
		}	
	}
	
	int SelectCan() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("1.콜라(700원) 2.원두커피(300원) 3.레몬주스(1000원) 4.홍차(500원) 5.코코아(600원)");
		System.out.printf("메뉴를 선택해주세요 : ");
		kind = s.nextInt();
		return this.sale[kind-1];
	}

}
