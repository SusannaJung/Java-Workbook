package StepE;

import java.util.Scanner;

public class StepE3 {
	private int height;
	
	public StepE3() {
		input();
	}
	
	public void printTri() {
		int i, j;
		for(i = 1; i <= height; i++) {
			for(j = 0; j < height-i; j++) 
				System.out.print(" ");
			for(j = 0; j < 2*i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�̵ �ﰢ���� ���̸� �Է��Ͻÿ�: ");
		this.height = s.nextInt();
	}

}
