package StepC;

import java.util.Scanner;

public class StepC9 {
	
	private int income;
	private int tax;
	
	public StepC9() {
		input();
	}
	
	public void printTax() {
		System.out.printf("���� �ݾ׿� ���� �ҵ漼�� %d�� �Դϴ�.\n", getTax());
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		System.out.print("����(�� ����)�� ���ڷ� �Է��ϼ��� ");
		this.income= s.nextInt();
		s.close();
	}
	
	int getTax() {
		if(income<10000000)
			tax = (int)(income *0.095);
		else if(income<40000000)
			tax = (int)(income *0.19);
		else if(income<80000000)
			tax = (int)(income * 0.28);
		else if(income>=80000000)
			tax =(int)(income * 0.37);
		return this.tax;
	}
	

}
