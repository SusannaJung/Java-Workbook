package StepC;

import java.util.Scanner;

public class StepC2 {
	
	private double input_degree;
	
	public StepC2() {
		input();
	}
	

	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �µ��� �Է��ϼ��� ");
		this.input_degree = s.nextDouble();
		s.close();
	}
	
	public void printTemp() {
		
		if(input_degree>=0 && input_degree<25)
			System.out.printf("�ü��Դϴ�.\n");
		else if(input_degree < 40)
			System.out.printf("�̿¼��Դϴ�.\n");
		else if(input_degree <80)
			System.out.printf("�¼��Դϴ�.\n");
		else
			System.out.printf("���� ���Դϴ�.\n");
			
	}

}
