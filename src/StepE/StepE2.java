package StepE;

import java.util.Scanner;

public class StepE2 {
	private int height, blank;
	
	public StepE2() {
		input();
	}
	
	public void printTri() {
		int i, j;
		for(i = 1; i <= height; i++) {
			for(j = 0; j < blank; j++)
				System.out.print(" ");
			
			for(j = 1; j <= height; j++) {
				if(j <= height-i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.print("\n");
		}
			
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� �ﰢ���� ���̿� ���� ������ ũ�⸦ �Է��Ͻÿ�: ");
		this.height = s.nextInt();
		this.blank = s.nextInt();
	}

}