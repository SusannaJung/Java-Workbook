package StepE;

import java.util.Scanner;

public class StepE5 {
	
	private int mode;
	private int column;
	
	public StepE5() {
		input();
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		System.out.print("구구단의 출력모드(1: 홀수단, 2: 짝수단)을 입력하시오.");
		this.mode= s.nextInt();
		System.out.print("한 줄에 출력할 갯수를 입력하시오. ");
		this.column= s.nextInt();
	}
	
	public void printTableColumn() {
		if(this.mode==1) {
			for(int i=3; i<10; i+=2) {
				for(int j=1; j<10; j++) {
					System.out.printf("%d x %d = %-2d  ", i,j, i*j);
					if(j%this.column==0)
						System.out.print("\n");
				}
				System.out.print("\n");
			}
		}
		else if(mode==2) {
			for(int i=this.mode;i<10;i+=2) {
				for(int j=1;j<10;j++) {
					System.out.printf("%d x %d = %-2d",i,j,i*j);
						System.out.printf("  ");
						if(j%this.column==0) {
							System.out.print("/n");
						}
				}
				System.out.print("\n");
			}
		}
	}

}
