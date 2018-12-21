package StepC;

import java.util.Scanner;

public class StepC1 {
	
	private int birth_year;
	private int age;
	
	public StepC1() {
		input();
	}
	
	public void printAge() {
		int a = getAge();
		if(a>0 && a<7)
			System.out.print("유아입니다.\n");
		else if(a<13)
			System.out.print("어린이입니다.\n");
		else if(a<20)
			System.out.print("청소년입니다.\n");
		else if(a<30)
			System.out.print("청년입니다.\n");
		else if(a<60)
			System.out.print("중년입니다.\n");
		else
			System.out.print("노년입니다.\n");
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요.");
		this.birth_year = s.nextInt();
		s.close();
	}
	
	int getAge() {
		this.age= 2018- this.birth_year+1;
		return this.age;
	}
	

}
