package StepA;

import java.util.Scanner;

public class StepA5 {
	
	private int days;
	private int seconds;
	
	public StepA5() {
		input();
	}
	
	public void printSec() {
		System.out.printf("�� ���� �ش�Ǵ� �ð��� ��� %d ���Դϴ�.\n", getSec());
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("�� ���� �Է��ϼ���.");
		this.days = s.nextInt();
		s.close();
	}
	
	int getSec() {
		this.seconds = this.days * 24 * 60 * 60;
		return this.seconds;
	}

}
