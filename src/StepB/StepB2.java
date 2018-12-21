package StepB;

import java.util.Scanner;

public class StepB2 {
	
	private double input_degree;
	private String kind;
	private double output_degree;
	
	public StepB2() {
		input();
	}
	
	public void printTemp() {
		System.out.printf("변환된 온도는 %d 입니다.\n", getTemp());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("온도를 입력하세요. ");
		this.input_degree = s.nextDouble();
		System.out.print("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요. ");
		this.kind = s.next();
		s.close();
	}
	
	double getTemp() {
		String cel = "C";
		
		if(this.kind.equals(cel)) {
			this.output_degree = this.input_degree *1.8 +32;
			return this.output_degree;
		}
		else {
			this.output_degree = (this.input_degree-32)/1.8;
			return this.output_degree;
		}
	}
}
