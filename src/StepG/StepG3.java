package StepG;

import java.util.Scanner;

public class StepG3 {
	
	private int jumsu[][]=new int[5][3];
	private String class_name[] = {"국어", "영어", "수학"};
	private int sum = 0;
	private double average;
	
	public StepG3() {
		input();
	}
	public void printScore() {
		getScore();
	}
	void input() {
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
		    System.out.printf("%d번 학생의 국어, 영어, 수학 점수는?", i+1);
			for(int j = 0; j < 3; j++)
			    jumsu[i][j] = s.nextInt();
		}
	}
	
	void getScore() {
		
		System.out.println("1) 각 과목별 총점과 평균 점수");
	
		for(int j = 0; j< 3; j++) {
			sum = 0;
		    for(int i = 0; i < 5; i++)
				sum += jumsu[i][j];
		        System.out.printf("%s 과목 총점은 %d 평균은 %.1f입니다.\n", class_name[j], sum, (double)sum/5);
		}
		System.out.println();
	    System.out.println("1) 각 학생별 총점과 평균 점수");
		
		for(int i = 0; i < 5; i++) {
		    sum = 0;
			for(int j = 0; j < 3; j++)
			
				sum += jumsu[i][j];
		
			average =(double)sum / 3;
			System.out.printf("%d번 학생 점수 : 총점 %d, 평균 %.1f, 등급 ", i+1, sum, average);
			
			if(average >= 90)
				System.out.printf("A\n");
	
			else if(average >= 80)
				System.out.printf("B\n");
			
			else if(average >= 70)
				System.out.printf("C\n");
		
			else if(average >= 60)
				System.out.printf("D\n");
			
			else
				System.out.printf("F\n");
		}
	}

}
