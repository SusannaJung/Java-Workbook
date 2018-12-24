package StepF;

import java.util.Scanner;

public class StepF5 {
	
	private int height, weight; // �Է¹��� ����(cm), ü��(kg)
	private double bmi; // ���� �񸸵� ��ġ
	private int bmilist[][] = new int[10][3]; // 10�� ���� ����, ü��, �񸸵���ġ�� ��� �ִ� ����Ʈ
	private int count=0;
	
	public StepF5() {
		input();
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		for(int i=0; i<10; i++) {
			System.out.print("%d��° ����� ����(cm)�� ü��(kg)�� �Է��Ͻÿ�. ");
			this.height=s.nextInt();
			this.weight = s.nextInt();
			this.bmilist[i][0]= this.height;
			this.bmilist[i][1]= this.weight;	
		}
		
	}
	
	public void printBmi() {
		
		for(int i=0;i<10;i++) {
			this.bmi=(double)this.bmilist[i][1]/(((double)this.bmilist[i][0]/100)*((double)this.bmilist[i][0]/100));
			this.bmilist[i][2]=(int)this.bmi;
			
			if(this.bmi>=25) {
				count++;
				System.out.printf("%d ��° ����� ���Դϴ�.\n ", i+1);
				
			}
		}
		System.out.printf("\n�� %d ���� ����� ���Դϴ�. \n",count);
		
	}

}
