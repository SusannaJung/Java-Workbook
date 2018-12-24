package StepF;

import java.util.Scanner;

public class StepF1 {
	
	private int num[] = new int[10]; // 10개의 숫자를 담을 리스트
	private int first; // 첫 번째로 큰 수
	private int second; // 두 번째로 큰 수
	private int second_max_index; // 두 번째로 큰 수의 인덱스
	
	
	public StepF1() {
		input();
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		for(int i=0; i<10; i++) {	
			System.out.printf("%d번째 수를 입력하시오. ", i+1);
			this.num[i] = s.nextInt();
		}
	}	
	
	public void printSecMax() {
		
		first=num[0];
		second=num[0];
		
		int first_max_index=0;
		second_max_index = 0;
		
		for(int i=1;i<num.length;i++) {
			if(num[i]>first) {
				second = first;
				second_max_index = first_max_index;
				first = num[i];
				first_max_index=i+1;
			}
			else if(first>num[i]&&num[i]>second) {
				second = num[i];
				second_max_index=i+1;
			}
		}
		
		System.out.printf("두 번째로 큰 수는 %d번재 수 %d입니다.\n", second_max_index, second);
		
	}
		
	

}
