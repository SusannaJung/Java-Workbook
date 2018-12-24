package StepF;

import java.util.Scanner;

public class StepF7 {
	
	int number[][] = new int[5][3]; // 각 집의 거주자 수, 층별, 호수별 중복 리스트
	int floor_total[] = new int[5]; // 층별 거주자 합계 리스트 (1층, 2층, 3층, 4층, 5층)
	int line_total[] = new int[3]; // 호수별 거주자 합계 리스트 (1호라인, 2호라인, 3호라인)
	int total; // 아파트의 총 거주자 수
	
	public StepF7() {
		input();
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("%d0%d호에 살고 있는 사람의 숫자를 입력하시오.", i+1, j+1);
				this.number[i][j]= s.nextInt();
				
				this.total += this.number[i][j];
				this.floor_total[i] += this.number[i][j];
				this.line_total[j] += this.number[i][j];			}
		}
	}
	
	public void printApt2() {
		for(int i=0; i<5; i++) {
				System.out.printf("%d층에 사는 거주자는 모두 %d명 입니다.\n", i+1, floor_total[i]);
				
		}
		System.out.print("\n");
		
		for(int j=0; j<3; j++) {
			System.out.printf("%d호 라인에 사는 거주자는 모두 %d명 입니다.\n", j+1, line_total[j]);
			
		}
		System.out.print("\n");
		
		System.out.printf("이 아파트에 사는 거주자는 모두 %d명 입니다.\n", total);
		
	}

}
