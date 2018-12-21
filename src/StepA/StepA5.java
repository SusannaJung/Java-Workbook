package StepA;

import java.util.Scanner;

public class StepA5 {
	
	private int days;
	private int seconds;
	
	public StepA5() {
		input();
	}
	
	public void printSec() {
		System.out.printf("날 수에 해당되는 시간은 모두 %d 초입니다.\n", getSec());
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("날 수를 입력하세요.");
		this.days = s.nextInt();
		s.close();
	}
	
	int getSec() {
		this.seconds = this.days * 24 * 60 * 60;
		return this.seconds;
	}

}
