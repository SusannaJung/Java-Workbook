package StepF;

import java.util.Scanner;

public class StepF1 {
	
	private int num[] = new int[10]; // 10���� ���ڸ� ���� ����Ʈ
	private int first; // ù ��°�� ū ��
	private int second; // �� ��°�� ū ��
	private int second_max_index; // �� ��°�� ū ���� �ε���
	
	
	public StepF1() {
		input();
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		for(int i=0; i<10; i++) {	
			System.out.printf("%d��° ���� �Է��Ͻÿ�. ", i+1);
			this.num[i] = s.nextInt();
		}
	}	
	
	public void printSecMax() {
		
		first=num[0];
		second=num[0];
		
		int first_max_index=0;
		second_max_index = 0;
		
		for(int i=1;i<num.length;i++) {
			if(num[i]>first) {
				second = first;
				second_max_index = first_max_index;
				first = num[i];
				first_max_index=i+1;
			}
			else if(first>num[i]&&num[i]>second) {
				second = num[i];
				second_max_index=i+1;
			}
		}
		
		System.out.printf("�� ��°�� ū ���� %d���� �� %d�Դϴ�.\n", second_max_index, second);
		
	}
		
	

}
