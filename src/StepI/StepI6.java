package StepI;

import java.util.Random;

public class StepI6 {
	
	private int number[] = new int[10];
	private byte kind;
	private int judge[] = {0,0,0};
	private String name[] = {"대(70 이상)", "중(40이상)", "소(40미만)"};
	
	public StepI6() {
		input();
	}
	
	public void printNumber() {
		for(int i=0; i<3; i++)
			System.out.printf("%d. %s : %d회 생성\n", i+1, name[i], judge[i]);
	}
	
	void input() {
		Random r = new Random();
		System.out.println("10개의 숫자를 생성합니다.");
		for(int i = 0; i<number.length; i++) {
			number[i] = r.nextInt(100) + 1;
			System.out.printf("생성된 임의의 숫자는 %d입니다.\n", number[i]);
			kind = GetRandom(number[i]);
			judge[kind]++;
		}
	}
	
	byte GetRandom(int number) {
		if(number >= 70)
			return 0;
		else if(number >= 40)
			return 1;
		else
			return 2;
	}

}
