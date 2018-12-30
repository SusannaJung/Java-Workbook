package StepH;

import java.util.Scanner;
import java.util.Random;

public class StepH4 {
	private int com_finger; // 컴퓨터가 낸 가위(1), 바위(2), 보(3)
	private int my_finger; //사용자가 낸 가위(1), 바위(2), 보(3)
	private int score[][] = new int[2][3];//결과 횟수 리스트 [[컴퓨터의 승, 무, 패], [사용자의 승, 무, 패]]
	private int count;
	private String RSP_name[] = {"가위", "바위", "보", "컴퓨터 승!", "비김~", "사용자 승!"};
	
	public StepH4() {
		countWin();
	}
	
	public void printWin() {
		
		System.out.printf("컴퓨터 : 이긴 횟수는 %d회, 진 횟수는 %d회, 비긴 횟수는 %d 입니다.\n", score[0][0], score[0][2], score[0][1]);
		System.out.printf("사용자 : 이긴 횟수는 %d회, 진 횟수는 %d회, 비긴 횟수는 %d 입니다.\n", score[1][0], score[1][2], score[1][1]);
	}
	void input() {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
	
		com_finger = r.nextInt(3)+1;
		System.out.printf("가위(1), 바위(2), 보(3)를 입력하세요.");
		my_finger = s.nextInt();	
	}
	
	void countWin() {
		while(true) {
			input();
			
			if(my_finger == 0) break;
			else if(com_finger == my_finger)
				count = 1;
			else if((my_finger - com_finger+1) % 3 == 0)
				count = 0;
			else
				count = 2;
		
			score[0][count]++;
			score[1][2-count]++;
			System.out.printf("컴퓨터가 낸 것은 %s입니다. -----> %s\n", RSP_name[com_finger-1], RSP_name[count+3]);
		}
		
	}
}
