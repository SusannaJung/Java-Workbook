package StepD;

import java.util.Scanner;

public class StepD9 {
	
	private int dan;
	
	public StepD9() {
		input();
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		
		while(true) {
			System.out.printf("출력하고 싶은 구구단의 단 수를 입력하시오(2-9). ");
			this.dan = s.nextInt();
			
			if(dan>=2&&dan<=9) {
				break;
			}
			else {
				System.out.println("잘못 입력하였습니다.");
			}
		}
	}
	
	public void printTable() {
		for(int i=1;i<10;i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
	}

}
