package StepA;

import java.util.Scanner;

public class StepA2 {
	
	private double c_degree;
	private double f_degree;
	
	public StepA2() {
		input();
	}
	
	public void printTemp() {
		
		System.out.printf("ȭ�� �µ��� %f �Դϴ�.\n", getTemp());
	
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �µ��� �Է��Ͻÿ�. ");
		this.c_degree = s.nextDouble();
		s.close();
	}
	
	double getTemp() {
		this.f_degree = this.c_degree *1.8 +32;
		return this.f_degree;
	}
}
