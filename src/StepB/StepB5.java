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
		System.out.printf("�� ���� �ش�Ǵ� �ð��� ��� %d ���Դϴ�.\n", getSec());
		if(this.seconds>1000000) {
			getCount();
		}
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
	
	void getCount() {
		
		this.m_count= this.seconds/1000000;
		System.out.println("100���ʰ� ���" + m_count +"���̳� ���Ե˴ϴ�.\n");
	}

}
