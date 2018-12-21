package StepB;

import java.util.Scanner;

public class StepB9 {
	
	private int height, weight;
	private int bmi;
	
	public StepB9() {
		input();
	}
	
	public void printBmi() {
		if(getBmi()>25)
			System.out.print("당신은 비만이십니다.\n");
		else
			System.out.print("당신은 비만이 아니군요.\n");

	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("신장(cm단위)를 입력하세요.");
		this.height = s.nextInt();
		System.out.print("체중(kg단위)를 입력하세요.");
		this.weight = s.nextInt();
		s.close();
	}
	
	int getBmi() {
		this.bmi= this.weight/((this.height/100)*(this.height/100));
		return this.bmi;
	}
	

}
