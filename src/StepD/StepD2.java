package StepD;

import java.util.Scanner;

public class StepD2 {
	
	private int number;
	private int max_num=0, min_num=100;
	
	public StepD2() {
		input();
	}
	
	public void printMaxMin() {
		System.out.printf("�Էµ� ���ڵ� �� ���� ū ���� %d �̰�, ���� ���� ���� %d �Դϴ�.\n", max_num, min_num);
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		
		while(true) {
			System.out.print("0���� 100 ������ ���ڸ� �Է��ϼ��� ");
			this.number= s.nextInt();
			
			if(this.number<0 || this.number>100)
				break;
			
			getMaxMin();
		}
	}
	
	void getMaxMin() {
		if(this.number>this.max_num) {
			this.max_num= this.number;
		}
		if(this.number<this.min_num) {
			this.min_num= this.number;
		}
		
		
	}

}
