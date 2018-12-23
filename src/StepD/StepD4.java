package StepD;

import java.util.Scanner;

public class StepD4 {
	
	private int count_all;
	private int count_young = 0;
	private int birth_year;
	private int age;
	
	public StepD4() {
		input();
	}
	
	public void printCount() {
		System.out.printf("가족들 중에 미성년자는 모두 %d명입니다. \n", count_young);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("가족이 몇명인지 입력하세요");
		this.count_all = s.nextInt();
		
		for(int i=0; i<count_all; i++) {
			System.out.print("태어난 년도를 입력하세요");
			this.birth_year= s.nextInt();
			
			this.age =2018-this.birth_year +1;
			
			if(age<20)
				count_young++;
			
		}
	}
	
}
