package StepB;

import java.util.Scanner;

public class StepB1 {
	
	private int birth_year;
	private int age;
	
	public StepB1() {
		input();
	}

	public void printAge() {
		if(getAge()<20) {
			System.out.print("미성년자입니다.\n");
		}
		else {
			System.out.print("미성년자가 아닙니다.\n");
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요. ");
		this.birth_year = s.nextInt();
		s.close();
	}
	
	int getAge() {
		this.age= 2018- this.birth_year + 1;
		return this.age;
	}
	
}
