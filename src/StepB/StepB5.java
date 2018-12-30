package StepB;

import java.util.Scanner;

public class StepB5 {
	
	private int days;
	private int seconds;
	private int m_count;
	
	public StepB5() {
		input();
	}
	
	public void printSec() {
		System.out.printf("날수에 해당되는 기간은 모두 %d 초입니다.\n", getSec());
		if(this.seconds>1000000) {
			getCount();
		}
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
	
	void getCount() {
		
		this.m_count= this.seconds/1000000;
		System.out.println("100만 초가 모두" + m_count +"번이나 포함됩니다.\n");
	}

}
