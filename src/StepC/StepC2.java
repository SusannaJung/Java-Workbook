package StepC;

import java.util.Scanner;

public class StepC2 {
	
	private double input_degree;
	
	public StepC2() {
		input();
	}
	

	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("물의 온도를 입력하세요 ");
		this.input_degree = s.nextDouble();
		s.close();
	}
	
	public void printTemp() {
		
		if(input_degree>=0 && input_degree<25)
			System.out.printf("냉수입니다.\n");
		else if(input_degree < 40)
			System.out.printf("미온수입니다.\n");
		else if(input_degree <80)
			System.out.printf("온수입니다.\n");
		else
			System.out.printf("끓는 물입니다.\n");
			
	}

}
