package StepF;

import java.util.Scanner;

public class StepF6 {
	
	private int number[][] = new int[5][3]; // �� ���� ������ ��, ����, ȣ���� �ߺ� ����Ʈ

	private int total=0; // ����Ʈ�� �� ������ ��
	
	public StepF6() {
		input();
	}
	
	public void printApt() {
		System.out.printf("�� ����Ʈ�� ��� �����ڴ� ��� %d�� �Դϴ�.\n", total);
	}
	
	
	void input() {
		Scanner s= new Scanner(System.in);
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("%d0%dȣ�� ��� �ִ� ����� ���ڸ� �Է��Ͻÿ�. ",i+1,j+1);
				this.number[i][j]= s.nextInt();
				this.total += this.number[i][j];
			}
		}
		
	}

}
