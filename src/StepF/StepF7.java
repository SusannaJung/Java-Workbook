package StepF;

import java.util.Scanner;

public class StepF7 {
	
	int number[][] = new int[5][3]; // �� ���� ������ ��, ����, ȣ���� �ߺ� ����Ʈ
	int floor_total[] = new int[5]; // ���� ������ �հ� ����Ʈ (1��, 2��, 3��, 4��, 5��)
	int line_total[] = new int[3]; // ȣ���� ������ �հ� ����Ʈ (1ȣ����, 2ȣ����, 3ȣ����)
	int total; // ����Ʈ�� �� ������ ��
	
	public StepF7() {
		input();
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("%d0%dȣ�� ��� �ִ� ����� ���ڸ� �Է��Ͻÿ�.", i+1, j+1);
				this.number[i][j]= s.nextInt();
				
				this.total += this.number[i][j];
				this.floor_total[i] += this.number[i][j];
				this.line_total[j] += this.number[i][j];			}
		}
	}
	
	public void printApt2() {
		for(int i=0; i<5; i++) {
				System.out.printf("%d���� ��� �����ڴ� ��� %d�� �Դϴ�.\n", i+1, floor_total[i]);
				
		}
		System.out.print("\n");
		
		for(int j=0; j<3; j++) {
			System.out.printf("%dȣ ���ο� ��� �����ڴ� ��� %d�� �Դϴ�.\n", j+1, line_total[j]);
			
		}
		System.out.print("\n");
		
		System.out.printf("�� ����Ʈ�� ��� �����ڴ� ��� %d�� �Դϴ�.\n", total);
		
	}

}
