package StepG;

import java.util.Scanner;

public class StepG1 {
	
	private int birth_year; // 입력받은 태어난 년도
	private int age[] = new int[100];
	// 각 사람들의 나이 (최대 100명)
	private int count[] = new int[6];
	private String name[] = {"유아", "어린이", "청소년", "청년", "중년", "노년"};
	
	public StepG1() {
		input();
	}
	public void printAge() {
		int i;
		
		for(i = 0; i < 10; i++)
		
			System.out.printf("%d번째 사람의 나이는 %d 입니다.\n",i+1, age[i]);
		
		for(i = 0; i < 6; i++)
	
			System.out.printf("%s는 %d명 입니다.\n",name[i], count[i]);
	}
	void input() {
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			
			System.out.printf("%d번째 사람의 태어난 년도를 입력하시오.",i+1);
			birth_year = s.nextInt();
			age[i] = 2018 - birth_year + 1;
			
			if(age[i] < 7)
				count[0]++;
			
			else if(age[i] < 13)
				count[1]++;

			else if(age[i] < 20)
				count[2]++;
		
			else if(age[i] < 30)
				count[3]++;
			
			else if(age[i] < 60)
				count[4]++;
			
			else
				count[5]++;
		}
	}

}
