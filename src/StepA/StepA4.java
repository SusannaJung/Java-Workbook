package StepA;

import java.util.Scanner;

public class StepA4 {
	
	private double m2_area;
	private double pyung_area;
	
	public StepA4() {
		input();
	}
	
	public void printPyung() {
		System.out.printf("����Ʈ�� ������ %f�Դϴ�.\n", getPyung());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("����Ʈ �о� ������ �Է��Ͻÿ�. ");
		this.m2_area = s.nextDouble();
		s.close();
	}
	
	double getPyung() {
		this.pyung_area = this.m2_area / 3.305;
		return this.pyung_area;
	}
}
