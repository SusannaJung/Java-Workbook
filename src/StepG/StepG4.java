package StepG;

import java.util.Scanner;

public class StepG4 {
	
	private int kind;
	private int money;
	private int charge;
	private int total_charge;
	
	public StepG4() {
		input();
	}
	
	public void printTotal() {
		System.out.printf("지금까지의 수수료 총액은 %d원 입니다.\n", total_charge);
	}
	void input() {
		Scanner s = new Scanner(System.in);

		while(true) {
			System.out.printf("부동산 거래종류(1:매매, 2:임대, 0:계산종료)를 입력하세요 : ");
			kind = s.nextInt();

			if (kind == 0) break;
			System.out.printf("부동산 거래금액(원)을 입력하세요 : ");
			money = s.nextInt();
			if(kind == 1)
				charge = deal(money);
			else if(kind == 2)
				//charge = 임대함수
				charge = rental(money);
			System.out.printf("이에 대한 중개 수수료는 %d입니다.\n", charge);
			total_charge += charge;
		}
			
	}
	

	int deal(int money) {
		if(money < 50000000) {
			charge = money*6/1000;
			if(charge > 250000)
				charge = 250000;
		}
		else if(money < 200000000) {
			charge = money/200;
			if(charge > 800000)
				charge = 800000;
		}
		else
			charge = money/250;
		
		return this.charge;
	}
	
	int rental(int money) {
		if(money < 20000000) {
			charge = money / 200;
			if(charge > 70000)
				charge = 70000;
		}
		else if(money < 50000000) {
			charge = money / 200;
			if(charge > 200000)
				charge = 200000;
		}
		else if(money < 100000000) {
			charge = money / 250;
			if(charge > 300000)
				charge = 300000;
		}
		else
			charge = money / 1000 * 3;
		
		return this.charge;
	}

}
