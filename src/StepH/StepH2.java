package StepH;

import java.util.Scanner;
import java.util.Random;

public class StepH2 {
	
	private int lotto[] = new int[6];
	private String onemore;
	private boolean same;
	
	public StepH2() {
		input();
	}
	
	public void printLotto() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.printf("생성된 로또 번호는 ");
			for(int j = 0; j < lotto.length; j++)
				System.out.printf("%d  ", lotto[j]);
			System.out.println("입니다.");
			System.out.printf("더 만드시겠습니까? (Y/N)");
			onemore = s.next();
	
			if(onemore.equalsIgnoreCase("N")) break;
			else if(onemore.equalsIgnoreCase("Y")) 
				input();
		}
	}
	void input() {
		int count = 0;
		Random r = new Random();
	
		while(count < lotto.length) {
			lotto[count] = r.nextInt(45) + 1;
			same = true;
			for(int i = 0; i < count-1; i++) {
				if(lotto[count] == lotto[i]) {
					same = false;
					break;
				}
			}
			if(same == true)
				count++;
		}
	}

}
