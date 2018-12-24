package StepF;

import java.util.Scanner;

public class StepF5 {
	
	private int height, weight; // 입력받은 신장(cm), 체중(kg)
	private double bmi; // 계산된 비만도 수치
	private int bmilist[][] = new int[10][3]; // 10명에 대한 신장, 체중, 비만도수치를 담고 있는 리스트
	private int count=0;
	
	public StepF5() {
		input();
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		for(int i=0; i<10; i++) {
			System.out.print("%d번째 사람의 신장(cm)과 체중(kg)을 입력하시오. ");
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
				System.out.printf("%d 번째 사람은 비만입니다.\n ", i+1);
				
			}
		}
		System.out.printf("\n총 %d 명의 사람이 비만입니다. \n",count);
		
	}

}
