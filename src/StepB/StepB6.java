package StepB;

import java.util.Scanner;

public class StepB6 {
	
	private int kor, eng, math, total;
	private double average;
	
	public StepB6() {
		input();
	}
	
	public void printScore() {
		System.out.printf("�Է��Ͻ� ������ ������ %d �̰�,\n����� %f �Դϴ�.\n",getTotal(), getAvg());
		if(this.kor>90)
			System.out.print("���������� ����մϴ�.\n");
		if(this.eng>90)
			System.out.print("���������� ����մϴ�.\n");
		if(this.math>90)
			System.out.print("���������� ����մϴ�.\n");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���.");
		this.kor = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���.");
		this.eng = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���.");
		this.math = s.nextInt();
		s.close();
	}
	
	int getTotal(){
		this.total = this.kor+ this.eng + this.math;
		return this.total;
	}
	
	double getAvg() {
		this.average = this.total / 3.0;
		return this.average;
	}

}
