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
		System.out.printf("��ȯ�� �µ��� %d �Դϴ�.\n", getTemp());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("�µ��� �Է��ϼ���. ");
		this.input_degree = s.nextDouble();
		System.out.print("�Է��Ͻ� �µ��� �����µ��̸� C��, ȭ���µ��̸� F�� �Է��ϼ���. ");
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
