package StepD;

import java.util.Scanner;

public class StepD6 {
	
	private double m2_area;
	private double pyung_area;
	private int count1=0, count2=0, count3=0, count4=0;
	
	public StepD6() {
		input();
	}
	
	public void printArea() {
		
		System.out.printf("\"���� ����Ʈ\"�� ������ %d �Դϴ�.\n", count1);
		System.out.printf("\"�߼��� ����Ʈ\"�� ������ %d �Դϴ�.\n", count2);
		System.out.printf("\"���� ����Ʈ\"�� ������ %d �Դϴ�.\n", count3);
		System.out.printf("\"���� ����Ʈ\"�� ������ %d �Դϴ�.\n", count4);
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			System.out.print("����Ʈ�� �о� ����(��������)�� �Է��Ͻÿ�. ");
			this.m2_area= s.nextDouble();
			this.pyung_area= this.m2_area/3.305;
			
			countApt();
		}
	}
	
	void countApt() {
			
		if(this.pyung_area<15)
			this.count1++;
		else if(this.pyung_area>= 15 && this.pyung_area <30)
			this.count2++;
		else if(this.pyung_area>= 30 && this.pyung_area <50)
			this.count3++;
		else 
			this.count4++;
	}
}
