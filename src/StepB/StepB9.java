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
			System.out.print("����� ���̽ʴϴ�.\n");
		else
			System.out.print("����� ���� �ƴϱ���.\n");

	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("����(cm����)�� �Է��ϼ���.");
		this.height = s.nextInt();
		System.out.print("ü��(kg����)�� �Է��ϼ���.");
		this.weight = s.nextInt();
		s.close();
	}
	
	int getBmi() {
		this.bmi= this.weight/((this.height/100)*(this.height/100));
		return this.bmi;
	}
	

}
