package StepF;

import java.util.Scanner;

public class StepF8 {
	
	private int number[] = new int[10];// 사용자가 입력한 숫자 10개
	
	

	public StepF8() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		int count=0; // 현재까지 입력된 숫자의 개수(0~10)
		boolean dup = true;
	
		System.out.print("1부터 100사이의 숫자를 입력하시오.\n");
		
		while(count<10) {	
			System.out.print("%d번째 숫자를 입력하시오. ");
			this.number[count]= s.nextInt();
			
			if((number[count] < 1)||(number[count] > 100))
				dup = false;
			else{
				for(int i = 0; i < count; i++)
					if(number[i] == number[count])
						dup = false;
			}
			
			if(dup == true)
				count++;
			else {
				System.out.print("잘못 입력하였습니다. 다시 입력하세요.");
				dup = true;
			}
			
		}
	}
	
	public void printNumber() {
		for(int i = 0; i < 10; i++)
			System.out.printf("%d번째 숫자는 %d입니다.\n", i+1, number[i]);
	}
}
