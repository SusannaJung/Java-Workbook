package StepA;

import java.util.Scanner;

public class StepA4 {
	
	private double m2_area;
	private double pyung_area;
	
	public StepA4() {
		input();
	}
	
	public void printPyung() {
		System.out.printf("아파트의 평형은 %f입니다.\n", getPyung());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("아파트 분양 면적을 입력하시오. ");
		this.m2_area = s.nextDouble();
		s.close();
	}
	
	double getPyung() {
		this.pyung_area = this.m2_area / 3.305;
		return this.pyung_area;
	}
}
