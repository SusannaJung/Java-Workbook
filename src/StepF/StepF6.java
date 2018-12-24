package StepF;

import java.util.Scanner;

public class StepF6 {
	
	private int number[][] = new int[5][3]; // 각 집의 거주자 수, 층별, 호수별 중복 리스트

	private int total=0; // 아파트의 총 거주자 수
	
	public StepF6() {
		input();
	}
	
	public void printApt() {
		System.out.printf("이 아파트에 사는 거주자는 모두 %d명 입니다.\n", total);
	}
	
	
	void input() {
		Scanner s= new Scanner(System.in);
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("%d0%d호에 살고 있는 사람의 숫자를 입력하시오. ",i+1,j+1);
				this.number[i][j]= s.nextInt();
				this.total += this.number[i][j];
			}
		}
		
	}

}
