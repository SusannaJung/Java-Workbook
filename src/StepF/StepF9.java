package StepF;

import java.util.Scanner;

public class StepF9 {
	
	private int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31}; // 1~12���� �� ��
	private int month, day; // �Է¹��� ��, ��
	private int day_count; // 1�� �� �� ��
	
	public StepF9() {
		input();
	}
	
	public void printDay() {
		System.out.printf("�� ��¥�� 1�� �� %d��° ���� �ش�˴ϴ�.\n", getDay());
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		
		System.out.print("���� �Է��Ͻÿ�. ");
		this.month = s.nextInt();
		System.out.println("���� �Է��Ͻÿ�.");
		this.day = s.nextInt();
		
	}
	
	int getDay() {
		
		if((month >= 1)&&(month <= 12)&&(day <= monthdays[month-1])){
			for(int i = 0; i < month - 1; i++) {
				day_count += monthdays[i];
			}
				day_count += day;
		}
	
		return this.day_count;
	}
	
	

}
