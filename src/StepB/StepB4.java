package StepB;

import java.util.Scanner;

public class StepB4 {
	
	private double m2_area;
	private double pyung_area;
	
	public StepB4() {
		input();
	}
	
	public void printPyung() {
		
		if(this.pyung_area<30) {
			System.out.printf("아파트의 평형은 %f이고,\n30평 미만이므로 작은 아파트 입니다", getPyung());	
		}
		else {
			System.out.printf("아파트의 평형은 %f이고,\n30평 이상이므로 큰 아파트 입니다", getPyung());
		}
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
