package StepF;

import java.util.Scanner;

public class StepF3 {
	
	private int jumsu[][] = new int[5][3]; // 5���� 3���� ������ �����ϰ� �ִ� �ߺ� ����Ʈ
	private int sum[] = new int[3]; // 3���� ���� ����Ʈ
	private double average[] = new double[3]; // 3���� ��� ����Ʈ
	
	public StepF3() {
		input();
	}
	
	
	
	void input() {
		Scanner s= new Scanner(System.in);
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("%d�� �л� ����, ���� ���� ������ �Է��Ͻÿ�. ");
				this.jumsu[i][j]= s.nextInt();
				
				
			}
			
		}
		
	}
	
    public void printJumsu() {
    	
    	String sub[] = { "����", "����", "����"};
    
    	
    	for(int i=0; i<5; i++) {
    		for(int j=0; j<3; j++) {
    			sum[j] += jumsu[i][j];
    		}
    	}
    	
    	
    	for(int j=0; j<3; j++) {
    		average[j] = sum[j]/3.0;
    	}
    	
    	
    	for(int j=0; j<3; j++) {
    		System.out.printf("%s�� ������ %d �̰�, ����� %.1f �Դϴ�.\n",sub[j], sum[j], average[j]);
	    }
    	
    }
		
}
