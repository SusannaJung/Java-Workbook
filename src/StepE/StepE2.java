package StepE;

import java.util.Scanner;

public class StepE2 {
	
	private int height, blank;
	
	public StepE2() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오. ");
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
