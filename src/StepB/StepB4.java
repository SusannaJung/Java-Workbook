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
			System.out.printf("����Ʈ�� ������ %f�̰�,\n30�� �̸��̹Ƿ� ���� ����Ʈ �Դϴ�", getPyung());	
		}
		else {
			System.out.printf("����Ʈ�� ������ %f�̰�,\n30�� �̻��̹Ƿ� ū ����Ʈ �Դϴ�", getPyung());
		}
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
