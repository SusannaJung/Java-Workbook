package StepE;

import java.util.Scanner;

public class StepE3 {
	
	private int height;
	
	public StepE3() {
		input();
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		System.out.print("�̵ �ﰢ���� ���̸� �Է��Ͻÿ�.");
		this.height= s.nextInt();
		
	}
	
	public void printIsoTri() {
		for(int i=1; i<=this.height; i++) {
			for(int j=1; j<=height-i; j++) {
				System.out.println(" ");
			}
			for(int j=1; j<=(2*i)-1; j++) {
				System.out.println("*");
			}
			System.out.println("\n");
		}
	}

}
