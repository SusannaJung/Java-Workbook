package StepC;

import java.util.Scanner;

public class StepC4 {
	
	private double m2_area;
	private double pyung_area;
	
	public StepC4() {
		input();
	}

	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("����Ʈ�� �о� ����(��������)�� �Է��Ͻÿ�. ");
		this.m2_area = s.nextDouble();
		s.close();
	}
	
	double getPyung() {
		this.pyung_area = this.m2_area/3.305;
		return this.pyung_area;
	}
	
	public void printPyung() {
		double ap = getPyung();
		
		if(ap>0 && ap<15)
			System.out.print("���� ����Ʈ �Դϴ�.\n");
		else if(ap<30)
			System.out.print("�߼��� ����Ʈ �Դϴ�.\n");
		else if(ap<50)
			System.out.print("���� ����Ʈ �Դϴ�.\n");
		else
			System.out.print("���� ����Ʈ �Դϴ�.\n");
			
	}
	

}
