package StepE;

import java.util.Scanner;

public class StepE6 {
	
	private int rows, columns;
	private int number;
	
	public StepE6() {
		input();
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		System.out.print("����Ϸ��� ���� ũ��� ���� ũ�⸦ �Է��Ͻÿ�. ");
		this.rows= s.nextInt();
		this.columns = s.nextInt();
	}
	
	public void printRowColumn() {
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=columns; j++) {
				this.number = i*j;
				System.out.printf("%2d  ", number);
			}
			System.out.print("\n");
		}
	}

}
