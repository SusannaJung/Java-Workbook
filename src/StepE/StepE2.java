package StepE;

import java.util.Scanner;

public class StepE2 {
	
	private int height, blank;
	
	public StepE2() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �ﰢ���� ���̿� ���� ������ ũ�⸦ �Է��Ͻÿ�. ");
		this.height= s.nextInt();
		this.blank = s.nextInt();
	
	}
	
	public void printRightTri() {
		for(int i=1; i<=this.height; i++) {
			for(int j=1; j<=this.blank; j++) {
				System.out.println(" ");
			}
			
			for(int j=1; j<=this.height-i; j++) {
				System.out.println(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.println("*");
			}
		}
	}
	
}
