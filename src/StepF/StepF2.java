package StepF;

import java.util.Scanner;

public class StepF2 {
	
	private double score[] = new double[10]; // �ɻ����� ����Ʈ
	private double maxscore, minscore; // ���� ū ����, ���� ���� ����
	private int total = 0; // ���� �� �հ�
	private double average; // �������
	
	public StepF2() {
		input();
	}
	
	public void printScore() {
		System.out.printf("���� ū ������ ���� ���� ������ ������ 8���� ������ ���� ����� %.1f �Դϴ�.\n", getAvg());
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0; i<10; i++) {
			System.out.printf("%d�� �ɻ������� �Է��Ͻÿ�.", i+1);
			this.score[i]= s.nextDouble();
			
			total += score[i];
			
			
		}
	
	}
	
	double getAvg() {
		
		this.maxscore=0;
		this.minscore=10;
		
		for(int i=0; i<10; i++) {
			if(score[i]>this.maxscore)
				maxscore= score[i];
			if(score[i]<this.minscore)
				minscore= score[i];
		}
		
		this.average = (total-maxscore-minscore)/8.0;
		
		return this.average;
		
	}
	
	
	
	


}
