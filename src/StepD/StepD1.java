package StepD;

import java.util.Scanner;

public class StepD1 {
	
	private int number;
	private int totalsum = 0;
	
	public StepD1() {
		input();
	}
	
	public void printSum() {
		if(this.number>1) {
			System.out.printf("1���� �Է��� ���ڱ����� ��� ������ ���� ���� %d �Դϴ�.\n", getSum());
		}
		else {
			System.out.print("�߸� �Է��Ͽ����ϴ�.\n");
		}
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���");
		this.number= s.nextInt();
	}
	
	int getSum() {
		for(int i=0; i<this.number; i++) {
			this.totalsum += i;
		}
		
		return this.totalsum;
	}

}
