package StepD;

import java.util.Scanner;

public class StepD3 {
	
	private int number;
	private int count =0;
	private int totalsum;
	private double average;
	
	public StepD3() {
		input();
	}
	
	public void printSumNAvg() {
		System.out.printf("�Է��� %d ���� ���ڵ��� ���հ�� %d �̰�, ��� ���� %.1f �Դϴ�.\n", count, totalsum, getAverage());
	}
	
	void input() {
		
		Scanner s= new Scanner(System.in);
		
		while(true) {
			System.out.print("0���� 100 ������ ���ڸ� �Է��ϼ��� ");
			this.number= s.nextInt();
			
			if(this.number<0 || this.number>100)
				break;
			
			this.count++;
			this.totalsum+= this.number;
				
		}
	}
	
	
	double getAverage() {
		this.average = (double)this.totalsum/this.count;
		
		return this.average;
	}

}
