package StepF;

import java.util.Scanner;

public class StepF3 {
	
	private int jumsu[][] = new int[5][3]; // 5명의 3과목 점수를 저장하고 있는 중복 리스트
	private int sum[] = new int[3]; // 3과목 총점 리스트
	private double average[] = new double[3]; // 3과목 평균 리스트
	
	public StepF3() {
		input();
	}
	
	
	
	void input() {
		Scanner s= new Scanner(System.in);
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("%d번 학생 국어, 영어 수학 점수를 입력하시오. ");
				this.jumsu[i][j]= s.nextInt();
				
				
			}
			
		}
		
	}
	
    public void printJumsu() {
    	
    	for(int i=0; i<5; i++) {
    		for(int j=0; j<3; j++) {
    			sum[j] += jumsu[i][j];
    		}
    	}
    	
    	
    	for(int j=0; j<3; j++) {
    		average[j] = sum[j]/3.0;
    	}
    	
    	
    	
		System.out.printf("국어의 총점은 %d 이고, 평균은 %.1f 입니다.\n",sum[0], average[0]);
		System.out.printf("영어의 총점은 %d 이고, 평균은 %.1f 입니다.\n",sum[1],average[1]);
		System.out.printf("수학의 총점은 %d 이고, 평균은 %.1f 입니다.\n",sum[2], average[2]);
	}
		
}
